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
  
  inline def apply(): OrganizationContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationContact]
  }
  
  extension [Self <: OrganizationContact](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setName(value: HumanName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPurpose(value: CodeableConcept): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value :_*))
  }
}
