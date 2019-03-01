package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame extends js.Object {
  /** Likelihood of the pornography content.. */
  var pornographyLikelihood: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame {
  @scala.inline
  def apply(pornographyLikelihood: java.lang.String = null, timeOffset: java.lang.String = null): GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    if (pornographyLikelihood != null) __obj.updateDynamic("pornographyLikelihood")(pornographyLikelihood)
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame]
  }
}

