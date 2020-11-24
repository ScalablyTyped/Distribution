package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Supplement components
  */
@js.native
trait NutritionOrderSupplement extends BackboneElement {
  
  /**
    * Contains extended information for property 'instruction'.
    */
  var _instruction: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'productName'.
    */
  var _productName: js.UndefOr[Element] = js.native
  
  /**
    * Instructions or additional information about the oral supplement
    */
  var instruction: js.UndefOr[String] = js.native
  
  /**
    * Product or brand name of the nutritional supplement
    */
  var productName: js.UndefOr[String] = js.native
  
  /**
    * Amount of the nutritional supplement
    */
  var quantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Scheduled frequency of supplement
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.native
  
  /**
    * Type of supplement product requested
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object NutritionOrderSupplement {
  
  @scala.inline
  def apply(): NutritionOrderSupplement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderSupplement]
  }
  
  @scala.inline
  implicit class NutritionOrderSupplementOps[Self <: NutritionOrderSupplement] (val x: Self) extends AnyVal {
    
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
    def set_productName(value: Element): Self = this.set("_productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_productName: Self = this.set("_productName", js.undefined)
    
    @scala.inline
    def setInstruction(value: String): Self = this.set("instruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstruction: Self = this.set("instruction", js.undefined)
    
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setScheduleVarargs(value: Timing*): Self = this.set("schedule", js.Array(value :_*))
    
    @scala.inline
    def setSchedule(value: js.Array[Timing]): Self = this.set("schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
