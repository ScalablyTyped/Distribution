package typings.gapiClientQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TripsSearchResponse extends js.Object {
  /** Identifies this as a QPX Express API search response resource. Value: the fixed string qpxExpress#tripsSearch. */
  var kind: js.UndefOr[String] = js.native
  /** All possible solutions to the QPX Express search request. */
  var trips: js.UndefOr[TripOptionsResponse] = js.native
}

object TripsSearchResponse {
  @scala.inline
  def apply(): TripsSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripsSearchResponse]
  }
  @scala.inline
  implicit class TripsSearchResponseOps[Self <: TripsSearchResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setTrips(value: TripOptionsResponse): Self = this.set("trips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrips: Self = this.set("trips", js.undefined)
  }
  
}

