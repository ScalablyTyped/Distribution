package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import typings.gapiClient.gapi.client.Request
import typings.gapiClientQpxexpress.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: Alt): Request[TripsSearchResponse]
}

object TripsResource {
  @scala.inline
  def apply(search: Alt => Request[TripsSearchResponse]): TripsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[TripsResource]
  }
}

