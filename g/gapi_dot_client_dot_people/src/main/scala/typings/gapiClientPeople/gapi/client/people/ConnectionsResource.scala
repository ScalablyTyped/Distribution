package typings.gapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPeople.AnonPageSize
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
  def list(): Request_[ListConnectionsResponse] = js.native
  def list(request: AnonPageSize): Request_[ListConnectionsResponse] = js.native
}

