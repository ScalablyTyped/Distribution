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

