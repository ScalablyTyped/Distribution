package typings.evernote.anon

import typings.evernote.mod.Types.ContactType
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var messagingPermit: js.UndefOr[String] = js.undefined
  var messagingPermitExpires: js.UndefOr[Timestamp] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var photoLastUpdated: js.UndefOr[Timestamp] = js.undefined
  var photoUrl: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ContactType] = js.undefined
}

object Id {
  @scala.inline
  def apply(
    id: String = null,
    messagingPermit: String = null,
    messagingPermitExpires: js.UndefOr[Timestamp] = js.undefined,
    name: String = null,
    photoLastUpdated: js.UndefOr[Timestamp] = js.undefined,
    photoUrl: String = null,
    `type`: ContactType = null
  ): Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (messagingPermit != null) __obj.updateDynamic("messagingPermit")(messagingPermit.asInstanceOf[js.Any])
    if (!js.isUndefined(messagingPermitExpires)) __obj.updateDynamic("messagingPermitExpires")(messagingPermitExpires.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(photoLastUpdated)) __obj.updateDynamic("photoLastUpdated")(photoLastUpdated.get.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

