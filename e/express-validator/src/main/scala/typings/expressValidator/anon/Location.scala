package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import typings.expressValidator.expressValidatorStrings._error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends ValidationError {
  var location: js.UndefOr[scala.Nothing] = js.undefined
  var msg: js.Any
  var nestedErrors: js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
  ]
  var param: _error
  var value: js.UndefOr[scala.Nothing] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    msg: js.Any,
    nestedErrors: js.Array[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias express-validator.express-validator/src/base.ValidationError */ js.Object
    ],
    param: _error
  ): Location = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any], nestedErrors = nestedErrors.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

