package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  var group: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object Group {
  @scala.inline
  def apply(group: String = null, id: String = null, weight: js.UndefOr[Double] = js.undefined): Group = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

