package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment (if paid)
  */
@js.native
trait ExplanationOfBenefitPayment extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Payment adjustment for non-Claim issues
    */
  var adjustment: js.UndefOr[Money] = js.native
  
  /**
    * Explanation for the non-claim adjustment
    */
  var adjustmentReason: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Payable amount after adjustment
    */
  var amount: js.UndefOr[Money] = js.native
  
  /**
    * Expected date of Payment
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.native
  
  /**
    * Identifier of the payment instrument
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Partial or Complete
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object ExplanationOfBenefitPayment {
  
  @scala.inline
  def apply(): ExplanationOfBenefitPayment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitPayment]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitPaymentOps[Self <: ExplanationOfBenefitPayment] (val x: Self) extends AnyVal {
    
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
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def setAdjustment(value: Money): Self = this.set("adjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustment: Self = this.set("adjustment", js.undefined)
    
    @scala.inline
    def setAdjustmentReason(value: CodeableConcept): Self = this.set("adjustmentReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdjustmentReason: Self = this.set("adjustmentReason", js.undefined)
    
    @scala.inline
    def setAmount(value: Money): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setDate(value: date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
