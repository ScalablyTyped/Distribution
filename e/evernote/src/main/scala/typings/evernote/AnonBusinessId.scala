package typings.evernote

import typings.evernote.mod.Types.BusinessInvitationStatus
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBusinessId extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Timestamp] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var fromWorkChat: js.UndefOr[Boolean] = js.undefined
  var requesterId: js.UndefOr[UserID] = js.undefined
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  var status: js.UndefOr[BusinessInvitationStatus] = js.undefined
}

object AnonBusinessId {
  @scala.inline
  def apply(
    businessId: Int | Double = null,
    created: Int | Double = null,
    email: String = null,
    fromWorkChat: js.UndefOr[Boolean] = js.undefined,
    requesterId: Int | Double = null,
    role: BusinessUserRole = null,
    status: BusinessInvitationStatus = null
  ): AnonBusinessId = {
    val __obj = js.Dynamic.literal()
    if (businessId != null) __obj.updateDynamic("businessId")(businessId.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(fromWorkChat)) __obj.updateDynamic("fromWorkChat")(fromWorkChat.asInstanceOf[js.Any])
    if (requesterId != null) __obj.updateDynamic("requesterId")(requesterId.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBusinessId]
  }
}

