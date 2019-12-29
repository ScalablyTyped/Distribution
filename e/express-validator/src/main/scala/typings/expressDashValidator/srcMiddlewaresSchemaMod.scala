package typings.expressDashValidator

import typings.expressDashValidator.srcBaseMod.Location
import typings.expressDashValidator.srcChainValidationDashChainMod.ValidationChain
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/schema", JSImport.Namespace)
@js.native
object srcMiddlewaresSchemaMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expressDashValidator.expressDashValidatorBooleans.`true`
    - typings.expressDashValidator.Anon_0Options[K]
  */
  trait SanitizerSchemaOptions[K /* <: String */] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressDashValidator.expressDashValidatorBooleans.`true`
    - typings.expressDashValidator.Anon_0[K]
  */
  trait ValidatorSchemaOptions[K /* <: String */] extends js.Object
  
  def checkSchema(schema: Schema): js.Array[ValidationChain] = js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
  type InternalParamSchema = ValidatorsSchema with SanitizersSchema
  type ParamSchema = InternalParamSchema with Anon_ErrorMessage
  type SanitizersSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>}
    */ typings.expressDashValidator.expressDashValidatorStrings.SanitizersSchema with js.Any
  type Schema = Record[String, ParamSchema]
  type ValidationParamSchema = ParamSchema
  type ValidationSchema = Schema
  type ValidatorsSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>}
    */ typings.expressDashValidator.expressDashValidatorStrings.ValidatorsSchema with js.Any
}

