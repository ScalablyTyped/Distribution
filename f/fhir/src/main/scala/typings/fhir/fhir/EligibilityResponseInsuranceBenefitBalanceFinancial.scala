package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Benefit Summary
  */
@js.native
trait EligibilityResponseInsuranceBenefitBalanceFinancial extends BackboneElement {
  
  /**
    * Contains extended information for property 'allowedString'.
    */
  var _allowedString: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'allowedUnsignedInt'.
    */
  var _allowedUnsignedInt: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'usedUnsignedInt'.
    */
  var _usedUnsignedInt: js.UndefOr[Element] = js.native
  
  /**
    * Benefits allowed
    */
  var allowedMoney: js.UndefOr[Money] = js.native
  
  /**
    * Benefits allowed
    */
  var allowedString: js.UndefOr[String] = js.native
  
  /**
    * Benefits allowed
    */
  var allowedUnsignedInt: js.UndefOr[unsignedInt] = js.native
  
  /**
    * Deductable, visits, benefit amount
    */
  var `type`: CodeableConcept = js.native
  
  /**
    * Benefits used
    */
  var usedMoney: js.UndefOr[Money] = js.native
  
  /**
    * Benefits used
    */
  var usedUnsignedInt: js.UndefOr[unsignedInt] = js.native
}
object EligibilityResponseInsuranceBenefitBalanceFinancial {
  
  @scala.inline
  def apply(`type`: CodeableConcept): EligibilityResponseInsuranceBenefitBalanceFinancial = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EligibilityResponseInsuranceBenefitBalanceFinancial]
  }
  
  @scala.inline
  implicit class EligibilityResponseInsuranceBenefitBalanceFinancialMutableBuilder[Self <: EligibilityResponseInsuranceBenefitBalanceFinancial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedMoney(value: Money): Self = StObject.set(x, "allowedMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMoneyUndefined: Self = StObject.set(x, "allowedMoney", js.undefined)
    
    @scala.inline
    def setAllowedString(value: String): Self = StObject.set(x, "allowedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedStringUndefined: Self = StObject.set(x, "allowedString", js.undefined)
    
    @scala.inline
    def setAllowedUnsignedInt(value: unsignedInt): Self = StObject.set(x, "allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedUnsignedIntUndefined: Self = StObject.set(x, "allowedUnsignedInt", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedMoney(value: Money): Self = StObject.set(x, "usedMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedMoneyUndefined: Self = StObject.set(x, "usedMoney", js.undefined)
    
    @scala.inline
    def setUsedUnsignedInt(value: unsignedInt): Self = StObject.set(x, "usedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedUnsignedIntUndefined: Self = StObject.set(x, "usedUnsignedInt", js.undefined)
    
    @scala.inline
    def set_allowedString(value: Element): Self = StObject.set(x, "_allowedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_allowedStringUndefined: Self = StObject.set(x, "_allowedString", js.undefined)
    
    @scala.inline
    def set_allowedUnsignedInt(value: Element): Self = StObject.set(x, "_allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_allowedUnsignedIntUndefined: Self = StObject.set(x, "_allowedUnsignedInt", js.undefined)
    
    @scala.inline
    def set_usedUnsignedInt(value: Element): Self = StObject.set(x, "_usedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_usedUnsignedIntUndefined: Self = StObject.set(x, "_usedUnsignedInt", js.undefined)
  }
}
