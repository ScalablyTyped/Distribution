package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfiguration extends js.Object {
  /** Account ID of this floodlight configuration. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of the parent advertiser of this floodlight configuration. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether advertiser data is shared with Google Analytics. */
  var analyticsDataSharingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the exposure-to-conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen
    * by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Day that will be counted as the first day of the week in reports. This is a required field. */
  var firstDayOfWeek: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this floodlight configuration. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this floodlight configuration. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Whether in-app attribution tracking is enabled. */
  var inAppAttributionTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightConfiguration". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Lookback window settings for this floodlight configuration. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  /** Types of attribution options for natural search conversions. */
  var naturalSearchConversionAttributionOption: js.UndefOr[java.lang.String] = js.undefined
  /** Settings for DCM Omniture integration. */
  var omnitureSettings: js.UndefOr[OmnitureSettings] = js.undefined
  /** Subaccount ID of this floodlight configuration. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration settings for dynamic and image floodlight tags. */
  var tagSettings: js.UndefOr[TagSettings] = js.undefined
  /** List of third-party authentication tokens enabled for this configuration. */
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[ThirdPartyAuthenticationToken]] = js.undefined
  /** List of user defined variables enabled for this configuration. */
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[UserDefinedVariableConfiguration]] = js.undefined
}

object FloodlightConfiguration {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    analyticsDataSharingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    exposureToConversionEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    firstDayOfWeek: java.lang.String = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    inAppAttributionTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    lookbackConfiguration: LookbackConfiguration = null,
    naturalSearchConversionAttributionOption: java.lang.String = null,
    omnitureSettings: OmnitureSettings = null,
    subaccountId: java.lang.String = null,
    tagSettings: TagSettings = null,
    thirdPartyAuthenticationTokens: js.Array[ThirdPartyAuthenticationToken] = null,
    userDefinedVariableConfigurations: js.Array[UserDefinedVariableConfiguration] = null
  ): FloodlightConfiguration = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (!js.isUndefined(analyticsDataSharingEnabled)) __obj.updateDynamic("analyticsDataSharingEnabled")(analyticsDataSharingEnabled)
    if (!js.isUndefined(exposureToConversionEnabled)) __obj.updateDynamic("exposureToConversionEnabled")(exposureToConversionEnabled)
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (!js.isUndefined(inAppAttributionTrackingEnabled)) __obj.updateDynamic("inAppAttributionTrackingEnabled")(inAppAttributionTrackingEnabled)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lookbackConfiguration != null) __obj.updateDynamic("lookbackConfiguration")(lookbackConfiguration)
    if (naturalSearchConversionAttributionOption != null) __obj.updateDynamic("naturalSearchConversionAttributionOption")(naturalSearchConversionAttributionOption)
    if (omnitureSettings != null) __obj.updateDynamic("omnitureSettings")(omnitureSettings)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (tagSettings != null) __obj.updateDynamic("tagSettings")(tagSettings)
    if (thirdPartyAuthenticationTokens != null) __obj.updateDynamic("thirdPartyAuthenticationTokens")(thirdPartyAuthenticationTokens)
    if (userDefinedVariableConfigurations != null) __obj.updateDynamic("userDefinedVariableConfigurations")(userDefinedVariableConfigurations)
    __obj.asInstanceOf[FloodlightConfiguration]
  }
}

