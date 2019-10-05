package typings.gapiDotClientDotYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistPlayer extends js.Object {
  /** An <iframe> tag that embeds a player that will play the playlist. */
  var embedHtml: js.UndefOr[String] = js.undefined
}

object PlaylistPlayer {
  @scala.inline
  def apply(embedHtml: String = null): PlaylistPlayer = {
    val __obj = js.Dynamic.literal()
    if (embedHtml != null) __obj.updateDynamic("embedHtml")(embedHtml)
    __obj.asInstanceOf[PlaylistPlayer]
  }
}

