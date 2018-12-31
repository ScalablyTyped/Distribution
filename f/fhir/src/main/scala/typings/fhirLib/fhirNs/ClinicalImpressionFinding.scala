package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible or likely findings and diagnoses
  */
trait ClinicalImpressionFinding extends BackboneElement {
  /**
    * Contains extended information for property 'basis'.
    */
  var _basis: js.UndefOr[Element] = js.undefined
  /**
    * Which investigations support finding
    */
  var basis: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What was found
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * What was found
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
}

