package typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAvailabilityRequest extends js.Object {
  /** The availabilities being requested. */
  var availabilities: js.UndefOr[js.Array[Availability]] = js.undefined
}

object UpdateAvailabilityRequest {
  @scala.inline
  def apply(availabilities: js.Array[Availability] = null): UpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    if (availabilities != null) __obj.updateDynamic("availabilities")(availabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAvailabilityRequest]
  }
}

