package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistPlayer extends js.Object {
  /** An <iframe> tag that embeds a player that will play the playlist. */
  var embedHtml: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistPlayer {
  @scala.inline
  def apply(embedHtml: java.lang.String = null): PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    __obj.asInstanceOf[PlaylistPlayer]
  }
}

