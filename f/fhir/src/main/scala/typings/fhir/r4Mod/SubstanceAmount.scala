package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceAmount
  extends StObject
     with BackboneElement {
  
  var _amountString: js.UndefOr[Element] = js.undefined
  
  var _amountText: js.UndefOr[Element] = js.undefined
  
  /**
    * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
    */
  var amountQuantity: js.UndefOr[Quantity] = js.undefined
  
  /**
    * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
    */
  var amountRange: js.UndefOr[Range] = js.undefined
  
  /**
    * Used to capture quantitative values for a variety of elements. If only limits are given, the arithmetic mean would be the average. If only a single definite value for a given element is given, it would be captured in this field.
    */
  var amountString: js.UndefOr[String] = js.undefined
  
  /**
    * A textual comment on a numeric value.
    */
  var amountText: js.UndefOr[String] = js.undefined
  
  /**
    * Most elements that require a quantitative value will also have a field called amount type. Amount type should always be specified because the actual value of the amount is often dependent on it. EXAMPLE: In capturing the actual relative amounts of substances or molecular fragments it is essential to indicate whether the amount refers to a mole ratio or weight ratio. For any given element an effort should be made to use same the amount type for all related definitional elements.
    */
  var amountType: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Reference range of possible or expected values.
    */
  var referenceRange: js.UndefOr[SubstanceAmountReferenceRange] = js.undefined
}
object SubstanceAmount {
  
  inline def apply(): SubstanceAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceAmount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceAmount] (val x: Self) extends AnyVal {
    
    inline def setAmountQuantity(value: Quantity): Self = StObject.set(x, "amountQuantity", value.asInstanceOf[js.Any])
    
    inline def setAmountQuantityUndefined: Self = StObject.set(x, "amountQuantity", js.undefined)
    
    inline def setAmountRange(value: Range): Self = StObject.set(x, "amountRange", value.asInstanceOf[js.Any])
    
    inline def setAmountRangeUndefined: Self = StObject.set(x, "amountRange", js.undefined)
    
    inline def setAmountString(value: String): Self = StObject.set(x, "amountString", value.asInstanceOf[js.Any])
    
    inline def setAmountStringUndefined: Self = StObject.set(x, "amountString", js.undefined)
    
    inline def setAmountText(value: String): Self = StObject.set(x, "amountText", value.asInstanceOf[js.Any])
    
    inline def setAmountTextUndefined: Self = StObject.set(x, "amountText", js.undefined)
    
    inline def setAmountType(value: CodeableConcept): Self = StObject.set(x, "amountType", value.asInstanceOf[js.Any])
    
    inline def setAmountTypeUndefined: Self = StObject.set(x, "amountType", js.undefined)
    
    inline def setReferenceRange(value: SubstanceAmountReferenceRange): Self = StObject.set(x, "referenceRange", value.asInstanceOf[js.Any])
    
    inline def setReferenceRangeUndefined: Self = StObject.set(x, "referenceRange", js.undefined)
    
    inline def set_amountString(value: Element): Self = StObject.set(x, "_amountString", value.asInstanceOf[js.Any])
    
    inline def set_amountStringUndefined: Self = StObject.set(x, "_amountString", js.undefined)
    
    inline def set_amountText(value: Element): Self = StObject.set(x, "_amountText", value.asInstanceOf[js.Any])
    
    inline def set_amountTextUndefined: Self = StObject.set(x, "_amountText", js.undefined)
  }
}
