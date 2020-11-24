package typings.fhir.fhir

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
  implicit class NutritionOrderOralDietTextureOps[Self <: NutritionOrderOralDietTexture] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFoodType(value: CodeableConcept): Self = this.set("foodType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoodType: Self = this.set("foodType", js.undefined)
    
    @scala.inline
    def setModifier(value: CodeableConcept): Self = this.set("modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifier: Self = this.set("modifier", js.undefined)
  }
}
