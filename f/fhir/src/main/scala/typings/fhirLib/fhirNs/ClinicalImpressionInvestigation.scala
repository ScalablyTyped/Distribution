package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * One or more sets of investigations (signs, symptions, etc.)
     */

trait ClinicalImpressionInvestigation extends BackboneElement {
  /**
           * A name/code for the set
           */
  var code: CodeableConcept
  /**
           * Record of a specific investigation
           */
  var item: js.UndefOr[js.Array[Reference]] = js.undefined
}

