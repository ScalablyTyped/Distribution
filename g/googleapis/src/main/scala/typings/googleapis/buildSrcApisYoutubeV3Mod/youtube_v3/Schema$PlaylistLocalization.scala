package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist localization setting
  */
@js.native
trait Schema$PlaylistLocalization extends js.Object {
  /**
    * The localized strings for playlist&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The localized strings for playlist&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$PlaylistLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): Schema$PlaylistLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PlaylistLocalization]
  }
}

