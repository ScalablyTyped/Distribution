package typings
package fhirDashJsDashClientLib.FHIRNs.SMARTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a FHIR bundle
  */
trait Bundle extends js.Object {
  /**
    * The actual FHIR bundle, which is a FHIR resource itself with resourceType: 'Bundle'
    */
  var bundle: Resource
}

