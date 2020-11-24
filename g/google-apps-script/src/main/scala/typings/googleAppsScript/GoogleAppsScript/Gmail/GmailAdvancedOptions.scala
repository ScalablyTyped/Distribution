package typings.googleAppsScript.GoogleAppsScript.Gmail

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for a Gmail draft.
  */
@js.native
trait GmailAdvancedOptions extends js.Object {
  
  /**
    * An array of files to send with the email.
    */
  var attachments: js.UndefOr[js.Array[BlobSource]] = js.native
  
  /**
    * A comma-separated list of email addresses to BCC.
    */
  var bcc: js.UndefOr[String] = js.native
  
  /**
    * A comma-separated list of email addresses to CC.
    */
  var cc: js.UndefOr[String] = js.native
  
  /**
    * The address that the email should be sent from, which must be one of the values returned by `GmailApp.getAliases()`.
    */
  var from: js.UndefOr[String] = js.native
  
  /**
    * If set, devices capable of rendering HTML will use it instead of the required body argument; you can add an optional `inlineImages` field in HTML body if you have inlined images for your email.
    */
  var htmlBody: js.UndefOr[String] = js.native
  
  /**
    * A JavaScript object containing a mapping from image key (`String`) to image data (`BlobSource`) ; this assumes that the `htmlBody` parameter is used and contains references to these images in the format `<img src="cid:imageKey" />`.
    */
  var inlineImages: js.UndefOr[StringDictionary[BlobSource]] = js.native
  
  /**
    * The name of the sender of the email (default: the user's name).
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * An email address to use as the default reply-to address (default: the user's email address).
    */
  var replyTo: js.UndefOr[String] = js.native
}
object GmailAdvancedOptions {
  
  @scala.inline
  def apply(): GmailAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmailAdvancedOptions]
  }
  
  @scala.inline
  implicit class GmailAdvancedOptionsOps[Self <: GmailAdvancedOptions] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: BlobSource*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[BlobSource]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setBcc(value: String): Self = this.set("bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    
    @scala.inline
    def setCc(value: String): Self = this.set("cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setHtmlBody(value: String): Self = this.set("htmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlBody: Self = this.set("htmlBody", js.undefined)
    
    @scala.inline
    def setInlineImages(value: StringDictionary[BlobSource]): Self = this.set("inlineImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineImages: Self = this.set("inlineImages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setReplyTo(value: String): Self = this.set("replyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("replyTo", js.undefined)
  }
}
