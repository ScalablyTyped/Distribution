package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Required  nutrient modifications
  */
trait NutritionOrderOralDietNutrient
  extends StObject
     with BackboneElement {
  
  /**
    * Quantity of the specified nutrient
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Type of nutrient that is being modified
    */
  var modifier: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderOralDietNutrient {
  
  inline def apply(): NutritionOrderOralDietNutrient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietNutrient]
  }
  
  extension [Self <: NutritionOrderOralDietNutrient](x: Self) {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setModifier(value: CodeableConcept): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
