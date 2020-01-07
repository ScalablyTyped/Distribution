package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A liveChatBan resource represents a ban for a YouTube live chat.
  */
@js.native
trait Schema$LiveChatBan extends js.Object {
  /**
    * Etag of this resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The ID that YouTube assigns to uniquely identify the ban.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;youtube#liveChatBan&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The snippet object contains basic details about the ban.
    */
  var snippet: js.UndefOr[Schema$LiveChatBanSnippet] = js.native
}

object Schema$LiveChatBan {
  @scala.inline
  def apply(
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: Schema$LiveChatBanSnippet = null
  ): Schema$LiveChatBan = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LiveChatBan]
  }
}

