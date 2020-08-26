package typings.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SslSettings extends js.Object {
  /** ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support. Example: 12345. */
  var certificateId: js.UndefOr[String] = js.native
}

object SslSettings {
  @scala.inline
  def apply(): SslSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslSettings]
  }
  @scala.inline
  implicit class SslSettingsOps[Self <: SslSettings] (val x: Self) extends AnyVal {
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
    def setCertificateId(value: String): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
  }
  
}

