package typings.evernote

import typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel
import typings.evernote.mod.Types.UserID
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.undefined
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}

object AnonDisplayName {
  @scala.inline
  def apply(
    displayName: String = null,
    privilege: ShareRelationshipPrivilegeLevel = null,
    recipientUserIdentity: UserIdentity = null,
    sharerUserId: Int | Double = null
  ): AnonDisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientUserIdentity != null) __obj.updateDynamic("recipientUserIdentity")(recipientUserIdentity.asInstanceOf[js.Any])
    if (sharerUserId != null) __obj.updateDynamic("sharerUserId")(sharerUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

