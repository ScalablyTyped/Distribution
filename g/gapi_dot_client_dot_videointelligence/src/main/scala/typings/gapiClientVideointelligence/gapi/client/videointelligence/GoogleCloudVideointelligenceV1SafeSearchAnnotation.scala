package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1SafeSearchAnnotation extends js.Object {
  /** Likelihood of adult content. */
  var adult: js.UndefOr[String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the video frame for this annotation.
    */
  var time: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1SafeSearchAnnotation {
  @scala.inline
  def apply(adult: String = null, time: String = null): GoogleCloudVideointelligenceV1SafeSearchAnnotation = {
    val __obj = js.Dynamic.literal()
    if (adult != null) __obj.updateDynamic("adult")(adult.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1SafeSearchAnnotation]
  }
}

