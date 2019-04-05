package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserProfile extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var advertiserFilter: js.UndefOr[ObjectFilter] = js.undefined
  var campaignFilter: js.UndefOr[ObjectFilter] = js.undefined
  var comments: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var siteFilter: js.UndefOr[ObjectFilter] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var traffickerType: js.UndefOr[java.lang.String] = js.undefined
  var userAccessType: js.UndefOr[java.lang.String] = js.undefined
  var userRoleFilter: js.UndefOr[ObjectFilter] = js.undefined
  var userRoleId: js.UndefOr[java.lang.String] = js.undefined
}

object AccountUserProfile {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    advertiserFilter: ObjectFilter = null,
    campaignFilter: ObjectFilter = null,
    comments: java.lang.String = null,
    email: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    locale: java.lang.String = null,
    name: java.lang.String = null,
    siteFilter: ObjectFilter = null,
    subaccountId: java.lang.String = null,
    traffickerType: java.lang.String = null,
    userAccessType: java.lang.String = null,
    userRoleFilter: ObjectFilter = null,
    userRoleId: java.lang.String = null
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

