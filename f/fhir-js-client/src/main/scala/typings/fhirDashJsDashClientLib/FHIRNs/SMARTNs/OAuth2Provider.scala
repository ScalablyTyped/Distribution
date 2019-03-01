package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * OAuth2 Provider information. If provided during the Authorize call, the library skips the conformance statement introspection
  */
trait OAuth2Provider extends js.Object {
  /**
    * Description about the provider
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Unique name for the provider
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
    */
  var oauth2: js.UndefOr[OAuth2Endpoints] = js.undefined
  /**
    * FHIR Service URL
    */
  var url: java.lang.String
}

object OAuth2Provider {
  @scala.inline
  def apply(
    url: java.lang.String,
    description: java.lang.String = null,
    name: java.lang.String = null,
    oauth2: OAuth2Endpoints = null
  ): OAuth2Provider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2)
    __obj.asInstanceOf[OAuth2Provider]
  }
}

