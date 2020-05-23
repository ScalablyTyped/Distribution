package typings.evernote.anon

import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import typings.evernote.mod.Types.SharedNotebookRecipientSettings
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Email extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var globalId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var notebookGuid: js.UndefOr[typings.evernote.mod.Types.Guid] = js.undefined
  var notebookModifiable: js.UndefOr[Boolean] = js.undefined
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  var recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  var recipientSettings: js.UndefOr[SharedNotebookRecipientSettings] = js.undefined
  var recipientUserId: js.UndefOr[UserID] = js.undefined
  var recipientUsername: js.UndefOr[String] = js.undefined
  var serviceAssigned: js.UndefOr[Timestamp] = js.undefined
  var serviceCreated: js.UndefOr[Timestamp] = js.undefined
  var serviceUpdated: js.UndefOr[Timestamp] = js.undefined
  var sharerUserId: js.UndefOr[UserID] = js.undefined
  var userId: js.UndefOr[UserID] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Email {
  @scala.inline
  def apply(
    email: String = null,
    globalId: String = null,
    id: js.UndefOr[Double] = js.undefined,
    notebookGuid: typings.evernote.mod.Types.Guid = null,
    notebookModifiable: js.UndefOr[Boolean] = js.undefined,
    privilege: SharedNotebookPrivilegeLevel = null,
    recipientIdentityId: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined,
    recipientSettings: SharedNotebookRecipientSettings = null,
    recipientUserId: js.UndefOr[UserID] = js.undefined,
    recipientUsername: String = null,
    serviceAssigned: js.UndefOr[Timestamp] = js.undefined,
    serviceCreated: js.UndefOr[Timestamp] = js.undefined,
    serviceUpdated: js.UndefOr[Timestamp] = js.undefined,
    sharerUserId: js.UndefOr[UserID] = js.undefined,
    userId: js.UndefOr[UserID] = js.undefined,
    username: String = null
  ): Email = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (globalId != null) __obj.updateDynamic("globalId")(globalId.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (!js.isUndefined(notebookModifiable)) __obj.updateDynamic("notebookModifiable")(notebookModifiable.get.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientIdentityId)) __obj.updateDynamic("recipientIdentityId")(recipientIdentityId.get.asInstanceOf[js.Any])
    if (recipientSettings != null) __obj.updateDynamic("recipientSettings")(recipientSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(recipientUserId)) __obj.updateDynamic("recipientUserId")(recipientUserId.get.asInstanceOf[js.Any])
    if (recipientUsername != null) __obj.updateDynamic("recipientUsername")(recipientUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceAssigned)) __obj.updateDynamic("serviceAssigned")(serviceAssigned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceCreated)) __obj.updateDynamic("serviceCreated")(serviceCreated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serviceUpdated)) __obj.updateDynamic("serviceUpdated")(serviceUpdated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sharerUserId)) __obj.updateDynamic("sharerUserId")(sharerUserId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userId)) __obj.updateDynamic("userId")(userId.get.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
}

