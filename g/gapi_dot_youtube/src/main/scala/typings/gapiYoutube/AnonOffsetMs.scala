package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffsetMs extends js.Object {
  /**
    * The time offset, specified in milliseconds, that determines when the promoted item appears during video playbacks. The type propertys value determines whether the offset is measured from the start or end of the video.
    */
  var offsetMs: Double
  /**
    * The timing method that determines when the promoted item is inserted during the video playback. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
    */
  var `type`: String
}

object AnonOffsetMs {
  @scala.inline
  def apply(offsetMs: Double, `type`: String): AnonOffsetMs = {
    val __obj = js.Dynamic.literal(offsetMs = offsetMs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffsetMs]
  }
}

