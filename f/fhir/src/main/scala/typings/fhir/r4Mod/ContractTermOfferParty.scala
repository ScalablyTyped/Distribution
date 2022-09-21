package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContractTermOfferParty
  extends StObject
     with BackboneElement {
  
  /**
    * Participant in the offer.
    */
  var reference: js.Array[Reference]
  
  /**
    * How the party participates in the offer.
    */
  var role: CodeableConcept
}
object ContractTermOfferParty {
  
  inline def apply(reference: js.Array[Reference], role: CodeableConcept): ContractTermOfferParty = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContractTermOfferParty]
  }
  
  extension [Self <: ContractTermOfferParty](x: Self) {
    
    inline def setReference(value: js.Array[Reference]): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceVarargs(value: Reference*): Self = StObject.set(x, "reference", js.Array(value*))
    
    inline def setRole(value: CodeableConcept): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
