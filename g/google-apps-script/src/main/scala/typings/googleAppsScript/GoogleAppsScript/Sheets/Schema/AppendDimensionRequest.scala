package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendDimensionRequest extends js.Object {
  var dimension: js.UndefOr[String] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var sheetId: js.UndefOr[Double] = js.undefined
}

object AppendDimensionRequest {
  @scala.inline
  def apply(dimension: String = null, length: Int | Double = null, sheetId: Int | Double = null): AppendDimensionRequest = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (sheetId != null) __obj.updateDynamic("sheetId")(sheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendDimensionRequest]
  }
}

