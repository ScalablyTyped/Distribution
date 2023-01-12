package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NutritionOrderSupplement
  extends StObject
     with BackboneElement {
  
  var _instruction: js.UndefOr[Element] = js.undefined
  
  var _productName: js.UndefOr[Element] = js.undefined
  
  /**
    * Free text dosage instructions can be used for cases where the instructions are too complex to code.
    */
  var instruction: js.UndefOr[String] = js.undefined
  
  /**
    * The product or brand name of the nutritional supplement such as "Acme Protein Shake".
    */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
    * The amount of the nutritional supplement to be given.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The time period and frequency at which the supplement(s) should be given.  The supplement should be given for the combination of all schedules if more than one schedule is present.
    */
  var schedule: js.UndefOr[js.Array[Timing]] = js.undefined
  
  /**
    * The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object NutritionOrderSupplement {
  
  inline def apply(): NutritionOrderSupplement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NutritionOrderSupplement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NutritionOrderSupplement] (val x: Self) extends AnyVal {
    
    inline def setInstruction(value: String): Self = StObject.set(x, "instruction", value.asInstanceOf[js.Any])
    
    inline def setInstructionUndefined: Self = StObject.set(x, "instruction", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSchedule(value: js.Array[Timing]): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setScheduleVarargs(value: Timing*): Self = StObject.set(x, "schedule", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def set_instruction(value: Element): Self = StObject.set(x, "_instruction", value.asInstanceOf[js.Any])
    
    inline def set_instructionUndefined: Self = StObject.set(x, "_instruction", js.undefined)
    
    inline def set_productName(value: Element): Self = StObject.set(x, "_productName", value.asInstanceOf[js.Any])
    
    inline def set_productNameUndefined: Self = StObject.set(x, "_productName", js.undefined)
  }
}
