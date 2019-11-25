package typings.dingtalkDashRobotDashSender.dingtalkDashRobotDashSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrlOptions extends js.Object {
  var accessToken: String
  var baseUrl: String
  var httpclient: js.UndefOr[js.Any] = js.undefined
}

object BaseUrlOptions {
  @scala.inline
  def apply(accessToken: String, baseUrl: String, httpclient: js.Any = null): BaseUrlOptions = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
    if (httpclient != null) __obj.updateDynamic("httpclient")(httpclient.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrlOptions]
  }
}

