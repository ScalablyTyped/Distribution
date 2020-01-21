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
  def apply(`type`: String = null): SchemaGmailAttachmentRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGmailAttachmentRestrict]
  }
}

