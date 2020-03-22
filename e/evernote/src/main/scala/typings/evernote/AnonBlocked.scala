package typings.evernote

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.IdentityID
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBlocked extends js.Object {
  var blocked: js.UndefOr[Boolean] = js.undefined
  var contact: js.UndefOr[Contact] = js.undefined
  var deactivated: js.UndefOr[Boolean] = js.undefined
  var eventId: js.UndefOr[MessageEventID] = js.undefined
  var id: js.UndefOr[IdentityID] = js.undefined
  var sameBusiness: js.UndefOr[Boolean] = js.undefined
  var userConnected: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[UserID] = js.undefined
}

object AnonBlocked {
  @scala.inline
  def apply(
    blocked: js.UndefOr[Boolean] = js.undefined,
    contact: Contact = null,
    deactivated: js.UndefOr[Boolean] = js.undefined,
    eventId: Int | Double = null,
    id: Int | Double = null,
    sameBusiness: js.UndefOr[Boolean] = js.undefined,
    userConnected: js.UndefOr[Boolean] = js.undefined,
    userId: Int | Double = null
  ): AnonBlocked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (!js.isUndefined(deactivated)) __obj.updateDynamic("deactivated")(deactivated.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(sameBusiness)) __obj.updateDynamic("sameBusiness")(sameBusiness.asInstanceOf[js.Any])
    if (!js.isUndefined(userConnected)) __obj.updateDynamic("userConnected")(userConnected.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlocked]
  }
}

