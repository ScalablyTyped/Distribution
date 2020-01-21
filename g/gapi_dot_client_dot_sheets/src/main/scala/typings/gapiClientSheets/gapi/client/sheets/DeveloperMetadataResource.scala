package typings.gapiClientSheets.gapi.client.sheets

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSheets.AnonAccesstoken
import typings.gapiClientSheets.AnonAccesstokenAlt
import typings.gapiClientSheets.AnonAccesstokenAltCallback
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
  def get(request: AnonAccesstoken): Request_[DeveloperMetadata] = js.native
  /**
    * Returns all developer metadata matching the specified DataFilter.
    * If the provided DataFilter represents a DeveloperMetadataLookup object,
    * this will return all DeveloperMetadata entries selected by it. If the
    * DataFilter represents a location in a spreadsheet, this will return all
    * developer metadata associated with locations intersecting that region.
    */
  def search(request: AnonAccesstokenAlt): Request_[SearchDeveloperMetadataResponse] = js.native
  def search(request: AnonAccesstokenAltCallback, body: SearchDeveloperMetadataRequest): Request_[SearchDeveloperMetadataResponse] = js.native
}

