package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingList extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lifeSpan: js.UndefOr[String] = js.undefined
  var listSize: js.UndefOr[String] = js.undefined
  var listSource: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
}

object TargetableRemarketingList {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    lifeSpan: String = null,
    listSize: String = null,
    listSource: String = null,
    name: String = null,
    subaccountId: String = null
  ): TargetableRemarketingList = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lifeSpan != null) __obj.updateDynamic("lifeSpan")(lifeSpan)
    if (listSize != null) __obj.updateDynamic("listSize")(listSize)
    if (listSource != null) __obj.updateDynamic("listSource")(listSource)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[TargetableRemarketingList]
  }
}

