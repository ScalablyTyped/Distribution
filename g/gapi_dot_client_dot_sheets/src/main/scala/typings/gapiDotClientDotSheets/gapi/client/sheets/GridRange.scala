package typings.gapiDotClientDotSheets.gapi.client.sheets

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
    endColumnIndex: Int | Double = null,
    endRowIndex: Int | Double = null,
    sheetId: Int | Double = null,
    startColumnIndex: Int | Double = null,
    startRowIndex: Int | Double = null
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

