package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person with a  formal responsibility in the provisioning of healthcare or related services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Practitioner
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this practitioner's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Address(es) of the practitioner that are not role specific (typically home address)
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * The date  on which the practitioner was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  
  /**
    * A language the practitioner is able to use in patient communication
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  
  /**
    * A identifier for the person as this agent
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The name(s) associated with the practitioner
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * Image of the person
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * Qualifications obtained by training and certification
    */
  var qualification: js.UndefOr[js.Array[PractitionerQualification]] = js.undefined
  
  /**
    * A contact detail for the practitioner (that apply to all roles)
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object Practitioner {
  
  @scala.inline
  def apply(): Practitioner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Practitioner]
  }
  
  @scala.inline
  implicit class PractitionerMutableBuilder[Self <: Practitioner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value :_*))
    
    @scala.inline
    def setBirthDate(value: date): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    @scala.inline
    def setCommunication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommunicationUndefined: Self = StObject.set(x, "communication", js.undefined)
    
    @scala.inline
    def setCommunicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "communication", js.Array(value :_*))
    
    @scala.inline
    def setGender(value: code): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value :_*))
    
    @scala.inline
    def setQualification(value: js.Array[PractitionerQualification]): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationUndefined: Self = StObject.set(x, "qualification", js.undefined)
    
    @scala.inline
    def setQualificationVarargs(value: PractitionerQualification*): Self = StObject.set(x, "qualification", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
    
    @scala.inline
    def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    @scala.inline
    def set_birthDate(value: Element): Self = StObject.set(x, "_birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_birthDateUndefined: Self = StObject.set(x, "_birthDate", js.undefined)
    
    @scala.inline
    def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
