package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Related Claims which may be revelant to processing this claim
  */
trait ExplanationOfBenefitRelated extends BackboneElement {
  /**
    * Reference to the related claim
    */
  var claim: js.UndefOr[Reference] = js.undefined
  /**
    * Related file or case reference
    */
  var reference: js.UndefOr[Identifier] = js.undefined
  /**
    * How the reference claim is related
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
}

object ExplanationOfBenefitRelated {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    claim: Reference = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    reference: Identifier = null,
    relationship: CodeableConcept = null
  ): ExplanationOfBenefitRelated = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (claim != null) __obj.updateDynamic("claim")(claim)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    if (relationship != null) __obj.updateDynamic("relationship")(relationship)
    __obj.asInstanceOf[ExplanationOfBenefitRelated]
  }
}

