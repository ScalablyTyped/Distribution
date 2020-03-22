package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDfareporting.AnonFields
import typings.gapiClientDfareporting.AnonSearchString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Gets one project by ID. */
  def get(request: AnonFields): Request_[Project]
  /** Retrieves a list of projects, possibly filtered. This method supports paging. */
  def list(request: AnonSearchString): Request_[ProjectsListResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(get: AnonFields => Request_[Project], list: AnonSearchString => Request_[ProjectsListResponse]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

