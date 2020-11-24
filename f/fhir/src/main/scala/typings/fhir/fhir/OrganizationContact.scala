package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contact for the organization for a certain purpose
  */
@js.native
trait OrganizationContact extends BackboneElement {
  
  /**
    * Visiting or postal addresses for the contact
    */
  var address: js.UndefOr[Address] = js.native
  
  /**
    * A name associated with the contact
    */
  var name: js.UndefOr[HumanName] = js.native
  
  /**
    * The type of contact
    */
  var purpose: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Contact details (telephone, email, etc.)  for a contact
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.native
}
object OrganizationContact {
  
  @scala.inline
  def apply(): OrganizationContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationContact]
  }
  
  @scala.inline
  implicit class OrganizationContactOps[Self <: OrganizationContact] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: Address): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setName(value: HumanName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPurpose(value: CodeableConcept): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = this.set("telecom", js.Array(value :_*))
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = this.set("telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelecom: Self = this.set("telecom", js.undefined)
  }
}
