package typings.fhir.mod

import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Patient
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  var _deceasedBoolean: js.UndefOr[Element] = js.undefined
  
  var _deceasedDateTime: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  var _multipleBirthBoolean: js.UndefOr[Element] = js.undefined
  
  /**
    * Need to be able to mark a patient record as not to be used because it was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * May need to keep track of patient addresses for contacting, billing or reporting requirements and also to help with identification.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * Many clinical systems are extended to care for animal patients as well as human.
    */
  var animal: js.UndefOr[PatientAnimal] = js.undefined
  
  /**
    * Age of the individual drives many clinical processes.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * Patient's nominated care provider.
    */
  var careProvider: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * If a patient does not speak the local language, interpreters may be required, so languages spoken and proficiency is an important things to keep track of both for patient and other persons of interest.
    */
  var communication: js.UndefOr[js.Array[PatientCommunication]] = js.undefined
  
  /**
    * Need to track people you can contact about the patient.
    */
  var contact: js.UndefOr[js.Array[PatientContact]] = js.undefined
  
  /**
    * The fact that a patient is deceased influences the clinical process. Also, in human communication and relation management it is necessary to know whether the person is alive.
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The fact that a patient is deceased influences the clinical process. Also, in human communication and relation management it is necessary to know whether the person is alive.
    */
  var deceasedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Needed for identification of the individual, in combination with (at least) name and birth date. Gender of individual drives many clinical processes.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * Patients are almost always assigned specific numerical identifiers.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * There are multiple usecases:   * Duplicate patient records due to the clerical errors associated with the difficulties of identifying humans consistently, and * Distribution of patient information across multiple servers.
    */
  var link: js.UndefOr[js.Array[PatientLink]] = js.undefined
  
  /**
    * Need to know who recognizes this patient record, manages and updates it.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Most, if not all systems capture it.
    */
  var maritalStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * For disambiguation of multiple-birth children, especially relevant where the care provider doesn't meet the patient, such as labs.
    */
  var multipleBirthBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For disambiguation of multiple-birth children, especially relevant where the care provider doesn't meet the patient, such as labs.
    */
  var multipleBirthInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * Need to be able to track the patient by multiple names. Examples are your official name and a partner name.
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * Many EHR systems have the capability to capture an image of the patient. Fits with newer social media usage too.
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Patient: typings.fhir.fhirStrings.Patient
  
  /**
    * People have (primary) ways to contact them in some way such as phone, email.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object Patient {
  
  inline def apply(): Patient = {
    val __obj = js.Dynamic.literal(resourceType = "Patient")
    __obj.asInstanceOf[Patient]
  }
  
  extension [Self <: Patient](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setAnimal(value: PatientAnimal): Self = StObject.set(x, "animal", value.asInstanceOf[js.Any])
    
    inline def setAnimalUndefined: Self = StObject.set(x, "animal", js.undefined)
    
    inline def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    inline def setCareProvider(value: js.Array[Reference]): Self = StObject.set(x, "careProvider", value.asInstanceOf[js.Any])
    
    inline def setCareProviderUndefined: Self = StObject.set(x, "careProvider", js.undefined)
    
    inline def setCareProviderVarargs(value: Reference*): Self = StObject.set(x, "careProvider", js.Array(value*))
    
    inline def setCommunication(value: js.Array[PatientCommunication]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    inline def setCommunicationUndefined: Self = StObject.set(x, "communication", js.undefined)
    
    inline def setCommunicationVarargs(value: PatientCommunication*): Self = StObject.set(x, "communication", js.Array(value*))
    
    inline def setContact(value: js.Array[PatientContact]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: PatientContact*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setDeceasedBoolean(value: Boolean): Self = StObject.set(x, "deceasedBoolean", value.asInstanceOf[js.Any])
    
    inline def setDeceasedBooleanUndefined: Self = StObject.set(x, "deceasedBoolean", js.undefined)
    
    inline def setDeceasedDateTime(value: String): Self = StObject.set(x, "deceasedDateTime", value.asInstanceOf[js.Any])
    
    inline def setDeceasedDateTimeUndefined: Self = StObject.set(x, "deceasedDateTime", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setLink(value: js.Array[PatientLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: PatientLink*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setMaritalStatus(value: CodeableConcept): Self = StObject.set(x, "maritalStatus", value.asInstanceOf[js.Any])
    
    inline def setMaritalStatusUndefined: Self = StObject.set(x, "maritalStatus", js.undefined)
    
    inline def setMultipleBirthBoolean(value: Boolean): Self = StObject.set(x, "multipleBirthBoolean", value.asInstanceOf[js.Any])
    
    inline def setMultipleBirthBooleanUndefined: Self = StObject.set(x, "multipleBirthBoolean", js.undefined)
    
    inline def setMultipleBirthInteger(value: Double): Self = StObject.set(x, "multipleBirthInteger", value.asInstanceOf[js.Any])
    
    inline def setMultipleBirthIntegerUndefined: Self = StObject.set(x, "multipleBirthInteger", js.undefined)
    
    inline def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Patient): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
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
    
    inline def set_multipleBirthBoolean(value: Element): Self = StObject.set(x, "_multipleBirthBoolean", value.asInstanceOf[js.Any])
    
    inline def set_multipleBirthBooleanUndefined: Self = StObject.set(x, "_multipleBirthBoolean", js.undefined)
  }
}
