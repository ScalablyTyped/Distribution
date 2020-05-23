package typings.evernote.anon

import typings.evernote.mod.Types.BusinessInvitationStatus
import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessId extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var created: js.UndefOr[Timestamp] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var fromWorkChat: js.UndefOr[Boolean] = js.undefined
  var requesterId: js.UndefOr[UserID] = js.undefined
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  var status: js.UndefOr[BusinessInvitationStatus] = js.undefined
}

object BusinessId {
  @scala.inline
  def apply(
    businessId: js.UndefOr[Double] = js.undefined,
    created: js.UndefOr[Timestamp] = js.undefined,
    email: String = null,
    fromWorkChat: js.UndefOr[Boolean] = js.undefined,
    requesterId: js.UndefOr[UserID] = js.undefined,
    role: BusinessUserRole = null,
    status: BusinessInvitationStatus = null
  ): BusinessId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(businessId)) __obj.updateDynamic("businessId")(businessId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(created)) __obj.updateDynamic("created")(created.get.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(fromWorkChat)) __obj.updateDynamic("fromWorkChat")(fromWorkChat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requesterId)) __obj.updateDynamic("requesterId")(requesterId.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessId]
  }
}

