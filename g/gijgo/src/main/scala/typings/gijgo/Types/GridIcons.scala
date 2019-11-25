package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridIcons extends js.Object {
  var collapseGroup: js.UndefOr[String] = js.undefined
  var collapseRow: js.UndefOr[String] = js.undefined
  var expandGroup: js.UndefOr[String] = js.undefined
  var expandRow: js.UndefOr[String] = js.undefined
}

object GridIcons {
  @scala.inline
  def apply(
    collapseGroup: String = null,
    collapseRow: String = null,
    expandGroup: String = null,
    expandRow: String = null
  ): GridIcons = {
    val __obj = js.Dynamic.literal()
    if (collapseGroup != null) __obj.updateDynamic("collapseGroup")(collapseGroup.asInstanceOf[js.Any])
    if (collapseRow != null) __obj.updateDynamic("collapseRow")(collapseRow.asInstanceOf[js.Any])
    if (expandGroup != null) __obj.updateDynamic("expandGroup")(expandGroup.asInstanceOf[js.Any])
    if (expandRow != null) __obj.updateDynamic("expandRow")(expandRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridIcons]
  }
}

