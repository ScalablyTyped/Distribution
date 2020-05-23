package typings.evernote.anon

import typings.evernote.mod.Types.Contact
import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blocked extends js.Object {
  var blocked: js.UndefOr[Boolean] = js.undefined
  var contact: js.UndefOr[Contact] = js.undefined
  var deactivated: js.UndefOr[Boolean] = js.undefined
  var eventId: js.UndefOr[MessageEventID] = js.undefined
  var id: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined
  var sameBusiness: js.UndefOr[Boolean] = js.undefined
  var userConnected: js.UndefOr[Boolean] = js.undefined
  var userId: js.UndefOr[UserID] = js.undefined
}

object Blocked {
  @scala.inline
  def apply(
    blocked: js.UndefOr[Boolean] = js.undefined,
    contact: Contact = null,
    deactivated: js.UndefOr[Boolean] = js.undefined,
    eventId: js.UndefOr[MessageEventID] = js.undefined,
    id: js.UndefOr[typings.evernote.mod.Types.IdentityID] = js.undefined,
    sameBusiness: js.UndefOr[Boolean] = js.undefined,
    userConnected: js.UndefOr[Boolean] = js.undefined,
    userId: js.UndefOr[UserID] = js.undefined
  ): Blocked = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blocked)) __obj.updateDynamic("blocked")(blocked.get.asInstanceOf[js.Any])
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    if (!js.isUndefined(deactivated)) __obj.updateDynamic("deactivated")(deactivated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(eventId)) __obj.updateDynamic("eventId")(eventId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sameBusiness)) __obj.updateDynamic("sameBusiness")(sameBusiness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userConnected)) __obj.updateDynamic("userConnected")(userConnected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(userId)) __obj.updateDynamic("userId")(userId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blocked]
  }
}

