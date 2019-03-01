package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

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
  var authorize_uri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * OAuth2 Registration URI
    */
  var registration_uri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * OAuth2 Token URI
    */
  var token_uri: js.UndefOr[java.lang.String] = js.undefined
}

object OAuth2Endpoints {
  @scala.inline
  def apply(
    authorize_uri: java.lang.String = null,
    registration_uri: java.lang.String = null,
    token_uri: java.lang.String = null
  ): OAuth2Endpoints = {
    val __obj = js.Dynamic.literal()
    if (authorize_uri != null) __obj.updateDynamic("authorize_uri")(authorize_uri)
    if (registration_uri != null) __obj.updateDynamic("registration_uri")(registration_uri)
    if (token_uri != null) __obj.updateDynamic("token_uri")(token_uri)
    __obj.asInstanceOf[OAuth2Endpoints]
  }
}

