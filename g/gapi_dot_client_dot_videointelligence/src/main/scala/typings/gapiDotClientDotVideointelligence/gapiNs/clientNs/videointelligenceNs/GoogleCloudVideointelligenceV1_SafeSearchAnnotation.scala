package typings.gapiDotClientDotVideointelligence.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the video frame for this annotation.
    */
  var time: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1_SafeSearchAnnotation {
  @scala.inline
  def apply(adult: String = null, time: String = null): GoogleCloudVideointelligenceV1_SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_SafeSearchAnnotation]
  }
}

