package typings.fhirJsClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OAuth2 Configuration of the SMART on FHIR Server
  */
@js.native
trait OAuth2Configuration extends js.Object {
  /**
    * Client or application specific settings provided on the FHIR server during the client/application registration.
    */
  var client: js.UndefOr[OAuth2ClientSettings] = js.native
  /**
    * Fake Access Token Response. Should contain the patient property to set the patient context.
    */
  var fake_token_response: js.UndefOr[js.Any] = js.native
  /**
    * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
    */
  var provider: js.UndefOr[OAuth2Provider] = js.native
  /**
    * Set the response type based on the Authorization Grant eg. code(Authorization Code Grant), token(Implicit Grant)
    */
  var response_type: js.UndefOr[String] = js.native
  /**
    * FHIR Service URL
    */
  var server: js.UndefOr[String] = js.native
}

object OAuth2Configuration {
  @scala.inline
  def apply(): OAuth2Configuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2Configuration]
  }
  @scala.inline
  implicit class OAuth2ConfigurationOps[Self <: OAuth2Configuration] (val x: Self) extends AnyVal {
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
    def setClient(value: OAuth2ClientSettings): Self = this.set("client", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    @scala.inline
    def setFake_token_response(value: js.Any): Self = this.set("fake_token_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFake_token_response: Self = this.set("fake_token_response", js.undefined)
    @scala.inline
    def setProvider(value: OAuth2Provider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setResponse_type(value: String): Self = this.set("response_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse_type: Self = this.set("response_type", js.undefined)
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
  }
  
}

