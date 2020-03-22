package typings.evernote

import typings.evernote.mod.Types.IdentityID
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecipientIdentityId extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientIdentityId: js.UndefOr[IdentityID] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}

object AnonRecipientIdentityId {
  @scala.inline
  def apply(
    displayName: String = null,
    privilege: SharedNotePrivilegeLevel = null,
    recipientIdentityId: Int | Double = null,
    sharerUserId: Int | Double = null
  ): AnonRecipientIdentityId = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientIdentityId != null) __obj.updateDynamic("recipientIdentityId")(recipientIdentityId.asInstanceOf[js.Any])
    if (sharerUserId != null) __obj.updateDynamic("sharerUserId")(sharerUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecipientIdentityId]
  }
}

