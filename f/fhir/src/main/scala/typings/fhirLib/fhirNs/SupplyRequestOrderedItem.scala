package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item being requested
  */
trait SupplyRequestOrderedItem extends BackboneElement {
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Medication, Substance, or Device requested to be supplied
    */
  var itemReference: js.UndefOr[Reference] = js.undefined
  /**
    * The requested amount of the item indicated
    */
  var quantity: Quantity
}

object SupplyRequestOrderedItem {
  @scala.inline
  def apply(
    quantity: Quantity,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    itemCodeableConcept: CodeableConcept = null,
    itemReference: Reference = null,
    modifierExtension: js.Array[Extension] = null
  ): SupplyRequestOrderedItem = {
    val __obj = js.Dynamic.literal(quantity = quantity)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (itemCodeableConcept != null) __obj.updateDynamic("itemCodeableConcept")(itemCodeableConcept)
    if (itemReference != null) __obj.updateDynamic("itemReference")(itemReference)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[SupplyRequestOrderedItem]
  }
}

