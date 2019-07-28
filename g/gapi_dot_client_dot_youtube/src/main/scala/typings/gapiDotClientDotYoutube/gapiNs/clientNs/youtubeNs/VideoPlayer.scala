package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer extends js.Object {
  var embedHeight: js.UndefOr[String] = js.undefined
  /** An <iframe> tag that embeds a player that will play the video. */
  var embedHtml: js.UndefOr[String] = js.undefined
  /** The embed width */
  var embedWidth: js.UndefOr[String] = js.undefined
}

object VideoPlayer {
  @scala.inline
  def apply(embedHeight: String = null, embedHtml: String = null, embedWidth: String = null): VideoPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHeight != null) __obj.updateDynamic("embedHeight")(embedHeight)
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    if (embedWidth != null) __obj.updateDynamic("embedWidth")(embedWidth)
    __obj.asInstanceOf[VideoPlayer]
  }
}

