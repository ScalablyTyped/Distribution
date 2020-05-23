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
  def apply(
    offsetPercentage: js.UndefOr[Double] = js.undefined,
    offsetSeconds: js.UndefOr[Double] = js.undefined
  ): VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(offsetPercentage)) __obj.updateDynamic("offsetPercentage")(offsetPercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetSeconds)) __obj.updateDynamic("offsetSeconds")(offsetSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOffset]
  }
}

