package typings.fhir.fhir

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
  implicit class EligibilityResponseInsuranceBenefitBalanceFinancialOps[Self <: EligibilityResponseInsuranceBenefitBalanceFinancial] (val x: Self) extends AnyVal {
    
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
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_allowedString(value: Element): Self = this.set("_allowedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_allowedString: Self = this.set("_allowedString", js.undefined)
    
    @scala.inline
    def set_allowedUnsignedInt(value: Element): Self = this.set("_allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_allowedUnsignedInt: Self = this.set("_allowedUnsignedInt", js.undefined)
    
    @scala.inline
    def set_usedUnsignedInt(value: Element): Self = this.set("_usedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_usedUnsignedInt: Self = this.set("_usedUnsignedInt", js.undefined)
    
    @scala.inline
    def setAllowedMoney(value: Money): Self = this.set("allowedMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedMoney: Self = this.set("allowedMoney", js.undefined)
    
    @scala.inline
    def setAllowedString(value: String): Self = this.set("allowedString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedString: Self = this.set("allowedString", js.undefined)
    
    @scala.inline
    def setAllowedUnsignedInt(value: unsignedInt): Self = this.set("allowedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedUnsignedInt: Self = this.set("allowedUnsignedInt", js.undefined)
    
    @scala.inline
    def setUsedMoney(value: Money): Self = this.set("usedMoney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedMoney: Self = this.set("usedMoney", js.undefined)
    
    @scala.inline
    def setUsedUnsignedInt(value: unsignedInt): Self = this.set("usedUnsignedInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedUnsignedInt: Self = this.set("usedUnsignedInt", js.undefined)
  }
}
