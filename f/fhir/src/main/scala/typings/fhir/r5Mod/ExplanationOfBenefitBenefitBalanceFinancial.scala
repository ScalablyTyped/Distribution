package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplanationOfBenefitBenefitBalanceFinancial
  extends StObject
     with BackboneElement {
  
  var _allowedString: js.UndefOr[Element] = js.undefined
  
  /**
    * The quantity of the benefit which is permitted under the coverage.
    */
  var allowedMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * The quantity of the benefit which is permitted under the coverage.
    */
  var allowedString: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of the benefit which is permitted under the coverage.
    */
  var allowedUnsignedInt: js.UndefOr[Double] = js.undefined
  
  /**
    * For example: deductible, visits, benefit amount.
    */
  var `type`: CodeableConcept
  
  /**
    * The quantity of the benefit which have been consumed to date.
    */
  var usedMoney: js.UndefOr[Money] = js.undefined
  
  /**
    * The quantity of the benefit which have been consumed to date.
    */
  var usedUnsignedInt: js.UndefOr[Double] = js.undefined
}
object ExplanationOfBenefitBenefitBalanceFinancial {
  
  inline def apply(`type`: CodeableConcept): ExplanationOfBenefitBenefitBalanceFinancial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplanationOfBenefitBenefitBalanceFinancial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplanationOfBenefitBenefitBalanceFinancial] (val x: Self) extends AnyVal {
    
    inline def setAllowedMoney(value: Money): Self = StObject.set(x, "allowedMoney", value.asInstanceOf[js.Any])
    
    inline def setAllowedMoneyUndefined: Self = StObject.set(x, "allowedMoney", js.undefined)
    
    inline def setAllowedString(value: String): Self = StObject.set(x, "allowedString", value.asInstanceOf[js.Any])
    
    inline def setAllowedStringUndefined: Self = StObject.set(x, "allowedString", js.undefined)
    
    inline def setAllowedUnsignedInt(value: Double): Self = StObject.set(x, "allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setAllowedUnsignedIntUndefined: Self = StObject.set(x, "allowedUnsignedInt", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsedMoney(value: Money): Self = StObject.set(x, "usedMoney", value.asInstanceOf[js.Any])
    
    inline def setUsedMoneyUndefined: Self = StObject.set(x, "usedMoney", js.undefined)
    
    inline def setUsedUnsignedInt(value: Double): Self = StObject.set(x, "usedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setUsedUnsignedIntUndefined: Self = StObject.set(x, "usedUnsignedInt", js.undefined)
    
    inline def set_allowedString(value: Element): Self = StObject.set(x, "_allowedString", value.asInstanceOf[js.Any])
    
    inline def set_allowedStringUndefined: Self = StObject.set(x, "_allowedString", js.undefined)
  }
}
