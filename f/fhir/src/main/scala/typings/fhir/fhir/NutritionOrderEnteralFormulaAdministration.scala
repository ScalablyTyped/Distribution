package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Formula feeding instruction as structured data
  */
trait NutritionOrderEnteralFormulaAdministration
  extends StObject
     with BackboneElement {
  
  /**
    * The volume of formula to provide
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Speed with which the formula is provided per period of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.undefined
  
  /**
    * Scheduled frequency of enteral feeding
    */
  var schedule: js.UndefOr[Timing] = js.undefined
}
object NutritionOrderEnteralFormulaAdministration {
  
  @scala.inline
  def apply(): NutritionOrderEnteralFormulaAdministration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderEnteralFormulaAdministration]
  }
  
  @scala.inline
  implicit class NutritionOrderEnteralFormulaAdministrationMutableBuilder[Self <: NutritionOrderEnteralFormulaAdministration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setRateQuantity(value: Quantity): Self = StObject.set(x, "rateQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateQuantityUndefined: Self = StObject.set(x, "rateQuantity", js.undefined)
    
    @scala.inline
    def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    @scala.inline
    def setSchedule(value: Timing): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
  }
}
