package typings.exprDashEval.exprDashEvalMod

import typings.exprDashEval.Anon_Abs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var allowMemberAccess: js.UndefOr[Boolean] = js.undefined
  var operators: js.UndefOr[Anon_Abs] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(allowMemberAccess: js.UndefOr[Boolean] = js.undefined, operators: Anon_Abs = null): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMemberAccess)) __obj.updateDynamic("allowMemberAccess")(allowMemberAccess)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    __obj.asInstanceOf[ParserOptions]
  }
}

