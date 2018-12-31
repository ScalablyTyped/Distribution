package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context passed to create a SMART client directly without completing the SMART on FHIR OAuth2 authorization workflow
  */
trait Context extends js.Object {
  /**
    * Authorization context
    */
  var auth: js.UndefOr[AuthContext] = js.undefined
  /**
    * Patient in context
    */
  var patientId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * FHIR service base url
    */
  var serviceUrl: java.lang.String
  /**
    * User in context
    */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

