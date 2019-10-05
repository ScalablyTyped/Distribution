package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Client or application specific settings provided on the FHIR server during the client/application registration.
  */
trait OAuth2ClientSettings extends js.Object {
  /**
    * Unique ID representing the client or application
    */
  var client_id: String
  /**
    * URI to which the code is sent via query string during the OAuth2 authorization workflow. Defaults to the applications base url.
    */
  var redirect_uri: js.UndefOr[String] = js.undefined
  /**
    * Scopes based on the access required by the application
    */
  var scope: js.UndefOr[String] = js.undefined
  /**
    * If the application registered is a confidential application, the client_secret needs to be provided during the Token workflow. (Not recommended for public applications)
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * Override the state parameter set by the SMART JS Client library. The library generates a random string as state.
    */
  var state: js.UndefOr[String] = js.undefined
}

object OAuth2ClientSettings {
  @scala.inline
  def apply(
    client_id: String,
    redirect_uri: String = null,
    scope: String = null,
    secret: String = null,
    state: String = null
  ): OAuth2ClientSettings = {
    val __obj = js.Dynamic.literal(client_id = client_id)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[OAuth2ClientSettings]
  }
}

