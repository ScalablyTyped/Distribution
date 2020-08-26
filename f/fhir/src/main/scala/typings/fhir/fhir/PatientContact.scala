package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A contact party (e.g. guardian, partner, friend) for the patient
  */
@js.native
trait PatientContact extends BackboneElement {
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  /**
    * Address for the contact person
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  /**
    * A name associated with the contact person
    */
  var name: js.UndefOr[HumanName] = js.native
  /**
    * Organization that is associated with the contact
    */
  var organization: js.UndefOr[Reference] = js.native
  /**
    * The period during which this contact person or organization is valid to be contacted relating to this patient
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * The kind of relationship
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}

object PatientContact {
  @scala.inline
  def apply(): PatientContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatientContact]
  }
  @scala.inline
  implicit class PatientContactOps[Self <: PatientContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_gender(value: Element): Self = this.set("_gender", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gender: Self = this.set("_gender", js.undefined)
    @scala.inline
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setGender(value: code): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setName(value: HumanName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrganization(value: Reference): Self = this.set("organization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    @scala.inline
    def setRelationshipVarargs(value: CodeableConcept*): Self = this.set("relationship", js.Array(value :_*))
    @scala.inline
    def setRelationship(value: js.Array[CodeableConcept]): Self = this.set("relationship", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationship: Self = this.set("relationship", js.undefined)
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
  }
  
}

