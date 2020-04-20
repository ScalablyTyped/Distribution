package typings.gapiClientMirror.gapi.client.mirror

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientMirror.AnonAlt
import typings.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: AnonAlt): Request_[Location]
  /** Retrieves a list of locations for the user. */
  def list(request: AnonFields): Request_[LocationsListResponse]
}

object LocationsResource {
  @scala.inline
  def apply(get: AnonAlt => Request_[Location], list: AnonFields => Request_[LocationsListResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[LocationsResource]
  }
}

