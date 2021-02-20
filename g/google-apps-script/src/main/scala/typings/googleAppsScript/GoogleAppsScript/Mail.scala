package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mail {
  
  @js.native
  trait MailAdvancedParameters extends StObject {
    
    /** an array of files to send with the email */
    var attachments: js.UndefOr[js.Array[BlobSource]] = js.native
    
    /** a comma-separated list of email addresses to BCC */
    var bcc: js.UndefOr[String] = js.native
    
    /** the body of the email */
    var body: js.UndefOr[String] = js.native
    
    /** a comma-separated list of email addresses to CC */
    var cc: js.UndefOr[String] = js.native
    
    /** if set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional inlineImages field in HTML body if you have inlined images for your email */
    var htmlBody: js.UndefOr[String] = js.native
    
    /** a JavaScript object containing a mapping from image key (String) to image data (BlobSource); this assumes that the htmlBody parameter is used and contains references to these images in the format <img src="cid:imageKey" /> */
    var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.native
    
    /** the name of the sender of the email (default: the user's name) */
    var name: js.UndefOr[String] = js.native
    
    /** true if the email should be sent from a generic no-reply email address to discourage recipients from responding to emails; this option is only possible for G Suite accounts, not Gmail users */
    var noReply: js.UndefOr[Boolean] = js.native
    
    /** an email address to use as the default reply-to address (default: the user's email address) */
    var replyTo: js.UndefOr[String] = js.native
    
    /** the subject of the email */
    var subject: js.UndefOr[String] = js.native
    
    /** the address of the recipient */
    var to: js.UndefOr[String] = js.native
  }
  object MailAdvancedParameters {
    
    @scala.inline
    def apply(): MailAdvancedParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MailAdvancedParameters]
    }
    
    @scala.inline
    implicit class MailAdvancedParametersMutableBuilder[Self <: MailAdvancedParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachments(value: js.Array[BlobSource]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      @scala.inline
      def setAttachmentsVarargs(value: BlobSource*): Self = StObject.set(x, "attachments", js.Array(value :_*))
      
      @scala.inline
      def setBcc(value: String): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCc(value: String): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
      
      @scala.inline
      def setHtmlBody(value: String): Self = StObject.set(x, "htmlBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlBodyUndefined: Self = StObject.set(x, "htmlBody", js.undefined)
      
      @scala.inline
      def setInlineImages(value: StringDictionary[BlobSource]): Self = StObject.set(x, "inlineImages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineImagesUndefined: Self = StObject.set(x, "inlineImages", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoReply(value: Boolean): Self = StObject.set(x, "noReply", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoReplyUndefined: Self = StObject.set(x, "noReply", js.undefined)
      
      @scala.inline
      def setReplyTo(value: String): Self = StObject.set(x, "replyTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToUndefined: Self = StObject.set(x, "replyTo", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
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
