package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Qualifications obtained by training and certification
     */

trait PractitionerQualification extends BackboneElement {
  /**
           * Coded representation of the qualification
           */
  var code: CodeableConcept
  /**
           * An identifier for this qualification for the practitioner
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Organization that regulates and issues the qualification
           */
  var issuer: js.UndefOr[Reference] = js.undefined
  /**
           * Period during which the qualification is valid
           */
  var period: js.UndefOr[Period] = js.undefined
}

