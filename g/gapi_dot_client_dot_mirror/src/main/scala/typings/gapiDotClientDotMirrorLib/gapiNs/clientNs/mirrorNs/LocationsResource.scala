package typings
package gapiDotClientDotMirrorLib.gapiNs.clientNs.mirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Gets a single location by ID. */
  def get(request: gapiDotClientDotMirrorLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Retrieves a list of locations for the user. */
  def list(request: gapiDotClientDotMirrorLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[LocationsListResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotMirrorLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Location],
    list: gapiDotClientDotMirrorLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[LocationsListResponse]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[LocationsResource]
  }
}

