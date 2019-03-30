package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRange extends js.Object {
  var columnSpan: js.UndefOr[scala.Double] = js.undefined
  var location: js.UndefOr[TableCellLocation] = js.undefined
  var rowSpan: js.UndefOr[scala.Double] = js.undefined
}

object TableRange {
  @scala.inline
  def apply(
    columnSpan: scala.Int | scala.Double = null,
    location: TableCellLocation = null,
    rowSpan: scala.Int | scala.Double = null
  ): TableRange = {
    val __obj = js.Dynamic.literal()
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRange]
  }
}

