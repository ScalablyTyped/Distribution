package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonAcceptsInStreamVideoPlacements
import typings.gapiClientDfareporting.AnonAltFields
import typings.gapiClientDfareporting.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: AnonAltFields): Request_[DirectorySite]
  /** Inserts a new directory site. */
  def insert(request: AnonAltFieldsKey): Request_[DirectorySite]
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: AnonAcceptsInStreamVideoPlacements): Request_[DirectorySitesListResponse]
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: AnonAltFields => Request_[DirectorySite],
    insert: AnonAltFieldsKey => Request_[DirectorySite],
    list: AnonAcceptsInStreamVideoPlacements => Request_[DirectorySitesListResponse]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DirectorySitesResource]
  }
}

