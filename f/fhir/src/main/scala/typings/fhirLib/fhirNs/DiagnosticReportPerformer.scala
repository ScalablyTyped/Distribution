package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Participants in producing the report
  */
trait DiagnosticReportPerformer extends BackboneElement {
  /**
    * Practitioner or Organization  participant
    */
  var actor: Reference
  /**
    * Type of performer
    */
  var role: js.UndefOr[CodeableConcept] = js.undefined
}

