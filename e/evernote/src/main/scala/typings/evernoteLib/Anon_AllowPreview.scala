package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowPreview extends js.Object {
  var allowPreview: js.UndefOr[scala.Boolean] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  var notebookGuid: js.UndefOr[java.lang.String] = js.undefined
  var notebookModifiable: js.UndefOr[scala.Boolean] = js.undefined
  var privilege: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel] = js.undefined
  var recipientSettings: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.SharedNotebookRecipientSettings] = js.undefined
  var requireLogin: js.UndefOr[scala.Boolean] = js.undefined
  var serviceCreated: js.UndefOr[scala.Double] = js.undefined
  var serviceUpdated: js.UndefOr[scala.Double] = js.undefined
  var shareKey: js.UndefOr[java.lang.String] = js.undefined
  var userId: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AllowPreview {
  @scala.inline
  def apply(
    allowPreview: js.UndefOr[scala.Boolean] = js.undefined,
    email: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    notebookGuid: java.lang.String = null,
    notebookModifiable: js.UndefOr[scala.Boolean] = js.undefined,
    privilege: evernoteLib.evernoteMod.EvernoteNs.SharedNotebookPrivilegeLevel = null,
    recipientSettings: evernoteLib.evernoteMod.EvernoteNs.SharedNotebookRecipientSettings = null,
    requireLogin: js.UndefOr[scala.Boolean] = js.undefined,
    serviceCreated: scala.Int | scala.Double = null,
    serviceUpdated: scala.Int | scala.Double = null,
    shareKey: java.lang.String = null,
    userId: scala.Int | scala.Double = null,
    username: java.lang.String = null
  ): Anon_AllowPreview = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPreview)) __obj.updateDynamic("allowPreview")(allowPreview)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (notebookGuid != null) __obj.updateDynamic("notebookGuid")(notebookGuid)
    if (!js.isUndefined(notebookModifiable)) __obj.updateDynamic("notebookModifiable")(notebookModifiable)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege)
    if (recipientSettings != null) __obj.updateDynamic("recipientSettings")(recipientSettings)
    if (!js.isUndefined(requireLogin)) __obj.updateDynamic("requireLogin")(requireLogin)
    if (serviceCreated != null) __obj.updateDynamic("serviceCreated")(serviceCreated.asInstanceOf[js.Any])
    if (serviceUpdated != null) __obj.updateDynamic("serviceUpdated")(serviceUpdated.asInstanceOf[js.Any])
    if (shareKey != null) __obj.updateDynamic("shareKey")(shareKey)
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_AllowPreview]
  }
}

