package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetingTemplate extends js.Object {
  /** Account ID of this targeting template. This field, if left unset, will be auto-generated on insert and is read-only after insert. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this targeting template. This is a required field on insert and is read-only after insert. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Time and day targeting criteria. */
  var dayPartTargeting: js.UndefOr[DayPartTargeting] = js.undefined
  /** Geographical targeting criteria. */
  var geoTargeting: js.UndefOr[GeoTargeting] = js.undefined
  /** ID of this targeting template. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Key-value targeting criteria. */
  var keyValueTargetingExpression: js.UndefOr[KeyValueTargetingExpression] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetingTemplate". */
  var kind: js.UndefOr[String] = js.undefined
  /** Language targeting criteria. */
  var languageTargeting: js.UndefOr[LanguageTargeting] = js.undefined
  /** Remarketing list targeting criteria. */
  var listTargetingExpression: js.UndefOr[ListTargetingExpression] = js.undefined
  /** Name of this targeting template. This field is required. It must be less than 256 characters long and unique within an advertiser. */
  var name: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this targeting template. This field, if left unset, will be auto-generated on insert and is read-only after insert. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Technology platform targeting criteria. */
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

