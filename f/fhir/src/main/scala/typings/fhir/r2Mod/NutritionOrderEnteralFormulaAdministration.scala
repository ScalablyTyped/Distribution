package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderEnteralFormulaAdministration
  extends StObject
     with BackboneElement {
  
  /**
    * The volume of formula to provide to the patient per the specified administration schedule.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The time period and frequency at which the enteral formula should be delivered to the patient.
    */
  var schedule: js.UndefOr[Timing] = js.undefined
}
object NutritionOrderEnteralFormulaAdministration {
  
  inline def apply(): NutritionOrderEnteralFormulaAdministration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdministration]
  }
  
  extension [Self <: NutritionOrderEnteralFormulaAdministration](x: Self) {
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setRateQuantity(value: Quantity): Self = StObject.set(x, "rateQuantity", value.asInstanceOf[js.Any])
    
    inline def setRateQuantityUndefined: Self = StObject.set(x, "rateQuantity", js.undefined)
    
    inline def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    inline def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    inline def setSchedule(value: Timing): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
