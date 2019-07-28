package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import typings.gapiDotClientDotSheets.Anon_AccesstokenAlt
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltBearertokenCallback
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOption
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOptionFields
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltBearertokenCallbackFields
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltBearertokenCallbackFieldsIncludeValuesInResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValuesResource extends js.Object {
  /**
    * Appends values to a spreadsheet. The input range is used to search for
    * existing data and find a "table" within that range. Values will be
    * appended to the next row of the table, starting with the first column of
    * the table. See the
    * [guide](/sheets/api/guides/values#appending_values)
    * and
    * [sample code](/sheets/api/samples/writing#append_values)
    * for specific details of how tables are detected and data is appended.
    *
    * The caller must specify the spreadsheet ID, range, and
    * a valueInputOption.  The `valueInputOption` only
    * controls how the input data will be added to the sheet (column-wise or
    * row-wise), it does not influence what cell the data starts being written
    * to.
    */
  def append(request: Anon_AccesstokenAltBearertokenCallback): typings.gapiDotClient.gapiNs.clientNs.Request[AppendValuesResponse]
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def batchClear(request: Anon_AccesstokenAlt): typings.gapiDotClient.gapiNs.clientNs.Request[BatchClearValuesResponse]
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters. Ranges matching any of the specified data
    * filters will be cleared.  Only values are cleared -- all other properties
    * of the cell (such as formatting, data validation, etc..) are kept.
    */
  def batchClearByDataFilter(request: Anon_AccesstokenAlt): typings.gapiDotClient.gapiNs.clientNs.Request[BatchClearValuesByDataFilterResponse]
  /**
    * Returns one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    */
  def batchGet(request: Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOption): typings.gapiDotClient.gapiNs.clientNs.Request[BatchGetValuesResponse]
  /**
    * Returns one or more ranges of values that match the specified data filters.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters.  Ranges that match any of the data filters in
    * the request will be returned.
    */
  def batchGetByDataFilter(request: Anon_AccesstokenAlt): typings.gapiDotClient.gapiNs.clientNs.Request[BatchGetValuesByDataFilterResponse]
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * ValueRanges.
    */
  def batchUpdate(request: Anon_AccesstokenAlt): typings.gapiDotClient.gapiNs.clientNs.Request[BatchUpdateValuesResponse]
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * DataFilterValueRanges.
    */
  def batchUpdateByDataFilter(request: Anon_AccesstokenAlt): typings.gapiDotClient.gapiNs.clientNs.Request[BatchUpdateValuesByDataFilterResponse]
  /**
    * Clears values from a spreadsheet.
    * The caller must specify the spreadsheet ID and range.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def clear(request: Anon_AccesstokenAltBearertokenCallbackFields): typings.gapiDotClient.gapiNs.clientNs.Request[ClearValuesResponse]
  /**
    * Returns a range of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and a range.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOptionFields): typings.gapiDotClient.gapiNs.clientNs.Request[ValueRange]
  /**
    * Sets values in a range of a spreadsheet.
    * The caller must specify the spreadsheet ID, range, and
    * a valueInputOption.
    */
  def update(request: Anon_AccesstokenAltBearertokenCallbackFieldsIncludeValuesInResponse): typings.gapiDotClient.gapiNs.clientNs.Request[UpdateValuesResponse]
}

object ValuesResource {
  @scala.inline
  def apply(
    append: Anon_AccesstokenAltBearertokenCallback => typings.gapiDotClient.gapiNs.clientNs.Request[AppendValuesResponse],
    batchClear: Anon_AccesstokenAlt => typings.gapiDotClient.gapiNs.clientNs.Request[BatchClearValuesResponse],
    batchClearByDataFilter: Anon_AccesstokenAlt => typings.gapiDotClient.gapiNs.clientNs.Request[BatchClearValuesByDataFilterResponse],
    batchGet: Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOption => typings.gapiDotClient.gapiNs.clientNs.Request[BatchGetValuesResponse],
    batchGetByDataFilter: Anon_AccesstokenAlt => typings.gapiDotClient.gapiNs.clientNs.Request[BatchGetValuesByDataFilterResponse],
    batchUpdate: Anon_AccesstokenAlt => typings.gapiDotClient.gapiNs.clientNs.Request[BatchUpdateValuesResponse],
    batchUpdateByDataFilter: Anon_AccesstokenAlt => typings.gapiDotClient.gapiNs.clientNs.Request[BatchUpdateValuesByDataFilterResponse],
    clear: Anon_AccesstokenAltBearertokenCallbackFields => typings.gapiDotClient.gapiNs.clientNs.Request[ClearValuesResponse],
    get: Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOptionFields => typings.gapiDotClient.gapiNs.clientNs.Request[ValueRange],
    update: Anon_AccesstokenAltBearertokenCallbackFieldsIncludeValuesInResponse => typings.gapiDotClient.gapiNs.clientNs.Request[UpdateValuesResponse]
  ): ValuesResource = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), batchClear = js.Any.fromFunction1(batchClear), batchClearByDataFilter = js.Any.fromFunction1(batchClearByDataFilter), batchGet = js.Any.fromFunction1(batchGet), batchGetByDataFilter = js.Any.fromFunction1(batchGetByDataFilter), batchUpdate = js.Any.fromFunction1(batchUpdate), batchUpdateByDataFilter = js.Any.fromFunction1(batchUpdateByDataFilter), clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ValuesResource]
  }
}

