package typings.evernote

import typings.evernote.mod.Types.Guid
import typings.evernote.mod.Types.IdentityID
import typings.evernote.mod.Types.SharedNotebookPrivilegeLevel
import typings.evernote.mod.Types.SharedNotebookRecipientSettings
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmail extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var globalId: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var notebookGuid: js.UndefOr[Guid] = js.undefined
  var notebookModifiable: js.UndefOr[Boolean] = js.undefined
  var privilege: js.UndefOr[SharedNotebookPrivilegeLevel] = js.undefined
  var recipientIdentityId: js.UndefOr[IdentityID] = js.undefined
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

object AnonEmail {
  @scala.inline
  def apply(
    email: String = null,
    globalId: String = null,
    id: Int | Double = null,
    notebookGuid: Guid = null,
    notebookModifiable: js.UndefOr[Boolean] = js.undefined,
    privilege: SharedNotebookPrivilegeLevel = null,
    recipientIdentityId: Int | Double = null,
    recipientSettings: SharedNotebookRecipientSettings = null,
    recipientUserId: Int | Double = null,
    recipientUsername: String = null,
    serviceAssigned: Int | Double = null,
    serviceCreated: Int | Double = null,
    serviceUpdated: Int | Double = null,
    sharerUserId: Int | Double = null,
    userId: Int | Double = null,
    username: String = null
  ): AnonEmail = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (globalId != null) __obj.updateDynamic("globalId")(globalId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid.asInstanceOf[js.Any])
    if (!js.isUndefined(notebookModifiable)) __obj.updateDynamic("notebookModifiable")(notebookModifiable.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (recipientIdentityId != null) __obj.updateDynamic("recipientIdentityId")(recipientIdentityId.asInstanceOf[js.Any])
    if (recipientSettings != null) __obj.updateDynamic("recipientSettings")(recipientSettings.asInstanceOf[js.Any])
    if (recipientUserId != null) __obj.updateDynamic("recipientUserId")(recipientUserId.asInstanceOf[js.Any])
    if (recipientUsername != null) __obj.updateDynamic("recipientUsername")(recipientUsername.asInstanceOf[js.Any])
    if (serviceAssigned != null) __obj.updateDynamic("serviceAssigned")(serviceAssigned.asInstanceOf[js.Any])
    if (serviceCreated != null) __obj.updateDynamic("serviceCreated")(serviceCreated.asInstanceOf[js.Any])
    if (serviceUpdated != null) __obj.updateDynamic("serviceUpdated")(serviceUpdated.asInstanceOf[js.Any])
    if (sharerUserId != null) __obj.updateDynamic("sharerUserId")(sharerUserId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmail]
  }
}

