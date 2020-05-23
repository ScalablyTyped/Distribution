package typings.exprEval.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithMembers extends js.Object {
  var withMembers: js.UndefOr[Boolean] = js.undefined
}

object WithMembers {
  @scala.inline
  def apply(withMembers: js.UndefOr[Boolean] = js.undefined): WithMembers = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(withMembers)) __obj.updateDynamic("withMembers")(withMembers.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithMembers]
  }
}

