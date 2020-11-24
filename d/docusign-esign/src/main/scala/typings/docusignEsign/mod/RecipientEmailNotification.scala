package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientEmailNotification extends js.Object {
  
  /**
    * The body of the email message.
    */
  var emailBody: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `emailBody` property can be edited.
    */
  var emailBodyMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The subject line for the email notification.
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `emailSubject` property can be edited.
    */
  var emailSubjectMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
  var supportedLanguage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supportedLanguage` property can be edited.
    */
  var supportedLanguageMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
}
object RecipientEmailNotification {
  
  @scala.inline
  def apply(): RecipientEmailNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEmailNotification]
  }
  
  @scala.inline
  implicit class RecipientEmailNotificationOps[Self <: RecipientEmailNotification] (val x: Self) extends AnyVal {
    
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
    def setEmailBody(value: String): Self = this.set("emailBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailBody: Self = this.set("emailBody", js.undefined)
    
    @scala.inline
    def setEmailBodyMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("emailBodyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailBodyMetadata: Self = this.set("emailBodyMetadata", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    
    @scala.inline
    def setEmailSubjectMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("emailSubjectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubjectMetadata: Self = this.set("emailSubjectMetadata", js.undefined)
    
    @scala.inline
    def setSupportedLanguage(value: String): Self = this.set("supportedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLanguage: Self = this.set("supportedLanguage", js.undefined)
    
    @scala.inline
    def setSupportedLanguageMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("supportedLanguageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedLanguageMetadata: Self = this.set("supportedLanguageMetadata", js.undefined)
  }
}
