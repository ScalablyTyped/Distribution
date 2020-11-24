package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Oral diet components
  */
@js.native
trait NutritionOrderOralDiet extends BackboneElement {
  
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.native
  
  /**
    * The required consistency of fluids and liquids provided to the patient
    */
  var fluidConsistencyType: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Instructions or additional information about the oral diet
    */
  var instruction: js.UndefOr[String] = js.native
  
  /**
    * Required  nutrient modifications
    */
  var nutrient: js.UndefOr[js.Array[NutritionOrderOralDietNutrient]] = js.native
  
  /**
    * Scheduled frequency of diet
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.native
  
  /**
    * Required  texture modifications
    */
  var texture: js.UndefOr[js.Array[NutritionOrderOralDietTexture]] = js.native
  
  /**
    * Type of oral diet or diet restrictions that describe what can be consumed orally
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.native
}
object NutritionOrderOralDiet {
  
  @scala.inline
  def apply(): NutritionOrderOralDiet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDiet]
  }
  
  @scala.inline
  implicit class NutritionOrderOralDietOps[Self <: NutritionOrderOralDiet] (val x: Self) extends AnyVal {
    
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
    def set_instruction(value: Element): Self = this.set("_instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_instruction: Self = this.set("_instruction", js.undefined)
    
    @scala.inline
    def setFluidConsistencyTypeVarargs(value: CodeableConcept*): Self = this.set("fluidConsistencyType", js.Array(value :_*))
    
    @scala.inline
    def setFluidConsistencyType(value: js.Array[CodeableConcept]): Self = this.set("fluidConsistencyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluidConsistencyType: Self = this.set("fluidConsistencyType", js.undefined)
    
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
    
    @scala.inline
    def setNutrientVarargs(value: NutritionOrderOralDietNutrient*): Self = this.set("nutrient", js.Array(value :_*))
    
    @scala.inline
    def setNutrient(value: js.Array[NutritionOrderOralDietNutrient]): Self = this.set("nutrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNutrient: Self = this.set("nutrient", js.undefined)
    
    @scala.inline
    def setScheduleVarargs(value: Timing*): Self = this.set("schedule", js.Array(value :_*))
    
    @scala.inline
    def setSchedule(value: js.Array[Timing]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setTextureVarargs(value: NutritionOrderOralDietTexture*): Self = this.set("texture", js.Array(value :_*))
    
    @scala.inline
    def setTexture(value: js.Array[NutritionOrderOralDietTexture]): Self = this.set("texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTexture: Self = this.set("texture", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = this.set("type", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
