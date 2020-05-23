package typings.evernote.anon

import typings.evernote.mod.Types.Identity
import typings.evernote.mod.Types.SharedNotePrivilegeLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientIdentity extends js.Object {
  var privilege: js.UndefOr[SharedNotePrivilegeLevel] = js.undefined
  var recipientIdentity: js.UndefOr[Identity] = js.undefined
  var serviceAssigned: js.UndefOr[Timestamp] = js.undefined
  var serviceCreated: js.UndefOr[Timestamp] = js.undefined
  var serviceUpdated: js.UndefOr[Timestamp] = js.undefined
  var sharerUserID: js.UndefOr[UserID] = js.undefined
}

object RecipientIdentity {
  @scala.inline
  def apply(
    privilege: SharedNotePrivilegeLevel = null,
    recipientIdentity: Identity = null,
    serviceAssigned: js.UndefOr[Timestamp] = js.undefined,
    serviceCreated: js.UndefOr[Timestamp] = js.undefined,
    serviceUpdated: js.UndefOr[Timestamp] = js.undefined,
    sharerUserID: js.UndefOr[UserID] = js.undefined
  ): RecipientIdentity = {
    val __obj = js.Dynamic.literal()
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientIdentity != null) __obj.updateDynamic("recipientIdentity")(recipientIdentity.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceAssigned)) __obj.updateDynamic("serviceAssigned")(serviceAssigned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceCreated)) __obj.updateDynamic("serviceCreated")(serviceCreated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceUpdated)) __obj.updateDynamic("serviceUpdated")(serviceUpdated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sharerUserID)) __obj.updateDynamic("sharerUserID")(sharerUserID.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientIdentity]
  }
}

