package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supporting evidence
  */
trait ConditionEvidence
  extends StObject
     with BackboneElement {
  
  /**
    * Manifestation/symptom
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Supporting information found elsewhere
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ConditionEvidence {
  
  inline def apply(): ConditionEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionEvidence]
  }
  
  extension [Self <: ConditionEvidence](x: Self) {
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value :_*))
    
    inline def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value :_*))
  }
}
