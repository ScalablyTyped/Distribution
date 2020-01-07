package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video Offset
  */
@js.native
trait Schema$VideoOffset extends js.Object {
  /**
    * Duration, as a percentage of video duration. Do not set when
    * offsetSeconds is set. Acceptable values are 0 to 100, inclusive.
    */
  var offsetPercentage: js.UndefOr[Double] = js.native
  /**
    * Duration, in seconds. Do not set when offsetPercentage is set. Acceptable
    * values are 0 to 86399, inclusive.
    */
  var offsetSeconds: js.UndefOr[Double] = js.native
}

object Schema$VideoOffset {
  @scala.inline
  def apply(offsetPercentage: Int | Double = null, offsetSeconds: Int | Double = null): Schema$VideoOffset = {
    val __obj = js.Dynamic.literal()
    if (offsetPercentage != null) __obj.updateDynamic("offsetPercentage")(offsetPercentage.asInstanceOf[js.Any])
    if (offsetSeconds != null) __obj.updateDynamic("offsetSeconds")(offsetSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoOffset]
  }
}

