package typings.gapiDotClientDotMirror.gapi.client.mirror

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotMirror.Anon_Alt
import typings.gapiDotClientDotMirror.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: Anon_Alt): Request[Location]
  /** Retrieves a list of locations for the user. */
  def list(request: Anon_AltFields): Request[LocationsListResponse]
}

object LocationsResource {
  @scala.inline
  def apply(get: Anon_Alt => Request[Location], list: Anon_AltFields => Request[LocationsListResponse]): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

