package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplate extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  var listTargetingExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var technologyTargeting: js.UndefOr[TechnologyTargeting] = js.undefined
}

object TargetingTemplate {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    dayPartTargeting: DayPartTargeting = null,
    geoTargeting: GeoTargeting = null,
    id: String = null,
    keyValueTargetingExpression: KeyValueTargetingExpression = null,
    kind: String = null,
    languageTargeting: LanguageTargeting = null,
    listTargetingExpression: ListTargetingExpression = null,
    name: String = null,
    subaccountId: String = null,
    technologyTargeting: TechnologyTargeting = null
  ): TargetingTemplate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (dayPartTargeting != null) __obj.updateDynamic("dayPartTargeting")(dayPartTargeting.asInstanceOf[js.Any])
    if (geoTargeting != null) __obj.updateDynamic("geoTargeting")(geoTargeting.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (keyValueTargetingExpression != null) __obj.updateDynamic("keyValueTargetingExpression")(keyValueTargetingExpression.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (languageTargeting != null) __obj.updateDynamic("languageTargeting")(languageTargeting.asInstanceOf[js.Any])
    if (listTargetingExpression != null) __obj.updateDynamic("listTargetingExpression")(listTargetingExpression.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (technologyTargeting != null) __obj.updateDynamic("technologyTargeting")(technologyTargeting.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetingTemplate]
  }
}

