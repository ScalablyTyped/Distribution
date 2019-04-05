package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendDimensionRequest extends js.Object {
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
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

