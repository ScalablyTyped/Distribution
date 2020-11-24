package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An person that is related to a patient, but who is not a direct target of care
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait RelatedPerson extends DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  
  /**
    * Whether this related person's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Address where the related person can be contacted or visited
    */
  var address: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * The date on which the related person was born
    */
  var birthDate: js.UndefOr[date] = js.native
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.native
  
  /**
    * The patient this person is related to
    */
  var patient: Reference = js.native
  
  /**
    * Period of time that this relationship is considered valid
    */
  var period: js.UndefOr[Period] = js.native
  
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * The nature of the relationship
    */
  var relationship: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object RelatedPerson {
  
  @scala.inline
  def apply(patient: Reference): RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedPerson]
  }
  
  @scala.inline
  implicit class RelatedPersonOps[Self <: RelatedPerson] (val x: Self) extends AnyVal {
    
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
    def setPatient(value: Reference): Self = this.set("patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    
    @scala.inline
    def set_birthDate(value: Element): Self = this.set("_birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_birthDate: Self = this.set("_birthDate", js.undefined)
    
    @scala.inline
    def set_gender(value: Element): Self = this.set("_gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_gender: Self = this.set("_gender", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: Address*): Self = this.set("address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: js.Array[Address]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBirthDate(value: date): Self = this.set("birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthDate: Self = this.set("birthDate", js.undefined)
    
    @scala.inline
    def setGender(value: code): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: HumanName*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[HumanName]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
    
    @scala.inline
    def setPhotoVarargs(value: Attachment*): Self = this.set("photo", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: js.Array[Attachment]): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setRelationship(value: CodeableConcept): Self = this.set("relationship", value.asInstanceOf[js.Any])
    
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
