package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookOptions extends js.Object {
  var httpclient: js.UndefOr[js.Any] = js.undefined
  var webhook: java.lang.String
}

object WebHookOptions {
  @scala.inline
  def apply(webhook: java.lang.String, httpclient: js.Any = null): WebHookOptions = {
    val __obj = js.Dynamic.literal(webhook = webhook)
    if (httpclient != null) __obj.updateDynamic("httpclient")(httpclient)
    __obj.asInstanceOf[WebHookOptions]
  }
}

