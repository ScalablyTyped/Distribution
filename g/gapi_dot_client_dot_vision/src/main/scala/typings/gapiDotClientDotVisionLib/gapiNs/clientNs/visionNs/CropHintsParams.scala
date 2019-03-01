package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropHintsParams extends js.Object {
  /**
    * Aspect ratios in floats, representing the ratio of the width to the height
    * of the image. For example, if the desired aspect ratio is 4/3, the
    * corresponding float value should be 1.33333.  If not specified, the
    * best possible crop is returned. The number of provided aspect ratios is
    * limited to a maximum of 16; any aspect ratios provided after the 16th are
    * ignored.
    */
  var aspectRatios: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object CropHintsParams {
  @scala.inline
  def apply(aspectRatios: js.Array[scala.Double] = null): CropHintsParams = {
    val __obj = js.Dynamic.literal()
    if (aspectRatios != null) __obj.updateDynamic("aspectRatios")(aspectRatios)
    __obj.asInstanceOf[CropHintsParams]
  }
}

