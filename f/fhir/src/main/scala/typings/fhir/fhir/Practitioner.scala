package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person with a  formal responsibility in the provisioning of healthcare or related services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Practitioner extends DomainResource {
  
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
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Address(es) of the practitioner that are not role specific (typically home address)
    */
  var address: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * The date  on which the practitioner was born
    */
  var birthDate: js.UndefOr[date] = js.native
  
  /**
    * A language the practitioner is able to use in patient communication
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  
  /**
    * A identifier for the person as this agent
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * The name(s) associated with the practitioner
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.native
  
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.native
  
  /**
    * Qualifications obtained by training and certification
    */
  var qualification: js.UndefOr[js.Array[PractitionerQualification]] = js.native
  
  /**
    * A contact detail for the practitioner (that apply to all roles)
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object Practitioner {
  
  @scala.inline
  def apply(): Practitioner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Practitioner]
  }
  
  @scala.inline
  implicit class PractitionerOps[Self <: Practitioner] (val x: Self) extends AnyVal {
    
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
    def setCommunicationVarargs(value: CodeableConcept*): Self = this.set("communication", js.Array(value :_*))
    
    @scala.inline
    def setCommunication(value: js.Array[CodeableConcept]): Self = this.set("communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommunication: Self = this.set("communication", js.undefined)
    
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
    def setPhotoVarargs(value: Attachment*): Self = this.set("photo", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: js.Array[Attachment]): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setQualificationVarargs(value: PractitionerQualification*): Self = this.set("qualification", js.Array(value :_*))
    
    @scala.inline
    def setQualification(value: js.Array[PractitionerQualification]): Self = this.set("qualification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualification: Self = this.set("qualification", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
  }
}
