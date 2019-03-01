package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Composition information about the substance
  */
trait SubstanceIngredient extends BackboneElement {
  /**
    * Optional amount (concentration)
    */
  var quantity: js.UndefOr[Ratio] = js.undefined
  /**
    * A component of the substance
    */
  var substanceCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * A component of the substance
    */
  var substanceReference: js.UndefOr[Reference] = js.undefined
}

object SubstanceIngredient {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    quantity: Ratio = null,
    substanceCodeableConcept: CodeableConcept = null,
    substanceReference: Reference = null
  ): SubstanceIngredient = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity)
    if (substanceCodeableConcept != null) __obj.updateDynamic("substanceCodeableConcept")(substanceCodeableConcept)
    if (substanceReference != null) __obj.updateDynamic("substanceReference")(substanceReference)
    __obj.asInstanceOf[SubstanceIngredient]
  }
}

