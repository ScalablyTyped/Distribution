package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Client or application specific settings provided on the FHIR server during the client/application registration.
  */
@js.native
trait OAuth2ClientSettings extends js.Object {
  /**
    * Unique ID representing the client or application
    */
  var client_id: String = js.native
  /**
    * URI to which the code is sent via query string during the OAuth2 authorization workflow. Defaults to the applications base url.
    */
  var redirect_uri: js.UndefOr[String] = js.native
  /**
    * Scopes based on the access required by the application
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * If the application registered is a confidential application, the client_secret needs to be provided during the Token workflow. (Not recommended for public applications)
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * Override the state parameter set by the SMART JS Client library. The library generates a random string as state.
    */
  var state: js.UndefOr[String] = js.native
}

object OAuth2ClientSettings {
  @scala.inline
  def apply(client_id: String): OAuth2ClientSettings = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2ClientSettings]
  }
  @scala.inline
  implicit class OAuth2ClientSettingsOps[Self <: OAuth2ClientSettings] (val x: Self) extends AnyVal {
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
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedirect_uri(value: String): Self = this.set("redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_uri: Self = this.set("redirect_uri", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

