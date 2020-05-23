package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmtpMsa extends js.Object {
  /** The hostname of the SMTP service. Required. */
  var host: js.UndefOr[String] = js.undefined
  /**
    * The password that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var password: js.UndefOr[String] = js.undefined
  /** The port of the SMTP service. Required. */
  var port: js.UndefOr[Double] = js.undefined
  /** The protocol that will be used to secure communication with the SMTP service. Required. */
  var securityMode: js.UndefOr[String] = js.undefined
  /**
    * The username that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var username: js.UndefOr[String] = js.undefined
}

object SmtpMsa {
  @scala.inline
  def apply(
    host: String = null,
    password: String = null,
    port: js.UndefOr[Double] = js.undefined,
    securityMode: String = null,
    username: String = null
  ): SmtpMsa = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (securityMode != null) __obj.updateDynamic("securityMode")(securityMode.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmtpMsa]
  }
}

