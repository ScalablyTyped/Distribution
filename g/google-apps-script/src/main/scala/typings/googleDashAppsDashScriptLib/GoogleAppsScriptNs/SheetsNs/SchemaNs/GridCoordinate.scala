package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCoordinate extends js.Object {
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object GridCoordinate {
  @scala.inline
  def apply(
    columnIndex: scala.Int | scala.Double = null,
    rowIndex: scala.Int | scala.Double = null,
    sheetId: scala.Int | scala.Double = null
  ): GridCoordinate = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCoordinate]
  }
}

