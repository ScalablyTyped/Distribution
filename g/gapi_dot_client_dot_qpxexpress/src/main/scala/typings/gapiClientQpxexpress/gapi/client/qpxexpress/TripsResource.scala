package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import typings.gapiClient.gapi.client.Request
import typings.gapiClientQpxexpress.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripsResource extends js.Object {
  /** Returns a list of flights. */
  def search(request: Alt): Request[TripsSearchResponse] = js.native
}

object TripsResource {
  @scala.inline
  def apply(search: Alt => Request[TripsSearchResponse]): TripsResource = {
    val __obj = js.Dynamic.literal(search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[TripsResource]
  }
  @scala.inline
  implicit class TripsResourceOps[Self <: TripsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSearch(value: Alt => Request[TripsSearchResponse]): Self = this.set("search", js.Any.fromFunction1(value))
  }
  
}

