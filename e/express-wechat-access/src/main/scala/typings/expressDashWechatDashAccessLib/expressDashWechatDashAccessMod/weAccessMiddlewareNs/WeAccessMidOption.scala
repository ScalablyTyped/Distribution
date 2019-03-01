package typings
package expressDashWechatDashAccessLib.expressDashWechatDashAccessMod.weAccessMiddlewareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeAccessMidOption extends js.Object {
  var accessTokenUrl: js.UndefOr[java.lang.String] = js.undefined
  var appId: java.lang.String
  var appSecret: java.lang.String
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var ticketUrl: js.UndefOr[java.lang.String] = js.undefined
}

object WeAccessMidOption {
  @scala.inline
  def apply(
    appId: java.lang.String,
    appSecret: java.lang.String,
    accessTokenUrl: java.lang.String = null,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    ticketUrl: java.lang.String = null
  ): WeAccessMidOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appId")(appId)
    __obj.updateDynamic("appSecret")(appSecret)
    if (accessTokenUrl != null) __obj.updateDynamic("accessTokenUrl")(accessTokenUrl)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (ticketUrl != null) __obj.updateDynamic("ticketUrl")(ticketUrl)
    __obj.asInstanceOf[WeAccessMidOption]
  }
}

