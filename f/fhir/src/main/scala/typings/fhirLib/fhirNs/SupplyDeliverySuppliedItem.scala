package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item that is delivered or supplied
  */
trait SupplyDeliverySuppliedItem extends BackboneElement {
  /**
    * Medication, Substance, or Device supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Medication, Substance, or Device supplied
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
  /**
    * Amount dispensed
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}

