package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmbedHtml extends js.Object {
  /**
    * An <iframe> tag that embeds a player that will play the video.
    */
  var embedHtml: java.lang.String
}

object Anon_EmbedHtml {
  @scala.inline
  def apply(embedHtml: java.lang.String): Anon_EmbedHtml = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("embedHtml")(embedHtml)
    __obj.asInstanceOf[Anon_EmbedHtml]
  }
}

