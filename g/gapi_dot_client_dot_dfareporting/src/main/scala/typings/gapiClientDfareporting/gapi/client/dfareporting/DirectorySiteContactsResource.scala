package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonDirectorySiteIds
import typings.gapiClientDfareporting.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySiteContactsResource extends js.Object {
  /** Gets one directory site contact by ID. */
  def get(request: AnonFields): Request_[DirectorySiteContact]
  /** Retrieves a list of directory site contacts, possibly filtered. This method supports paging. */
  def list(request: AnonDirectorySiteIds): Request_[DirectorySiteContactsListResponse]
}

object DirectorySiteContactsResource {
  @scala.inline
  def apply(
    get: AnonFields => Request_[DirectorySiteContact],
    list: AnonDirectorySiteIds => Request_[DirectorySiteContactsListResponse]
  ): DirectorySiteContactsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DirectorySiteContactsResource]
  }
}

