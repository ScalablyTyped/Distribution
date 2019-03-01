package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoProperties extends js.Object {
  // Whether to enable video autoplay when the page is displayed in present
  // mode. Defaults to false.
  var auto_play: scala.Boolean
  // The time at which to end playback, measured in seconds from the beginning
  // of the video.
  // If set, the end time should be after the start time.
  // If not set or if you set this to a value that exceeds the video's length,
  // the video will be played until its end.
  var end: scala.Double
  // Whether to mute the audio during video playback. Defaults to false.
  var mute: scala.Boolean
  // The outline of the video. The default outline matches the defaults for new
  // videos created in the Slides editor.
  var outline: Outline
  // The time at which to start playback, measured in seconds from the beginning
  // of the video.
  // If set, the start time should be before the end time.
  // If you set this to a value that exceeds the video's length in seconds, the
  // video will be played from the last second.
  // If not set, the video will be played from the beginning.
  var start: scala.Double
}

object VideoProperties {
  @scala.inline
  def apply(
    auto_play: scala.Boolean,
    end: scala.Double,
    mute: scala.Boolean,
    outline: Outline,
    start: scala.Double
  ): VideoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auto_play")(auto_play)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("mute")(mute)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[VideoProperties]
  }
}

