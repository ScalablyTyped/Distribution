package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreditCardInformation extends js.Object {
  
  /**
    * A complex element containing the credit card billing address information.
    */
  var address: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * The credit card number.
    */
  var cardNumber: js.UndefOr[String] = js.native
  
  /**
    * The type of credit card. Valid values are:
    *
    * - `visa`
    * - `mastercard`
    * - `amex`
    */
  var cardType: js.UndefOr[String] = js.native
  
  /**
    * The 3 or 4-digit card verification value (CVV) number associated with the credit card. CVV numbers are also referred to as card security codes (CSCs).
    */
  var cvNumber: js.UndefOr[String] = js.native
  
  /**
    * The month that the credit card expires, expressed as a number from 1 to 12.
    */
  var expirationMonth: js.UndefOr[String] = js.native
  
  /**
    * The year in which the credit card expires, in 4-digit format.
    */
  var expirationYear: js.UndefOr[String] = js.native
  
  /**
    * The exact name as it appears on the credit card.
    */
  var nameOnCard: js.UndefOr[String] = js.native
}
object CreditCardInformation {
  
  @scala.inline
  def apply(): CreditCardInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCardInformation]
  }
  
  @scala.inline
  implicit class CreditCardInformationOps[Self <: CreditCardInformation] (val x: Self) extends AnyVal {
    
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
    def setCardNumber(value: String): Self = this.set("cardNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardNumber: Self = this.set("cardNumber", js.undefined)
    
    @scala.inline
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardType: Self = this.set("cardType", js.undefined)
    
    @scala.inline
    def setCvNumber(value: String): Self = this.set("cvNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCvNumber: Self = this.set("cvNumber", js.undefined)
    
    @scala.inline
    def setExpirationMonth(value: String): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationMonth: Self = this.set("expirationMonth", js.undefined)
    
    @scala.inline
    def setExpirationYear(value: String): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationYear: Self = this.set("expirationYear", js.undefined)
    
    @scala.inline
    def setNameOnCard(value: String): Self = this.set("nameOnCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameOnCard: Self = this.set("nameOnCard", js.undefined)
  }
}
