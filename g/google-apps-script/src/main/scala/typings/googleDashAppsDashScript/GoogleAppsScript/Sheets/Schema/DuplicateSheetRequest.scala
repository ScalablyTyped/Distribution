package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DuplicateSheetRequest extends js.Object {
  var insertSheetIndex: js.UndefOr[Double] = js.undefined
  var newSheetId: js.UndefOr[Double] = js.undefined
  var newSheetName: js.UndefOr[String] = js.undefined
  var sourceSheetId: js.UndefOr[Double] = js.undefined
}

object DuplicateSheetRequest {
  @scala.inline
  def apply(
    insertSheetIndex: Int | Double = null,
    newSheetId: Int | Double = null,
    newSheetName: String = null,
    sourceSheetId: Int | Double = null
  ): DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (insertSheetIndex != null) __obj.updateDynamic("insertSheetIndex")(insertSheetIndex.asInstanceOf[js.Any])
    if (newSheetId != null) __obj.updateDynamic("newSheetId")(newSheetId.asInstanceOf[js.Any])
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName.asInstanceOf[js.Any])
    if (sourceSheetId != null) __obj.updateDynamic("sourceSheetId")(sourceSheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateSheetRequest]
  }
}

