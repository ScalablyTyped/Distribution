package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpMsa extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var securityMode: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object SmtpMsa {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    password: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    securityMode: java.lang.String = null,
    username: java.lang.String = null
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

