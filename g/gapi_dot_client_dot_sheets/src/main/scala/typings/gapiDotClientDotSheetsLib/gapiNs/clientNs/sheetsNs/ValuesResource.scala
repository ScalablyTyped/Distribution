package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

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
  def append(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[AppendValuesResponse]
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def batchClear(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchClearValuesResponse]
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters. Ranges matching any of the specified data
    * filters will be cleared.  Only values are cleared -- all other properties
    * of the cell (such as formatting, data validation, etc..) are kept.
    */
  def batchClearByDataFilter(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchClearValuesByDataFilterResponse]
  /**
    * Returns one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    */
  def batchGet(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOption): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetValuesResponse]
  /**
    * Returns one or more ranges of values that match the specified data filters.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters.  Ranges that match any of the data filters in
    * the request will be returned.
    */
  def batchGetByDataFilter(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchGetValuesByDataFilterResponse]
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * ValueRanges.
    */
  def batchUpdate(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateValuesResponse]
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * DataFilterValueRanges.
    */
  def batchUpdateByDataFilter(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateValuesByDataFilterResponse]
  /**
    * Clears values from a spreadsheet.
    * The caller must specify the spreadsheet ID and range.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def clear(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ClearValuesResponse]
  /**
    * Returns a range of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and a range.
    */
  def get(
    request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOptionFields
  ): gapiDotClientLib.gapiNs.clientNs.Request[ValueRange]
  /**
    * Sets values in a range of a spreadsheet.
    * The caller must specify the spreadsheet ID, range, and
    * a valueInputOption.
    */
  def update(
    request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFieldsIncludeValuesInResponse
  ): gapiDotClientLib.gapiNs.clientNs.Request[UpdateValuesResponse]
}

object ValuesResource {
  @scala.inline
  def apply(
    append: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[AppendValuesResponse],
    batchClear: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[BatchClearValuesResponse],
    batchClearByDataFilter: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[BatchClearValuesByDataFilterResponse],
    batchGet: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOption => gapiDotClientLib.gapiNs.clientNs.Request[BatchGetValuesResponse],
    batchGetByDataFilter: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[BatchGetValuesByDataFilterResponse],
    batchUpdate: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateValuesResponse],
    batchUpdateByDataFilter: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateValuesByDataFilterResponse],
    clear: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[ClearValuesResponse],
    get: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackDateTimeRenderOptionFields => gapiDotClientLib.gapiNs.clientNs.Request[ValueRange],
    update: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFieldsIncludeValuesInResponse => gapiDotClientLib.gapiNs.clientNs.Request[UpdateValuesResponse]
  ): ValuesResource = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), batchClear = js.Any.fromFunction1(batchClear), batchClearByDataFilter = js.Any.fromFunction1(batchClearByDataFilter), batchGet = js.Any.fromFunction1(batchGet), batchGetByDataFilter = js.Any.fromFunction1(batchGetByDataFilter), batchUpdate = js.Any.fromFunction1(batchUpdate), batchUpdateByDataFilter = js.Any.fromFunction1(batchUpdateByDataFilter), clear = js.Any.fromFunction1(clear), get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ValuesResource]
  }
}

