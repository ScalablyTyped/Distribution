package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfile extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var advertiserFilter: js.UndefOr[ObjectFilter] = js.undefined
  var campaignFilter: js.UndefOr[ObjectFilter] = js.undefined
  var comments: js.UndefOr[String] = js.undefined
  var email: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var siteFilter: js.UndefOr[ObjectFilter] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var traffickerType: js.UndefOr[String] = js.undefined
  var userAccessType: js.UndefOr[String] = js.undefined
  var userRoleFilter: js.UndefOr[ObjectFilter] = js.undefined
  var userRoleId: js.UndefOr[String] = js.undefined
}

object AccountUserProfile {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserFilter: ObjectFilter = null,
    campaignFilter: ObjectFilter = null,
    comments: String = null,
    email: String = null,
    id: String = null,
    kind: String = null,
    locale: String = null,
    name: String = null,
    siteFilter: ObjectFilter = null,
    subaccountId: String = null,
    traffickerType: String = null,
    userAccessType: String = null,
    userRoleFilter: ObjectFilter = null,
    userRoleId: String = null
  ): AccountUserProfile = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserFilter != null) __obj.updateDynamic("advertiserFilter")(advertiserFilter)
    if (campaignFilter != null) __obj.updateDynamic("campaignFilter")(campaignFilter)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (email != null) __obj.updateDynamic("email")(email)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (name != null) __obj.updateDynamic("name")(name)
    if (siteFilter != null) __obj.updateDynamic("siteFilter")(siteFilter)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (traffickerType != null) __obj.updateDynamic("traffickerType")(traffickerType)
    if (userAccessType != null) __obj.updateDynamic("userAccessType")(userAccessType)
    if (userRoleFilter != null) __obj.updateDynamic("userRoleFilter")(userRoleFilter)
    if (userRoleId != null) __obj.updateDynamic("userRoleId")(userRoleId)
    __obj.asInstanceOf[AccountUserProfile]
  }
}

