package typings.gapiDotClientDotQpxexpress.gapiNs.clientNs.qpxexpressNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotQpxexpress.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: Anon_Alt): Request[TripsSearchResponse]
}

object TripsResource {
  @scala.inline
  def apply(search: Anon_Alt => Request[TripsSearchResponse]): TripsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
  
    __obj.asInstanceOf[TripsResource]
  }
}

