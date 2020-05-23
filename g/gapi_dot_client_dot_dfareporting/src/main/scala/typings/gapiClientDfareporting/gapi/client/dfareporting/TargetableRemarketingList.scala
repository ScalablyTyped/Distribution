package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetableRemarketingList extends js.Object {
  /** Account ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Whether this targetable remarketing list is active. */
  var active: js.UndefOr[Boolean] = js.undefined
  /** Dimension value for the advertiser ID that owns this targetable remarketing list. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Targetable remarketing list description. */
  var description: js.UndefOr[String] = js.undefined
  /** Targetable remarketing list ID. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#targetableRemarketingList". */
  var kind: js.UndefOr[String] = js.undefined
  /** Number of days that a user should remain in the targetable remarketing list without an impression. */
  var lifeSpan: js.UndefOr[String] = js.undefined
  /** Number of users currently in the list. This is a read-only field. */
  var listSize: js.UndefOr[String] = js.undefined
  /** Product from which this targetable remarketing list was originated. */
  var listSource: js.UndefOr[String] = js.undefined
  /** Name of the targetable remarketing list. Is no greater than 128 characters long. */
  var name: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests. */
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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lifeSpan != null) __obj.updateDynamic("lifeSpan")(lifeSpan.asInstanceOf[js.Any])
    if (listSize != null) __obj.updateDynamic("listSize")(listSize.asInstanceOf[js.Any])
    if (listSource != null) __obj.updateDynamic("listSource")(listSource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetableRemarketingList]
  }
}

