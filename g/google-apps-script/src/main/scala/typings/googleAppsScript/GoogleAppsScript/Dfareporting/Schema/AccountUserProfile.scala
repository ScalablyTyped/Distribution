package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (advertiserFilter != null) __obj.updateDynamic("advertiserFilter")(advertiserFilter.asInstanceOf[js.Any])
    if (campaignFilter != null) __obj.updateDynamic("campaignFilter")(campaignFilter.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (siteFilter != null) __obj.updateDynamic("siteFilter")(siteFilter.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (traffickerType != null) __obj.updateDynamic("traffickerType")(traffickerType.asInstanceOf[js.Any])
    if (userAccessType != null) __obj.updateDynamic("userAccessType")(userAccessType.asInstanceOf[js.Any])
    if (userRoleFilter != null) __obj.updateDynamic("userRoleFilter")(userRoleFilter.asInstanceOf[js.Any])
    if (userRoleId != null) __obj.updateDynamic("userRoleId")(userRoleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountUserProfile]
  }
}

