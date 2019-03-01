package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact party (e.g. guardian, partner, friend) for the patient
  */
trait PatientContact extends BackboneElement {
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  /**
    * Address for the contact person
    */
  var address: js.UndefOr[Address] = js.undefined
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  /**
    * A name associated with the contact person
    */
  var name: js.UndefOr[HumanName] = js.undefined
  /**
    * Organization that is associated with the contact
    */
  var organization: js.UndefOr[Reference] = js.undefined
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The kind of relationship
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}

object PatientContact {
  @scala.inline
  def apply(
    _fhir_comments: js.Array[Element] = null,
    _gender: Element = null,
    _id: Element = null,
    address: Address = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    gender: code = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    name: HumanName = null,
    organization: Reference = null,
    period: Period = null,
    relationship: js.Array[CodeableConcept] = null,
    telecom: js.Array[ContactPoint] = null
  ): PatientContact = {
    val __obj = js.Dynamic.literal()
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_gender != null) __obj.updateDynamic("_gender")(_gender)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (address != null) __obj.updateDynamic("address")(address)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (organization != null) __obj.updateDynamic("organization")(organization)
    if (period != null) __obj.updateDynamic("period")(period)
    if (relationship != null) __obj.updateDynamic("relationship")(relationship)
    if (telecom != null) __obj.updateDynamic("telecom")(telecom)
    __obj.asInstanceOf[PatientContact]
  }
}

