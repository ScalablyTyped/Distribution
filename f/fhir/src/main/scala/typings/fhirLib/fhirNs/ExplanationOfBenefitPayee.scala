package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Party to be paid any benefits payable
  */
trait ExplanationOfBenefitPayee extends BackboneElement {
  /**
    * Party to receive the payable
    */
  var party: js.UndefOr[Reference] = js.undefined
  /**
    * organization | patient | practitioner | relatedperson
    */
  var resourceType: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Type of party: Subscriber, Provider, other
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}

object ExplanationOfBenefitPayee {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    party: Reference = null,
    resourceType: CodeableConcept = null,
    `type`: CodeableConcept = null
  ): ExplanationOfBenefitPayee = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (party != null) __obj.updateDynamic("party")(party)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExplanationOfBenefitPayee]
  }
}

