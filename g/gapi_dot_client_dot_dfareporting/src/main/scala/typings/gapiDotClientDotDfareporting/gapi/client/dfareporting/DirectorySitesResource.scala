package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AcceptsInStreamVideoPlacements
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import typings.gapiDotClientDotDfareporting.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySitesResource extends js.Object {
  /** Gets one directory site by ID. */
  def get(request: Anon_AltFields): Request[DirectorySite]
  /** Inserts a new directory site. */
  def insert(request: Anon_AltFieldsKey): Request[DirectorySite]
  /** Retrieves a list of directory sites, possibly filtered. This method supports paging. */
  def list(request: Anon_AcceptsInStreamVideoPlacements): Request[DirectorySitesListResponse]
}

object DirectorySitesResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[DirectorySite],
    insert: Anon_AltFieldsKey => Request[DirectorySite],
    list: Anon_AcceptsInStreamVideoPlacements => Request[DirectorySitesListResponse]
  ): DirectorySitesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DirectorySitesResource]
  }
}

