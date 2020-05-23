package typings.expressWechatAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenUrl extends js.Object {
  var accessTokenUrl: js.UndefOr[String] = js.undefined
  var appId: String
  var appSecret: String
  var https: js.UndefOr[Boolean] = js.undefined
  var ticketUrl: js.UndefOr[String] = js.undefined
}

object AccessTokenUrl {
  @scala.inline
  def apply(
    appId: String,
    appSecret: String,
    accessTokenUrl: String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    ticketUrl: String = null
  ): AccessTokenUrl = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], appSecret = appSecret.asInstanceOf[js.Any])
    if (accessTokenUrl != null) __obj.updateDynamic("accessTokenUrl")(accessTokenUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (ticketUrl != null) __obj.updateDynamic("ticketUrl")(ticketUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenUrl]
  }
}

