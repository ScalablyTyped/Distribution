package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetsResource extends js.Object {
  var developerMetadata: DeveloperMetadataResource
  var sheets: SheetsResource
  var values: ValuesResource
  /**
    * Applies one or more updates to the spreadsheet.
    *
    * Each request is validated before
    * being applied. If any request is not valid then the entire request will
    * fail and nothing will be applied.
    *
    * Some requests have replies to
    * give you some information about how
    * they are applied. The replies will mirror the requests.  For example,
    * if you applied 4 updates and the 3rd one had a reply, then the
    * response will have 2 empty replies, the actual reply, and another empty
    * reply, in that order.
    *
    * Due to the collaborative nature of spreadsheets, it is not guaranteed that
    * the spreadsheet will reflect exactly your changes after this completes,
    * however it is guaranteed that the updates in the request will be
    * applied together atomically. Your changes may be altered with respect to
    * collaborator changes. If there are no collaborators, the spreadsheet
    * should reflect your changes.
    */
  def batchUpdate(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateSpreadsheetResponse]
  /** Creates a spreadsheet, returning the newly created spreadsheet. */
  def create(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Spreadsheet]
  /**
    * Returns the spreadsheet at the given ID.
    * The caller must specify the spreadsheet ID.
    *
    * By default, data within grids will not be returned.
    * You can include grid data one of two ways:
    *
    * &#42; Specify a field mask listing your desired fields using the `fields` URL
    * parameter in HTTP
    *
    * &#42; Set the includeGridData
    * URL parameter to true.  If a field mask is set, the `includeGridData`
    * parameter is ignored
    *
    * For large spreadsheets, it is recommended to retrieve only the specific
    * fields of the spreadsheet that you want.
    *
    * To retrieve only subsets of the spreadsheet, use the
    * ranges URL parameter.
    * Multiple ranges can be specified.  Limiting the range will
    * return only the portions of the spreadsheet that intersect the requested
    * ranges. Ranges are specified using A1 notation.
    */
  def get(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFieldsIncludeGridData): gapiDotClientLib.gapiNs.clientNs.Request[Spreadsheet]
  /**
    * Returns the spreadsheet at the given ID.
    * The caller must specify the spreadsheet ID.
    *
    * This method differs from GetSpreadsheet in that it allows selecting
    * which subsets of spreadsheet data to return by specifying a
    * dataFilters parameter.
    * Multiple DataFilters can be specified.  Specifying one or
    * more data filters will return the portions of the spreadsheet that
    * intersect ranges matched by any of the filters.
    *
    * By default, data within grids will not be returned.
    * You can include grid data one of two ways:
    *
    * &#42; Specify a field mask listing your desired fields using the `fields` URL
    * parameter in HTTP
    *
    * &#42; Set the includeGridData
    * parameter to true.  If a field mask is set, the `includeGridData`
    * parameter is ignored
    *
    * For large spreadsheets, it is recommended to retrieve only the specific
    * fields of the spreadsheet that you want.
    */
  def getByDataFilter(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Spreadsheet]
}

object SpreadsheetsResource {
  @scala.inline
  def apply(
    batchUpdate: js.Function1[
      gapiDotClientDotSheetsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[BatchUpdateSpreadsheetResponse]
    ],
    create: js.Function1[
      gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Spreadsheet]
    ],
    developerMetadata: DeveloperMetadataResource,
    get: js.Function1[
      gapiDotClientDotSheetsLib.Anon_AccesstokenAltBearertokenCallbackFieldsIncludeGridData, 
      gapiDotClientLib.gapiNs.clientNs.Request[Spreadsheet]
    ],
    getByDataFilter: js.Function1[
      gapiDotClientDotSheetsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Spreadsheet]
    ],
    sheets: SheetsResource,
    values: ValuesResource
  ): SpreadsheetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batchUpdate")(batchUpdate)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("developerMetadata")(developerMetadata)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("getByDataFilter")(getByDataFilter)
    __obj.updateDynamic("sheets")(sheets)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SpreadsheetsResource]
  }
}

