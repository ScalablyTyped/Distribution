package typings.fhir.r2Mod

import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Practitioner
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Need to be able to mark a practitioner record as not to be used because it was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Need to keep track where the practitioner can found during work or for directing mail.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * Needed for identification.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * Knowing which language a practitioner speaks can help in facilitating communication with patients.
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Needed to address the person correctly.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * Often, specific identities are assigned for the agent.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Contact persons need to be identified by name, but it is uncommon to need details about multiple other names for that person.
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * Many EHR systems have the capability to capture an image of patients and personnel. Fits with newer social media usage too.
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The list of roles/organizations that the practitioner is associated with.
    */
  var practitionerRole: js.UndefOr[js.Array[PractitionerPractitionerRole]] = js.undefined
  
  /**
    * Qualifications obtained by training and certification.
    */
  var qualification: js.UndefOr[js.Array[PractitionerQualification]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Practitioner: typings.fhir.fhirStrings.Practitioner
  
  /**
    * Need to know how to reach a practitioner.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object Practitioner {
  
  inline def apply(): Practitioner = {
    val __obj = js.Dynamic.literal(resourceType = "Practitioner")
    __obj.asInstanceOf[Practitioner]
  }
  
  extension [Self <: Practitioner](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    inline def setCommunication(value: js.Array[CodeableConcept]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    inline def setCommunicationUndefined: Self = StObject.set(x, "communication", js.undefined)
    
    inline def setCommunicationVarargs(value: CodeableConcept*): Self = StObject.set(x, "communication", js.Array(value*))
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value*))
    
    inline def setPractitionerRole(value: js.Array[PractitionerPractitionerRole]): Self = StObject.set(x, "practitionerRole", value.asInstanceOf[js.Any])
    
    inline def setPractitionerRoleUndefined: Self = StObject.set(x, "practitionerRole", js.undefined)
    
    inline def setPractitionerRoleVarargs(value: PractitionerPractitionerRole*): Self = StObject.set(x, "practitionerRole", js.Array(value*))
    
    inline def setQualification(value: js.Array[PractitionerQualification]): Self = StObject.set(x, "qualification", value.asInstanceOf[js.Any])
    
    inline def setQualificationUndefined: Self = StObject.set(x, "qualification", js.undefined)
    
    inline def setQualificationVarargs(value: PractitionerQualification*): Self = StObject.set(x, "qualification", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Practitioner): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_active(value: Element): Self = StObject.set(x, "_active", value.asInstanceOf[js.Any])
    
    inline def set_activeUndefined: Self = StObject.set(x, "_active", js.undefined)
    
    inline def set_birthDate(value: Element): Self = StObject.set(x, "_birthDate", value.asInstanceOf[js.Any])
    
    inline def set_birthDateUndefined: Self = StObject.set(x, "_birthDate", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
