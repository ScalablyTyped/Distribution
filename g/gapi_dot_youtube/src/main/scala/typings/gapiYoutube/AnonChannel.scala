package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: AnonDefaultTab
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[AnonProperty]
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: AnonBackgroundImageUrl
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: AnonBackgroundColor
}

object AnonChannel {
  @scala.inline
  def apply(
    channel: AnonDefaultTab,
    hints: js.Array[AnonProperty],
    image: AnonBackgroundImageUrl,
    watch: AnonBackgroundColor
  ): AnonChannel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChannel]
  }
}

