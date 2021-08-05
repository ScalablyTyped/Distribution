package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreditCardInformation extends StObject {
  
  /**
    * A complex element containing the credit card billing address information.
    */
  var address: js.UndefOr[/* Contains address information. */ AddressInformation] = js.undefined
  
  /**
    * The credit card number.
    */
  var cardNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The type of credit card. Valid values are:
    *
    * - `visa`
    * - `mastercard`
    * - `amex`
    */
  var cardType: js.UndefOr[String] = js.undefined
  
  /**
    * The 3 or 4-digit card verification value (CVV) number associated with the credit card. CVV numbers are also referred to as card security codes (CSCs).
    */
  var cvNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The month that the credit card expires, expressed as a number from 1 to 12.
    */
  var expirationMonth: js.UndefOr[String] = js.undefined
  
  /**
    * The year in which the credit card expires, in 4-digit format.
    */
  var expirationYear: js.UndefOr[String] = js.undefined
  
  /**
    * The exact name as it appears on the credit card.
    */
  var nameOnCard: js.UndefOr[String] = js.undefined
}
object CreditCardInformation {
  
  inline def apply(): CreditCardInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreditCardInformation]
  }
  
  extension [Self <: CreditCardInformation](x: Self) {
    
    inline def setAddress(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCardNumberUndefined: Self = StObject.set(x, "cardNumber", js.undefined)
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardTypeUndefined: Self = StObject.set(x, "cardType", js.undefined)
    
    inline def setCvNumber(value: String): Self = StObject.set(x, "cvNumber", value.asInstanceOf[js.Any])
    
    inline def setCvNumberUndefined: Self = StObject.set(x, "cvNumber", js.undefined)
    
    inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    inline def setNameOnCard(value: String): Self = StObject.set(x, "nameOnCard", value.asInstanceOf[js.Any])
    
    inline def setNameOnCardUndefined: Self = StObject.set(x, "nameOnCard", js.undefined)
  }
}
