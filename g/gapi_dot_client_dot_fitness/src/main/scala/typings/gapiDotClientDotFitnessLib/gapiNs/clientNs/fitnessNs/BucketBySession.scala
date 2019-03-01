package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketBySession extends js.Object {
  /** Specifies that only sessions of duration longer than minDurationMillis are considered and used as a container for aggregated data. */
  var minDurationMillis: js.UndefOr[java.lang.String] = js.undefined
}

object BucketBySession {
  @scala.inline
  def apply(minDurationMillis: java.lang.String = null): BucketBySession = {
    val __obj = js.Dynamic.literal()
    if (minDurationMillis != null) __obj.updateDynamic("minDurationMillis")(minDurationMillis)
    __obj.asInstanceOf[BucketBySession]
  }
}

