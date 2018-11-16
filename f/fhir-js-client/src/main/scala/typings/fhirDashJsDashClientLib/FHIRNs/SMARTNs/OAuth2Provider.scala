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

