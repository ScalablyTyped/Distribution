package typings.evernote.anon

import typings.evernote.mod.NoteStore.NoteShareRelationshipRestrictions
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privilege extends js.Object {
  var displayName: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientUserId: js.UndefOr[UserID] = js.undefined
  var restrictions: js.UndefOr[NoteShareRelationshipRestrictions] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
}

object Privilege {
  @scala.inline
  def apply(
    displayName: String = null,
    privilege: SharedNotePrivilegeLevel = null,
    recipientUserId: js.UndefOr[UserID] = js.undefined,
    restrictions: NoteShareRelationshipRestrictions = null,
    sharerUserId: js.UndefOr[UserID] = js.undefined
  ): Privilege = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientUserId)) __obj.updateDynamic("recipientUserId")(recipientUserId.get.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    if (!js.isUndefined(sharerUserId)) __obj.updateDynamic("sharerUserId")(sharerUserId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privilege]
  }
}

