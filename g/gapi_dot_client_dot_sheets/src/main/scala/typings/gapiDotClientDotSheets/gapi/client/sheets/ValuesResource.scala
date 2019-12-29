package typings.gapiDotClientDotSheets.gapi.client.sheets

import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallback
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackDateTimeRenderOption
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackDateTimeRenderOptionFields
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponse
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponseInsertDataOption
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponseKey
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponseKeyOauthtoken
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtoken
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrint
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUser
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserRange
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserRangeSpreadsheetId
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResource
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceSpreadsheetId
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
  def append(request: Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponse): typings.gapiDotClient.gapi.client.Request[AppendValuesResponse] = js.native
  def append(
    request: Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponseInsertDataOption,
    body: ValueRange
  ): typings.gapiDotClient.gapi.client.Request[AppendValuesResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def batchClear(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtoken): typings.gapiDotClient.gapi.client.Request[BatchClearValuesResponse] = js.native
  def batchClear(request: Anon_AccesstokenAltCallback, body: BatchClearValuesRequest): typings.gapiDotClient.gapi.client.Request[BatchClearValuesResponse] = js.native
  /**
    * Clears one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters. Ranges matching any of the specified data
    * filters will be cleared.  Only values are cleared -- all other properties
    * of the cell (such as formatting, data validation, etc..) are kept.
    */
  def batchClearByDataFilter(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrint): typings.gapiDotClient.gapi.client.Request[BatchClearValuesByDataFilterResponse] = js.native
  def batchClearByDataFilter(request: Anon_AccesstokenAltCallback, body: BatchClearValuesByDataFilterRequest): typings.gapiDotClient.gapi.client.Request[BatchClearValuesByDataFilterResponse] = js.native
  /**
    * Returns one or more ranges of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and one or more ranges.
    */
  def batchGet(request: Anon_AccesstokenAltCallbackDateTimeRenderOption): typings.gapiDotClient.gapi.client.Request[BatchGetValuesResponse] = js.native
  /**
    * Returns one or more ranges of values that match the specified data filters.
    * The caller must specify the spreadsheet ID and one or more
    * DataFilters.  Ranges that match any of the data filters in
    * the request will be returned.
    */
  def batchGetByDataFilter(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUser): typings.gapiDotClient.gapi.client.Request[BatchGetValuesByDataFilterResponse] = js.native
  def batchGetByDataFilter(request: Anon_AccesstokenAltCallback, body: BatchGetValuesByDataFilterRequest): typings.gapiDotClient.gapi.client.Request[BatchGetValuesByDataFilterResponse] = js.native
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * ValueRanges.
    */
  def batchUpdate(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResource): typings.gapiDotClient.gapi.client.Request[BatchUpdateValuesResponse] = js.native
  def batchUpdate(request: Anon_AccesstokenAltCallback, body: BatchUpdateValuesRequest): typings.gapiDotClient.gapi.client.Request[BatchUpdateValuesResponse] = js.native
  /**
    * Sets values in one or more ranges of a spreadsheet.
    * The caller must specify the spreadsheet ID,
    * a valueInputOption, and one or more
    * DataFilterValueRanges.
    */
  def batchUpdateByDataFilter(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserResourceSpreadsheetId): typings.gapiDotClient.gapi.client.Request[BatchUpdateValuesByDataFilterResponse] = js.native
  def batchUpdateByDataFilter(request: Anon_AccesstokenAltCallback, body: BatchUpdateValuesByDataFilterRequest): typings.gapiDotClient.gapi.client.Request[BatchUpdateValuesByDataFilterResponse] = js.native
  /**
    * Clears values from a spreadsheet.
    * The caller must specify the spreadsheet ID and range.
    * Only values are cleared -- all other properties of the cell (such as
    * formatting, data validation, etc..) are kept.
    */
  def clear(request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserRange): typings.gapiDotClient.gapi.client.Request[ClearValuesResponse] = js.native
  def clear(
    request: Anon_AccesstokenAltCallbackFieldsKeyOauthtokenPrettyPrintQuotaUserRangeSpreadsheetId,
    body: ClearValuesRequest
  ): typings.gapiDotClient.gapi.client.Request[ClearValuesResponse] = js.native
  /**
    * Returns a range of values from a spreadsheet.
    * The caller must specify the spreadsheet ID and a range.
    */
  def get(request: Anon_AccesstokenAltCallbackDateTimeRenderOptionFields): typings.gapiDotClient.gapi.client.Request[ValueRange] = js.native
  /**
    * Sets values in a range of a spreadsheet.
    * The caller must specify the spreadsheet ID, range, and
    * a valueInputOption.
    */
  def update(request: Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponseKey): typings.gapiDotClient.gapi.client.Request[UpdateValuesResponse] = js.native
  def update(request: Anon_AccesstokenAltCallbackFieldsIncludeValuesInResponseKeyOauthtoken, body: ValueRange): typings.gapiDotClient.gapi.client.Request[UpdateValuesResponse] = js.native
}

