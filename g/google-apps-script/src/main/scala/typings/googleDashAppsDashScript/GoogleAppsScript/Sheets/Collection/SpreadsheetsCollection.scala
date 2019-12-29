package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Collection

import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Collection.Spreadsheets.DeveloperMetadataCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Collection.Spreadsheets.SheetsCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Collection.Spreadsheets.ValuesCollection
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.BatchUpdateSpreadsheetRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.BatchUpdateSpreadsheetResponse
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.GetSpreadsheetByDataFilterRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.Spreadsheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadsheetsCollection extends js.Object {
  var DeveloperMetadata: js.UndefOr[DeveloperMetadataCollection] = js.native
  var Sheets: js.UndefOr[SheetsCollection] = js.native
  var Values: js.UndefOr[ValuesCollection] = js.native
  // Applies one or more updates to the spreadsheet.
  // Each request is validated before
  // being applied. If any request is not valid then the entire request will
  // fail and nothing will be applied.
  // Some requests have replies to
  // give you some information about how
  // they are applied. The replies will mirror the requests.  For example,
  // if you applied 4 updates and the 3rd one had a reply, then the
  // response will have 2 empty replies, the actual reply, and another empty
  // reply, in that order.
  // Due to the collaborative nature of spreadsheets, it is not guaranteed that
  // the spreadsheet will reflect exactly your changes after this completes,
  // however it is guaranteed that the updates in the request will be
  // applied together atomically. Your changes may be altered with respect to
  // collaborator changes. If there are no collaborators, the spreadsheet
  // should reflect your changes.
  def batchUpdate(resource: BatchUpdateSpreadsheetRequest, spreadsheetId: String): BatchUpdateSpreadsheetResponse = js.native
  // Creates a spreadsheet, returning the newly created spreadsheet.
  def create(resource: Spreadsheet): Spreadsheet = js.native
  // Returns the spreadsheet at the given ID.
  // The caller must specify the spreadsheet ID.
  // By default, data within grids will not be returned.
  // You can include grid data one of two ways:
  // * Specify a field mask listing your desired fields using the `fields` URL
  // parameter in HTTP
  // * Set the includeGridData
  // URL parameter to true.  If a field mask is set, the `includeGridData`
  // parameter is ignored
  // For large spreadsheets, it is recommended to retrieve only the specific
  // fields of the spreadsheet that you want.
  // To retrieve only subsets of the spreadsheet, use the
  // ranges URL parameter.
  // Multiple ranges can be specified.  Limiting the range will
  // return only the portions of the spreadsheet that intersect the requested
  // ranges. Ranges are specified using A1 notation.
  def get(spreadsheetId: String): Spreadsheet = js.native
  // Returns the spreadsheet at the given ID.
  // The caller must specify the spreadsheet ID.
  // By default, data within grids will not be returned.
  // You can include grid data one of two ways:
  // * Specify a field mask listing your desired fields using the `fields` URL
  // parameter in HTTP
  // * Set the includeGridData
  // URL parameter to true.  If a field mask is set, the `includeGridData`
  // parameter is ignored
  // For large spreadsheets, it is recommended to retrieve only the specific
  // fields of the spreadsheet that you want.
  // To retrieve only subsets of the spreadsheet, use the
  // ranges URL parameter.
  // Multiple ranges can be specified.  Limiting the range will
  // return only the portions of the spreadsheet that intersect the requested
  // ranges. Ranges are specified using A1 notation.
  def get(spreadsheetId: String, optionalArgs: js.Object): Spreadsheet = js.native
  // Returns the spreadsheet at the given ID.
  // The caller must specify the spreadsheet ID.
  // This method differs from GetSpreadsheet in that it allows selecting
  // which subsets of spreadsheet data to return by specifying a
  // dataFilters parameter.
  // Multiple DataFilters can be specified.  Specifying one or
  // more data filters will return the portions of the spreadsheet that
  // intersect ranges matched by any of the filters.
  // By default, data within grids will not be returned.
  // You can include grid data one of two ways:
  // * Specify a field mask listing your desired fields using the `fields` URL
  // parameter in HTTP
  // * Set the includeGridData
  // parameter to true.  If a field mask is set, the `includeGridData`
  // parameter is ignored
  // For large spreadsheets, it is recommended to retrieve only the specific
  // fields of the spreadsheet that you want.
  def getByDataFilter(resource: GetSpreadsheetByDataFilterRequest, spreadsheetId: String): Spreadsheet = js.native
}

