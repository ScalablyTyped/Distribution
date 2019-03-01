package typings
package expressDashFlashDashNotificationLib.expressDashFlashDashNotificationMod.Global.ExpressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashOptions extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var redirect: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object FlashOptions {
  @scala.inline
  def apply(
    message: java.lang.String = null,
    redirect: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): FlashOptions = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(redirect)) __obj.updateDynamic("redirect")(redirect)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[FlashOptions]
  }
}

