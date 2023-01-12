package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageEligibilityResponseInsuranceItemBenefit
  extends StObject
     with BackboneElement {
  
  var _allowedString: js.UndefOr[Element] = js.undefined
  
  var _usedString: js.UndefOr[Element] = js.undefined
  
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
  var usedString: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of the benefit which have been consumed to date.
    */
  var usedUnsignedInt: js.UndefOr[Double] = js.undefined
}
object CoverageEligibilityResponseInsuranceItemBenefit {
  
  inline def apply(`type`: CodeableConcept): CoverageEligibilityResponseInsuranceItemBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageEligibilityResponseInsuranceItemBenefit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageEligibilityResponseInsuranceItemBenefit] (val x: Self) extends AnyVal {
    
    inline def setAllowedMoney(value: Money): Self = StObject.set(x, "allowedMoney", value.asInstanceOf[js.Any])
    
    inline def setAllowedMoneyUndefined: Self = StObject.set(x, "allowedMoney", js.undefined)
    
    inline def setAllowedString(value: String): Self = StObject.set(x, "allowedString", value.asInstanceOf[js.Any])
    
    inline def setAllowedStringUndefined: Self = StObject.set(x, "allowedString", js.undefined)
    
    inline def setAllowedUnsignedInt(value: Double): Self = StObject.set(x, "allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setAllowedUnsignedIntUndefined: Self = StObject.set(x, "allowedUnsignedInt", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsedMoney(value: Money): Self = StObject.set(x, "usedMoney", value.asInstanceOf[js.Any])
    
    inline def setUsedMoneyUndefined: Self = StObject.set(x, "usedMoney", js.undefined)
    
    inline def setUsedString(value: String): Self = StObject.set(x, "usedString", value.asInstanceOf[js.Any])
    
    inline def setUsedStringUndefined: Self = StObject.set(x, "usedString", js.undefined)
    
    inline def setUsedUnsignedInt(value: Double): Self = StObject.set(x, "usedUnsignedInt", value.asInstanceOf[js.Any])
    
    inline def setUsedUnsignedIntUndefined: Self = StObject.set(x, "usedUnsignedInt", js.undefined)
    
    inline def set_allowedString(value: Element): Self = StObject.set(x, "_allowedString", value.asInstanceOf[js.Any])
    
    inline def set_allowedStringUndefined: Self = StObject.set(x, "_allowedString", js.undefined)
    
    inline def set_usedString(value: Element): Self = StObject.set(x, "_usedString", value.asInstanceOf[js.Any])
    
    inline def set_usedStringUndefined: Self = StObject.set(x, "_usedString", js.undefined)
  }
}
