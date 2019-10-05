package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetValuesByDataFilterRequest extends js.Object {
  /**
    * The data filters used to match the ranges of values to retrieve.  Ranges
    * that match any of the specified data filters will be included in the
    * response.
    */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.undefined
  /**
    * How dates, times, and durations should be represented in the output.
    * This is ignored if value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.undefined
  /**
    * The major dimension that results should use.
    *
    * For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
    * then a request that selects that range and sets `majorDimension=ROWS` will
    * return `[[1,2],[3,4]]`,
    * whereas a request that sets `majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  /**
    * How values should be represented in the output.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.undefined
}

object BatchGetValuesByDataFilterRequest {
  @scala.inline
  def apply(
    dataFilters: js.Array[DataFilter] = null,
    dateTimeRenderOption: String = null,
    majorDimension: String = null,
    valueRenderOption: String = null
  ): BatchGetValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    if (dataFilters != null) __obj.updateDynamic("dataFilters")(dataFilters)
    if (dateTimeRenderOption != null) __obj.updateDynamic("dateTimeRenderOption")(dateTimeRenderOption)
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (valueRenderOption != null) __obj.updateDynamic("valueRenderOption")(valueRenderOption)
    __obj.asInstanceOf[BatchGetValuesByDataFilterRequest]
  }
}

