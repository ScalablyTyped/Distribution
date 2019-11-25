package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contact for the organization for a certain purpose
  */
trait OrganizationContact extends BackboneElement {
  /**
    * Visiting or postal addresses for the contact
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * A name associated with the contact
    */
  var name: js.UndefOr[HumanName] = js.undefined
  /**
    * The type of contact
    */
  var purpose: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Contact details (telephone, email, etc.)  for a contact
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object OrganizationContact {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    address: Address = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: HumanName = null,
    purpose: CodeableConcept = null,
    telecom: js.Array[ContactPoint] = null
  ): OrganizationContact = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (purpose != null) __obj.updateDynamic("purpose")(purpose.asInstanceOf[js.Any])
    if (telecom != null) __obj.updateDynamic("telecom")(telecom.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationContact]
  }
}

