package typings.evernote.anon

import typings.evernote.mod.NoteStore.ShareRelationshipPrivilegeLevel
import typings.evernote.mod.Types.UserID
import typings.evernote.mod.Types.UserIdentity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[ShareRelationshipPrivilegeLevel] = js.undefined
  var recipientUserIdentity: js.UndefOr[UserIdentity] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}

object DisplayName {
  @scala.inline
  def apply(
    displayName: String = null,
    privilege: ShareRelationshipPrivilegeLevel = null,
    recipientUserIdentity: UserIdentity = null,
    sharerUserId: js.UndefOr[UserID] = js.undefined
  ): DisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientUserIdentity != null) __obj.updateDynamic("recipientUserIdentity")(recipientUserIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(sharerUserId)) __obj.updateDynamic("sharerUserId")(sharerUserId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

