package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a video category, such as its localized title.
  */
@js.native
trait Schema$VideoCategorySnippet extends js.Object {
  var assignable: js.UndefOr[Boolean] = js.native
  /**
    * The YouTube channel that created the video category.
    */
  var channelId: js.UndefOr[String] = js.native
  /**
    * The video category&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object Schema$VideoCategorySnippet {
  @scala.inline
  def apply(assignable: js.UndefOr[Boolean] = js.undefined, channelId: String = null, title: String = null): Schema$VideoCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignable)) __obj.updateDynamic("assignable")(assignable.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoCategorySnippet]
  }
}

