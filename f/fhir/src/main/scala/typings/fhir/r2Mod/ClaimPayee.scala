package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimPayee
  extends StObject
     with BackboneElement {
  
  /**
    * The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned).
    */
  var organization: js.UndefOr[Reference] = js.undefined
  
  /**
    * The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned).
    */
  var person: js.UndefOr[Reference] = js.undefined
  
  /**
    * The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned).
    */
  var provider: js.UndefOr[Reference] = js.undefined
  
  /**
    * Party to be reimbursed: Subscriber, provider, other.
    */
  var `type`: js.UndefOr[Coding] = js.undefined
}
object ClaimPayee {
  
  inline def apply(): ClaimPayee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimPayee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimPayee] (val x: Self) extends AnyVal {
    
    inline def setOrganization(value: Reference): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
    
    inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
    
    inline def setPerson(value: Reference): Self = StObject.set(x, "person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "person", js.undefined)
    
    inline def setProvider(value: Reference): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setType(value: Coding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
