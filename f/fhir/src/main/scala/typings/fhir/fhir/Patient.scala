package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an individual or animal receiving health care services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Patient extends DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'deceasedBoolean'.
    */
  var _deceasedBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'deceasedDateTime'.
    */
  var _deceasedDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'multipleBirthBoolean'.
    */
  var _multipleBirthBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'multipleBirthInteger'.
    */
  var _multipleBirthInteger: js.UndefOr[Element] = js.native
  
  /**
    * Whether this patient's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Addresses for the individual
    */
  var address: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * This patient is known to be an animal (non-human)
    */
  var animal: js.UndefOr[PatientAnimal] = js.native
  
  /**
    * The date of birth for the individual
    */
  var birthDate: js.UndefOr[date] = js.native
  
  /**
    * A list of Languages which may be used to communicate with the patient about their health
    */
  var communication: js.UndefOr[js.Array[PatientCommunication]] = js.native
  
  /**
    * A contact party (e.g. guardian, partner, friend) for the patient
    */
  var contact: js.UndefOr[js.Array[PatientContact]] = js.native
  
  /**
    * Indicates if the individual is deceased or not
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the individual is deceased or not
    */
  var deceasedDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  
  /**
    * Patient's nominated primary care provider
    */
  var generalPractitioner: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * An identifier for this patient
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Link to another patient resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PatientLink]] = js.native
  
  /**
    * Organization that is the custodian of the patient record
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  
  /**
    * Marital (civil) status of a patient
    */
  var maritalStatus: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Whether patient is part of a multiple birth
    */
  var multipleBirthBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether patient is part of a multiple birth
    */
  var multipleBirthInteger: js.UndefOr[integer] = js.native
  
  /**
    * A name associated with the patient
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.native
  
  /**
    * Image of the patient
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * A contact detail for the individual
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object Patient {
  
  @scala.inline
  def apply(): Patient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patient]
  }
  
  @scala.inline
  implicit class PatientOps[Self <: Patient] (val x: Self) extends AnyVal {
    
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
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    
    @scala.inline
    def set_birthDate(value: Element): Self = this.set("_birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_birthDate: Self = this.set("_birthDate", js.undefined)
    
    @scala.inline
    def set_deceasedBoolean(value: Element): Self = this.set("_deceasedBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_deceasedBoolean: Self = this.set("_deceasedBoolean", js.undefined)
    
    @scala.inline
    def set_deceasedDateTime(value: Element): Self = this.set("_deceasedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_deceasedDateTime: Self = this.set("_deceasedDateTime", js.undefined)
    
    @scala.inline
    def set_gender(value: Element): Self = this.set("_gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_gender: Self = this.set("_gender", js.undefined)
    
    @scala.inline
    def set_multipleBirthBoolean(value: Element): Self = this.set("_multipleBirthBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_multipleBirthBoolean: Self = this.set("_multipleBirthBoolean", js.undefined)
    
    @scala.inline
    def set_multipleBirthInteger(value: Element): Self = this.set("_multipleBirthInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_multipleBirthInteger: Self = this.set("_multipleBirthInteger", js.undefined)
    
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
    def setAnimal(value: PatientAnimal): Self = this.set("animal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimal: Self = this.set("animal", js.undefined)
    
    @scala.inline
    def setBirthDate(value: date): Self = this.set("birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthDate: Self = this.set("birthDate", js.undefined)
    
    @scala.inline
    def setCommunicationVarargs(value: PatientCommunication*): Self = this.set("communication", js.Array(value :_*))
    
    @scala.inline
    def setCommunication(value: js.Array[PatientCommunication]): Self = this.set("communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommunication: Self = this.set("communication", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: PatientContact*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[PatientContact]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setDeceasedBoolean(value: Boolean): Self = this.set("deceasedBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeceasedBoolean: Self = this.set("deceasedBoolean", js.undefined)
    
    @scala.inline
    def setDeceasedDateTime(value: dateTime): Self = this.set("deceasedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeceasedDateTime: Self = this.set("deceasedDateTime", js.undefined)
    
    @scala.inline
    def setGender(value: code): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setGeneralPractitionerVarargs(value: Reference*): Self = this.set("generalPractitioner", js.Array(value :_*))
    
    @scala.inline
    def setGeneralPractitioner(value: js.Array[Reference]): Self = this.set("generalPractitioner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneralPractitioner: Self = this.set("generalPractitioner", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: PatientLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[PatientLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = this.set("managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagingOrganization: Self = this.set("managingOrganization", js.undefined)
    
    @scala.inline
    def setMaritalStatus(value: CodeableConcept): Self = this.set("maritalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaritalStatus: Self = this.set("maritalStatus", js.undefined)
    
    @scala.inline
    def setMultipleBirthBoolean(value: Boolean): Self = this.set("multipleBirthBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleBirthBoolean: Self = this.set("multipleBirthBoolean", js.undefined)
    
    @scala.inline
    def setMultipleBirthInteger(value: integer): Self = this.set("multipleBirthInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleBirthInteger: Self = this.set("multipleBirthInteger", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: HumanName*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[HumanName]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhotoVarargs(value: Attachment*): Self = this.set("photo", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: js.Array[Attachment]): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
  }
}
