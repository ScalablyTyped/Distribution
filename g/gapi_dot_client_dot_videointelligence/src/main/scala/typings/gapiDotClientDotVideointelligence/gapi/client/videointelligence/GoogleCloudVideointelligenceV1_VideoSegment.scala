package typings.gapiDotClientDotVideointelligence.gapi.client.videointelligence

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_VideoSegment extends js.Object {
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the end of the segment (inclusive).
    */
  var endTime: js.UndefOr[String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the start of the segment (inclusive).
    */
  var startTime: js.UndefOr[String] = js.undefined
}

object GoogleCloudVideointelligenceV1_VideoSegment {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): GoogleCloudVideointelligenceV1_VideoSegment = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_VideoSegment]
  }
}

