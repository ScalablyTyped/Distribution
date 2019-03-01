package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OffsetMs extends js.Object {
  /**
    * The time offset, specified in milliseconds, that determines when the promoted item appears during video playbacks. The type propertys value determines whether the offset is measured from the start or end of the video.
    */
  var offsetMs: scala.Double
  /**
    * The timing method that determines when the promoted item is inserted during the video playback. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
    */
  var `type`: java.lang.String
}

object Anon_OffsetMs {
  @scala.inline
  def apply(offsetMs: scala.Double, `type`: java.lang.String): Anon_OffsetMs = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("offsetMs")(offsetMs)
    __obj.asInstanceOf[Anon_OffsetMs]
  }
}

