package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkRecipient extends js.Object {
  
  /**
    * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.
    *
    * Maximum Length: 50 characters and it must conform to the account's access code format setting.
    *
    * If blank, but the signer `accessCode` property is set in the envelope, then that value is used.
    *
    * If blank and the signer `accessCode` property is not set, then the access code is not required.
    */
  var accessCode: js.UndefOr[String] = js.native
  
  /**
    * Specifies the recipient's email address.
    *
    * Maximum length: 100 characters.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Array or errors.
    */
  var errorDetails: js.UndefOr[
    js.Array[
      /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ]
  ] = js.native
  
  /**
    * Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.
    *
    * The acceptable values are:
    *
    * * KBA: Enables the normal ID check authentication set up for your account.
    * * Phone: Enables phone authentication.
    * * SMS: Enables SMS authentication.
    */
  var identification: js.UndefOr[String] = js.native
  
  /**
    * Specifies the recipient's name.
    *
    * Maximum length: 50 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A note sent to the recipient in the signing email.
    * This note is unique to this recipient.
    * In the user interface,
    * it appears near the upper left corner
    * of the document
    * on the signing screen.
    *
    * Maximum Length: 1000 characters.
    *
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone,
    * usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.
    *
    * If `usersupplied` is used, the signer supplies his or her own telephone number.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  var recipientSignatureProviderInfo: js.UndefOr[js.Array[BulkRecipientSignatureProvider]] = js.native
  
  var rowNumber: js.UndefOr[String] = js.native
  
  /**
    * Specifies values used to populate recipient tabs with information. This allows each bulk recipient signer to have different values
    * for their associated tabs. Any number of `tabLabel` columns can be added to the bulk recipient file.
    *
    * The information used in the bulk recipient file header must be the same as the `tabLabel` for the tab.
    *
    * The values entered in this column are automatically inserted into the corresponding tab for the recipient in the same row.
    *
    * Note that this option cannot be used for tabs that do not have data or that are automatically populated data such as Signature,
    * Full Name, Email Address, Company, Title, and Date Signed tabs.
    */
  var tabLabels: js.UndefOr[js.Array[BulkRecipientTabLabel]] = js.native
}
object BulkRecipient {
  
  @scala.inline
  def apply(): BulkRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipient]
  }
  
  @scala.inline
  implicit class BulkRecipientOps[Self <: BulkRecipient] (val x: Self) extends AnyVal {
    
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
    def setAccessCode(value: String): Self = this.set("accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCode: Self = this.set("accessCode", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(
      value: (/* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails)*
    ): Self = this.set("errorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrorDetails(
      value: js.Array[
          /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
        ]
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setIdentification(value: String): Self = this.set("identification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentification: Self = this.set("identification", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProviderInfoVarargs(value: BulkRecipientSignatureProvider*): Self = this.set("recipientSignatureProviderInfo", js.Array(value :_*))
    
    @scala.inline
    def setRecipientSignatureProviderInfo(value: js.Array[BulkRecipientSignatureProvider]): Self = this.set("recipientSignatureProviderInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientSignatureProviderInfo: Self = this.set("recipientSignatureProviderInfo", js.undefined)
    
    @scala.inline
    def setRowNumber(value: String): Self = this.set("rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowNumber: Self = this.set("rowNumber", js.undefined)
    
    @scala.inline
    def setTabLabelsVarargs(value: BulkRecipientTabLabel*): Self = this.set("tabLabels", js.Array(value :_*))
    
    @scala.inline
    def setTabLabels(value: js.Array[BulkRecipientTabLabel]): Self = this.set("tabLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabLabels: Self = this.set("tabLabels", js.undefined)
  }
}
