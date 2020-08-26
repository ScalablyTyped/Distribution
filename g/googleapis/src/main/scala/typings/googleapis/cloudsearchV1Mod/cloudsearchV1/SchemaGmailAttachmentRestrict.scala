package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Attachment restricts (i.e. has:attachment, has:drive, filename:pdf).
  */
@js.native
trait SchemaGmailAttachmentRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmailAttachmentRestrict {
  @scala.inline
  def apply(): SchemaGmailAttachmentRestrict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGmailAttachmentRestrict]
  }
  @scala.inline
  implicit class SchemaGmailAttachmentRestrictOps[Self <: SchemaGmailAttachmentRestrict] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

