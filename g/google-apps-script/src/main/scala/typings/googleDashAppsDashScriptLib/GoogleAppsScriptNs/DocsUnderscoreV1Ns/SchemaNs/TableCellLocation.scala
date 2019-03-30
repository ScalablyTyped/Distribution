package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellLocation extends js.Object {
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var tableStartLocation: js.UndefOr[Location] = js.undefined
}

object TableCellLocation {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    tableStartLocation: Location = null
  ): TableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (tableStartLocation != null) __obj.updateDynamic("tableStartLocation")(tableStartLocation)
    __obj.asInstanceOf[TableCellLocation]
  }
}

