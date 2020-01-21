package typings.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.AppendValuesResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesByDataFilterRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesByDataFilterResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchClearValuesResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesByDataFilterRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesByDataFilterResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchGetValuesResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesByDataFilterRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesByDataFilterResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.BatchUpdateValuesResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.ClearValuesResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.UpdateValuesResponse
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.ValueRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValuesCollection extends js.Object {
  // Appends values to a spreadsheet. The input range is used to search for
  // existing data and find a "table" within that range. Values will be
  // appended to the next row of the table, starting with the first column of
  // the table. See the
  // [guide](/sheets/api/guides/values#appending_values)
  // and
  // [sample code](/sheets/api/samples/writing#append_values)
  // for specific details of how tables are detected and data is appended.
  // The caller must specify the spreadsheet ID, range, and
  // a valueInputOption.  The `valueInputOption` only
  // controls how the input data will be added to the sheet (column-wise or
  // row-wise), it does not influence what cell the data starts being written
  // to.
  def append(resource: ValueRange, spreadsheetId: String, range: String): AppendValuesResponse = js.native
  // Appends values to a spreadsheet. The input range is used to search for
  // existing data and find a "table" within that range. Values will be
  // appended to the next row of the table, starting with the first column of
  // the table. See the
  // [guide](/sheets/api/guides/values#appending_values)
  // and
  // [sample code](/sheets/api/samples/writing#append_values)
  // for specific details of how tables are detected and data is appended.
  // The caller must specify the spreadsheet ID, range, and
  // a valueInputOption.  The `valueInputOption` only
  // controls how the input data will be added to the sheet (column-wise or
  // row-wise), it does not influence what cell the data starts being written
  // to.
  def append(resource: ValueRange, spreadsheetId: String, range: String, optionalArgs: js.Object): AppendValuesResponse = js.native
  // Clears one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more ranges.
  // Only values are cleared -- all other properties of the cell (such as
  // formatting, data validation, etc..) are kept.
  def batchClear(resource: BatchClearValuesRequest, spreadsheetId: String): BatchClearValuesResponse = js.native
  // Clears one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more
  // DataFilters. Ranges matching any of the specified data
  // filters will be cleared.  Only values are cleared -- all other properties
  // of the cell (such as formatting, data validation, etc..) are kept.
  def batchClearByDataFilter(resource: BatchClearValuesByDataFilterRequest, spreadsheetId: String): BatchClearValuesByDataFilterResponse = js.native
  // Returns one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more ranges.
  def batchGet(spreadsheetId: String): BatchGetValuesResponse = js.native
  // Returns one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more ranges.
  def batchGet(spreadsheetId: String, optionalArgs: js.Object): BatchGetValuesResponse = js.native
  // Returns one or more ranges of values that match the specified data filters.
  // The caller must specify the spreadsheet ID and one or more
  // DataFilters.  Ranges that match any of the data filters in
  // the request will be returned.
  def batchGetByDataFilter(resource: BatchGetValuesByDataFilterRequest, spreadsheetId: String): BatchGetValuesByDataFilterResponse = js.native
  // Sets values in one or more ranges of a spreadsheet.
  // The caller must specify the spreadsheet ID,
  // a valueInputOption, and one or more
  // ValueRanges.
  def batchUpdate(resource: BatchUpdateValuesRequest, spreadsheetId: String): BatchUpdateValuesResponse = js.native
  // Sets values in one or more ranges of a spreadsheet.
  // The caller must specify the spreadsheet ID,
  // a valueInputOption, and one or more
  // DataFilterValueRanges.
  def batchUpdateByDataFilter(resource: BatchUpdateValuesByDataFilterRequest, spreadsheetId: String): BatchUpdateValuesByDataFilterResponse = js.native
  // Clears values from a spreadsheet.
  // The caller must specify the spreadsheet ID and range.
  // Only values are cleared -- all other properties of the cell (such as
  // formatting, data validation, etc..) are kept.
  def clear(resource: js.Any, /* Schema.ClearValuesRequest */ spreadsheetId: String, range: String): ClearValuesResponse = js.native
  // Returns a range of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and a range.
  def get(spreadsheetId: String, range: String): ValueRange = js.native
  // Returns a range of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and a range.
  def get(spreadsheetId: String, range: String, optionalArgs: js.Object): ValueRange = js.native
  // Sets values in a range of a spreadsheet.
  // The caller must specify the spreadsheet ID, range, and
  // a valueInputOption.
  def update(resource: ValueRange, spreadsheetId: String, range: String): UpdateValuesResponse = js.native
  // Sets values in a range of a spreadsheet.
  // The caller must specify the spreadsheet ID, range, and
  // a valueInputOption.
  def update(resource: ValueRange, spreadsheetId: String, range: String, optionalArgs: js.Object): UpdateValuesResponse = js.native
}

