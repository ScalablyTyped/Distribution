package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The suspected agent causing the adverse event
  */
trait AdverseEventSuspectEntity extends BackboneElement {
  /**
    * Contains extended information for property 'causality'.
    */
  var _causality: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'causalityProductRelatedness'.
    */
  var _causalityProductRelatedness: js.UndefOr[Element] = js.undefined
  /**
    * causality1 | causality2
    */
  var causality: js.UndefOr[code] = js.undefined
  /**
    * assess1 | assess2
    */
  var causalityAssessment: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * AdverseEvent.suspectEntity.causalityAuthor
    */
  var causalityAuthor: js.UndefOr[Reference] = js.undefined
  /**
    * method1 | method2
    */
  var causalityMethod: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * AdverseEvent.suspectEntity.causalityProductRelatedness
    */
  var causalityProductRelatedness: js.UndefOr[java.lang.String] = js.undefined
  /**
    * result1 | result2
    */
  var causalityResult: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Refers to the specific entity that caused the adverse event
    */
  var instance: Reference
}

