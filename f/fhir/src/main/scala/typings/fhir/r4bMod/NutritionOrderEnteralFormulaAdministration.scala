package typings.fhir.r4bMod

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
    * Ratio is used when the quantity value in the denominator is not "1", otherwise use Quantity. For example, the Ratio datatype is used for "200 mL/4 hrs" versus the Quantity datatype for "50 mL/hr".
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Ratio is used when the quantity value in the denominator is not "1", otherwise use Quantity. For example, the Ratio datatype is used for "200 mL/4 hrs" versus the Quantity datatype for "50 mL/hr".
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderEnteralFormulaAdministration] (val x: Self) extends AnyVal {
    
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
