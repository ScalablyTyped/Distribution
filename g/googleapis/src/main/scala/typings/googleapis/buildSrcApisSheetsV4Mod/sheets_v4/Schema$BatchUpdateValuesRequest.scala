package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for updating more than one range of values in a spreadsheet.
  */
@js.native
trait Schema$BatchUpdateValuesRequest extends js.Object {
  /**
    * The new values to apply to the spreadsheet.
    */
  var data: js.UndefOr[js.Array[Schema$ValueRange]] = js.native
  /**
    * Determines if the update response should include the values of the cells
    * that were updated. By default, responses do not include the updated
    * values. The `updatedData` field within each of the
    * BatchUpdateValuesResponse.responses will contain the updated values. If
    * the range to write was larger than than the range actually written, the
    * response will include all values in the requested range (excluding
    * trailing empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE. The default dateTime render option is
    * DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * Determines how values in the response should be rendered. The default
    * render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.native
  /**
    * How the input data should be interpreted.
    */
  var valueInputOption: js.UndefOr[String] = js.native
}

object Schema$BatchUpdateValuesRequest {
  @scala.inline
  def apply(
    data: js.Array[Schema$ValueRange] = null,
    includeValuesInResponse: js.UndefOr[Boolean] = js.undefined,
    responseDateTimeRenderOption: String = null,
    responseValueRenderOption: String = null,
    valueInputOption: String = null
  ): Schema$BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(includeValuesInResponse)) __obj.updateDynamic("includeValuesInResponse")(includeValuesInResponse.asInstanceOf[js.Any])
    if (responseDateTimeRenderOption != null) __obj.updateDynamic("responseDateTimeRenderOption")(responseDateTimeRenderOption.asInstanceOf[js.Any])
    if (responseValueRenderOption != null) __obj.updateDynamic("responseValueRenderOption")(responseValueRenderOption.asInstanceOf[js.Any])
    if (valueInputOption != null) __obj.updateDynamic("valueInputOption")(valueInputOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BatchUpdateValuesRequest]
  }
}

