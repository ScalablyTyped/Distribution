package typings.googleapis.buildSrcApisDoubleclicksearchV2Mod.doubleclicksearch_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response to a update availability request.
  */
@js.native
trait Schema$UpdateAvailabilityResponse extends js.Object {
  /**
    * The availabilities being returned.
    */
  var availabilities: js.UndefOr[js.Array[Schema$Availability]] = js.native
}

object Schema$UpdateAvailabilityResponse {
  @scala.inline
  def apply(availabilities: js.Array[Schema$Availability] = null): Schema$UpdateAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    if (availabilities != null) __obj.updateDynamic("availabilities")(availabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateAvailabilityResponse]
  }
}

