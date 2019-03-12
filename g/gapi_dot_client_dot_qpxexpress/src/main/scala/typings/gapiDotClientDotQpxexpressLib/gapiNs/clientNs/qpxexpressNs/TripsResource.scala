package typings
package gapiDotClientDotQpxexpressLib.gapiNs.clientNs.qpxexpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: gapiDotClientDotQpxexpressLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[TripsSearchResponse]
}

object TripsResource {
  @scala.inline
  def apply(
    search: gapiDotClientDotQpxexpressLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[TripsSearchResponse]
  ): TripsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[TripsResource]
  }
}

