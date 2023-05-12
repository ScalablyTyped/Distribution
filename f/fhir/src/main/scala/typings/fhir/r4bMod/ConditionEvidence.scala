package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionEvidence
  extends StObject
     with BackboneElement {
  
  /**
    * A manifestation or symptom that led to the recording of this condition.
    */
  var code: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Links to other relevant information, including pathology reports.
    */
  var detail: js.UndefOr[js.Array[Reference]] = js.undefined
}
object ConditionEvidence {
  
  inline def apply(): ConditionEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionEvidence] (val x: Self) extends AnyVal {
    
    inline def setCode(value: js.Array[CodeableConcept]): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCodeVarargs(value: CodeableConcept*): Self = StObject.set(x, "code", js.Array(value*))
    
    inline def setDetail(value: js.Array[Reference]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDetailVarargs(value: Reference*): Self = StObject.set(x, "detail", js.Array(value*))
  }
}
