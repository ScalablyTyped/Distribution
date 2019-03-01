package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Channel extends js.Object {
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: Anon_DefaultTab
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[Anon_Property]
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: Anon_BackgroundImageUrl
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: Anon_BackgroundColor
}

object Anon_Channel {
  @scala.inline
  def apply(
    channel: Anon_DefaultTab,
    hints: js.Array[Anon_Property],
    image: Anon_BackgroundImageUrl,
    watch: Anon_BackgroundColor
  ): Anon_Channel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("hints")(hints)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[Anon_Channel]
  }
}

