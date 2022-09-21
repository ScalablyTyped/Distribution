package typings.fhir.mod

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
  
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Need to keep track where the related person can be contacted per postal mail or visited.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * The date on which the related person was born.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * Needed for identification of the person, in combination with (at least) name and birth date.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * People are known by a variety of ids. Some institutions maintain several, and most collect identifiers for exchange with other organizations concerning the patient. Examples are national person identifier and local identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Related persons need to be identified by name, but it is uncommon to need details about multiple other names for that person.
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * We need to know which patient this RelatedPerson is related to.
    */
  var patient: Reference
  
  /**
    * The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * Many EHR systems have the capability to capture an image of persons. Fits with newer social media usage too.
    */
  var photo: js.UndefOr[js.Array[Attachment]] = js.undefined
  
  /**
    * We need to know the relationship with the patient since it influences the interpretation of the information attributed to this person.
    */
  var relationship: js.UndefOr[CodeableConcept] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_RelatedPerson: typings.fhir.fhirStrings.RelatedPerson
  
  /**
    * People have (primary) ways to contact them in some way such as phone, email.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object RelatedPerson {
  
  inline def apply(patient: Reference): RelatedPerson = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], resourceType = "RelatedPerson")
    __obj.asInstanceOf[RelatedPerson]
  }
  
  extension [Self <: RelatedPerson](x: Self) {
    
    inline def setAddress(value: js.Array[Address]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddressVarargs(value: Address*): Self = StObject.set(x, "address", js.Array(value*))
    
    inline def setBirthDate(value: String): Self = StObject.set(x, "birthDate", value.asInstanceOf[js.Any])
    
    inline def setBirthDateUndefined: Self = StObject.set(x, "birthDate", js.undefined)
    
    inline def setGender(value: male | female | other | unknown): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value*))
    
    inline def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setPhoto(value: js.Array[Attachment]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setPhotoVarargs(value: Attachment*): Self = StObject.set(x, "photo", js.Array(value*))
    
    inline def setRelationship(value: CodeableConcept): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
    
    inline def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.RelatedPerson): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_birthDate(value: Element): Self = StObject.set(x, "_birthDate", value.asInstanceOf[js.Any])
    
    inline def set_birthDateUndefined: Self = StObject.set(x, "_birthDate", js.undefined)
    
    inline def set_gender(value: Element): Self = StObject.set(x, "_gender", value.asInstanceOf[js.Any])
    
    inline def set_genderUndefined: Self = StObject.set(x, "_gender", js.undefined)
  }
}
