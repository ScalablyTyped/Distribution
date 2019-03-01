package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OAuth2 Configuration of the SMART on FHIR Server
  */
trait OAuth2Configuration extends js.Object {
  /**
    * Client or application specific settings provided on the FHIR server during the client/application registration.
    */
  var client: js.UndefOr[OAuth2ClientSettings] = js.undefined
  /**
    * Fake Access Token Response. Should contain the patient property to set the patient context.
    */
  var fake_token_response: js.UndefOr[js.Any] = js.undefined
  /**
    * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
    */
  var provider: js.UndefOr[OAuth2Provider] = js.undefined
  /**
    * Set the response type based on the Authorization Grant eg. code(Authorization Code Grant), token(Implicit Grant)
    */
  var response_type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * FHIR Service URL
    */
  var server: js.UndefOr[java.lang.String] = js.undefined
}

object OAuth2Configuration {
  @scala.inline
  def apply(
    client: OAuth2ClientSettings = null,
    fake_token_response: js.Any = null,
    provider: OAuth2Provider = null,
    response_type: java.lang.String = null,
    server: java.lang.String = null
  ): OAuth2Configuration = {
    val __obj = js.Dynamic.literal()
    if (client != null) __obj.updateDynamic("client")(client)
    if (fake_token_response != null) __obj.updateDynamic("fake_token_response")(fake_token_response)
    if (provider != null) __obj.updateDynamic("provider")(provider)
    if (response_type != null) __obj.updateDynamic("response_type")(response_type)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[OAuth2Configuration]
  }
}

