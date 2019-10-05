package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

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

