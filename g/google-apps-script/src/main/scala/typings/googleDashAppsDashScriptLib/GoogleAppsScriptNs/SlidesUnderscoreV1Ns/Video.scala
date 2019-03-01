package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Video extends js.Object {
  // The video source's unique identifier for this video.
  var id: java.lang.String
  // The video source.
  var source: VideoSource
  // An URL to a video. The URL is valid as long as the source video exists and
  // sharing settings do not change.
  var url: java.lang.String
  // The properties of the video.
  var video_properties: VideoProperties
}

object Video {
  @scala.inline
  def apply(
    id: java.lang.String,
    source: VideoSource,
    url: java.lang.String,
    video_properties: VideoProperties
  ): Video = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("video_properties")(video_properties)
    __obj.asInstanceOf[Video]
  }
}

