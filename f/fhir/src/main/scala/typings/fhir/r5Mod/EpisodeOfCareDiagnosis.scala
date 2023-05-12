package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EpisodeOfCareDiagnosis
  extends StObject
     with BackboneElement {
  
  /**
    * The medical condition that was addressed during the episode of care, expressed as a text, code or a reference to another resource.
    */
  var condition: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * Role that this diagnosis has within the episode of care (e.g. admission, billing, discharge …).
    */
  var use: js.UndefOr[CodeableConcept] = js.undefined
}
object EpisodeOfCareDiagnosis {
  
  inline def apply(): EpisodeOfCareDiagnosis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EpisodeOfCareDiagnosis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EpisodeOfCareDiagnosis] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: js.Array[CodeableReference]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: CodeableReference*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setUse(value: CodeableConcept): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
