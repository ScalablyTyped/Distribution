package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Required  texture modifications
  */
@js.native
trait NutritionOrderOralDietTexture extends BackboneElement {
  
  /**
    * Concepts that are used to identify an entity that is ingested for nutritional purposes
    */
  var foodType: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Code to indicate how to alter the texture of the foods, e.g. pureed
    */
  var modifier: js.UndefOr[CodeableConcept] = js.native
}
object NutritionOrderOralDietTexture {
  
  @scala.inline
  def apply(): NutritionOrderOralDietTexture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietTexture]
  }
  
  @scala.inline
  implicit class NutritionOrderOralDietTextureMutableBuilder[Self <: NutritionOrderOralDietTexture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFoodType(value: CodeableConcept): Self = StObject.set(x, "foodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoodTypeUndefined: Self = StObject.set(x, "foodType", js.undefined)
    
    @scala.inline
    def setModifier(value: CodeableConcept): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
