package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChannelSection localization setting
  */
@js.native
trait Schema$ChannelSectionLocalization extends js.Object {
  /**
    * The localized strings for channel section&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$ChannelSectionLocalization {
  @scala.inline
  def apply(title: String = null): Schema$ChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelSectionLocalization]
  }
}

