package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridIcons extends js.Object {
  var collapseGroup: js.UndefOr[java.lang.String] = js.undefined
  var collapseRow: js.UndefOr[java.lang.String] = js.undefined
  var expandGroup: js.UndefOr[java.lang.String] = js.undefined
  var expandRow: js.UndefOr[java.lang.String] = js.undefined
}

object GridIcons {
  @scala.inline
  def apply(
    collapseGroup: java.lang.String = null,
    collapseRow: java.lang.String = null,
    expandGroup: java.lang.String = null,
    expandRow: java.lang.String = null
  ): GridIcons = {
    val __obj = js.Dynamic.literal()
    if (collapseGroup != null) __obj.updateDynamic("collapseGroup")(collapseGroup)
    if (collapseRow != null) __obj.updateDynamic("collapseRow")(collapseRow)
    if (expandGroup != null) __obj.updateDynamic("expandGroup")(expandGroup)
    if (expandRow != null) __obj.updateDynamic("expandRow")(expandRow)
    __obj.asInstanceOf[GridIcons]
  }
}

