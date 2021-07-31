package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic person record
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait Person
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
    * This person's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more addresses for the person
    */
  var address: js.UndefOr[js.Array[Address]] = js.undefined
  
  /**
    * The date on which the person was born
    */
  var birthDate: js.UndefOr[date] = js.undefined
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.undefined
  
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  
  /**
    * Link to a resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PersonLink]] = js.undefined
  
  /**
    * The organization that is the custodian of the person record
    */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.undefined
  
  /**
    * Image of the person
    */
  var photo: js.UndefOr[Attachment] = js.undefined
  
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object Person {
  
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit class PersonMutableBuilder[Self <: Person] (val x: Self) extends AnyVal {
    
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
    def setLink(value: js.Array[PersonLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: PersonLink*): Self = StObject.set(x, "link", js.Array(value :_*))
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = StObject.set(x, "managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagingOrganizationUndefined: Self = StObject.set(x, "managingOrganization", js.undefined)
    
    @scala.inline
    def setName(value: js.Array[HumanName]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: HumanName*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setPhoto(value: Attachment): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
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
