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
  
  @scala.inline
  def apply(): RecipientEmailNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEmailNotification]
  }
  
  @scala.inline
  implicit class RecipientEmailNotificationMutableBuilder[Self <: RecipientEmailNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailBody(value: String): Self = StObject.set(x, "emailBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailBodyMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "emailBodyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailBodyMetadataUndefined: Self = StObject.set(x, "emailBodyMetadata", js.undefined)
    
    @scala.inline
    def setEmailBodyUndefined: Self = StObject.set(x, "emailBody", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "emailSubjectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectMetadataUndefined: Self = StObject.set(x, "emailSubjectMetadata", js.undefined)
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setSupportedLanguage(value: String): Self = StObject.set(x, "supportedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLanguageMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "supportedLanguageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedLanguageMetadataUndefined: Self = StObject.set(x, "supportedLanguageMetadata", js.undefined)
    
    @scala.inline
    def setSupportedLanguageUndefined: Self = StObject.set(x, "supportedLanguage", js.undefined)
  }
}
