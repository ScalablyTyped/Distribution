package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Folder restricts (i.e. in Drafts/Sent/Chats/User Generated Labels).
  */
@js.native
trait SchemaGmailFolderRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGmailFolderRestrict {
  @scala.inline
  def apply(`type`: String = null): SchemaGmailFolderRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGmailFolderRestrict]
  }
}

