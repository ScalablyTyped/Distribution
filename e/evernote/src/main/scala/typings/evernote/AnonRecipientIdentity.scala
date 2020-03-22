package typings.evernote

import typings.evernote.mod.Types.Identity
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecipientIdentity extends js.Object {
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientIdentity: js.UndefOr[Identity] = js.undefined
  var serviceAssigned: js.UndefOr[Timestamp] = js.undefined
  var serviceCreated: js.UndefOr[Timestamp] = js.undefined
  var serviceUpdated: js.UndefOr[Timestamp] = js.undefined
  var sharerUserID: js.UndefOr[UserID] = js.undefined
}

object AnonRecipientIdentity {
  @scala.inline
  def apply(
    privilege: SharedNotePrivilegeLevel = null,
    recipientIdentity: Identity = null,
    serviceAssigned: Int | Double = null,
    serviceCreated: Int | Double = null,
    serviceUpdated: Int | Double = null,
    sharerUserID: Int | Double = null
  ): AnonRecipientIdentity = {
    val __obj = js.Dynamic.literal()
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientIdentity != null) __obj.updateDynamic("recipientIdentity")(recipientIdentity.asInstanceOf[js.Any])
    if (serviceAssigned != null) __obj.updateDynamic("serviceAssigned")(serviceAssigned.asInstanceOf[js.Any])
    if (serviceCreated != null) __obj.updateDynamic("serviceCreated")(serviceCreated.asInstanceOf[js.Any])
    if (serviceUpdated != null) __obj.updateDynamic("serviceUpdated")(serviceUpdated.asInstanceOf[js.Any])
    if (sharerUserID != null) __obj.updateDynamic("sharerUserID")(sharerUserID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecipientIdentity]
  }
}

