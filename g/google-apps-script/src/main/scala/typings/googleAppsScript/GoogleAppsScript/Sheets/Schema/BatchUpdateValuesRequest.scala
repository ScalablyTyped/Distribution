package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesRequest extends js.Object {
  var data: js.UndefOr[js.Array[ValueRange]] = js.undefined
  var includeValuesInResponse: js.UndefOr[Boolean] = js.undefined
  var responseDateTimeRenderOption: js.UndefOr[String] = js.undefined
  var responseValueRenderOption: js.UndefOr[String] = js.undefined
  var valueInputOption: js.UndefOr[String] = js.undefined
}

object BatchUpdateValuesRequest {
  @scala.inline
  def apply(
    data: js.Array[ValueRange] = null,
    includeValuesInResponse: js.UndefOr[Boolean] = js.undefined,
    responseDateTimeRenderOption: String = null,
    responseValueRenderOption: String = null,
    valueInputOption: String = null
  ): BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(includeValuesInResponse)) __obj.updateDynamic("includeValuesInResponse")(includeValuesInResponse.asInstanceOf[js.Any])
    if (responseDateTimeRenderOption != null) __obj.updateDynamic("responseDateTimeRenderOption")(responseDateTimeRenderOption.asInstanceOf[js.Any])
    if (responseValueRenderOption != null) __obj.updateDynamic("responseValueRenderOption")(responseValueRenderOption.asInstanceOf[js.Any])
    if (valueInputOption != null) __obj.updateDynamic("valueInputOption")(valueInputOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateValuesRequest]
  }
}

