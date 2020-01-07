package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Frequency Cap.
  */
@js.native
trait Schema$FrequencyCap extends js.Object {
  /**
    * Duration of time, in seconds, for this frequency cap. The maximum
    * duration is 90 days. Acceptable values are 1 to 7776000, inclusive.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Number of times an individual user can be served the ad within the
    * specified duration. Acceptable values are 1 to 15, inclusive.
    */
  var impressions: js.UndefOr[String] = js.native
}

object Schema$FrequencyCap {
  @scala.inline
  def apply(duration: String = null, impressions: String = null): Schema$FrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (impressions != null) __obj.updateDynamic("impressions")(impressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FrequencyCap]
  }
}

