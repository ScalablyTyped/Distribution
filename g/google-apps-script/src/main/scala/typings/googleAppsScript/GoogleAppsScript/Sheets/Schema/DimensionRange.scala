package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionRange extends js.Object {
  var dimension: js.UndefOr[String] = js.undefined
  var endIndex: js.UndefOr[Double] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
  var startIndex: js.UndefOr[Double] = js.undefined
}

object DimensionRange {
  @scala.inline
  def apply(
    dimension: String = null,
    endIndex: js.UndefOr[Double] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined
  ): DimensionRange = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (!js.isUndefined(endIndex)) __obj.updateDynamic("endIndex")(endIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionRange]
  }
}

