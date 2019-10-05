package typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadata
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataRequest
import typings.googleDashAppsDashScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataCollection extends js.Object {
  // Returns the developer metadata with the specified ID.
  // The caller must specify the spreadsheet ID and the developer metadata's
  // unique metadataId.
  def get(spreadsheetId: String, metadataId: Double): DeveloperMetadata
  // Returns all developer metadata matching the specified DataFilter.
  // If the provided DataFilter represents a DeveloperMetadataLookup object,
  // this will return all DeveloperMetadata entries selected by it. If the
  // DataFilter represents a location in a spreadsheet, this will return all
  // developer metadata associated with locations intersecting that region.
  def search(resource: SearchDeveloperMetadataRequest, spreadsheetId: String): SearchDeveloperMetadataResponse
}

object DeveloperMetadataCollection {
  @scala.inline
  def apply(
    get: (String, Double) => DeveloperMetadata,
    search: (SearchDeveloperMetadataRequest, String) => SearchDeveloperMetadataResponse
  ): DeveloperMetadataCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), search = js.Any.fromFunction2(search))
  
    __obj.asInstanceOf[DeveloperMetadataCollection]
  }
}

