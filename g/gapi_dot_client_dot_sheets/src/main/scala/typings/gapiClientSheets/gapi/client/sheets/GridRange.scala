package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRange extends js.Object {
  /** The end column (exclusive) of the range, or not set if unbounded. */
  var endColumnIndex: js.UndefOr[Double] = js.undefined
  /** The end row (exclusive) of the range, or not set if unbounded. */
  var endRowIndex: js.UndefOr[Double] = js.undefined
  /** The sheet this range is on. */
  var sheetId: js.UndefOr[Double] = js.undefined
  /** The start column (inclusive) of the range, or not set if unbounded. */
  var startColumnIndex: js.UndefOr[Double] = js.undefined
  /** The start row (inclusive) of the range, or not set if unbounded. */
  var startRowIndex: js.UndefOr[Double] = js.undefined
}

object GridRange {
  @scala.inline
  def apply(
    endColumnIndex: js.UndefOr[Double] = js.undefined,
    endRowIndex: js.UndefOr[Double] = js.undefined,
    sheetId: js.UndefOr[Double] = js.undefined,
    startColumnIndex: js.UndefOr[Double] = js.undefined,
    startRowIndex: js.UndefOr[Double] = js.undefined
  ): GridRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endColumnIndex)) __obj.updateDynamic("endColumnIndex")(endColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(endRowIndex)) __obj.updateDynamic("endRowIndex")(endRowIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetId)) __obj.updateDynamic("sheetId")(sheetId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startColumnIndex)) __obj.updateDynamic("startColumnIndex")(startColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRowIndex)) __obj.updateDynamic("startRowIndex")(startRowIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRange]
  }
}

