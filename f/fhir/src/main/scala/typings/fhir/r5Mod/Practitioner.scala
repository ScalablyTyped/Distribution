package typings.fhir.r5Mod

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
  
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  
  var _deceasedDateTime: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * If the practitioner is not in use by one organization, then it should mark the period on the PractitonerRole with an end date (even if they are active) as they may be active in another role.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The PractitionerRole does not have an address value on it, as it is expected that the location property be used for this purpose (which has an address).
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * The date of birth for the practitioner.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * The structure aa-BB with this exact casing is one the most widely used notations for locale. However not all systems code this but instead have it as free text. Hence CodeableConcept instead of code as the data type.
    */
  var communication: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * If there's no value in the instance, it means there is no statement on whether or not the practitioner is deceased. Most systems will interpret the absence of a value as a sign of the person being alive.
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If there's no value in the instance, it means there is no statement on whether or not the practitioner is deceased. Most systems will interpret the absence of a value as a sign of the person being alive.
    */
  var deceasedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * An identifier that applies to this person in this role.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * The selection of the use property should ensure that there is a single usual name specified, and others use the nickname (alias), old, or other values as appropriate.
    * In general, select the value to be used in the ResourceReference.display based on this:
    * 1. There is more than 1 name
    * 2. Use = usual
    * 3. Period is current to the date of the usage
    * 4. Use = official
    * 5. Other order as decided by internal business rules.
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * Image of the person.
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The official certifications, training, and licenses that authorize or otherwise pertain to the provision of care by the practitioner.  For example, a medical license issued by a medical board authorizing the practitioner to practice medicine within a certain locality.
    */
  var qualification: js.UndefOr[js.Array[PractitionerQualification]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Practitioner: typings.fhir.fhirStrings.Practitioner
  
  /**
    * Person may have multiple ways to be contacted with different uses or applicable periods.  May need to have options for contacting the person urgently and to help with identification.  These typically will have home numbers, or mobile numbers that are not role specific.
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
    
    inline def setDeceasedBoolean(value: Boolean): Self = StObject.set(x, "deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def setDeceasedBooleanUndefined: Self = StObject.set(x, "deceasedBoolean", js.undefined)
    
    inline def setDeceasedDateTime(value: String): Self = StObject.set(x, "deceasedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeceasedDateTimeUndefined: Self = StObject.set(x, "deceasedDateTime", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value*))
    
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
    
    inline def set_deceasedBoolean(value: Element): Self = StObject.set(x, "_deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def set_deceasedBooleanUndefined: Self = StObject.set(x, "_deceasedBoolean", js.undefined)
    
    inline def set_deceasedDateTime(value: Element): Self = StObject.set(x, "_deceasedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_deceasedDateTimeUndefined: Self = StObject.set(x, "_deceasedDateTime", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
