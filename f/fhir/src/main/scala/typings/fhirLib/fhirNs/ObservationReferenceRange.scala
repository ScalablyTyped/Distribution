package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides guide for interpretation
  */
trait ObservationReferenceRange extends BackboneElement {
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.undefined
  /**
    * Applicable age range, if relevant
    */
  var age: js.UndefOr[Range] = js.undefined
  /**
    * Reference range population
    */
  var appliesTo: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * High Range, if relevant
    */
  var high: js.UndefOr[Quantity] = js.undefined
  /**
    * Low Range, if relevant
    */
  var low: js.UndefOr[Quantity] = js.undefined
  /**
    * Text based reference range in an observation
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Reference range qualifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

