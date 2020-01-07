package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video frame level annotation results for explicit content.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1_ExplicitContentFrame extends js.Object {
  /**
    * Likelihood of the pornography content..
    */
  var pornographyLikelihood: js.UndefOr[String] = js.native
  /**
    * Time-offset, relative to the beginning of the video, corresponding to the
    * video frame for this location.
    */
  var timeOffset: js.UndefOr[String] = js.native
}

object Schema$GoogleCloudVideointelligenceV1_ExplicitContentFrame {
  @scala.inline
  def apply(pornographyLikelihood: String = null, timeOffset: String = null): Schema$GoogleCloudVideointelligenceV1_ExplicitContentFrame = {
    val __obj = js.Dynamic.literal()
    if (pornographyLikelihood != null) __obj.updateDynamic("pornographyLikelihood")(pornographyLikelihood.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1_ExplicitContentFrame]
  }
}

