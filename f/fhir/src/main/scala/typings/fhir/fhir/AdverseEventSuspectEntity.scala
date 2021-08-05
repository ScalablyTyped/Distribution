package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The suspected agent causing the adverse event
  */
trait AdverseEventSuspectEntity
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'causality'.
    */
  var _causality: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'causalityProductRelatedness'.
    */
  var _causalityProductRelatedness: js.UndefOr[Element] = js.undefined
  
  /**
    * causality1 | causality2
    */
  var causality: js.UndefOr[code] = js.undefined
  
  /**
    * assess1 | assess2
    */
  var causalityAssessment: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * AdverseEvent.suspectEntity.causalityAuthor
    */
  var causalityAuthor: js.UndefOr[Reference] = js.undefined
  
  /**
    * method1 | method2
    */
  var causalityMethod: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * AdverseEvent.suspectEntity.causalityProductRelatedness
    */
  var causalityProductRelatedness: js.UndefOr[String] = js.undefined
  
  /**
    * result1 | result2
    */
  var causalityResult: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Refers to the specific entity that caused the adverse event
    */
  var instance: Reference
}
object AdverseEventSuspectEntity {
  
  inline def apply(instance: Reference): AdverseEventSuspectEntity = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdverseEventSuspectEntity]
  }
  
  extension [Self <: AdverseEventSuspectEntity](x: Self) {
    
    inline def setCausality(value: code): Self = StObject.set(x, "causality", value.asInstanceOf[js.Any])
    
    inline def setCausalityAssessment(value: CodeableConcept): Self = StObject.set(x, "causalityAssessment", value.asInstanceOf[js.Any])
    
    inline def setCausalityAssessmentUndefined: Self = StObject.set(x, "causalityAssessment", js.undefined)
    
    inline def setCausalityAuthor(value: Reference): Self = StObject.set(x, "causalityAuthor", value.asInstanceOf[js.Any])
    
    inline def setCausalityAuthorUndefined: Self = StObject.set(x, "causalityAuthor", js.undefined)
    
    inline def setCausalityMethod(value: CodeableConcept): Self = StObject.set(x, "causalityMethod", value.asInstanceOf[js.Any])
    
    inline def setCausalityMethodUndefined: Self = StObject.set(x, "causalityMethod", js.undefined)
    
    inline def setCausalityProductRelatedness(value: String): Self = StObject.set(x, "causalityProductRelatedness", value.asInstanceOf[js.Any])
    
    inline def setCausalityProductRelatednessUndefined: Self = StObject.set(x, "causalityProductRelatedness", js.undefined)
    
    inline def setCausalityResult(value: CodeableConcept): Self = StObject.set(x, "causalityResult", value.asInstanceOf[js.Any])
    
    inline def setCausalityResultUndefined: Self = StObject.set(x, "causalityResult", js.undefined)
    
    inline def setCausalityUndefined: Self = StObject.set(x, "causality", js.undefined)
    
    inline def setInstance(value: Reference): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def set_causality(value: Element): Self = StObject.set(x, "_causality", value.asInstanceOf[js.Any])
    
    inline def set_causalityProductRelatedness(value: Element): Self = StObject.set(x, "_causalityProductRelatedness", value.asInstanceOf[js.Any])
    
    inline def set_causalityProductRelatednessUndefined: Self = StObject.set(x, "_causalityProductRelatedness", js.undefined)
    
    inline def set_causalityUndefined: Self = StObject.set(x, "_causality", js.undefined)
  }
}
