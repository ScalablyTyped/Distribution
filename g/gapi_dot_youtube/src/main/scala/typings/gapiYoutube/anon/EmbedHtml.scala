package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbedHtml extends js.Object {
  /**
    * An <iframe> tag that embeds a player that will play the video.
    */
  var embedHtml: String
}

object EmbedHtml {
  @scala.inline
  def apply(embedHtml: String): EmbedHtml = {
    val __obj = js.Dynamic.literal(embedHtml = embedHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbedHtml]
  }
}

