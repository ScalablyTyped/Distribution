package typings.expressDashValidator

import typings.expressDashValidator.Anon_ErrorMessage
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcMiddlewaresSchemaMod {
  type InternalParamSchema = ValidatorsSchema with SanitizersSchema
  type ParamSchema = InternalParamSchema with Anon_ErrorMessage
  type SanitizersSchema = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>}
    */ typings.expressDashValidator.expressDashValidatorStrings.SanitizersSchema with js.Any
  type Schema = Record[String, ParamSchema]
  type ValidationParamSchema = ParamSchema
  type ValidationSchema = Schema
  type ValidatorsSchema = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>}
    */ typings.expressDashValidator.expressDashValidatorStrings.ValidatorsSchema with js.Any
}
