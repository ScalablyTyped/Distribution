package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentProcessorInformation extends js.Object {
  
  /**
    * The mailing address associated with the payment processor.
    */
  var address: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * The id of the billing agreement.
    */
  var billingAgreementId: js.UndefOr[String] = js.native
  
  /**
    * The email address associated with the payment processor.
    */
  var email: js.UndefOr[String] = js.native
}
object PaymentProcessorInformation {
  
  @scala.inline
  def apply(): PaymentProcessorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaymentProcessorInformation]
  }
  
  @scala.inline
  implicit class PaymentProcessorInformationOps[Self <: PaymentProcessorInformation] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: /* Contains address information. */ AddressInformation): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setBillingAgreementId(value: String): Self = this.set("billingAgreementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAgreementId: Self = this.set("billingAgreementId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
}
