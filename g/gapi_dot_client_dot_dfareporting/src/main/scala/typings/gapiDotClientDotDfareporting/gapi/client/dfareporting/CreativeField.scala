package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeField extends js.Object {
  /** Account ID of this creative field. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Advertiser ID of this creative field. This is a required field on insertion. */
  var advertiserId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** ID of this creative field. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeField". */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * Name of this creative field. This is a required field and must be less than 256 characters long and unique among creative fields of the same
    * advertiser.
    */
  var name: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this creative field. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
}

object CreativeField {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    subaccountId: String = null
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

