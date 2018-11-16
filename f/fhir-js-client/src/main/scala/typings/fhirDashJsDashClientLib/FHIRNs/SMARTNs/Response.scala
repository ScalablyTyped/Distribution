package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Structure of the response from the FHIR server
         */

trait Response extends js.Object {
  /**
               * Contains state information. Url, type, server configuration used, Id etc
               */
  var config: js.UndefOr[js.Any] = js.undefined
  /**
               * Data returned from the FHIR server
               */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
               * Error object returned by the client library.
               */
  var error: js.UndefOr[js.Any] = js.undefined
  /**
               * HTTP Response headers
               */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
               * HTTP Status code string
               */
  var status: js.UndefOr[js.Any] = js.undefined
}

