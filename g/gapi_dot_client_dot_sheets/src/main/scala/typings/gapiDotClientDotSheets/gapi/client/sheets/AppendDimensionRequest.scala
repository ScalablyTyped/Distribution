package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendDimensionRequest extends js.Object {
  /** Whether rows or columns should be appended. */
  var dimension: js.UndefOr[String] = js.undefined
  /** The number of rows or columns to append. */
  var length: js.UndefOr[Double] = js.undefined
  /** The sheet to append rows or columns to. */
  var sheetId: js.UndefOr[Double] = js.undefined
}

object AppendDimensionRequest {
  @scala.inline
  def apply(dimension: String = null, length: Int | Double = null, sheetId: Int | Double = null): AppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendDimensionRequest]
  }
}

