package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details by insurance coverage
  */
@js.native
trait EligibilityResponseInsurance extends BackboneElement {
  /**
    * Benefits by Category
    */
  var benefitBalance: js.UndefOr[js.Array[EligibilityResponseInsuranceBenefitBalance]] = js.native
  /**
    * Contract details
    */
  var contract: js.UndefOr[Reference] = js.native
  /**
    * Updated Coverage details
    */
  var coverage: js.UndefOr[Reference] = js.native
}

object EligibilityResponseInsurance {
  @scala.inline
  def apply(): EligibilityResponseInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EligibilityResponseInsurance]
  }
  @scala.inline
  implicit class EligibilityResponseInsuranceOps[Self <: EligibilityResponseInsurance] (val x: Self) extends AnyVal {
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
    def setBenefitBalanceVarargs(value: EligibilityResponseInsuranceBenefitBalance*): Self = this.set("benefitBalance", js.Array(value :_*))
    @scala.inline
    def setBenefitBalance(value: js.Array[EligibilityResponseInsuranceBenefitBalance]): Self = this.set("benefitBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBenefitBalance: Self = this.set("benefitBalance", js.undefined)
    @scala.inline
    def setContract(value: Reference): Self = this.set("contract", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContract: Self = this.set("contract", js.undefined)
    @scala.inline
    def setCoverage(value: Reference): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
  }
  
}

