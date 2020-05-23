package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPeople.anon.PageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionsResource extends js.Object {
  /**
    * Provides a list of the authenticated user's contacts merged with any
    * connected profiles.
    *
    * The request throws a 400 error if 'personFields' is not specified.
    */
  def list(): Request[ListConnectionsResponse] = js.native
  def list(request: PageSize): Request[ListConnectionsResponse] = js.native
}

