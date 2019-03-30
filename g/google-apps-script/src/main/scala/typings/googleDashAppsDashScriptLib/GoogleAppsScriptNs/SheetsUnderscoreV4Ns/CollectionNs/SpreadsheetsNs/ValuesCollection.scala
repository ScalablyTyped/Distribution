package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.CollectionNs.SpreadsheetsNs

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
  def append(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ValueRange,
    spreadsheetId: java.lang.String,
    range: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.AppendValuesResponse = js.native
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
  def append(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ValueRange,
    spreadsheetId: java.lang.String,
    range: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.AppendValuesResponse = js.native
  // Clears one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more ranges.
  // Only values are cleared -- all other properties of the cell (such as
  // formatting, data validation, etc..) are kept.
  def batchClear(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchClearValuesRequest,
    spreadsheetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchClearValuesResponse = js.native
  // Clears one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more
  // DataFilters. Ranges matching any of the specified data
  // filters will be cleared.  Only values are cleared -- all other properties
  // of the cell (such as formatting, data validation, etc..) are kept.
  def batchClearByDataFilter(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchClearValuesByDataFilterRequest,
    spreadsheetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchClearValuesByDataFilterResponse = js.native
  // Returns one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more ranges.
  def batchGet(spreadsheetId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchGetValuesResponse = js.native
  // Returns one or more ranges of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and one or more ranges.
  def batchGet(spreadsheetId: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchGetValuesResponse = js.native
  // Returns one or more ranges of values that match the specified data filters.
  // The caller must specify the spreadsheet ID and one or more
  // DataFilters.  Ranges that match any of the data filters in
  // the request will be returned.
  def batchGetByDataFilter(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchGetValuesByDataFilterRequest,
    spreadsheetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchGetValuesByDataFilterResponse = js.native
  // Sets values in one or more ranges of a spreadsheet.
  // The caller must specify the spreadsheet ID,
  // a valueInputOption, and one or more
  // ValueRanges.
  def batchUpdate(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchUpdateValuesRequest,
    spreadsheetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchUpdateValuesResponse = js.native
  // Sets values in one or more ranges of a spreadsheet.
  // The caller must specify the spreadsheet ID,
  // a valueInputOption, and one or more
  // DataFilterValueRanges.
  def batchUpdateByDataFilter(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchUpdateValuesByDataFilterRequest,
    spreadsheetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.BatchUpdateValuesByDataFilterResponse = js.native
  // Clears values from a spreadsheet.
  // The caller must specify the spreadsheet ID and range.
  // Only values are cleared -- all other properties of the cell (such as
  // formatting, data validation, etc..) are kept.
  def clear(
    resource: js.Any,
    /* Schema.ClearValuesRequest */ spreadsheetId: java.lang.String,
    range: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ClearValuesResponse = js.native
  // Returns a range of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and a range.
  def get(spreadsheetId: java.lang.String, range: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ValueRange = js.native
  // Returns a range of values from a spreadsheet.
  // The caller must specify the spreadsheet ID and a range.
  def get(spreadsheetId: java.lang.String, range: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ValueRange = js.native
  // Sets values in a range of a spreadsheet.
  // The caller must specify the spreadsheet ID, range, and
  // a valueInputOption.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ValueRange,
    spreadsheetId: java.lang.String,
    range: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.UpdateValuesResponse = js.native
  // Sets values in a range of a spreadsheet.
  // The caller must specify the spreadsheet ID, range, and
  // a valueInputOption.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.ValueRange,
    spreadsheetId: java.lang.String,
    range: java.lang.String,
    optionalArgs: js.Object
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.UpdateValuesResponse = js.native
}

