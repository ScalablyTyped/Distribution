package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the context of use for a conformance or knowledge resource
  */
trait UsageContext extends Element {
  /**
    * Type of context being specified
    */
  var code: Coding
  /**
    * Value that defines the context
    */
  var valueCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Value that defines the context
    */
  var valueQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Value that defines the context
    */
  var valueRange: js.UndefOr[Range] = js.undefined
}

