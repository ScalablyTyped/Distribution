package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendDimensionRequest extends js.Object {
  /** Whether rows or columns should be appended. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /** The number of rows or columns to append. */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** The sheet to append rows or columns to. */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

object AppendDimensionRequest {
  @scala.inline
  def apply(
    dimension: java.lang.String = null,
    length: scala.Int | scala.Double = null,
    sheetId: scala.Int | scala.Double = null
  ): AppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendDimensionRequest]
  }
}

