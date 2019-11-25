package typings.fhirDashJsDashClient.FHIR.SMART

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
  var description: js.UndefOr[String] = js.undefined
  /**
    * Unique name for the provider
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The OAuth2 endpoints (Registration URI, Authorize URI, Token URI)
    */
  var oauth2: js.UndefOr[OAuth2Endpoints] = js.undefined
  /**
    * FHIR Service URL
    */
  var url: String
}

object OAuth2Provider {
  @scala.inline
  def apply(url: String, description: String = null, name: String = null, oauth2: OAuth2Endpoints = null): OAuth2Provider = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Provider]
  }
}

