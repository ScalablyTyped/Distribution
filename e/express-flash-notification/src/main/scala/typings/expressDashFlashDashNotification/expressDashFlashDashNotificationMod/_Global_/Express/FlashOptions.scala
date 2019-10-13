package typings.expressDashFlashDashNotification.expressDashFlashDashNotificationMod._Global_.Express

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashOptions extends js.Object {
  var message: js.UndefOr[String] = js.undefined
  var redirect: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object FlashOptions {
  @scala.inline
  def apply(
    message: String = null,
    redirect: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    url: String = null
  ): FlashOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FlashOptions]
  }
}

