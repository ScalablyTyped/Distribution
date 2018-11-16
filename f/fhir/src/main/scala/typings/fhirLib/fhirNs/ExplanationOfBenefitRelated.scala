package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Related Claims which may be revelant to processing this claim
     */

trait ExplanationOfBenefitRelated extends BackboneElement {
  /**
           * Reference to the related claim
           */
  var claim: js.UndefOr[Reference] = js.undefined
  /**
           * Related file or case reference
           */
  var reference: js.UndefOr[Identifier] = js.undefined
  /**
           * How the reference claim is related
           */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
}

