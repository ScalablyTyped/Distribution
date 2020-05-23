package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

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
    insertSheetIndex: js.UndefOr[Double] = js.undefined,
    newSheetId: js.UndefOr[Double] = js.undefined,
    newSheetName: String = null,
    sourceSheetId: js.UndefOr[Double] = js.undefined
  ): DuplicateSheetRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insertSheetIndex)) __obj.updateDynamic("insertSheetIndex")(insertSheetIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newSheetId)) __obj.updateDynamic("newSheetId")(newSheetId.get.asInstanceOf[js.Any])
    if (newSheetName != null) __obj.updateDynamic("newSheetName")(newSheetName.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceSheetId)) __obj.updateDynamic("sourceSheetId")(sourceSheetId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DuplicateSheetRequest]
  }
}

