package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimPayee
  extends StObject
     with BackboneElement {
  
  /**
    * Not required if the payee is 'subscriber' or 'provider'.
    */
  var party: js.UndefOr[Reference] = js.undefined
  
  /**
    * Type of Party to be reimbursed: subscriber, provider, other.
    */
  var `type`: CodeableConcept
}
object ClaimPayee {
  
  inline def apply(`type`: CodeableConcept): ClaimPayee = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimPayee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimPayee] (val x: Self) extends AnyVal {
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setPartyUndefined: Self = StObject.set(x, "party", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
