package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supplement components
  */
trait NutritionOrderSupplement
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'productName'.
    */
  var _productName: js.UndefOr[Element] = js.undefined
  
  /**
    * Instructions or additional information about the oral supplement
    */
  var instruction: js.UndefOr[String] = js.undefined
  
  /**
    * Product or brand name of the nutritional supplement
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * Amount of the nutritional supplement
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Scheduled frequency of supplement
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.undefined
  
  /**
    * Type of supplement product requested
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderSupplement {
  
  @scala.inline
  def apply(): NutritionOrderSupplement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderSupplement]
  }
  
  @scala.inline
  implicit class NutritionOrderSupplementMutableBuilder[Self <: NutritionOrderSupplement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setSchedule(value: js.Array[Timing]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    @scala.inline
    def setScheduleVarargs(value: Timing*): Self = StObject.set(x, "schedule", js.Array(value :_*))
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_instruction(value: Element): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
    
    @scala.inline
    def set_productName(value: Element): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
  }
}
