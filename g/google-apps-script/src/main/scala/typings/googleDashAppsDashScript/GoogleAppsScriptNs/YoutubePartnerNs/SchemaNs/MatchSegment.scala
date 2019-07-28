package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchSegment extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var reference_segment: js.UndefOr[Segment] = js.undefined
  var video_segment: js.UndefOr[Segment] = js.undefined
}

object MatchSegment {
  @scala.inline
  def apply(channel: String = null, reference_segment: Segment = null, video_segment: Segment = null): MatchSegment = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (reference_segment != null) __obj.updateDynamic("reference_segment")(reference_segment)
    if (video_segment != null) __obj.updateDynamic("video_segment")(video_segment)
    __obj.asInstanceOf[MatchSegment]
  }
}

