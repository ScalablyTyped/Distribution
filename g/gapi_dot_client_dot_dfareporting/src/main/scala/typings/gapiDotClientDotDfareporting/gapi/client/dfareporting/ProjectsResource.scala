package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDfareporting.Anon_AdvertiserIds
import typings.gapiDotClientDotDfareporting.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  /** Gets one project by ID. */
  def get(request: Anon_AltFields): Request[Project]
  /** Retrieves a list of projects, possibly filtered. This method supports paging. */
  def list(request: Anon_AdvertiserIds): Request[ProjectsListResponse]
}

object ProjectsResource {
  @scala.inline
  def apply(get: Anon_AltFields => Request[Project], list: Anon_AdvertiserIds => Request[ProjectsListResponse]): ProjectsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

