package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta2_VideoSegment extends js.Object {
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the end of the segment (inclusive).
    */
  var endTimeOffset: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Time-offset, relative to the beginning of the video,
    * corresponding to the start of the segment (inclusive).
    */
  var startTimeOffset: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta2_VideoSegment {
  @scala.inline
  def apply(endTimeOffset: java.lang.String = null, startTimeOffset: java.lang.String = null): GoogleCloudVideointelligenceV1beta2_VideoSegment = {
    val __obj = js.Dynamic.literal()
    if (endTimeOffset != null) __obj.updateDynamic("endTimeOffset")(endTimeOffset)
    if (startTimeOffset != null) __obj.updateDynamic("startTimeOffset")(startTimeOffset)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta2_VideoSegment]
  }
}

