package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientEmailNotification extends StObject {
  
  /**
    * The body of the email message.
    */
  var emailBody: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `emailBody` property can be edited.
    */
  var emailBodyMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The subject line for the email notification.
    */
  var emailSubject: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `emailSubject` property can be edited.
    */
  var emailSubjectMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The language to use for the standard email format and signing view for a recipient.
    *
    * For example, in the recipient's email notification, this setting affects elements such as the standard introductory text describing the request to sign.
    * It also determines the language used for buttons and tabs in both the email notification and the signing experience.
    *
    * **Note**: This setting affects only DocuSign standard text. Any custom text that you enter for the `emailBody` and `emailSubject` of the notification is not translated,
    * and appears exactly as you enter it.
    *
    *  To retrieve the possible values, use the [Accounts::listSupportedLanguages][ListLang] method.
    *
    * [ListLang]: ./esign/restapi/Accounts/Accounts/listSupportedLanguages/
    */
  var supportedLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `supportedLanguage` property can be edited.
    */
  var supportedLanguageMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
}
object RecipientEmailNotification {
  
  inline def apply(): RecipientEmailNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEmailNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecipientEmailNotification] (val x: Self) extends AnyVal {
    
    inline def setEmailBody(value: String): Self = StObject.set(x, "emailBody", value.asInstanceOf[js.Any])
    
    inline def setEmailBodyMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "emailBodyMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmailBodyMetadataUndefined: Self = StObject.set(x, "emailBodyMetadata", js.undefined)
    
    inline def setEmailBodyUndefined: Self = StObject.set(x, "emailBody", js.undefined)
    
    inline def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "emailSubjectMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmailSubjectMetadataUndefined: Self = StObject.set(x, "emailSubjectMetadata", js.undefined)
    
    inline def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    inline def setSupportedLanguage(value: String): Self = StObject.set(x, "supportedLanguage", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguageMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "supportedLanguageMetadata", value.asInstanceOf[js.Any])
    
    inline def setSupportedLanguageMetadataUndefined: Self = StObject.set(x, "supportedLanguageMetadata", js.undefined)
    
    inline def setSupportedLanguageUndefined: Self = StObject.set(x, "supportedLanguage", js.undefined)
  }
}
