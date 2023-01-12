package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientPhoneAuthentication extends StObject {
  
  /**
    * Boolean. When set to **true**, the recipient can supply a phone number their choice.
    */
  var recipMayProvideNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `recipMayProvideNumber` property can be edited.
    */
  var recipMayProvideNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var recordVoicePrint: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var recordVoicePrintMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An array containing a list of phone numbers that the recipient can use for SMS text authentication.
    */
  var senderProvidedNumbers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Metadata that indicates whether the `senderProvidedNumbers` property can be edited.
    */
  var senderProvidedNumbersMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    *  Reserved for DocuSign.
    */
  var validateRecipProvidedNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var validateRecipProvidedNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object RecipientPhoneAuthentication {
  
  inline def apply(): RecipientPhoneAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientPhoneAuthentication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientPhoneAuthentication] (val x: Self) extends AnyVal {
    
    inline def setRecipMayProvideNumber(value: String): Self = StObject.set(x, "recipMayProvideNumber", value.asInstanceOf[js.Any])
    
    inline def setRecipMayProvideNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipMayProvideNumberMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipMayProvideNumberMetadataUndefined: Self = StObject.set(x, "recipMayProvideNumberMetadata", js.undefined)
    
    inline def setRecipMayProvideNumberUndefined: Self = StObject.set(x, "recipMayProvideNumber", js.undefined)
    
    inline def setRecordVoicePrint(value: String): Self = StObject.set(x, "recordVoicePrint", value.asInstanceOf[js.Any])
    
    inline def setRecordVoicePrintMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recordVoicePrintMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecordVoicePrintMetadataUndefined: Self = StObject.set(x, "recordVoicePrintMetadata", js.undefined)
    
    inline def setRecordVoicePrintUndefined: Self = StObject.set(x, "recordVoicePrint", js.undefined)
    
    inline def setSenderProvidedNumbers(value: js.Array[String]): Self = StObject.set(x, "senderProvidedNumbers", value.asInstanceOf[js.Any])
    
    inline def setSenderProvidedNumbersMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "senderProvidedNumbersMetadata", value.asInstanceOf[js.Any])
    
    inline def setSenderProvidedNumbersMetadataUndefined: Self = StObject.set(x, "senderProvidedNumbersMetadata", js.undefined)
    
    inline def setSenderProvidedNumbersUndefined: Self = StObject.set(x, "senderProvidedNumbers", js.undefined)
    
    inline def setSenderProvidedNumbersVarargs(value: String*): Self = StObject.set(x, "senderProvidedNumbers", js.Array(value*))
    
    inline def setValidateRecipProvidedNumber(value: String): Self = StObject.set(x, "validateRecipProvidedNumber", value.asInstanceOf[js.Any])
    
    inline def setValidateRecipProvidedNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "validateRecipProvidedNumberMetadata", value.asInstanceOf[js.Any])
    
    inline def setValidateRecipProvidedNumberMetadataUndefined: Self = StObject.set(x, "validateRecipProvidedNumberMetadata", js.undefined)
    
    inline def setValidateRecipProvidedNumberUndefined: Self = StObject.set(x, "validateRecipProvidedNumber", js.undefined)
  }
}
