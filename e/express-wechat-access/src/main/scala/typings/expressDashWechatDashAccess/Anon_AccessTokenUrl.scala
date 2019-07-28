package typings.expressDashWechatDashAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenUrl extends js.Object {
  var accessTokenUrl: js.UndefOr[String] = js.undefined
  var appId: String
  var appSecret: String
  var https: js.UndefOr[Boolean] = js.undefined
  var ticketUrl: js.UndefOr[String] = js.undefined
}

object Anon_AccessTokenUrl {
  @scala.inline
  def apply(
    appId: String,
    appSecret: String,
    accessTokenUrl: String = null,
    https: js.UndefOr[Boolean] = js.undefined,
    ticketUrl: String = null
  ): Anon_AccessTokenUrl = {
    val __obj = js.Dynamic.literal(appId = appId, appSecret = appSecret)
    if (accessTokenUrl != null) __obj.updateDynamic("accessTokenUrl")(accessTokenUrl)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (ticketUrl != null) __obj.updateDynamic("ticketUrl")(ticketUrl)
    __obj.asInstanceOf[Anon_AccessTokenUrl]
  }
}

