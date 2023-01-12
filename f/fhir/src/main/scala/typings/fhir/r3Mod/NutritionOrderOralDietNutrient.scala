package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderOralDietNutrient
  extends StObject
     with BackboneElement {
  
  /**
    * The quantity of the specified nutrient to include in diet.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The nutrient that is being modified such as carbohydrate or sodium.
    */
  var modifier: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderOralDietNutrient {
  
  inline def apply(): NutritionOrderOralDietNutrient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietNutrient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderOralDietNutrient] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setModifier(value: CodeableConcept): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
