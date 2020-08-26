package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmtpMsa extends js.Object {
  /** The hostname of the SMTP service. Required. */
  var host: js.UndefOr[String] = js.native
  /**
    * The password that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var password: js.UndefOr[String] = js.native
  /** The port of the SMTP service. Required. */
  var port: js.UndefOr[Double] = js.native
  /** The protocol that will be used to secure communication with the SMTP service. Required. */
  var securityMode: js.UndefOr[String] = js.native
  /**
    * The username that will be used for authentication with the SMTP service. This is a write-only field that can be specified in requests to create or
    * update SendAs settings; it is never populated in responses.
    */
  var username: js.UndefOr[String] = js.native
}

object SmtpMsa {
  @scala.inline
  def apply(): SmtpMsa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmtpMsa]
  }
  @scala.inline
  implicit class SmtpMsaOps[Self <: SmtpMsa] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setSecurityMode(value: String): Self = this.set("securityMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityMode: Self = this.set("securityMode", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

