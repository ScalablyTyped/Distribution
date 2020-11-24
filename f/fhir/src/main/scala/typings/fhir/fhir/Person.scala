package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic person record
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ @js.native
trait Person extends DomainResource {
  
  /**
    * Contains extended information for property 'active'.
    */
  var _active: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'birthDate'.
    */
  var _birthDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'gender'.
    */
  var _gender: js.UndefOr[Element] = js.native
  
  /**
    * This person's record is in active use
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more addresses for the person
    */
  var address: js.UndefOr[js.Array[Address]] = js.native
  
  /**
    * The date on which the person was born
    */
  var birthDate: js.UndefOr[date] = js.native
  
  /**
    * male | female | other | unknown
    */
  var gender: js.UndefOr[code] = js.native
  
  /**
    * A human identifier for this person
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Link to a resource that concerns the same actual person
    */
  var link: js.UndefOr[js.Array[PersonLink]] = js.native
  
  /**
    * The organization that is the custodian of the person record
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  
  /**
    * A name associated with the person
    */
  var name: js.UndefOr[js.Array[HumanName]] = js.native
  
  /**
    * Image of the person
    */
  var photo: js.UndefOr[Attachment] = js.native
  
  /**
    * A contact detail for the person
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object Person {
  
  @scala.inline
  def apply(): Person = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Person]
  }
  
  @scala.inline
  implicit class PersonOps[Self <: Person] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_active(value: Element): Self = this.set("_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_active: Self = this.set("_active", js.undefined)
    
    @scala.inline
    def set_birthDate(value: Element): Self = this.set("_birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_birthDate: Self = this.set("_birthDate", js.undefined)
    
    @scala.inline
    def set_gender(value: Element): Self = this.set("_gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_gender: Self = this.set("_gender", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAddressVarargs(value: Address*): Self = this.set("address", js.Array(value :_*))
    
    @scala.inline
    def setAddress(value: js.Array[Address]): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBirthDate(value: date): Self = this.set("birthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthDate: Self = this.set("birthDate", js.undefined)
    
    @scala.inline
    def setGender(value: code): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: PersonLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[PersonLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setManagingOrganization(value: Reference): Self = this.set("managingOrganization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagingOrganization: Self = this.set("managingOrganization", js.undefined)
    
    @scala.inline
    def setNameVarargs(value: HumanName*): Self = this.set("name", js.Array(value :_*))
    
    @scala.inline
    def setName(value: js.Array[HumanName]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPhoto(value: Attachment): Self = this.set("photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
  }
}
