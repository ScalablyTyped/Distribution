package typings.evernote

import typings.evernote.evernoteMod.Evernote.Accounting
import typings.evernote.evernoteMod.Evernote.BusinessUserInfo
import typings.evernote.evernoteMod.Evernote.PremiumInfo
import typings.evernote.evernoteMod.Evernote.PrivilegeLevel
import typings.evernote.evernoteMod.Evernote.UserAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accounting extends js.Object {
  var accounting: js.UndefOr[Accounting] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var attributes: js.UndefOr[UserAttributes] = js.undefined
  var businessUserInfo: js.UndefOr[BusinessUserInfo] = js.undefined
  var created: js.UndefOr[Double] = js.undefined
  var deleted: js.UndefOr[Double] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var premiumInfo: js.UndefOr[PremiumInfo] = js.undefined
  var privilege: js.UndefOr[PrivilegeLevel] = js.undefined
  var shardId: js.UndefOr[String] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
  var updated: js.UndefOr[Double] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object Anon_Accounting {
  @scala.inline
  def apply(
    accounting: Accounting = null,
    active: js.UndefOr[Boolean] = js.undefined,
    attributes: UserAttributes = null,
    businessUserInfo: BusinessUserInfo = null,
    created: Int | Double = null,
    deleted: Int | Double = null,
    email: String = null,
    id: Int | Double = null,
    name: String = null,
    premiumInfo: PremiumInfo = null,
    privilege: PrivilegeLevel = null,
    shardId: String = null,
    timezone: String = null,
    updated: Int | Double = null,
    username: String = null
  ): Anon_Accounting = {
    val __obj = js.Dynamic.literal()
    if (accounting != null) __obj.updateDynamic("accounting")(accounting.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (businessUserInfo != null) __obj.updateDynamic("businessUserInfo")(businessUserInfo.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (premiumInfo != null) __obj.updateDynamic("premiumInfo")(premiumInfo.asInstanceOf[js.Any])
    if (privilege != null) __obj.updateDynamic("privilege")(privilege.asInstanceOf[js.Any])
    if (shardId != null) __obj.updateDynamic("shardId")(shardId.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accounting]
  }
}

