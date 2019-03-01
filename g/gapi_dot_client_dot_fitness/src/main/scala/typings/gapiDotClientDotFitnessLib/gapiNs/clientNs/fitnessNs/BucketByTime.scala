package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketByTime extends js.Object {
  /**
    * Specifies that result buckets aggregate data by exactly durationMillis time frames. Time frames that contain no data will be included in the response
    * with an empty dataset.
    */
  var durationMillis: js.UndefOr[java.lang.String] = js.undefined
  var period: js.UndefOr[BucketByTimePeriod] = js.undefined
}

object BucketByTime {
  @scala.inline
  def apply(durationMillis: java.lang.String = null, period: BucketByTimePeriod = null): BucketByTime = {
    val __obj = js.Dynamic.literal()
    if (durationMillis != null) __obj.updateDynamic("durationMillis")(durationMillis)
    if (period != null) __obj.updateDynamic("period")(period)
    __obj.asInstanceOf[BucketByTime]
  }
}

