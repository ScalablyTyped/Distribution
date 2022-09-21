package typings.fhir.r5Mod

import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedPerson
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * This element is labeled as a modifier because it may be used to mark that the resource was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Address where the related person can be contacted or visited.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * The date on which the related person was born.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * If no language is specified, this *implies* that the default local language is spoken.  If you need to convey proficiency for multiple modes, then you need multiple RelatedPerson.Communication associations.   If the RelatedPerson does not speak the default local language, then the Interpreter Required Standard can be used to explicitly declare that an interpreter is required.
    */
  var communication: js.UndefOr[js.Array[RelatedPersonCommunication]] = js.undefined
  
  /**
    * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * Identifier for a person within a particular scope.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * A name associated with the person.
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * The patient this person is related to.
    */
  var patient: Reference
  
  /**
    * The period of time during which this relationship is or was active. If there are no dates defined, then the interval is unknown.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Image of the person.
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * The nature of the relationship between a patient and the related person.
    */
  var relationship: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_RelatedPerson: typings.fhir.fhirStrings.RelatedPerson
  
  /**
    * Person may have multiple ways to be contacted with different uses or applicable periods.  May need to have options for contacting the person urgently, and also to help with identification.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object RelatedPerson {
  
  inline def apply(patient: Reference): RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "RelatedPerson")
    __obj.asInstanceOf[RelatedPerson]
  }
  
  extension [Self <: RelatedPerson](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    inline def setCommunication(value: js.Array[RelatedPersonCommunication]): Self = StObject.set(x, "communication", value.asInstanceOf[js.Any])
    
    inline def setCommunicationUndefined: Self = StObject.set(x, "communication", js.undefined)
    
    inline def setCommunicationVarargs(value: RelatedPersonCommunication*): Self = StObject.set(x, "communication", js.Array(value*))
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value*))
    
    inline def setRelationship(value: js.Array[CodeableConcept]): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setRelationshipVarargs(value: CodeableConcept*): Self = StObject.set(x, "relationship", js.Array(value*))
    
    inline def setResourceType(value: typings.fhir.fhirStrings.RelatedPerson): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
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
