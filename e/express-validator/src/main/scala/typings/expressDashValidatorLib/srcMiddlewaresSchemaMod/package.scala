package typings
package expressDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcMiddlewaresSchemaMod {
  type InternalParamSchema = ValidatorsSchema with SanitizersSchema
  type ParamSchema = InternalParamSchema with expressDashValidatorLib.Anon_ErrorMessage
  type SanitizersSchema = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>}
    */ expressDashValidatorLib.expressDashValidatorLibStrings.SanitizersSchema with js.Any
  type Schema = stdLib.Record[java.lang.String, ParamSchema]
  type ValidationParamSchema = ParamSchema
  type ValidationSchema = Schema
  type ValidatorsSchema = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof express-validator.express-validator/src/chain/validators.Validators<any> ]:? express-validator.express-validator/src/middlewares/schema.ValidatorSchemaOptions<K>}
    */ expressDashValidatorLib.expressDashValidatorLibStrings.ValidatorsSchema with js.Any
}
