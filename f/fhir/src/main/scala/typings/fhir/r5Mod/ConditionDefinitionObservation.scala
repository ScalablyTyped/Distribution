package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionDefinitionObservation
  extends StObject
     with BackboneElement {
  
  /**
    * Category that is relevant.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code for relevant Observation.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
}
object ConditionDefinitionObservation {
  
  inline def apply(): ConditionDefinitionObservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionDefinitionObservation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionDefinitionObservation] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
