package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of settlements
  */
@js.native
trait PaymentReconciliationDetail extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Amount being paid
    */
  var amount: js.UndefOr[Money] = js.native
  /**
    * Invoice date
    */
  var date: js.UndefOr[typings.fhir.fhir.date] = js.native
  /**
    * Organization which is receiving the payment
    */
  var payee: js.UndefOr[Reference] = js.native
  /**
    * Claim
    */
  var request: js.UndefOr[Reference] = js.native
  /**
    * Claim Response
    */
  var response: js.UndefOr[Reference] = js.native
  /**
    * Organization which submitted the claim
    */
  var submitter: js.UndefOr[Reference] = js.native
  /**
    * Type code
    */
  var `type`: CodeableConcept = js.native
}

object PaymentReconciliationDetail {
  @scala.inline
  def apply(`type`: CodeableConcept): PaymentReconciliationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentReconciliationDetail]
  }
  @scala.inline
  implicit class PaymentReconciliationDetailOps[Self <: PaymentReconciliationDetail] (val x: Self) extends AnyVal {
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
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    @scala.inline
    def setAmount(value: Money): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setDate(value: date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setPayee(value: Reference): Self = this.set("payee", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayee: Self = this.set("payee", js.undefined)
    @scala.inline
    def setRequest(value: Reference): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: Reference): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setSubmitter(value: Reference): Self = this.set("submitter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubmitter: Self = this.set("submitter", js.undefined)
  }
  
}

