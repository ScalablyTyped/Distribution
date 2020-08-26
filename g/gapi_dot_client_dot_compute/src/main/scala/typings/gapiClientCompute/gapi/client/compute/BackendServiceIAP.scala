package typings.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendServiceIAP extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var oauth2ClientId: js.UndefOr[String] = js.native
  var oauth2ClientSecret: js.UndefOr[String] = js.native
  /** [Output Only] SHA256 hash value for the field oauth2_client_secret above. */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.native
}

object BackendServiceIAP {
  @scala.inline
  def apply(): BackendServiceIAP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendServiceIAP]
  }
  @scala.inline
  implicit class BackendServiceIAPOps[Self <: BackendServiceIAP] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setOauth2ClientId(value: String): Self = this.set("oauth2ClientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth2ClientId: Self = this.set("oauth2ClientId", js.undefined)
    @scala.inline
    def setOauth2ClientSecret(value: String): Self = this.set("oauth2ClientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth2ClientSecret: Self = this.set("oauth2ClientSecret", js.undefined)
    @scala.inline
    def setOauth2ClientSecretSha256(value: String): Self = this.set("oauth2ClientSecretSha256", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth2ClientSecretSha256: Self = this.set("oauth2ClientSecretSha256", js.undefined)
  }
  
}

