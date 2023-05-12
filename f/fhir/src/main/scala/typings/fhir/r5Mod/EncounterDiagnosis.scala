package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncounterDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * The coded diagnosis or a reference to a Condition (with other resources referenced in the evidence.detail), the use property will indicate the purpose of this specific diagnosis.
    */
  var condition: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Role that this diagnosis has within the encounter (e.g. admission, billing, discharge …).
    */
  var use: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object EncounterDiagnosis {
  
  inline def apply(): EncounterDiagnosis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncounterDiagnosis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncounterDiagnosis] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: js.Array[CodeableReference]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: CodeableReference*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setUse(value: js.Array[CodeableConcept]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: CodeableConcept*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
