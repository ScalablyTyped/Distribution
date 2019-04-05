package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesRequest extends js.Object {
  var data: js.UndefOr[js.Array[ValueRange]] = js.undefined
  var includeValuesInResponse: js.UndefOr[scala.Boolean] = js.undefined
  var responseDateTimeRenderOption: js.UndefOr[java.lang.String] = js.undefined
  var responseValueRenderOption: js.UndefOr[java.lang.String] = js.undefined
  var valueInputOption: js.UndefOr[java.lang.String] = js.undefined
}

object BatchUpdateValuesRequest {
  @scala.inline
  def apply(
    data: js.Array[ValueRange] = null,
    includeValuesInResponse: js.UndefOr[scala.Boolean] = js.undefined,
    responseDateTimeRenderOption: java.lang.String = null,
    responseValueRenderOption: java.lang.String = null,
    valueInputOption: java.lang.String = null
  ): BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(includeValuesInResponse)) __obj.updateDynamic("includeValuesInResponse")(includeValuesInResponse)
    if (responseDateTimeRenderOption != null) __obj.updateDynamic("responseDateTimeRenderOption")(responseDateTimeRenderOption)
    if (responseValueRenderOption != null) __obj.updateDynamic("responseValueRenderOption")(responseValueRenderOption)
    if (valueInputOption != null) __obj.updateDynamic("valueInputOption")(valueInputOption)
    __obj.asInstanceOf[BatchUpdateValuesRequest]
  }
}

