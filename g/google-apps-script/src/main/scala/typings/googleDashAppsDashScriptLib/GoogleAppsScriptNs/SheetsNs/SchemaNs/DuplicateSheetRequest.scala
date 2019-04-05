package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateSheetRequest extends js.Object {
  var insertSheetIndex: js.UndefOr[scala.Double] = js.undefined
  var newSheetId: js.UndefOr[scala.Double] = js.undefined
  var newSheetName: js.UndefOr[java.lang.String] = js.undefined
  var sourceSheetId: js.UndefOr[scala.Double] = js.undefined
}

object DuplicateSheetRequest {
  @scala.inline
  def apply(
    insertSheetIndex: scala.Int | scala.Double = null,
    newSheetId: scala.Int | scala.Double = null,
    newSheetName: java.lang.String = null,
    sourceSheetId: scala.Int | scala.Double = null
  ): DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (insertSheetIndex != null) __obj.updateDynamic("insertSheetIndex")(insertSheetIndex.asInstanceOf[js.Any])
    if (newSheetId != null) __obj.updateDynamic("newSheetId")(newSheetId.asInstanceOf[js.Any])
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName)
    if (sourceSheetId != null) __obj.updateDynamic("sourceSheetId")(sourceSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateSheetRequest]
  }
}

