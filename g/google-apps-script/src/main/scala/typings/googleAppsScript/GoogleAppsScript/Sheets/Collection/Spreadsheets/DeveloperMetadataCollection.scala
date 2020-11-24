package typings.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadata
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataRequest
import typings.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperMetadataCollection extends js.Object {
  
  // Returns the developer metadata with the specified ID.
  // The caller must specify the spreadsheet ID and the developer metadata's
  // unique metadataId.
  def get(spreadsheetId: String, metadataId: Double): DeveloperMetadata = js.native
  
  // Returns all developer metadata matching the specified DataFilter.
  // If the provided DataFilter represents a DeveloperMetadataLookup object,
  // this will return all DeveloperMetadata entries selected by it. If the
  // DataFilter represents a location in a spreadsheet, this will return all
  // developer metadata associated with locations intersecting that region.
  def search(resource: SearchDeveloperMetadataRequest, spreadsheetId: String): SearchDeveloperMetadataResponse = js.native
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
  
  @scala.inline
  implicit class DeveloperMetadataCollectionOps[Self <: DeveloperMetadataCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: (String, Double) => DeveloperMetadata): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSearch(value: (SearchDeveloperMetadataRequest, String) => SearchDeveloperMetadataResponse): Self = this.set("search", js.Any.fromFunction2(value))
  }
}
