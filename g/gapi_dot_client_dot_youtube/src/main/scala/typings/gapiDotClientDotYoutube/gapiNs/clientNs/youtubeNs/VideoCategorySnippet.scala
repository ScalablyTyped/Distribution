package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCategorySnippet extends js.Object {
  var assignable: js.UndefOr[Boolean] = js.undefined
  /** The YouTube channel that created the video category. */
  var channelId: js.UndefOr[String] = js.undefined
  /** The video category's title. */
  var title: js.UndefOr[String] = js.undefined
}

object VideoCategorySnippet {
  @scala.inline
  def apply(assignable: js.UndefOr[Boolean] = js.undefined, channelId: String = null, title: String = null): VideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignable)) __obj.updateDynamic("assignable")(assignable)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[VideoCategorySnippet]
  }
}

