package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageStoreUrl extends js.Object {
  var messageStoreUrl: js.UndefOr[String] = js.undefined
  var noteStoreUrl: js.UndefOr[String] = js.undefined
  var userStoreUrl: js.UndefOr[String] = js.undefined
  var userWebSocketUrl: js.UndefOr[String] = js.undefined
  var utilityUrl: js.UndefOr[String] = js.undefined
  var webApiUrlPrefix: js.UndefOr[String] = js.undefined
}

object AnonMessageStoreUrl {
  @scala.inline
  def apply(
    messageStoreUrl: String = null,
    noteStoreUrl: String = null,
    userStoreUrl: String = null,
    userWebSocketUrl: String = null,
    utilityUrl: String = null,
    webApiUrlPrefix: String = null
  ): AnonMessageStoreUrl = {
    val __obj = js.Dynamic.literal()
    if (messageStoreUrl != null) __obj.updateDynamic("messageStoreUrl")(messageStoreUrl.asInstanceOf[js.Any])
    if (noteStoreUrl != null) __obj.updateDynamic("noteStoreUrl")(noteStoreUrl.asInstanceOf[js.Any])
    if (userStoreUrl != null) __obj.updateDynamic("userStoreUrl")(userStoreUrl.asInstanceOf[js.Any])
    if (userWebSocketUrl != null) __obj.updateDynamic("userWebSocketUrl")(userWebSocketUrl.asInstanceOf[js.Any])
    if (utilityUrl != null) __obj.updateDynamic("utilityUrl")(utilityUrl.asInstanceOf[js.Any])
    if (webApiUrlPrefix != null) __obj.updateDynamic("webApiUrlPrefix")(webApiUrlPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageStoreUrl]
  }
}

