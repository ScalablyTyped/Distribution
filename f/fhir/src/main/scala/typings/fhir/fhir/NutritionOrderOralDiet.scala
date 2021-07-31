package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Oral diet components
  */
trait NutritionOrderOralDiet
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.undefined
  
  /**
    * The required consistency of fluids and liquids provided to the patient
    */
  var fluidConsistencyType: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Instructions or additional information about the oral diet
    */
  var instruction: js.UndefOr[String] = js.undefined
  
  /**
    * Required  nutrient modifications
    */
  var nutrient: js.UndefOr[js.Array[NutritionOrderOralDietNutrient]] = js.undefined
  
  /**
    * Scheduled frequency of diet
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.undefined
  
  /**
    * Required  texture modifications
    */
  var texture: js.UndefOr[js.Array[NutritionOrderOralDietTexture]] = js.undefined
  
  /**
    * Type of oral diet or diet restrictions that describe what can be consumed orally
    */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object NutritionOrderOralDiet {
  
  @scala.inline
  def apply(): NutritionOrderOralDiet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDiet]
  }
  
  @scala.inline
  implicit class NutritionOrderOralDietMutableBuilder[Self <: NutritionOrderOralDiet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFluidConsistencyType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "fluidConsistencyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFluidConsistencyTypeUndefined: Self = StObject.set(x, "fluidConsistencyType", js.undefined)
    
    @scala.inline
    def setFluidConsistencyTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "fluidConsistencyType", js.Array(value :_*))
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    @scala.inline
    def setNutrient(value: js.Array[NutritionOrderOralDietNutrient]): Self = StObject.set(x, "nutrient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNutrientUndefined: Self = StObject.set(x, "nutrient", js.undefined)
    
    @scala.inline
    def setNutrientVarargs(value: NutritionOrderOralDietNutrient*): Self = StObject.set(x, "nutrient", js.Array(value :_*))
    
    @scala.inline
    def setSchedule(value: js.Array[Timing]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setScheduleVarargs(value: Timing*): Self = StObject.set(x, "schedule", js.Array(value :_*))
    
    @scala.inline
    def setTexture(value: js.Array[NutritionOrderOralDietTexture]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
    
    @scala.inline
    def setTextureVarargs(value: NutritionOrderOralDietTexture*): Self = StObject.set(x, "texture", js.Array(value :_*))
    
    @scala.inline
    def setType(value: js.Array[CodeableConcept]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setTypeVarargs(value: CodeableConcept*): Self = StObject.set(x, "type", js.Array(value :_*))
    
    @scala.inline
    def set_instruction(value: Element): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
  }
}
