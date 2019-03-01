package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionRange extends js.Object {
  /** The dimension of the span. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /** The end (exclusive) of the span, or not set if unbounded. */
  var endIndex: js.UndefOr[scala.Double] = js.undefined
  /** The sheet this span is on. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
  /** The start (inclusive) of the span, or not set if unbounded. */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
}

object DimensionRange {
  @scala.inline
  def apply(
    dimension: java.lang.String = null,
    endIndex: scala.Int | scala.Double = null,
    sheetId: scala.Int | scala.Double = null,
    startIndex: scala.Int | scala.Double = null
  ): DimensionRange = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DimensionRange]
  }
}

