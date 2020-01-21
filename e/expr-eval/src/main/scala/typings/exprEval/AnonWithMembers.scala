package typings.exprEval

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWithMembers extends js.Object {
  var withMembers: js.UndefOr[Boolean] = js.undefined
}

object AnonWithMembers {
  @scala.inline
  def apply(withMembers: js.UndefOr[Boolean] = js.undefined): AnonWithMembers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withMembers)) __obj.updateDynamic("withMembers")(withMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWithMembers]
  }
}

