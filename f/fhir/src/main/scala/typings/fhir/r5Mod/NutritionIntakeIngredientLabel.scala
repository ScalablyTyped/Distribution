package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionIntakeIngredientLabel
  extends StObject
     with BackboneElement {
  
  /**
    * Total amount of nutrient consumed.
    */
  var amount: Quantity
  
  /**
    * Total nutrient consumed. This could be a macronutrient (protein, fat, carbohydrate), or a vitamin and mineral.
    */
  var nutrient: CodeableReference
}
object NutritionIntakeIngredientLabel {
  
  inline def apply(amount: Quantity, nutrient: CodeableReference): NutritionIntakeIngredientLabel = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], nutrient = nutrient.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionIntakeIngredientLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionIntakeIngredientLabel] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setNutrient(value: CodeableReference): Self = StObject.set(x, "nutrient", value.asInstanceOf[js.Any])
  }
}
