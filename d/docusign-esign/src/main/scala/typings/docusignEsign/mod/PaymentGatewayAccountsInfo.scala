package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentGatewayAccountsInfo extends js.Object {
  
  /**
    * A list of payment gateway accounts.
    */
  var paymentGatewayAccounts: js.UndefOr[
    js.Array[
      /* This object contains details about a payment gateway account. */ PaymentGatewayAccount
    ]
  ] = js.native
}
object PaymentGatewayAccountsInfo {
  
  @scala.inline
  def apply(): PaymentGatewayAccountsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentGatewayAccountsInfo]
  }
  
  @scala.inline
  implicit class PaymentGatewayAccountsInfoOps[Self <: PaymentGatewayAccountsInfo] (val x: Self) extends AnyVal {
    
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
    def setPaymentGatewayAccountsVarargs(
      value: (/* This object contains details about a payment gateway account. */ PaymentGatewayAccount)*
    ): Self = this.set("paymentGatewayAccounts", js.Array(value :_*))
    
    @scala.inline
    def setPaymentGatewayAccounts(
      value: js.Array[
          /* This object contains details about a payment gateway account. */ PaymentGatewayAccount
        ]
    ): Self = this.set("paymentGatewayAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentGatewayAccounts: Self = this.set("paymentGatewayAccounts", js.undefined)
  }
}
