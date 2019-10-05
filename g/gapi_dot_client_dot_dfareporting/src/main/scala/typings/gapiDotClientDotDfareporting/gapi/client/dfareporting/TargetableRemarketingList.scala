package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

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

