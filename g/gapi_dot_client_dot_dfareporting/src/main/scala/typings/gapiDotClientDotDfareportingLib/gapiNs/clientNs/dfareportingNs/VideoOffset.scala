package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOffset extends js.Object {
  /** Duration, as a percentage of video duration. Do not set when offsetSeconds is set. Acceptable values are 0 to 100, inclusive. */
  var offsetPercentage: js.UndefOr[scala.Double] = js.undefined
  /** Duration, in seconds. Do not set when offsetPercentage is set. Acceptable values are 0 to 86399, inclusive. */
  var offsetSeconds: js.UndefOr[scala.Double] = js.undefined
}

object VideoOffset {
  @scala.inline
  def apply(offsetPercentage: scala.Int | scala.Double = null, offsetSeconds: scala.Int | scala.Double = null): VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (offsetPercentage != null) __obj.updateDynamic("offsetPercentage")(offsetPercentage.asInstanceOf[js.Any])
    if (offsetSeconds != null) __obj.updateDynamic("offsetSeconds")(offsetSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOffset]
  }
}

