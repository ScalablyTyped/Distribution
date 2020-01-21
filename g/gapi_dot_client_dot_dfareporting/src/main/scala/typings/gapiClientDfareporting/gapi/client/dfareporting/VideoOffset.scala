package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoOffset extends js.Object {
  /** Duration, as a percentage of video duration. Do not set when offsetSeconds is set. Acceptable values are 0 to 100, inclusive. */
  var offsetPercentage: js.UndefOr[Double] = js.undefined
  /** Duration, in seconds. Do not set when offsetPercentage is set. Acceptable values are 0 to 86399, inclusive. */
  var offsetSeconds: js.UndefOr[Double] = js.undefined
}

object VideoOffset {
  @scala.inline
  def apply(offsetPercentage: Int | Double = null, offsetSeconds: Int | Double = null): VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (offsetPercentage != null) __obj.updateDynamic("offsetPercentage")(offsetPercentage.asInstanceOf[js.Any])
    if (offsetSeconds != null) __obj.updateDynamic("offsetSeconds")(offsetSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOffset]
  }
}

