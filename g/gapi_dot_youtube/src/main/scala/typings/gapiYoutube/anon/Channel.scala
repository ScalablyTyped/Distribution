package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: DefaultTab
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[Property]
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: BackgroundImageUrl
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: BackgroundColor
}

object Channel {
  @scala.inline
  def apply(channel: DefaultTab, hints: js.Array[Property], image: BackgroundImageUrl, watch: BackgroundColor): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

