package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters that a bot can use to configure how it&#39;s response is posted.
  */
@js.native
trait Schema$ActionResponse extends js.Object {
  /**
    * The type of bot response.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * URL for users to auth or config. (Only for REQUEST_CONFIG response
    * types.)
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$ActionResponse {
  @scala.inline
  def apply(`type`: String = null, url: String = null): Schema$ActionResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ActionResponse]
  }
}

