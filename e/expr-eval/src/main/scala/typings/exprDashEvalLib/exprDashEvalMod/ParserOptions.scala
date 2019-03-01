package typings
package exprDashEvalLib.exprDashEvalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParserOptions extends js.Object {
  var allowMemberAccess: js.UndefOr[scala.Boolean] = js.undefined
  var operators: js.UndefOr[exprDashEvalLib.Anon_Abs] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    allowMemberAccess: js.UndefOr[scala.Boolean] = js.undefined,
    operators: exprDashEvalLib.Anon_Abs = null
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMemberAccess)) __obj.updateDynamic("allowMemberAccess")(allowMemberAccess)
    if (operators != null) __obj.updateDynamic("operators")(operators)
    __obj.asInstanceOf[ParserOptions]
  }
}

