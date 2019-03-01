package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_VideoSegment extends js.Object {
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the end of the segment (inclusive).
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the start of the segment (inclusive).
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudVideointelligenceV1_VideoSegment {
  @scala.inline
  def apply(endTime: java.lang.String = null, startTime: java.lang.String = null): GoogleCloudVideointelligenceV1_VideoSegment = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_VideoSegment]
  }
}

