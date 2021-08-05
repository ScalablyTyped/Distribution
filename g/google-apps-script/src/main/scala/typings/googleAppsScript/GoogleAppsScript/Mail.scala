package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mail {
  
  trait MailAdvancedParameters extends StObject {
    
    /** an array of files to send with the email */
    var attachments: js.UndefOr[js.Array[BlobSource]] = js.undefined
    
    /** a comma-separated list of email addresses to BCC */
    var bcc: js.UndefOr[String] = js.undefined
    
    /** the body of the email */
    var body: js.UndefOr[String] = js.undefined
    
    /** a comma-separated list of email addresses to CC */
    var cc: js.UndefOr[String] = js.undefined
    
    /** if set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional inlineImages field in HTML body if you have inlined images for your email */
    var htmlBody: js.UndefOr[String] = js.undefined
    
    /** a JavaScript object containing a mapping from image key (String) to image data (BlobSource); this assumes that the htmlBody parameter is used and contains references to these images in the format <img src="cid:imageKey" /> */
    var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.undefined
    
    /** the name of the sender of the email (default: the user's name) */
    var name: js.UndefOr[String] = js.undefined
    
    /** true if the email should be sent from a generic no-reply email address to discourage recipients from responding to emails; this option is only possible for G Suite accounts, not Gmail users */
    var noReply: js.UndefOr[Boolean] = js.undefined
    
    /** an email address to use as the default reply-to address (default: the user's email address) */
    var replyTo: js.UndefOr[String] = js.undefined
    
    /** the subject of the email */
    var subject: js.UndefOr[String] = js.undefined
    
    /** the address of the recipient */
    var to: js.UndefOr[String] = js.undefined
  }
  object MailAdvancedParameters {
    
    inline def apply(): MailAdvancedParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailAdvancedParameters]
    }
    
    extension [Self <: MailAdvancedParameters](x: Self) {
      
      inline def setAttachments(value: js.Array[BlobSource]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setAttachmentsVarargs(value: BlobSource*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      inline def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      inline def setHtmlBody(value: String): Self = StObject.set(x, "htmlBody", value.asInstanceOf[js.Any])
      
      inline def setHtmlBodyUndefined: Self = StObject.set(x, "htmlBody", js.undefined)
      
      inline def setInlineImages(value: StringDictionary[BlobSource]): Self = StObject.set(x, "inlineImages", value.asInstanceOf[js.Any])
      
      inline def setInlineImagesUndefined: Self = StObject.set(x, "inlineImages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoReply(value: Boolean): Self = StObject.set(x, "noReply", value.asInstanceOf[js.Any])
      
      inline def setNoReplyUndefined: Self = StObject.set(x, "noReply", js.undefined)
      
      inline def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      inline def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  /**
    * Sends email.
    *
    * This service allows users to send emails with complete control over the content of the email.
    * Unlike GmailApp, MailApp's sole purpose is sending email. MailApp cannot access a user's Gmail
    * inbox.
    *
    * Changes to scripts written using GmailApp are more likely to trigger a re-authorization
    * request from a user than MailApp scripts.
    */
  @js.native
  trait MailApp extends StObject {
    
    def getRemainingDailyQuota(): Integer = js.native
    
    def sendEmail(message: MailAdvancedParameters): Unit = js.native
    def sendEmail(recipient: String, subject: String, body: String): Unit = js.native
    def sendEmail(recipient: String, subject: String, body: String, options: MailAdvancedParameters): Unit = js.native
    def sendEmail(to: String, replyTo: String, subject: String, body: String): Unit = js.native
  }
}
