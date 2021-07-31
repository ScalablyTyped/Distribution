package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contact for the organization for a certain purpose
  */
trait OrganizationContact
  extends StObject
     with BackboneElement {
  
  /**
    * Visiting or postal addresses for the contact
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * A name associated with the contact
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * The type of contact
    */
  var purpose: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Contact details (telephone, email, etc.)  for a contact
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object OrganizationContact {
  
  @scala.inline
  def apply(): OrganizationContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationContact]
  }
  
  @scala.inline
  implicit class OrganizationContactMutableBuilder[Self <: OrganizationContact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPurpose(value: CodeableConcept): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    @scala.inline
    def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
  }
}
