package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingList extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lifeSpan: js.UndefOr[java.lang.String] = js.undefined
  var listPopulationRule: js.UndefOr[ListPopulationRule] = js.undefined
  var listSize: js.UndefOr[java.lang.String] = js.undefined
  var listSource: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

object RemarketingList {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lifeSpan: java.lang.String = null,
    listPopulationRule: ListPopulationRule = null,
    listSize: java.lang.String = null,
    listSource: java.lang.String = null,
    name: java.lang.String = null,
    subaccountId: java.lang.String = null
  ): RemarketingList = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lifeSpan != null) __obj.updateDynamic("lifeSpan")(lifeSpan)
    if (listPopulationRule != null) __obj.updateDynamic("listPopulationRule")(listPopulationRule)
    if (listSize != null) __obj.updateDynamic("listSize")(listSize)
    if (listSource != null) __obj.updateDynamic("listSource")(listSource)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[RemarketingList]
  }
}

