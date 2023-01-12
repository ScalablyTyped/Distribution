package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectDebitProcessorInformation extends StObject {
  
  /**
    * The branch code of the bank used for direct debit.
    *
    * Maximum Length: 10 characters.
    */
  var bankBranchCode: js.UndefOr[String] = js.undefined
  
  /**
    * The check digit or digits in the international bank account number. These digits are used to confirm the validity of the account.
    *
    * Maximum Length: 4 characters.
    */
  var bankCheckDigit: js.UndefOr[String] = js.undefined
  
  /**
    * The code or number that identifies the bank. This is also known as the sort code.
    *
    * Example: `200000`
    *
    * Maximum Length: 18 characters.
    */
  var bankCode: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the direct debit bank.
    *
    * Maximum Length: 80 characters.
    */
  var bankName: js.UndefOr[String] = js.undefined
  
  /**
    * The name on the direct debit bank account. This field is required for POST and PUT requests.
    *
    * Maximum Length: 60 characters.
    */
  var bankTransferAccountName: js.UndefOr[String] = js.undefined
  
  /**
    * The customer's bank account number. This value will be obfuscated. This field is required for POST and PUT requests.
    *
    * Maximum Length: 30 characters.
    */
  var bankTransferAccountNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the type of direct debit transfer. The value of this field is dependent on the user's country. This field is required for POST and PUT requests. Possible values are:
    *
    * - `DirectDebitUK`
    * - `DirectEntryAU`
    * - `SEPA`
    */
  var bankTransferType: js.UndefOr[String] = js.undefined
  
  /**
    * The user's country. The system populates this value automatically.
    *
    *
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user who is associated with the payment method. This field is required for POST and PUT requests.
    *
    * Maximum Length: 80 characters.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The user's first name. This field is required for POST and PUT requests.
    *
    * Maximum Length: 30 characters.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * The International Bank Account Number (IBAN).
    *
    * Example: `DE89370400440532013000`
    *
    * For more information, see [PeopleSoft's guide to Setting Up Banks](https://docs.oracle.com/cd/E16365_01/fscm91pbr0/eng/psbooks/fsbk/chapter.htm?File=fsbk/htm/fsbk03.htm).
    *
    * **Note**: This number will be obfuscated.
    */
  var iBAN: js.UndefOr[String] = js.undefined
  
  /**
    * The user's last name. This field is required for POST and PUT requests.
    *
    * Maximum Length: 70 characters.
    */
  var lastName: js.UndefOr[String] = js.undefined
}
object DirectDebitProcessorInformation {
  
  inline def apply(): DirectDebitProcessorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectDebitProcessorInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectDebitProcessorInformation] (val x: Self) extends AnyVal {
    
    inline def setBankBranchCode(value: String): Self = StObject.set(x, "bankBranchCode", value.asInstanceOf[js.Any])
    
    inline def setBankBranchCodeUndefined: Self = StObject.set(x, "bankBranchCode", js.undefined)
    
    inline def setBankCheckDigit(value: String): Self = StObject.set(x, "bankCheckDigit", value.asInstanceOf[js.Any])
    
    inline def setBankCheckDigitUndefined: Self = StObject.set(x, "bankCheckDigit", js.undefined)
    
    inline def setBankCode(value: String): Self = StObject.set(x, "bankCode", value.asInstanceOf[js.Any])
    
    inline def setBankCodeUndefined: Self = StObject.set(x, "bankCode", js.undefined)
    
    inline def setBankName(value: String): Self = StObject.set(x, "bankName", value.asInstanceOf[js.Any])
    
    inline def setBankNameUndefined: Self = StObject.set(x, "bankName", js.undefined)
    
    inline def setBankTransferAccountName(value: String): Self = StObject.set(x, "bankTransferAccountName", value.asInstanceOf[js.Any])
    
    inline def setBankTransferAccountNameUndefined: Self = StObject.set(x, "bankTransferAccountName", js.undefined)
    
    inline def setBankTransferAccountNumber(value: String): Self = StObject.set(x, "bankTransferAccountNumber", value.asInstanceOf[js.Any])
    
    inline def setBankTransferAccountNumberUndefined: Self = StObject.set(x, "bankTransferAccountNumber", js.undefined)
    
    inline def setBankTransferType(value: String): Self = StObject.set(x, "bankTransferType", value.asInstanceOf[js.Any])
    
    inline def setBankTransferTypeUndefined: Self = StObject.set(x, "bankTransferType", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setIBAN(value: String): Self = StObject.set(x, "iBAN", value.asInstanceOf[js.Any])
    
    inline def setIBANUndefined: Self = StObject.set(x, "iBAN", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
  }
}
