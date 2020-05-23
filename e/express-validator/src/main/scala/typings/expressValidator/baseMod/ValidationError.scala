package typings.expressValidator.baseMod

import typings.expressValidator.expressValidatorStrings._error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expressValidator.anon.Location
  - typings.expressValidator.anon.Msg
*/
trait ValidationError extends js.Object

object ValidationError {
  @scala.inline
  def Location(
    msg: js.Any,
    nestedErrors: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
    ],
    param: _error
  ): ValidationError = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  def Msg(location: Location, msg: js.Any, param: String, value: js.Any, nestedErrors: js.Array[_] = null): ValidationError = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (nestedErrors != null) __obj.updateDynamic("nestedErrors")(nestedErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

