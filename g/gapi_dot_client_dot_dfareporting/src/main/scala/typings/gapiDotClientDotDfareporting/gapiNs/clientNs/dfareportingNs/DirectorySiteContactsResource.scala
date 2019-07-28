package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotDfareporting.Anon_AltDirectorySiteIds
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsResource extends js.Object {
  /** Gets one directory site contact by ID. */
  def get(request: Anon_AltFields): Request[DirectorySiteContact]
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: Anon_AltDirectorySiteIds): Request[DirectorySiteContactsListResponse]
}

object DirectorySiteContactsResource {
  @scala.inline
  def apply(
    get: Anon_AltFields => Request[DirectorySiteContact],
    list: Anon_AltDirectorySiteIds => Request[DirectorySiteContactsListResponse]
  ): DirectorySiteContactsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[DirectorySiteContactsResource]
  }
}

