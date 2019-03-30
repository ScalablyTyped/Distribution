package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplate extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  var listTargetingExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
}

object TargetingTemplate {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    dayPartTargeting: DayPartTargeting = null,
    geoTargeting: GeoTargeting = null,
    id: java.lang.String = null,
    keyValueTargetingExpression: KeyValueTargetingExpression = null,
    kind: java.lang.String = null,
    languageTargeting: LanguageTargeting = null,
    listTargetingExpression: ListTargetingExpression = null,
    name: java.lang.String = null,
    subaccountId: java.lang.String = null,
    technologyTargeting: TechnologyTargeting = null
  ): TargetingTemplate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (dayPartTargeting != null) __obj.updateDynamic("dayPartTargeting")(dayPartTargeting)
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting)
    if (id != null) __obj.updateDynamic("id")(id)
    if (keyValueTargetingExpression != null) __obj.updateDynamic("keyValueTargetingExpression")(keyValueTargetingExpression)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (languageTargeting != null) __obj.updateDynamic("languageTargeting")(languageTargeting)
    if (listTargetingExpression != null) __obj.updateDynamic("listTargetingExpression")(listTargetingExpression)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting)
    __obj.asInstanceOf[TargetingTemplate]
  }
}

