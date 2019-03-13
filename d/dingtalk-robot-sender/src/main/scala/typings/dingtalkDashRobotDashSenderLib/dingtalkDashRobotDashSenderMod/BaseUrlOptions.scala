package typings
package dingtalkDashRobotDashSenderLib.dingtalkDashRobotDashSenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUrlOptions extends js.Object {
  var accessToken: java.lang.String
  var baseUrl: java.lang.String
  var httpclient: js.UndefOr[js.Any] = js.undefined
}

object BaseUrlOptions {
  @scala.inline
  def apply(accessToken: java.lang.String, baseUrl: java.lang.String, httpclient: js.Any = null): BaseUrlOptions = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, baseUrl = baseUrl)
    if (httpclient != null) __obj.updateDynamic("httpclient")(httpclient)
    __obj.asInstanceOf[BaseUrlOptions]
  }
}

