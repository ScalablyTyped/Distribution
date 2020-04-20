package typings.gapiClientSheets.gapi.client.sheets

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSheets.AnonCallback
import typings.gapiClientSheets.AnonDateTimeRenderOption
import typings.gapiClientSheets.AnonIncludeValuesInResponse
import typings.gapiClientSheets.AnonInsertDataOption
import typings.gapiClientSheets.AnonMajorDimension
import typings.gapiClientSheets.AnonOauthtoken
import typings.gapiClientSheets.AnonPrettyPrint
import typings.gapiClientSheets.AnonQuotaUser
import typings.gapiClientSheets.AnonRange
import typings.gapiClientSheets.AnonResource
import typings.gapiClientSheets.AnonResponseDateTimeRenderOption
import typings.gapiClientSheets.AnonResponseValueRenderOption
import typings.gapiClientSheets.AnonSpreadsheetId
import typings.gapiClientSheets.AnonUploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def append(request: AnonIncludeValuesInResponse): Request_[AppendValuesResponse] = js.native
  def append(request: AnonInsertDataOption, body: ValueRange): Request_[AppendValuesResponse] = js.native
  def batchClear(request: AnonCallback, body: BatchClearValuesRequest): Request_[BatchClearValuesResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def batchClear(request: AnonOauthtoken): Request_[BatchClearValuesResponse] = js.native
  def batchClearByDataFilter(request: AnonCallback, body: BatchClearValuesByDataFilterRequest): Request_[BatchClearValuesByDataFilterResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters. Ranges matching any of the specified data
    * filters will be cleared.  Only values are cleared -- all other properties
    * of the cell (such as formatting, data validation, etc..) are kept.
    */
  def batchClearByDataFilter(request: AnonPrettyPrint): Request_[BatchClearValuesByDataFilterResponse] = js.native
  /**
    * Returns one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    */
  def batchGet(): Request_[BatchGetValuesResponse] = js.native
  def batchGet(request: AnonDateTimeRenderOption): Request_[BatchGetValuesResponse] = js.native
  def batchGetByDataFilter(request: AnonCallback, body: BatchGetValuesByDataFilterRequest): Request_[BatchGetValuesByDataFilterResponse] = js.native
  /**
    * Returns one or more ranges of values that match the specified data filters.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters.  Ranges that match any of the data filters in
    * the request will be returned.
    */
  def batchGetByDataFilter(request: AnonQuotaUser): Request_[BatchGetValuesByDataFilterResponse] = js.native
  def batchUpdate(request: AnonCallback, body: BatchUpdateValuesRequest): Request_[BatchUpdateValuesResponse] = js.native
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * ValueRanges.
    */
  def batchUpdate(request: AnonResource): Request_[BatchUpdateValuesResponse] = js.native
  def batchUpdateByDataFilter(request: AnonCallback, body: BatchUpdateValuesByDataFilterRequest): Request_[BatchUpdateValuesByDataFilterResponse] = js.native
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * DataFilterValueRanges.
    */
  def batchUpdateByDataFilter(request: AnonSpreadsheetId): Request_[BatchUpdateValuesByDataFilterResponse] = js.native
  /**
    * Clears values from a spreadsheet.
    * The caller must specify the spreadsheet ID and range.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def clear(request: AnonRange): Request_[ClearValuesResponse] = js.native
  def clear(request: AnonUploadType, body: ClearValuesRequest): Request_[ClearValuesResponse] = js.native
  /**
    * Returns a range of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and a range.
    */
  def get(): Request_[ValueRange] = js.native
  def get(request: AnonMajorDimension): Request_[ValueRange] = js.native
  /**
    * Sets values in a range of a spreadsheet.
    * The caller must specify the spreadsheet ID, range, and
    * a valueInputOption.
    */
  def update(request: AnonResponseDateTimeRenderOption): Request_[UpdateValuesResponse] = js.native
  def update(request: AnonResponseValueRenderOption, body: ValueRange): Request_[UpdateValuesResponse] = js.native
}

