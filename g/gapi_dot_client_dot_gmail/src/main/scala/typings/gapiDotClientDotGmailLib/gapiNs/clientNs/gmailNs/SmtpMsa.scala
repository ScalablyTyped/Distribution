package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpMsa extends js.Object {
  /** The hostname of the SMTP service. Required. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The password that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** The port of the SMTP service. Required. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** The protocol that will be used to secure communication with the SMTP service. Required. */
  var securityMode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The username that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
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

