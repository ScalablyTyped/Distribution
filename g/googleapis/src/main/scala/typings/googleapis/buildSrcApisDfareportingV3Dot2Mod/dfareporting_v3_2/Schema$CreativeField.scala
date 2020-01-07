package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a creative field.
  */
@js.native
trait Schema$CreativeField extends js.Object {
  /**
    * Account ID of this creative field. This is a read-only field that can be
    * left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this creative field. This is a required field on
    * insertion.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the advertiser. This is a read-only,
    * auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * ID of this creative field. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeField&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this creative field. This is a required field and must be less
    * than 256 characters long and unique among creative fields of the same
    * advertiser.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this creative field. This is a read-only field that can
    * be left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
}

object Schema$CreativeField {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserId: String = null,
    advertiserIdDimensionValue: Schema$DimensionValue = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    subaccountId: String = null
  ): Schema$CreativeField = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeField]
  }
}

