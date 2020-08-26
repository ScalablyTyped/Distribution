package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateValuesRequest extends js.Object {
  /** The new values to apply to the spreadsheet. */
  var data: js.UndefOr[js.Array[ValueRange]] = js.native
  /**
    * Determines if the update response should include the values
    * of the cells that were updated. By default, responses
    * do not include the updated values. The `updatedData` field within
    * each of the BatchUpdateValuesResponse.responses contains the updated
    * values. If the range to write was larger than the range actually written,
    * the response includes all values in the requested range (excluding trailing
    * empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is
    * DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * Determines how values in the response should be rendered.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.native
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[String] = js.native
}

object BatchUpdateValuesRequest {
  @scala.inline
  def apply(): BatchUpdateValuesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateValuesRequest]
  }
  @scala.inline
  implicit class BatchUpdateValuesRequestOps[Self <: BatchUpdateValuesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataVarargs(value: ValueRange*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[ValueRange]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setIncludeValuesInResponse(value: Boolean): Self = this.set("includeValuesInResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeValuesInResponse: Self = this.set("includeValuesInResponse", js.undefined)
    @scala.inline
    def setResponseDateTimeRenderOption(value: String): Self = this.set("responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDateTimeRenderOption: Self = this.set("responseDateTimeRenderOption", js.undefined)
    @scala.inline
    def setResponseValueRenderOption(value: String): Self = this.set("responseValueRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseValueRenderOption: Self = this.set("responseValueRenderOption", js.undefined)
    @scala.inline
    def setValueInputOption(value: String): Self = this.set("valueInputOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInputOption: Self = this.set("valueInputOption", js.undefined)
  }
  
}

