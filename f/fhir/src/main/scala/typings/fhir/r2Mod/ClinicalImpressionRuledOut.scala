package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClinicalImpressionRuledOut
  extends StObject
     with BackboneElement {
  
  var _reason: js.UndefOr[Element] = js.undefined
  
  /**
    * Specific text of code for diagnosis.
    */
  var item: CodeableConcept
  
  /**
    * Grounds for elimination.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object ClinicalImpressionRuledOut {
  
  inline def apply(item: CodeableConcept): ClinicalImpressionRuledOut = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClinicalImpressionRuledOut]
  }
  
  extension [Self <: ClinicalImpressionRuledOut](x: Self) {
    
    inline def setItem(value: CodeableConcept): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def set_reason(value: Element): Self = StObject.set(x, "_reason", value.asInstanceOf[js.Any])
    
    inline def set_reasonUndefined: Self = StObject.set(x, "_reason", js.undefined)
  }
}
