package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a remarketing list. Remarketing enables you to
  * create lists of users who have performed specific actions on a site, then
  * target ads to members of those lists. This resource can be used to manage
  * remarketing lists that are owned by your advertisers. To see all
  * remarketing lists that are visible to your advertisers, including those
  * that are shared to your advertiser or account, use the
  * TargetableRemarketingLists resource.
  */
@js.native
trait Schema$RemarketingList extends js.Object {
  /**
    * Account ID of this remarketing list. This is a read-only, auto-generated
    * field that is only returned in GET requests.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Whether this remarketing list is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Dimension value for the advertiser ID that owns this remarketing list.
    * This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * Remarketing list description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Remarketing list ID. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#remarketingList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Number of days that a user should remain in the remarketing list without
    * an impression. Acceptable values are 1 to 540, inclusive.
    */
  var lifeSpan: js.UndefOr[String] = js.native
  /**
    * Rule used to populate the remarketing list with users.
    */
  var listPopulationRule: js.UndefOr[Schema$ListPopulationRule] = js.native
  /**
    * Number of users currently in the list. This is a read-only field.
    */
  var listSize: js.UndefOr[String] = js.native
  /**
    * Product from which this remarketing list was originated.
    */
  var listSource: js.UndefOr[String] = js.native
  /**
    * Name of the remarketing list. This is a required field. Must be no
    * greater than 128 characters long.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this remarketing list. This is a read-only,
    * auto-generated field that is only returned in GET requests.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object Schema$RemarketingList {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    advertiserId: String = null,
    advertiserIdDimensionValue: Schema$DimensionValue = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    lifeSpan: String = null,
    listPopulationRule: Schema$ListPopulationRule = null,
    listSize: String = null,
    listSource: String = null,
    name: String = null,
    subaccountId: String = null
  ): Schema$RemarketingList = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lifeSpan != null) __obj.updateDynamic("lifeSpan")(lifeSpan.asInstanceOf[js.Any])
    if (listPopulationRule != null) __obj.updateDynamic("listPopulationRule")(listPopulationRule.asInstanceOf[js.Any])
    if (listSize != null) __obj.updateDynamic("listSize")(listSize.asInstanceOf[js.Any])
    if (listSource != null) __obj.updateDynamic("listSource")(listSource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RemarketingList]
  }
}

