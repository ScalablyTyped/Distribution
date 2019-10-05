package typings.gapiDotClientDotQpxexpress.gapi.client.qpxexpress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripsSearchResponse extends js.Object {
  /** Identifies this as a QPX Express API search response resource. Value: the fixed string qpxExpress#tripsSearch. */
  var kind: js.UndefOr[String] = js.undefined
  /** All possible solutions to the QPX Express search request. */
  var trips: js.UndefOr[TripOptionsResponse] = js.undefined
}

object TripsSearchResponse {
  @scala.inline
  def apply(kind: String = null, trips: TripOptionsResponse = null): TripsSearchResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (trips != null) __obj.updateDynamic("trips")(trips)
    __obj.asInstanceOf[TripsSearchResponse]
  }
}

