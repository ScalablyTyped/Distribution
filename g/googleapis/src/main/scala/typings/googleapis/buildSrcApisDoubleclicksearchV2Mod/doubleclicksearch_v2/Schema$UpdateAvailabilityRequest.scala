package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request to update availability.
  */
@js.native
trait Schema$UpdateAvailabilityRequest extends js.Object {
  /**
    * The availabilities being requested.
    */
  var availabilities: js.UndefOr[js.Array[Schema$Availability]] = js.native
}

object Schema$UpdateAvailabilityRequest {
  @scala.inline
  def apply(availabilities: js.Array[Schema$Availability] = null): Schema$UpdateAvailabilityRequest = {
    val __obj = js.Dynamic.literal()
    if (availabilities != null) __obj.updateDynamic("availabilities")(availabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateAvailabilityRequest]
  }
}

