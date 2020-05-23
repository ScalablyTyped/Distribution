package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AcceptsInStreamVideoPlacements
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: Fields): Request[DirectorySite]
  /** Inserts a new directory site. */
  def insert(request: Key): Request[DirectorySite]
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: AcceptsInStreamVideoPlacements): Request[DirectorySitesListResponse]
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: Fields => Request[DirectorySite],
    insert: Key => Request[DirectorySite],
    list: AcceptsInStreamVideoPlacements => Request[DirectorySitesListResponse]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DirectorySitesResource]
  }
}

