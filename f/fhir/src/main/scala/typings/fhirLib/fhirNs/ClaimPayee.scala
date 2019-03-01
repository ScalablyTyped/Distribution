package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Party to be paid any benefits payable
  */
trait ClaimPayee extends BackboneElement {
  /**
    * Party to receive the payable
    */
  var party: js.UndefOr[Reference] = js.undefined
  /**
    * organization | patient | practitioner | relatedperson
    */
  var resourceType: js.UndefOr[Coding] = js.undefined
  /**
    * Type of party: Subscriber, Provider, other
    */
  var `type`: CodeableConcept
}

object ClaimPayee {
  @scala.inline
  def apply(
    `type`: CodeableConcept,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    party: Reference = null,
    resourceType: Coding = null
  ): ClaimPayee = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (party != null) __obj.updateDynamic("party")(party)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    __obj.asInstanceOf[ClaimPayee]
  }
}

