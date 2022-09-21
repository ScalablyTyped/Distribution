package typings.fhir.r3Mod

import typings.fhir.fhirStrings.female
import typings.fhir.fhirStrings.male
import typings.fhir.fhirStrings.other
import typings.fhir.fhirStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Person
  extends StObject
     with DomainResource
     with _FhirResource {
  
  var _active: js.UndefOr[Element] = js.undefined
  
  var _birthDate: js.UndefOr[Element] = js.undefined
  
  var _gender: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether this person's record is in active use.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Person may have multiple addresses with different uses or applicable periods.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * At least an estimated year should be provided as a guess if the real DOB is unknown.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * The gender may not match the biological sex as determined by genetics, or the individual's preferred identification. Note that for both humans and particularly animals, there are other legitimate possibilities than M and F, though the vast majority of systems and contexts only support M and F.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * Identifier for a person within a particular scope.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Link to a resource that concerns the same actual person.
    */
  var link: js.UndefOr[js.Array[PersonLink]] = js.undefined
  
  /**
    * The organization that is the custodian of the person record.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Person may have multiple names with different uses or applicable periods.
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * An image that can be displayed as a thumbnail of the person to enhance the identification of the individual.
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  
  /** Resource Type Name (for serialization) */
  @JSName("resourceType")
  val resourceType_Person: typings.fhir.fhirStrings.Person
  
  /**
    * Person may have multiple ways to be contacted with different uses or applicable periods.  May need to have options for contacting the person urgently, and also to help with identification.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object Person {
  
  inline def apply(): Person = {
    val __obj = js.Dynamic.literal(resourceType = "Person")
    __obj.asInstanceOf[Person]
  }
  
  extension [Self <: Person](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
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
    
    inline def setLink(value: js.Array[PersonLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setLinkVarargs(value: PersonLink*): Self = StObject.set(x, "link", js.Array(value*))
    
    inline def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    inline def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    inline def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setPhoto(value: Attachment): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    inline def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    inline def setResourceType(value: typings.fhir.fhirStrings.Person): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
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
