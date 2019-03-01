package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Campaign extends js.Object {
  /** Account ID of this campaign. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Ad blocking settings for this campaign. */
  var adBlockingConfiguration: js.UndefOr[AdBlockingConfiguration] = js.undefined
  /** Additional creative optimization configurations for the campaign. */
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[CreativeOptimizationConfiguration]] = js.undefined
  /** Advertiser group ID of the associated advertiser. */
  var advertiserGroupId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this campaign. This is a required field. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the advertiser ID of this campaign. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether this campaign has been archived. */
  var archived: js.UndefOr[scala.Boolean] = js.undefined
  /** Audience segment groups assigned to this campaign. Cannot have more than 300 segment groups. */
  var audienceSegmentGroups: js.UndefOr[js.Array[AudienceSegmentGroup]] = js.undefined
  /** Billing invoice code included in the DCM client billing invoices associated with the campaign. */
  var billingInvoiceCode: js.UndefOr[java.lang.String] = js.undefined
  /** Click-through URL suffix override properties for this campaign. */
  var clickThroughUrlSuffixProperties: js.UndefOr[ClickThroughUrlSuffixProperties] = js.undefined
  /** Arbitrary comments about this campaign. Must be less than 256 characters long. */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the creation of this campaign. This is a read-only field. */
  var createInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** List of creative group IDs that are assigned to the campaign. */
  var creativeGroupIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Creative optimization configuration for the campaign. */
  var creativeOptimizationConfiguration: js.UndefOr[CreativeOptimizationConfiguration] = js.undefined
  /** Click-through event tag ID override properties for this campaign. */
  var defaultClickThroughEventTagProperties: js.UndefOr[DefaultClickThroughEventTagProperties] = js.undefined
  /**
    * Date on which the campaign will stop running. On insert, the end date must be today or a future date. The end date must be later than or be the same as
    * the start date. If, for example, you set 6/25/2015 as both the start and end dates, the effective campaign run date is just that day only, 6/25/2015.
    * The hours, minutes, and seconds of the end date should not be set, as doing so will result in an error. This is a required field.
    */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Overrides that can be used to activate or deactivate advertiser event tags. */
  var eventTagOverrides: js.UndefOr[js.Array[EventTagOverride]] = js.undefined
  /** External ID for this campaign. */
  var externalId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this campaign. This is a read-only auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this campaign. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#campaign". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the most recent modification of this campaign. This is a read-only field. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Lookback window settings for the campaign. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  /** Name of this campaign. This is a required field and must be less than 256 characters long and unique among campaigns of the same advertiser. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Whether Nielsen reports are enabled for this campaign. */
  var nielsenOcrEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Date on which the campaign starts running. The start date can be any date. The hours, minutes, and seconds of the start date should not be set, as
    * doing so will result in an error. This is a required field.
    */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this campaign. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Campaign trafficker contact emails. */
  var traffickerEmails: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Campaign {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    adBlockingConfiguration: AdBlockingConfiguration = null,
    additionalCreativeOptimizationConfigurations: js.Array[CreativeOptimizationConfiguration] = null,
    advertiserGroupId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    archived: js.UndefOr[scala.Boolean] = js.undefined,
    audienceSegmentGroups: js.Array[AudienceSegmentGroup] = null,
    billingInvoiceCode: java.lang.String = null,
    clickThroughUrlSuffixProperties: ClickThroughUrlSuffixProperties = null,
    comment: java.lang.String = null,
    createInfo: LastModifiedInfo = null,
    creativeGroupIds: js.Array[java.lang.String] = null,
    creativeOptimizationConfiguration: CreativeOptimizationConfiguration = null,
    defaultClickThroughEventTagProperties: DefaultClickThroughEventTagProperties = null,
    endDate: java.lang.String = null,
    eventTagOverrides: js.Array[EventTagOverride] = null,
    externalId: java.lang.String = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    lookbackConfiguration: LookbackConfiguration = null,
    name: java.lang.String = null,
    nielsenOcrEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    startDate: java.lang.String = null,
    subaccountId: java.lang.String = null,
    traffickerEmails: js.Array[java.lang.String] = null
  ): Campaign = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (adBlockingConfiguration != null) __obj.updateDynamic("adBlockingConfiguration")(adBlockingConfiguration)
    if (additionalCreativeOptimizationConfigurations != null) __obj.updateDynamic("additionalCreativeOptimizationConfigurations")(additionalCreativeOptimizationConfigurations)
    if (advertiserGroupId != null) __obj.updateDynamic("advertiserGroupId")(advertiserGroupId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived)
    if (audienceSegmentGroups != null) __obj.updateDynamic("audienceSegmentGroups")(audienceSegmentGroups)
    if (billingInvoiceCode != null) __obj.updateDynamic("billingInvoiceCode")(billingInvoiceCode)
    if (clickThroughUrlSuffixProperties != null) __obj.updateDynamic("clickThroughUrlSuffixProperties")(clickThroughUrlSuffixProperties)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (createInfo != null) __obj.updateDynamic("createInfo")(createInfo)
    if (creativeGroupIds != null) __obj.updateDynamic("creativeGroupIds")(creativeGroupIds)
    if (creativeOptimizationConfiguration != null) __obj.updateDynamic("creativeOptimizationConfiguration")(creativeOptimizationConfiguration)
    if (defaultClickThroughEventTagProperties != null) __obj.updateDynamic("defaultClickThroughEventTagProperties")(defaultClickThroughEventTagProperties)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (eventTagOverrides != null) __obj.updateDynamic("eventTagOverrides")(eventTagOverrides)
    if (externalId != null) __obj.updateDynamic("externalId")(externalId)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(nielsenOcrEnabled)) __obj.updateDynamic("nielsenOcrEnabled")(nielsenOcrEnabled)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (traffickerEmails != null) __obj.updateDynamic("traffickerEmails")(traffickerEmails)
    __obj.asInstanceOf[Campaign]
  }
}

