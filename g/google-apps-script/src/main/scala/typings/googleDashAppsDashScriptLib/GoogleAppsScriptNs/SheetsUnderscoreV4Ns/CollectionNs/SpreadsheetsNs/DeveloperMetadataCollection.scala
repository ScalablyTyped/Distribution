package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.CollectionNs.SpreadsheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataCollection extends js.Object {
  // Returns the developer metadata with the specified ID.
  // The caller must specify the spreadsheet ID and the developer metadata's
  // unique metadataId.
  def get(spreadsheetId: java.lang.String, metadataId: scala.Double): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.DeveloperMetadata
  // Returns all developer metadata matching the specified DataFilter.
  // If the provided DataFilter represents a DeveloperMetadataLookup object,
  // this will return all DeveloperMetadata entries selected by it. If the
  // DataFilter represents a location in a spreadsheet, this will return all
  // developer metadata associated with locations intersecting that region.
  def search(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.SearchDeveloperMetadataRequest,
    spreadsheetId: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.SearchDeveloperMetadataResponse
}

object DeveloperMetadataCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, scala.Double) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.DeveloperMetadata,
    search: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.SearchDeveloperMetadataRequest, java.lang.String) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs.SearchDeveloperMetadataResponse
  ): DeveloperMetadataCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), search = js.Any.fromFunction2(search))
  
    __obj.asInstanceOf[DeveloperMetadataCollection]
  }
}

