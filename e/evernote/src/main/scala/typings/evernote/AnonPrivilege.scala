package typings.evernote

import typings.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrivilege extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientUserId: js.UndefOr[UserID] = js.undefined
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}

object AnonPrivilege {
  @scala.inline
  def apply(
    displayName: String = null,
    privilege: SharedNotePrivilegeLevel = null,
    recipientUserId: Int | Double = null,
    restrictions: NoteShareRelationshipRestrictions = null,
    sharerUserId: Int | Double = null
  ): AnonPrivilege = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientUserId != null) __obj.updateDynamic("recipientUserId")(recipientUserId.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (sharerUserId != null) __obj.updateDynamic("sharerUserId")(sharerUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrivilege]
  }
}

