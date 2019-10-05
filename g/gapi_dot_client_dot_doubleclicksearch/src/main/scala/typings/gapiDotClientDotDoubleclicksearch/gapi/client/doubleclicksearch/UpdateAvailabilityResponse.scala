package typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAvailabilityResponse extends js.Object {
  /** The availabilities being returned. */
  var availabilities: js.UndefOr[js.Array[Availability]] = js.undefined
}

object UpdateAvailabilityResponse {
  @scala.inline
  def apply(availabilities: js.Array[Availability] = null): UpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (availabilities != null) __obj.updateDynamic("availabilities")(availabilities)
    __obj.asInstanceOf[UpdateAvailabilityResponse]
  }
}

