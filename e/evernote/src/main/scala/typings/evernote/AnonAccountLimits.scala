package typings.evernote

import typings.evernote.mod.Types.AccountLimits
import typings.evernote.mod.Types.Accounting
import typings.evernote.mod.Types.BusinessUserInfo
import typings.evernote.mod.Types.PrivilegeLevel
import typings.evernote.mod.Types.ServiceLevel
import typings.evernote.mod.Types.Timestamp
import typings.evernote.mod.Types.UserAttributes
import typings.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccountLimits extends js.Object {
  var accountLimits: js.UndefOr[AccountLimits] = js.undefined
  var accounting: js.UndefOr[Accounting] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.UndefOr[UserAttributes] = js.undefined
  var businessUserInfo: js.UndefOr[BusinessUserInfo] = js.undefined
  var created: js.UndefOr[Timestamp] = js.undefined
  var deleted: js.UndefOr[Timestamp] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[UserID] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var photoLastUpdated: js.UndefOr[Timestamp] = js.undefined
  var photoUrl: js.UndefOr[String] = js.undefined
  var privilege: js.UndefOr[PrivilegeLevel] = js.undefined
  var serviceLevel: js.UndefOr[ServiceLevel] = js.undefined
  var shardId: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[Timestamp] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AnonAccountLimits {
  @scala.inline
  def apply(
    accountLimits: AccountLimits = null,
    accounting: Accounting = null,
    active: js.UndefOr[Boolean] = js.undefined,
    attributes: UserAttributes = null,
    businessUserInfo: BusinessUserInfo = null,
    created: Int | Double = null,
    deleted: Int | Double = null,
    email: String = null,
    id: Int | Double = null,
    name: String = null,
    photoLastUpdated: Int | Double = null,
    photoUrl: String = null,
    privilege: PrivilegeLevel = null,
    serviceLevel: ServiceLevel = null,
    shardId: String = null,
    timezone: String = null,
    updated: Int | Double = null,
    username: String = null
  ): AnonAccountLimits = {
    val __obj = js.Dynamic.literal()
    if (accountLimits != null) __obj.updateDynamic("accountLimits")(accountLimits.asInstanceOf[js.Any])
    if (accounting != null) __obj.updateDynamic("accounting")(accounting.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (businessUserInfo != null) __obj.updateDynamic("businessUserInfo")(businessUserInfo.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (photoLastUpdated != null) __obj.updateDynamic("photoLastUpdated")(photoLastUpdated.asInstanceOf[js.Any])
    if (photoUrl != null) __obj.updateDynamic("photoUrl")(photoUrl.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (serviceLevel != null) __obj.updateDynamic("serviceLevel")(serviceLevel.asInstanceOf[js.Any])
    if (shardId != null) __obj.updateDynamic("shardId")(shardId.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountLimits]
  }
}

