package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeField extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeField {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    subaccountId: java.lang.String = null
  ): CreativeField = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[CreativeField]
  }
}

