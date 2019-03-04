package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataResource extends js.Object {
  /**
    * Returns the developer metadata with the specified ID.
    * The caller must specify the spreadsheet ID and the developer metadata's
    * unique metadataId.
    */
  def get(request: gapiDotClientDotSheetsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[DeveloperMetadata]
  /**
    * Returns all developer metadata matching the specified DataFilter.
    * If the provided DataFilter represents a DeveloperMetadataLookup object,
    * this will return all DeveloperMetadata entries selected by it. If the
    * DataFilter represents a location in a spreadsheet, this will return all
    * developer metadata associated with locations intersecting that region.
    */
  def search(request: gapiDotClientDotSheetsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[SearchDeveloperMetadataResponse]
}

object DeveloperMetadataResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotSheetsLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[DeveloperMetadata]
    ],
    search: js.Function1[
      gapiDotClientDotSheetsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[SearchDeveloperMetadataResponse]
    ]
  ): DeveloperMetadataResource = {
    val __obj = js.Dynamic.literal(get = get, search = search)
  
    __obj.asInstanceOf[DeveloperMetadataResource]
  }
}

