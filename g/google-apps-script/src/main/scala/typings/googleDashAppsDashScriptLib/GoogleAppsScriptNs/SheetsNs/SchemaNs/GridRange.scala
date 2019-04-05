package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRange extends js.Object {
  var endColumnIndex: js.UndefOr[scala.Double] = js.undefined
  var endRowIndex: js.UndefOr[scala.Double] = js.undefined
  var sheetId: js.UndefOr[scala.Double] = js.undefined
  var startColumnIndex: js.UndefOr[scala.Double] = js.undefined
  var startRowIndex: js.UndefOr[scala.Double] = js.undefined
}

object GridRange {
  @scala.inline
  def apply(
    endColumnIndex: scala.Int | scala.Double = null,
    endRowIndex: scala.Int | scala.Double = null,
    sheetId: scala.Int | scala.Double = null,
    startColumnIndex: scala.Int | scala.Double = null,
    startRowIndex: scala.Int | scala.Double = null
  ): GridRange = {
    val __obj = js.Dynamic.literal()
    if (endColumnIndex != null) __obj.updateDynamic("endColumnIndex")(endColumnIndex.asInstanceOf[js.Any])
    if (endRowIndex != null) __obj.updateDynamic("endRowIndex")(endRowIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (startColumnIndex != null) __obj.updateDynamic("startColumnIndex")(startColumnIndex.asInstanceOf[js.Any])
    if (startRowIndex != null) __obj.updateDynamic("startRowIndex")(startRowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRange]
  }
}

