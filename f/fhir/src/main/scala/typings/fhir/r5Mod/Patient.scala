package typings.fhir.r5Mod

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
    * If a record is inactive, and linked to an active record, then future patient/record updates should occur on the other patient.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Patient may have multiple addresses with different uses or applicable periods.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * Partial dates are allowed if the specific date of birth is unknown. There is a standard extension "patient-birthTime" available that should be used where Time is required (such as in maternity/infant care systems).
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * If no language is specified, this *implies* that the default local language is spoken.  If you need to convey proficiency for multiple modes, then you need multiple Patient.Communication associations.   For animals, language is not a relevant field, and should be absent from the instance. If the Patient does not speak the default local language, then the Interpreter Required Standard can be used to explicitly declare that an interpreter is required.
    */
  var communication: js.UndefOr[js.Array[PatientCommunication]] = js.undefined
  
  /**
    * Contact covers all kinds of contact parties: family members, business contacts, guardians, caregivers. Not applicable to register pedigree and family ties beyond use of having contact.
    */
  var contact: js.UndefOr[js.Array[PatientContact]] = js.undefined
  
  /**
    * If there's no value in the instance, it means there is no statement on whether or not the individual is deceased. Most systems will interpret the absence of a value as a sign of the person being alive.
    */
  var deceasedBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If there's no value in the instance, it means there is no statement on whether or not the individual is deceased. Most systems will interpret the absence of a value as a sign of the person being alive.
    */
  var deceasedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The gender might not match the biological sex as determined by genetics or the individual's preferred identification. Note that for both humans and particularly animals, there are other legitimate possibilities than male and female, though the vast majority of systems and contexts only support male and female.  Systems providing decision support or enforcing business rules should ideally do this on the basis of Observations dealing with the specific sex or gender aspect of interest (anatomical, chromosomal, social, etc.)  However, because these observations are infrequently recorded, defaulting to the administrative gender is common practice.  Where such defaulting occurs, rule enforcement should allow for the variation between administrative and biological, chromosomal and other gender aspects.  For example, an alert about a hysterectomy on a male should be handled as a warning or overridable error, not a "hard" error.  See the Patient Gender and Sex section for additional information about communicating patient gender and sex.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * This may be the primary care provider (in a GP context), or it may be a patient nominated care manager in a community/disability setting, or even organization that will provide people to perform the care provider roles.  It is not to be used to record Care Teams, these should be in a CareTeam resource that may be linked to the CarePlan or EpisodeOfCare resources.
    * Multiple GPs may be recorded against the patient for various reasons, such as a student that has his home GP listed along with the GP at university during the school semesters, or a "fly-in/fly-out" worker that has the onsite GP also included with his home GP to remain aware of medical issues.
    * Jurisdictions may decide that they can profile this down to 1 if desired, or 1 per type.
    */
  var generalPractitioner: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * An identifier for this patient.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * There is no assumption that linked patient records have mutual links.
    */
  var link: js.UndefOr[js.Array[PatientLink]] = js.undefined
  
  /**
    * There is only one managing organization for a specific patient record. Other organizations will have their own Patient record, and may use the Link property to join the records together (or a Person resource which can include confidence ratings for the association).
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * This field contains a patient's most recent marital (civil) status.
    */
  var maritalStatus: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Where the valueInteger is provided, the number is the birth number in the sequence. E.g. The middle birth in triplets would be valueInteger=2 and the third born would have valueInteger=3 If a boolean value was provided for this triplets example, then all 3 patient records would have valueBoolean=true (the ordering is not indicated).
    */
  var multipleBirthBoolean: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where the valueInteger is provided, the number is the birth number in the sequence. E.g. The middle birth in triplets would be valueInteger=2 and the third born would have valueInteger=3 If a boolean value was provided for this triplets example, then all 3 patient records would have valueBoolean=true (the ordering is not indicated).
    */
  var multipleBirthInteger: js.UndefOr[Double] = js.undefined
  
  /**
    * A patient may have multiple names with different uses or applicable periods. For animals, the name is a "HumanName" in the sense that is assigned and used by humans and has the same patterns. Animal names may be communicated as given names, and optionally may include a family name.
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * Guidelines:
    * * Use id photos, not clinical photos.
    * * Limit dimensions to thumbnail.
    * * Keep byte count low to ease resource updates.
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Patient: typings.fhir.fhirStrings.Patient
  
  /**
    * A Patient may have multiple ways to be contacted with different uses or applicable periods.  May need to have options for contacting the person urgently and also to help with identification. The address might not go directly to the individual, but may reach another party that is able to proxy for the patient (i.e. home phone, or pet owner's phone).
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object Patient {
  
  inline def apply(): Patient = {
    val __obj = js.Dynamic.literal(resourceType = "Patient")
    __obj.asInstanceOf[Patient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Patient] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
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
    
    inline def setGeneralPractitioner(value: js.Array[Reference]): Self = StObject.set(x, "generalPractitioner", value.asInstanceOf[js.Any])
    
    inline def setGeneralPractitionerUndefined: Self = StObject.set(x, "generalPractitioner", js.undefined)
    
    inline def setGeneralPractitionerVarargs(value: Reference*): Self = StObject.set(x, "generalPractitioner", js.Array(value*))
    
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
