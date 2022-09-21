package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionIntakePerformer
  extends StObject
     with BackboneElement {
  
  /**
    * Who performed the intake.
    */
  var actor: Reference
  
  /**
    * Type of performer.
    */
  var function: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionIntakePerformer {
  
  inline def apply(actor: Reference): NutritionIntakePerformer = {
    val __obj = js.Dynamic.literal(actor = actor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionIntakePerformer]
  }
  
  extension [Self <: NutritionIntakePerformer](x: Self) {
    
    inline def setActor(value: Reference): Self = StObject.set(x, "actor", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: CodeableConcept): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
