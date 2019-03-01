package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrequencyCap extends js.Object {
  /** Duration of time, in seconds, for this frequency cap. The maximum duration is 90 days. Acceptable values are 1 to 7776000, inclusive. */
  var duration: js.UndefOr[java.lang.String] = js.undefined
  /** Number of times an individual user can be served the ad within the specified duration. Acceptable values are 1 to 15, inclusive. */
  var impressions: js.UndefOr[java.lang.String] = js.undefined
}

object FrequencyCap {
  @scala.inline
  def apply(duration: java.lang.String = null, impressions: java.lang.String = null): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration)
    if (impressions != null) __obj.updateDynamic("impressions")(impressions)
    __obj.asInstanceOf[FrequencyCap]
  }
}

