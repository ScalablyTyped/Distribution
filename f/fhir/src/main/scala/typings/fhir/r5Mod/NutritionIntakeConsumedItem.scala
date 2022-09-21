package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionIntakeConsumedItem
  extends StObject
     with BackboneElement {
  
  var _notConsumed: js.UndefOr[Element] = js.undefined
  
  /**
    * Quantity of the specified food.
    */
  var amount: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Indicator when a patient is in a setting where it is helpful to know if food was not consumed, such as it was refused, held (as in tube feedings), or otherwise not provided. If a consumption is being recorded from an app, such as MyFitnessPal, this indicator will likely not be used.
    */
  var notConsumed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Document the reason the food or fluid was not consumed, such as refused, held, etc.
    */
  var notConsumedReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * If only a code is specified, then it needs to be a code for a specific product. If more information is required, then the use of a new nutritionProduct resource is recommended.
    */
  var nutritionProduct: CodeableReference
  
  /**
    * Rate at which enteral feeding was administered.
    */
  var rate: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Scheduled frequency of consumption.
    */
  var schedule: js.UndefOr[Timing] = js.undefined
  
  /**
    * Indicates what a category of item that was consumed: eg., food, fluid, enteral, etc.
    */
  var `type`: CodeableConcept
}
object NutritionIntakeConsumedItem {
  
  inline def apply(nutritionProduct: CodeableReference, `type`: CodeableConcept): NutritionIntakeConsumedItem = {
    val __obj = js.Dynamic.literal(nutritionProduct = nutritionProduct.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NutritionIntakeConsumedItem]
  }
  
  extension [Self <: NutritionIntakeConsumedItem](x: Self) {
    
    inline def setAmount(value: Quantity): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setNotConsumed(value: Boolean): Self = StObject.set(x, "notConsumed", value.asInstanceOf[js.Any])
    
    inline def setNotConsumedReason(value: CodeableConcept): Self = StObject.set(x, "notConsumedReason", value.asInstanceOf[js.Any])
    
    inline def setNotConsumedReasonUndefined: Self = StObject.set(x, "notConsumedReason", js.undefined)
    
    inline def setNotConsumedUndefined: Self = StObject.set(x, "notConsumed", js.undefined)
    
    inline def setNutritionProduct(value: CodeableReference): Self = StObject.set(x, "nutritionProduct", value.asInstanceOf[js.Any])
    
    inline def setRate(value: Quantity): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setSchedule(value: Timing): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_notConsumed(value: Element): Self = StObject.set(x, "_notConsumed", value.asInstanceOf[js.Any])
    
    inline def set_notConsumedUndefined: Self = StObject.set(x, "_notConsumed", js.undefined)
  }
}
