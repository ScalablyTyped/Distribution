package typings.exprEval.mod

import typings.exprEval.AnonAbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var allowMemberAccess: js.UndefOr[Boolean] = js.undefined
  var operators: js.UndefOr[AnonAbs] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(allowMemberAccess: js.UndefOr[Boolean] = js.undefined, operators: AnonAbs = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMemberAccess)) __obj.updateDynamic("allowMemberAccess")(allowMemberAccess.asInstanceOf[js.Any])
    if (operators != null) __obj.updateDynamic("operators")(operators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

