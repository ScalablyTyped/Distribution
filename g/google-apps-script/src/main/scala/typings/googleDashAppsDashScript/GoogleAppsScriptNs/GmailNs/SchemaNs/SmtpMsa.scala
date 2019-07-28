package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpMsa extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var securityMode: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object SmtpMsa {
  @scala.inline
  def apply(
    host: String = null,
    password: String = null,
    port: Int | Double = null,
    securityMode: String = null,
    username: String = null
  ): SmtpMsa = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (password != null) __obj.updateDynamic("password")(password)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (securityMode != null) __obj.updateDynamic("securityMode")(securityMode)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SmtpMsa]
  }
}

