package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gmail Folder restricts (i.e. in Drafts/Sent/Chats/User Generated Labels).
  */
@js.native
trait Schema$GmailFolderRestrict extends js.Object {
  var `type`: js.UndefOr[String] = js.native
}

object Schema$GmailFolderRestrict {
  @scala.inline
  def apply(`type`: String = null): Schema$GmailFolderRestrict = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GmailFolderRestrict]
  }
}

