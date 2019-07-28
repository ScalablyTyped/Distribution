package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvideoTiming extends js.Object {
  /** Defines the duration in milliseconds for which the promotion should be displayed. If missing, the client should use the default. */
  var durationMs: js.UndefOr[String] = js.undefined
  /**
    * Defines the time at which the promotion will appear. Depending on the value of type the value of the offsetMs field will represent a time offset from
    * the start or from the end of the video, expressed in milliseconds.
    */
  var offsetMs: js.UndefOr[String] = js.undefined
  /**
    * Describes a timing type. If the value is offsetFromStart, then the offsetMs field represents an offset from the start of the video. If the value is
    * offsetFromEnd, then the offsetMs field represents an offset from the end of the video.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object InvideoTiming {
  @scala.inline
  def apply(durationMs: String = null, offsetMs: String = null, `type`: String = null): InvideoTiming = {
    val __obj = js.Dynamic.literal()
    if (durationMs != null) __obj.updateDynamic("durationMs")(durationMs)
    if (offsetMs != null) __obj.updateDynamic("offsetMs")(offsetMs)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InvideoTiming]
  }
}

