package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_VideoSegment extends js.Object {
  /** End offset in microseconds (inclusive). Unset means 0. */
  var endTimeOffset: js.UndefOr[java.lang.String] = js.undefined
  /** Start offset in microseconds (inclusive). Unset means 0. */
  var startTimeOffset: js.UndefOr[java.lang.String] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_VideoSegment {
  @scala.inline
  def apply(endTimeOffset: java.lang.String = null, startTimeOffset: java.lang.String = null): GoogleCloudVideointelligenceV1beta1_VideoSegment = {
    val __obj = js.Dynamic.literal()
    if (endTimeOffset != null) __obj.updateDynamic("endTimeOffset")(endTimeOffset)
    if (startTimeOffset != null) __obj.updateDynamic("startTimeOffset")(startTimeOffset)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_VideoSegment]
  }
}

