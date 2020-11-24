package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectDebitProcessorInformation extends js.Object {
  
  /**
    * The branch code of the bank used for direct debit.
    *
    * Maximum Length: 10 characters.
    */
  var bankBranchCode: js.UndefOr[String] = js.native
  
  /**
    * The check digit or digits in the international bank account number. These digits are used to confirm the validity of the account.
    *
    * Maximum Length: 4 characters.
    */
  var bankCheckDigit: js.UndefOr[String] = js.native
  
  /**
    * The code or number that identifies the bank. This is also known as the sort code.
    *
    * Example: `200000`
    *
    * Maximum Length: 18 characters.
    */
  var bankCode: js.UndefOr[String] = js.native
  
  /**
    * The name of the direct debit bank.
    *
    * Maximum Length: 80 characters.
    */
  var bankName: js.UndefOr[String] = js.native
  
  /**
    * The name on the direct debit bank account. This field is required for POST and PUT requests.
    *
    * Maximum Length: 60 characters.
    */
  var bankTransferAccountName: js.UndefOr[String] = js.native
  
  /**
    * The customer's bank account number. This value will be obfuscated. This field is required for POST and PUT requests.
    *
    * Maximum Length: 30 characters.
    */
  var bankTransferAccountNumber: js.UndefOr[String] = js.native
  
  /**
    * Specifies the type of direct debit transfer. The value of this field is dependent on the user's country. This field is required for POST and PUT requests. Possible values are:
    *
    * - `DirectDebitUK`
    * - `DirectEntryAU`
    * - `SEPA`
    */
  var bankTransferType: js.UndefOr[String] = js.native
  
  /**
    * The user's country. The system populates this value automatically.
    *
    *
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The email address of the user who is associated with the payment method. This field is required for POST and PUT requests.
    *
    * Maximum Length: 80 characters.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The user's first name. This field is required for POST and PUT requests.
    *
    * Maximum Length: 30 characters.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * The International Bank Account Number (IBAN).
    *
    * Example: `DE89370400440532013000`
    *
    * For more information, see [PeopleSoft's guide to Setting Up Banks](https://docs.oracle.com/cd/E16365_01/fscm91pbr0/eng/psbooks/fsbk/chapter.htm?File=fsbk/htm/fsbk03.htm).
    *
    * **Note**: This number will be obfuscated.
    */
  var iBAN: js.UndefOr[String] = js.native
  
  /**
    * The user's last name. This field is required for POST and PUT requests.
    *
    * Maximum Length: 70 characters.
    */
  var lastName: js.UndefOr[String] = js.native
}
object DirectDebitProcessorInformation {
  
  @scala.inline
  def apply(): DirectDebitProcessorInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectDebitProcessorInformation]
  }
  
  @scala.inline
  implicit class DirectDebitProcessorInformationOps[Self <: DirectDebitProcessorInformation] (val x: Self) extends AnyVal {
    
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
    def setBankBranchCode(value: String): Self = this.set("bankBranchCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankBranchCode: Self = this.set("bankBranchCode", js.undefined)
    
    @scala.inline
    def setBankCheckDigit(value: String): Self = this.set("bankCheckDigit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankCheckDigit: Self = this.set("bankCheckDigit", js.undefined)
    
    @scala.inline
    def setBankCode(value: String): Self = this.set("bankCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankCode: Self = this.set("bankCode", js.undefined)
    
    @scala.inline
    def setBankName(value: String): Self = this.set("bankName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankName: Self = this.set("bankName", js.undefined)
    
    @scala.inline
    def setBankTransferAccountName(value: String): Self = this.set("bankTransferAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankTransferAccountName: Self = this.set("bankTransferAccountName", js.undefined)
    
    @scala.inline
    def setBankTransferAccountNumber(value: String): Self = this.set("bankTransferAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankTransferAccountNumber: Self = this.set("bankTransferAccountNumber", js.undefined)
    
    @scala.inline
    def setBankTransferType(value: String): Self = this.set("bankTransferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBankTransferType: Self = this.set("bankTransferType", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setIBAN(value: String): Self = this.set("iBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIBAN: Self = this.set("iBAN", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
  }
}
