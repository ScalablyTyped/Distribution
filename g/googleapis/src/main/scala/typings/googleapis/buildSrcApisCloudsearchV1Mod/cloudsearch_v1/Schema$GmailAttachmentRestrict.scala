package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Attachment restricts (i.e. has:attachment, has:drive, filename:pdf).
  */
@js.native
trait Schema$GmailAttachmentRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GmailAttachmentRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$GmailAttachmentRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmailAttachmentRestrict]
  }
}

