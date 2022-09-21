package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdverseEventSuspectEntityCausality
  extends StObject
     with BackboneElement {
  
  var _productRelatedness: js.UndefOr[Element] = js.undefined
  
  /**
    * Assessment of if the entity caused the event.
    */
  var assessment: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * AdverseEvent.suspectEntity.causalityAuthor.
    */
  var author: js.UndefOr[Reference] = js.undefined
  
  /**
    * ProbabilityScale | Bayesian | Checklist.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * AdverseEvent.suspectEntity.causalityProductRelatedness.
    */
  var productRelatedness: js.UndefOr[String] = js.undefined
}
object AdverseEventSuspectEntityCausality {
  
  inline def apply(): AdverseEventSuspectEntityCausality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdverseEventSuspectEntityCausality]
  }
  
  extension [Self <: AdverseEventSuspectEntityCausality](x: Self) {
    
    inline def setAssessment(value: CodeableConcept): Self = StObject.set(x, "assessment", value.asInstanceOf[js.Any])
    
    inline def setAssessmentUndefined: Self = StObject.set(x, "assessment", js.undefined)
    
    inline def setAuthor(value: Reference): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setProductRelatedness(value: String): Self = StObject.set(x, "productRelatedness", value.asInstanceOf[js.Any])
    
    inline def setProductRelatednessUndefined: Self = StObject.set(x, "productRelatedness", js.undefined)
    
    inline def set_productRelatedness(value: Element): Self = StObject.set(x, "_productRelatedness", value.asInstanceOf[js.Any])
    
    inline def set_productRelatednessUndefined: Self = StObject.set(x, "_productRelatedness", js.undefined)
  }
}
