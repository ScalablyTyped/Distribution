package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientPhoneAuthentication extends js.Object {
  
  /**
    * Boolean. When set to **true**, the recipient can supply a phone number their choice.
    */
  var recipMayProvideNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipMayProvideNumber` property can be edited.
    */
  var recipMayProvideNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var recordVoicePrint: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var recordVoicePrintMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An array containing a list of phone numbers that the recipient can use for SMS text authentication.
    */
  var senderProvidedNumbers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata that indicates whether the `senderProvidedNumbers` property can be edited.
    */
  var senderProvidedNumbersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    *  Reserved for DocuSign.
    */
  var validateRecipProvidedNumber: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var validateRecipProvidedNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object RecipientPhoneAuthentication {
  
  @scala.inline
  def apply(): RecipientPhoneAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientPhoneAuthentication]
  }
  
  @scala.inline
  implicit class RecipientPhoneAuthenticationOps[Self <: RecipientPhoneAuthentication] (val x: Self) extends AnyVal {
    
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
    def setRecipMayProvideNumber(value: String): Self = this.set("recipMayProvideNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipMayProvideNumber: Self = this.set("recipMayProvideNumber", js.undefined)
    
    @scala.inline
    def setRecipMayProvideNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("recipMayProvideNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipMayProvideNumberMetadata: Self = this.set("recipMayProvideNumberMetadata", js.undefined)
    
    @scala.inline
    def setRecordVoicePrint(value: String): Self = this.set("recordVoicePrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordVoicePrint: Self = this.set("recordVoicePrint", js.undefined)
    
    @scala.inline
    def setRecordVoicePrintMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("recordVoicePrintMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordVoicePrintMetadata: Self = this.set("recordVoicePrintMetadata", js.undefined)
    
    @scala.inline
    def setSenderProvidedNumbersVarargs(value: String*): Self = this.set("senderProvidedNumbers", js.Array(value :_*))
    
    @scala.inline
    def setSenderProvidedNumbers(value: js.Array[String]): Self = this.set("senderProvidedNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderProvidedNumbers: Self = this.set("senderProvidedNumbers", js.undefined)
    
    @scala.inline
    def setSenderProvidedNumbersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("senderProvidedNumbersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderProvidedNumbersMetadata: Self = this.set("senderProvidedNumbersMetadata", js.undefined)
    
    @scala.inline
    def setValidateRecipProvidedNumber(value: String): Self = this.set("validateRecipProvidedNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateRecipProvidedNumber: Self = this.set("validateRecipProvidedNumber", js.undefined)
    
    @scala.inline
    def setValidateRecipProvidedNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("validateRecipProvidedNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidateRecipProvidedNumberMetadata: Self = this.set("validateRecipProvidedNumberMetadata", js.undefined)
  }
}
