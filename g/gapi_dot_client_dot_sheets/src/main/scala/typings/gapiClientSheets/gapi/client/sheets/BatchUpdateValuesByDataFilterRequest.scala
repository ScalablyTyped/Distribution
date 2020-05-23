package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateValuesByDataFilterRequest extends js.Object {
  /**
    * The new values to apply to the spreadsheet.  If more than one range is
    * matched by the specified DataFilter the specified values are applied to
    * all of those ranges.
    */
  var data: js.UndefOr[js.Array[DataFilterValueRange]] = js.undefined
  /**
    * Determines if the update response should include the values
    * of the cells that were updated. By default, responses
    * do not include the updated values. The `updatedData` field within
    * each of the BatchUpdateValuesResponse.responses contains the updated
    * values. If the range to write was larger than the range actually written,
    * the response includes all values in the requested range (excluding trailing
    * empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is
    * DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.undefined
  /**
    * Determines how values in the response should be rendered.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.undefined
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[String] = js.undefined
}

object BatchUpdateValuesByDataFilterRequest {
  @scala.inline
  def apply(
    data: js.Array[DataFilterValueRange] = null,
    includeValuesInResponse: js.UndefOr[Boolean] = js.undefined,
    responseDateTimeRenderOption: String = null,
    responseValueRenderOption: String = null,
    valueInputOption: String = null
  ): BatchUpdateValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(includeValuesInResponse)) __obj.updateDynamic("includeValuesInResponse")(includeValuesInResponse.get.asInstanceOf[js.Any])
    if (responseDateTimeRenderOption != null) __obj.updateDynamic("responseDateTimeRenderOption")(responseDateTimeRenderOption.asInstanceOf[js.Any])
    if (responseValueRenderOption != null) __obj.updateDynamic("responseValueRenderOption")(responseValueRenderOption.asInstanceOf[js.Any])
    if (valueInputOption != null) __obj.updateDynamic("valueInputOption")(valueInputOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateValuesByDataFilterRequest]
  }
}

