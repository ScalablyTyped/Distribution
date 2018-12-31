package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * What codes are expected
  */
trait DataRequirementCodeFilter extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'valueCode'.
    */
  var _valueCode: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'valueSetString'.
    */
  var _valueSetString: js.UndefOr[Element] = js.undefined
  /**
    * The code-valued attribute of the filter
    */
  var path: java.lang.String
  /**
    * What code is expected
    */
  var valueCode: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * What CodeableConcept is expected
    */
  var valueCodeableConcept: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * What Coding is expected
    */
  var valueCoding: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
    * Valueset for the filter
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  /**
    * Valueset for the filter
    */
  var valueSetString: js.UndefOr[java.lang.String] = js.undefined
}

