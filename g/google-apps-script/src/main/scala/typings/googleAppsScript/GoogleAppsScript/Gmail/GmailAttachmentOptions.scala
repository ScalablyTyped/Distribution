package typings.googleAppsScript.GoogleAppsScript.Gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for a Gmail Attachments.
  */
@js.native
trait GmailAttachmentOptions extends js.Object {
  /**
    *  If the returned array of Blob attachments should include regular (non-inline) attachments.
    */
  var includeAttachments: js.UndefOr[Boolean] = js.native
  /**
    * If the returned array of Blob attachments should include inline images.
    */
  var includeInlineImages: js.UndefOr[Boolean] = js.native
}

object GmailAttachmentOptions {
  @scala.inline
  def apply(): GmailAttachmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GmailAttachmentOptions]
  }
  @scala.inline
  implicit class GmailAttachmentOptionsOps[Self <: GmailAttachmentOptions] (val x: Self) extends AnyVal {
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
    def setIncludeAttachments(value: Boolean): Self = this.set("includeAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAttachments: Self = this.set("includeAttachments", js.undefined)
    @scala.inline
    def setIncludeInlineImages(value: Boolean): Self = this.set("includeInlineImages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeInlineImages: Self = this.set("includeInlineImages", js.undefined)
  }
  
}

