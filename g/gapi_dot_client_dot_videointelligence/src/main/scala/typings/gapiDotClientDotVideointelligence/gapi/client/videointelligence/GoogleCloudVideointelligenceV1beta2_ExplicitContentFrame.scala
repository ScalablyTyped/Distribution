package typings.gapiDotClientDotVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame extends js.Object {
  /** Likelihood of the pornography content.. */
  var pornographyLikelihood: js.UndefOr[String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame {
  @scala.inline
  def apply(pornographyLikelihood: String = null, timeOffset: String = null): GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    if (pornographyLikelihood != null) __obj.updateDynamic("pornographyLikelihood")(pornographyLikelihood.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_ExplicitContentFrame]
  }
}

