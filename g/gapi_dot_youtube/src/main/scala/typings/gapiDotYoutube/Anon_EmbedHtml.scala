package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmbedHtml extends js.Object {
  /**
    * An <iframe> tag that embeds a player that will play the video.
    */
  var embedHtml: String
}

object Anon_EmbedHtml {
  @scala.inline
  def apply(embedHtml: String): Anon_EmbedHtml = {
    val __obj = js.Dynamic.literal(embedHtml = embedHtml.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EmbedHtml]
  }
}

