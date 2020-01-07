package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Channel localization setting
  */
@js.native
trait Schema$ChannelLocalization extends js.Object {
  /**
    * The localized strings for channel&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The localized strings for channel&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$ChannelLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): Schema$ChannelLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ChannelLocalization]
  }
}

