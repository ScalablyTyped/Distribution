package typings.expressValidator

import typings.expressValidator.baseMod.Location
import typings.expressValidator.validationChainMod.ValidationChain
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-validator/src/middlewares/schema", JSImport.Namespace)
@js.native
object schemaMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.expressValidatorBooleans.`true`
    - typings.expressValidator.Anon0Options[K]
  */
  trait SanitizerSchemaOptions[K /* <: String */] extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expressValidator.expressValidatorBooleans.`true`
    - typings.expressValidator.Anon0[K]
  */
  trait ValidatorSchemaOptions[K /* <: String */] extends js.Object
  
  def checkSchema(schema: Schema): js.Array[ValidationChain] = js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
  type InternalParamSchema = ValidatorsSchema with SanitizersSchema
  type ParamSchema = InternalParamSchema with AnonErrorMessage
  type SanitizersSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>}
    */ typings.expressValidator.expressValidatorStrings.SanitizersSchema with js.Any
  type Schema = Record[String, ParamSchema]
  type ValidationParamSchema = ParamSchema
  type ValidationSchema = Schema
  type ValidatorsSchema = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>}
    */ typings.expressValidator.expressValidatorStrings.ValidatorsSchema with js.Any
}

