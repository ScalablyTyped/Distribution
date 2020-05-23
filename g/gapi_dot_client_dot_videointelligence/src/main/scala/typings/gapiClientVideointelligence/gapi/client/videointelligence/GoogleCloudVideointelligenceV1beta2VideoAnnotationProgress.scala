package typings.gapiClientVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2VideoAnnotationProgress extends js.Object {
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[String] = js.undefined
  /**
    * Approximate percentage processed thus far.
    * Guaranteed to be 100 when fully processed.
    */
  var progressPercent: js.UndefOr[Double] = js.undefined
  /** Time when the request was received. */
  var startTime: js.UndefOr[String] = js.undefined
  /** Time of the most recent update. */
  var updateTime: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2VideoAnnotationProgress {
  @scala.inline
  def apply(
    inputUri: String = null,
    progressPercent: js.UndefOr[Double] = js.undefined,
    startTime: String = null,
    updateTime: String = null
  ): GoogleCloudVideointelligenceV1beta2VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri.asInstanceOf[js.Any])
    if (!js.isUndefined(progressPercent)) __obj.updateDynamic("progressPercent")(progressPercent.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2VideoAnnotationProgress]
  }
}

