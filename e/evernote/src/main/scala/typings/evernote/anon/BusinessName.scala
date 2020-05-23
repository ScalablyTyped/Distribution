package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusinessName extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var businessName: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[BusinessUserRole] = js.undefined
  var updated: js.UndefOr[Timestamp] = js.undefined
}

object BusinessName {
  @scala.inline
  def apply(
    businessId: js.UndefOr[Double] = js.undefined,
    businessName: String = null,
    email: String = null,
    role: BusinessUserRole = null,
    updated: js.UndefOr[Timestamp] = js.undefined
  ): BusinessName = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(businessId)) __obj.updateDynamic("businessId")(businessId.get.asInstanceOf[js.Any])
    if (businessName != null) __obj.updateDynamic("businessName")(businessName.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessName]
  }
}

