package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionDefinitionMedication
  extends StObject
     with BackboneElement {
  
  /**
    * Category that is relevant.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code for relevant Medication.
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
}
object ConditionDefinitionMedication {
  
  inline def apply(): ConditionDefinitionMedication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionDefinitionMedication]
  }
  
  extension [Self <: ConditionDefinitionMedication](x: Self) {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
  }
}
