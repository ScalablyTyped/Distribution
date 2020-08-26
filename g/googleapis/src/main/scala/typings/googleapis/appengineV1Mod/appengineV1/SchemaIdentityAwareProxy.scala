package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identity-Aware Proxy
  */
@js.native
trait SchemaIdentityAwareProxy extends js.Object {
  /**
    * Whether the serving infrastructure will authenticate and authorize all
    * incoming requests.If true, the oauth2_client_id and oauth2_client_secret
    * fields must be non-empty.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * OAuth2 client ID to use for the authentication flow.
    */
  var oauth2ClientId: js.UndefOr[String] = js.native
  /**
    * OAuth2 client secret to use for the authentication flow.For security
    * reasons, this value cannot be retrieved via the API. Instead, the SHA-256
    * hash of the value is returned in the oauth2_client_secret_sha256
    * field.@InputOnly
    */
  var oauth2ClientSecret: js.UndefOr[String] = js.native
  /**
    * Hex-encoded SHA-256 hash of the client secret.@OutputOnly
    */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.native
}

object SchemaIdentityAwareProxy {
  @scala.inline
  def apply(): SchemaIdentityAwareProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentityAwareProxy]
  }
  @scala.inline
  implicit class SchemaIdentityAwareProxyOps[Self <: SchemaIdentityAwareProxy] (val x: Self) extends AnyVal {
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

