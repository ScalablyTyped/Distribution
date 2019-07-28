package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.Accounting
import typings.evernote.evernoteMod.EvernoteNs.BusinessUserInfo
import typings.evernote.evernoteMod.EvernoteNs.PremiumInfo
import typings.evernote.evernoteMod.EvernoteNs.PrivilegeLevel
import typings.evernote.evernoteMod.EvernoteNs.UserAttributes
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
    if (accounting != null) __obj.updateDynamic("accounting")(accounting)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (businessUserInfo != null) __obj.updateDynamic("businessUserInfo")(businessUserInfo)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (premiumInfo != null) __obj.updateDynamic("premiumInfo")(premiumInfo)
    if (privilege != null) __obj.updateDynamic("privilege")(privilege)
    if (shardId != null) __obj.updateDynamic("shardId")(shardId)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Accounting]
  }
}

