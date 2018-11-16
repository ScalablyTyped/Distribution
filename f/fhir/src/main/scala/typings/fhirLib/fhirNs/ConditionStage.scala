package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Stage/grade, usually assessed formally
     */

trait ConditionStage extends BackboneElement {
  /**
           * Formal record of assessment
           */
  var assessment: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Simple summary (disease specific)
           */
  var summary: js.UndefOr[CodeableConcept] = js.undefined
}

