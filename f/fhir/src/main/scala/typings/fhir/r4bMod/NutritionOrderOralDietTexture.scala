package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderOralDietTexture
  extends StObject
     with BackboneElement {
  
  /**
    * Coupled with the `texture.modifier`; could be (All Foods).
    */
  var foodType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Coupled with the foodType (Meat).
    */
  var modifier: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderOralDietTexture {
  
  inline def apply(): NutritionOrderOralDietTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietTexture]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderOralDietTexture] (val x: Self) extends AnyVal {
    
    inline def setFoodType(value: CodeableConcept): Self = StObject.set(x, "foodType", value.asInstanceOf[js.Any])
    
    inline def setFoodTypeUndefined: Self = StObject.set(x, "foodType", js.undefined)
    
    inline def setModifier(value: CodeableConcept): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
