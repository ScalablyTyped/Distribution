package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoveragePaymentBy
  extends StObject
     with BackboneElement {
  
  var _responsibility: js.UndefOr[Element] = js.undefined
  
  /**
    * The list of parties providing non-insurance payment for the treatment costs.
    */
  var party: Reference
  
  /**
    *  Description of the financial responsibility.
    */
  var responsibility: js.UndefOr[String] = js.undefined
}
object CoveragePaymentBy {
  
  inline def apply(party: Reference): CoveragePaymentBy = {
    val __obj = js.Dynamic.literal(party = party.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoveragePaymentBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoveragePaymentBy] (val x: Self) extends AnyVal {
    
    inline def setParty(value: Reference): Self = StObject.set(x, "party", value.asInstanceOf[js.Any])
    
    inline def setResponsibility(value: String): Self = StObject.set(x, "responsibility", value.asInstanceOf[js.Any])
    
    inline def setResponsibilityUndefined: Self = StObject.set(x, "responsibility", js.undefined)
    
    inline def set_responsibility(value: Element): Self = StObject.set(x, "_responsibility", value.asInstanceOf[js.Any])
    
    inline def set_responsibilityUndefined: Self = StObject.set(x, "_responsibility", js.undefined)
  }
}
