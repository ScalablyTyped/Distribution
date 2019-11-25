package typings.fhirDashJsDashClient.FHIR.SMART

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
  */
trait OAuth2Endpoints extends js.Object {
  /**
    * OAuth2 Authorize URI
    */
  var authorize_uri: js.UndefOr[String] = js.undefined
  /**
    * OAuth2 Registration URI
    */
  var registration_uri: js.UndefOr[String] = js.undefined
  /**
    * OAuth2 Token URI
    */
  var token_uri: js.UndefOr[String] = js.undefined
}

object OAuth2Endpoints {
  @scala.inline
  def apply(authorize_uri: String = null, registration_uri: String = null, token_uri: String = null): OAuth2Endpoints = {
    val __obj = js.Dynamic.literal()
    if (authorize_uri != null) __obj.updateDynamic("authorize_uri")(authorize_uri.asInstanceOf[js.Any])
    if (registration_uri != null) __obj.updateDynamic("registration_uri")(registration_uri.asInstanceOf[js.Any])
    if (token_uri != null) __obj.updateDynamic("token_uri")(token_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Endpoints]
  }
}

