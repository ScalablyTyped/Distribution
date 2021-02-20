package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Required  nutrient modifications
  */
@js.native
trait NutritionOrderOralDietNutrient extends BackboneElement {
  
  /**
    * Quantity of the specified nutrient
    */
  var amount: js.UndefOr[Quantity] = js.native
  
  /**
    * Type of nutrient that is being modified
    */
  var modifier: js.UndefOr[CodeableConcept] = js.native
}
object NutritionOrderOralDietNutrient {
  
  @scala.inline
  def apply(): NutritionOrderOralDietNutrient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderOralDietNutrient]
  }
  
  @scala.inline
  implicit class NutritionOrderOralDietNutrientMutableBuilder[Self <: NutritionOrderOralDietNutrient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    @scala.inline
    def setModifier(value: CodeableConcept): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
  }
}
