package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationContact
  extends StObject
     with BackboneElement {
  
  /**
    * May need to keep track of a contact party's address for contacting, billing or reporting requirements.
    */
  var address: js.UndefOr[Address] = js.undefined
  
  /**
    * Need to be able to track the person by name.
    */
  var name: js.UndefOr[HumanName] = js.undefined
  
  /**
    * Need to distinguish between multiple contact persons.
    */
  var purpose: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * People have (primary) ways to contact them in some way such as phone, email.
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
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
  }
}
