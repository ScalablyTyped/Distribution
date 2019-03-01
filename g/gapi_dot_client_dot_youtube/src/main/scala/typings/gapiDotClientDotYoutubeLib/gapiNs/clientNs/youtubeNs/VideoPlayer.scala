package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer extends js.Object {
  var embedHeight: js.UndefOr[java.lang.String] = js.undefined
  /** An <iframe> tag that embeds a player that will play the video. */
  var embedHtml: js.UndefOr[java.lang.String] = js.undefined
  /** The embed width */
  var embedWidth: js.UndefOr[java.lang.String] = js.undefined
}

object VideoPlayer {
  @scala.inline
  def apply(
    embedHeight: java.lang.String = null,
    embedHtml: java.lang.String = null,
    embedWidth: java.lang.String = null
  ): VideoPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHeight != null) __obj.updateDynamic("embedHeight")(embedHeight)
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    if (embedWidth != null) __obj.updateDynamic("embedWidth")(embedWidth)
    __obj.asInstanceOf[VideoPlayer]
  }
}

