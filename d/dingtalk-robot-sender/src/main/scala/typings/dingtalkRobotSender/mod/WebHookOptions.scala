package typings.dingtalkRobotSender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebHookOptions extends js.Object {
  var httpclient: js.UndefOr[js.Any] = js.undefined
  var webhook: String
}

object WebHookOptions {
  @scala.inline
  def apply(webhook: String, httpclient: js.Any = null): WebHookOptions = {
    val __obj = js.Dynamic.literal(webhook = webhook.asInstanceOf[js.Any])
    if (httpclient != null) __obj.updateDynamic("httpclient")(httpclient.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebHookOptions]
  }
}

