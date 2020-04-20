package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmbedHtml extends js.Object {
  /**
    * An <iframe> tag that embeds a player that will play the video.
    */
  var embedHtml: String
}

object AnonEmbedHtml {
  @scala.inline
  def apply(embedHtml: String): AnonEmbedHtml = {
    val __obj = js.Dynamic.literal(embedHtml = embedHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmbedHtml]
  }
}

