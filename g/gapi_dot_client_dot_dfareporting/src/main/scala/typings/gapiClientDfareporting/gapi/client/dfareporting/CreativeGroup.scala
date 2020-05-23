package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeGroup extends js.Object {
  /** Account ID of this creative group. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this creative group. This is a required field on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Subgroup of the creative group. Assign your creative groups to a subgroup in order to filter or manage them more easily. This field is required on
    * insertion and is read-only after insertion. Acceptable values are 1 to 2, inclusive.
    */
  var groupNumber: js.UndefOr[Double] = js.undefined
  /** ID of this creative group. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeGroup". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of this creative group. This is a required field and must be less than 256 characters long and unique among creative groups of the same
    * advertiser.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this creative group. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
}

object CreativeGroup {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    groupNumber: js.UndefOr[Double] = js.undefined,
    id: String = null,
    kind: String = null,
    name: String = null,
    subaccountId: String = null
  ): CreativeGroup = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(groupNumber)) __obj.updateDynamic("groupNumber")(groupNumber.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeGroup]
  }
}

