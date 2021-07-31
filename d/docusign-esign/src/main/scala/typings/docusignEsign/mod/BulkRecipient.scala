package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkRecipient extends StObject {
  
  /**
    * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.
    *
    * Maximum Length: 50 characters and it must conform to the account's access code format setting.
    *
    * If blank, but the signer `accessCode` property is set in the envelope, then that value is used.
    *
    * If blank and the signer `accessCode` property is not set, then the access code is not required.
    */
  var accessCode: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the recipient's email address.
    *
    * Maximum length: 100 characters.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Array or errors.
    */
  var errorDetails: js.UndefOr[
    js.Array[
      /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ]
  ] = js.undefined
  
  /**
    * Specifies the authentication check used for the signer. If blank then no authentication check is required for the signer. Only one value can be used in this field.
    *
    * The acceptable values are:
    *
    * * KBA: Enables the normal ID check authentication set up for your account.
    * * Phone: Enables phone authentication.
    * * SMS: Enables SMS authentication.
    */
  var identification: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the recipient's name.
    *
    * Maximum length: 50 characters.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * This is only used if the Identification field value is Phone or SMS. The value for this field can be a valid telephone number or, if Phone,
    * usersupplied (SMS authentication cannot use a user supplied number). Parenthesis and dashes can be used in the telephone number.
    *
    * If `usersupplied` is used, the signer supplies his or her own telephone number.
    */
  var phoneNumber: js.UndefOr[String] = js.undefined
  
  var recipientSignatureProviderInfo: js.UndefOr[js.Array[BulkRecipientSignatureProvider]] = js.undefined
  
  var rowNumber: js.UndefOr[String] = js.undefined
  
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
  var tabLabels: js.UndefOr[js.Array[BulkRecipientTabLabel]] = js.undefined
}
object BulkRecipient {
  
  @scala.inline
  def apply(): BulkRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkRecipient]
  }
  
  @scala.inline
  implicit class BulkRecipientMutableBuilder[Self <: BulkRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: js.Array[
          /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
        ]
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(
      value: (/* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails)*
    ): Self = StObject.set(x, "errorDetails", js.Array(value :_*))
    
    @scala.inline
    def setIdentification(value: String): Self = StObject.set(x, "identification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentificationUndefined: Self = StObject.set(x, "identification", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProviderInfo(value: js.Array[BulkRecipientSignatureProvider]): Self = StObject.set(x, "recipientSignatureProviderInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSignatureProviderInfoUndefined: Self = StObject.set(x, "recipientSignatureProviderInfo", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProviderInfoVarargs(value: BulkRecipientSignatureProvider*): Self = StObject.set(x, "recipientSignatureProviderInfo", js.Array(value :_*))
    
    @scala.inline
    def setRowNumber(value: String): Self = StObject.set(x, "rowNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowNumberUndefined: Self = StObject.set(x, "rowNumber", js.undefined)
    
    @scala.inline
    def setTabLabels(value: js.Array[BulkRecipientTabLabel]): Self = StObject.set(x, "tabLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabLabelsUndefined: Self = StObject.set(x, "tabLabels", js.undefined)
    
    @scala.inline
    def setTabLabelsVarargs(value: BulkRecipientTabLabel*): Self = StObject.set(x, "tabLabels", js.Array(value :_*))
  }
}
