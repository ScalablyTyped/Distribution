package typings.gapiDotClientDotVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_VideoAnnotationProgress extends js.Object {
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

object GoogleCloudVideointelligenceV1_VideoAnnotationProgress {
  @scala.inline
  def apply(
    inputUri: String = null,
    progressPercent: Int | Double = null,
    startTime: String = null,
    updateTime: String = null
  ): GoogleCloudVideointelligenceV1_VideoAnnotationProgress = {
    val __obj = js.Dynamic.literal()
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri)
    if (progressPercent != null) __obj.updateDynamic("progressPercent")(progressPercent.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_VideoAnnotationProgress]
  }
}

