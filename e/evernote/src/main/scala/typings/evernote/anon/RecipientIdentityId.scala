package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientIdentityId extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}

object RecipientIdentityId {
  @scala.inline
  def apply(
    displayName: String = null,
    privilege: SharedNotePrivilegeLevel = null,
    recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined,
    sharerUserId: js.UndefOr[UserID] = js.undefined
  ): RecipientIdentityId = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientIdentityId)) __obj.updateDynamic("recipientIdentityId")(recipientIdentityId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sharerUserId)) __obj.updateDynamic("sharerUserId")(sharerUserId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientIdentityId]
  }
}

