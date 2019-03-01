package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accounting extends js.Object {
  var accounting: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.Accounting] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var attributes: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.UserAttributes] = js.undefined
  var businessUserInfo: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.BusinessUserInfo] = js.undefined
  var created: js.UndefOr[scala.Double] = js.undefined
  var deleted: js.UndefOr[scala.Double] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var premiumInfo: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PremiumInfo] = js.undefined
  var privilege: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel] = js.undefined
  var shardId: js.UndefOr[java.lang.String] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
  var updated: js.UndefOr[scala.Double] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accounting {
  @scala.inline
  def apply(
    accounting: evernoteLib.evernoteMod.EvernoteNs.Accounting = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    attributes: evernoteLib.evernoteMod.EvernoteNs.UserAttributes = null,
    businessUserInfo: evernoteLib.evernoteMod.EvernoteNs.BusinessUserInfo = null,
    created: scala.Int | scala.Double = null,
    deleted: scala.Int | scala.Double = null,
    email: java.lang.String = null,
    id: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    premiumInfo: evernoteLib.evernoteMod.EvernoteNs.PremiumInfo = null,
    privilege: evernoteLib.evernoteMod.EvernoteNs.PrivilegeLevel = null,
    shardId: java.lang.String = null,
    timezone: java.lang.String = null,
    updated: scala.Int | scala.Double = null,
    username: java.lang.String = null
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

