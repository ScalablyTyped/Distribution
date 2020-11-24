package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payments extends js.Object {
  
  /**
    * Reserved: TBD
    */
  var amount: js.UndefOr[String] = js.native
  
  /**
    * A sender-defined description of the line item.
    *
    */
  var description: js.UndefOr[String] = js.native
  
  var paymentDate: js.UndefOr[String] = js.native
  
  var paymentId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, a PDF version of the invoice is available.
    *
    * To get the PDF, make the call again and change "Accept:" in the header to "Accept: application/pdf".
    */
  var paymentNumber: js.UndefOr[String] = js.native
}
object Payments {
  
  @scala.inline
  def apply(): Payments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payments]
  }
  
  @scala.inline
  implicit class PaymentsOps[Self <: Payments] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPaymentDate(value: String): Self = this.set("paymentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentDate: Self = this.set("paymentDate", js.undefined)
    
    @scala.inline
    def setPaymentId(value: String): Self = this.set("paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentId: Self = this.set("paymentId", js.undefined)
    
    @scala.inline
    def setPaymentNumber(value: String): Self = this.set("paymentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentNumber: Self = this.set("paymentNumber", js.undefined)
  }
}
