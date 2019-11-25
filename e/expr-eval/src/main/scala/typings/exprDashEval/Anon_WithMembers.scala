package typings.exprDashEval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WithMembers extends js.Object {
  var withMembers: js.UndefOr[Boolean] = js.undefined
}

object Anon_WithMembers {
  @scala.inline
  def apply(withMembers: js.UndefOr[Boolean] = js.undefined): Anon_WithMembers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withMembers)) __obj.updateDynamic("withMembers")(withMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WithMembers]
  }
}

