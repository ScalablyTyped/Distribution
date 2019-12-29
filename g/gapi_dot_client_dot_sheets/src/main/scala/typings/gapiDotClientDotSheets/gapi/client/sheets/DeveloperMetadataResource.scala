package typings.gapiDotClientDotSheets.gapi.client.sheets

import typings.gapiDotClientDotSheets.Anon_Accesstoken
import typings.gapiDotClientDotSheets.Anon_AccesstokenAlt
import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeveloperMetadataResource extends js.Object {
  /**
    * Returns the developer metadata with the specified ID.
    * The caller must specify the spreadsheet ID and the developer metadata's
    * unique metadataId.
    */
  def get(request: Anon_Accesstoken): typings.gapiDotClient.gapi.client.Request[DeveloperMetadata] = js.native
  /**
    * Returns all developer metadata matching the specified DataFilter.
    * If the provided DataFilter represents a DeveloperMetadataLookup object,
    * this will return all DeveloperMetadata entries selected by it. If the
    * DataFilter represents a location in a spreadsheet, this will return all
    * developer metadata associated with locations intersecting that region.
    */
  def search(request: Anon_AccesstokenAlt): typings.gapiDotClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
  def search(request: Anon_AccesstokenAltCallback, body: SearchDeveloperMetadataRequest): typings.gapiDotClient.gapi.client.Request[SearchDeveloperMetadataResponse] = js.native
}

