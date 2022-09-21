package typings.fhir.mod

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
    * Need to be able to mark a person record as not to be used because it was created in error.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * May need to keep track of person's addresses for contacting, billing or reporting requirements and also to help with identification.
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * Age of person drives many clinical processes, and is often used in performing identification of the person. Times are not included so as to not confuse things with potential timezone issues.
    */
  var birthDate: js.UndefOr[String] = js.undefined
  
  /**
    * Needed for identification of the person, in combination with (at least) name and birth date. Gender of person drives many clinical processes.
    */
  var gender: js.UndefOr[male | female | other | unknown] = js.undefined
  
  /**
    * People are known by a variety of ids. Some institutions maintain several, and most collect identifiers for exchange with other organizations concerning the person. Examples are national person identifier and local identifier.
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Link to a resource that concerns the same actual person.
    */
  var link: js.UndefOr[js.Array[PersonLink]] = js.undefined
  
  /**
    * Need to know who recognizes this person record, manages and updates it.
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * Need to be able to track the person by multiple names. Examples are your official name and a partner name.
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
    * People have (primary) ways to contact them in some way such as phone, email.
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
