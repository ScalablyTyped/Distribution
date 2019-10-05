package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertiser extends js.Object {
  /** Account ID of this advertiser.This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.undefined
  /**
    * ID of the advertiser group this advertiser belongs to. You can group advertisers for reporting purposes, allowing you to see aggregated information for
    * all advertisers in each group.
    */
  var advertiserGroupId: js.UndefOr[String] = js.undefined
  /** Suffix added to click-through URL of ad creative associations under this advertiser. Must be less than 129 characters long. */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.undefined
  /** ID of the click-through event tag to apply by default to the landing pages of this advertiser's campaigns. */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.undefined
  /** Default email address used in sender field for tag emails. */
  var defaultEmail: js.UndefOr[String] = js.undefined
  /**
    * Floodlight configuration ID of this advertiser. The floodlight configuration ID will be created automatically, so on insert this field should be left
    * blank. This field can be set to another advertiser's floodlight configuration ID in order to share that advertiser's floodlight configuration with this
    * advertiser, so long as:
    * - This advertiser's original floodlight configuration is not already associated with floodlight activities or floodlight activity groups.
    * - This advertiser's original floodlight configuration is not already shared with another advertiser.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated field. */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** ID of this advertiser. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of this advertiser. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#advertiser". */
  var kind: js.UndefOr[String] = js.undefined
  /** Name of this advertiser. This is a required field and must be less than 256 characters long and unique among advertisers of the same account. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Original floodlight configuration before any sharing occurred. Set the floodlightConfigurationId of this advertiser to
    * originalFloodlightConfigurationId to unshare the advertiser's current floodlight configuration. You cannot unshare an advertiser's floodlight
    * configuration if the shared configuration has activities associated with any campaign or placement.
    */
  var originalFloodlightConfigurationId: js.UndefOr[String] = js.undefined
  /** Status of this advertiser. */
  var status: js.UndefOr[String] = js.undefined
  /** Subaccount ID of this advertiser.This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.undefined
  /** Suspension status of this advertiser. */
  var suspended: js.UndefOr[Boolean] = js.undefined
}

object Advertiser {
  @scala.inline
  def apply(
    accountId: String = null,
    advertiserGroupId: String = null,
    clickThroughUrlSuffix: String = null,
    defaultClickThroughEventTagId: String = null,
    defaultEmail: String = null,
    floodlightConfigurationId: String = null,
    floodlightConfigurationIdDimensionValue: DimensionValue = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    kind: String = null,
    name: String = null,
    originalFloodlightConfigurationId: String = null,
    status: String = null,
    subaccountId: String = null,
    suspended: js.UndefOr[Boolean] = js.undefined
  ): Advertiser = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId)
    if (clickThroughUrlSuffix != null) __obj.updateDynamic("clickThroughUrlSuffix")(clickThroughUrlSuffix)
    if (defaultClickThroughEventTagId != null) __obj.updateDynamic("defaultClickThroughEventTagId")(defaultClickThroughEventTagId)
    if (defaultEmail != null) __obj.updateDynamic("defaultEmail")(defaultEmail)
    if (floodlightConfigurationId != null) __obj.updateDynamic("floodlightConfigurationId")(floodlightConfigurationId)
    if (floodlightConfigurationIdDimensionValue != null) __obj.updateDynamic("floodlightConfigurationIdDimensionValue")(floodlightConfigurationIdDimensionValue)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (originalFloodlightConfigurationId != null) __obj.updateDynamic("originalFloodlightConfigurationId")(originalFloodlightConfigurationId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (!js.isUndefined(suspended)) __obj.updateDynamic("suspended")(suspended)
    __obj.asInstanceOf[Advertiser]
  }
}

