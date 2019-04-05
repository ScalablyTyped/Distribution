package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightConfiguration extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var analyticsDataSharingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var customViewabilityMetric: js.UndefOr[CustomViewabilityMetric] = js.undefined
  var exposureToConversionEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var firstDayOfWeek: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var inAppAttributionTrackingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.undefined
  var naturalSearchConversionAttributionOption: js.UndefOr[java.lang.String] = js.undefined
  var omnitureSettings: js.UndefOr[OmnitureSettings] = js.undefined
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  var tagSettings: js.UndefOr[TagSettings] = js.undefined
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[ThirdPartyAuthenticationToken]] = js.undefined
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[UserDefinedVariableConfiguration]] = js.undefined
}

object FloodlightConfiguration {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    analyticsDataSharingEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    customViewabilityMetric: CustomViewabilityMetric = null,
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
    if (customViewabilityMetric != null) __obj.updateDynamic("customViewabilityMetric")(customViewabilityMetric)
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

