package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightConfiguration extends js.Object {
  /** Account ID of this floodlight configuration. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.native
  /** Advertiser ID of the parent advertiser of this floodlight configuration. */
  var advertiserId: js.UndefOr[String] = js.native
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  /** Whether advertiser data is shared with Google Analytics. */
  var analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the exposure-to-conversion report is enabled. This report shows detailed pathway information on up to 10 of the most recent ad exposures seen
    * by a user before converting.
    */
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  /** Day that will be counted as the first day of the week in reports. This is a required field. */
  var firstDayOfWeek: js.UndefOr[String] = js.native
  /** ID of this floodlight configuration. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Dimension value for the ID of this floodlight configuration. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  /** Whether in-app attribution tracking is enabled. */
  var inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightConfiguration". */
  var kind: js.UndefOr[String] = js.native
  /** Lookback window settings for this floodlight configuration. */
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  /** Types of attribution options for natural search conversions. */
  var naturalSearchConversionAttributionOption: js.UndefOr[String] = js.native
  /** Settings for DCM Omniture integration. */
  var omnitureSettings: js.UndefOr[OmnitureSettings] = js.native
  /** Subaccount ID of this floodlight configuration. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.native
  /** Configuration settings for dynamic and image floodlight tags. */
  var tagSettings: js.UndefOr[TagSettings] = js.native
  /** List of third-party authentication tokens enabled for this configuration. */
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[ThirdPartyAuthenticationToken]] = js.native
  /** List of user defined variables enabled for this configuration. */
  var userDefinedVariableConfigurations: js.UndefOr[js.Array[UserDefinedVariableConfiguration]] = js.native
}

object FloodlightConfiguration {
  @scala.inline
  def apply(): FloodlightConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightConfiguration]
  }
  @scala.inline
  implicit class FloodlightConfigurationOps[Self <: FloodlightConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    @scala.inline
    def setAdvertiserIdDimensionValue(value: DimensionValue): Self = this.set("advertiserIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertiserIdDimensionValue: Self = this.set("advertiserIdDimensionValue", js.undefined)
    @scala.inline
    def setAnalyticsDataSharingEnabled(value: Boolean): Self = this.set("analyticsDataSharingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsDataSharingEnabled: Self = this.set("analyticsDataSharingEnabled", js.undefined)
    @scala.inline
    def setExposureToConversionEnabled(value: Boolean): Self = this.set("exposureToConversionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExposureToConversionEnabled: Self = this.set("exposureToConversionEnabled", js.undefined)
    @scala.inline
    def setFirstDayOfWeek(value: String): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstDayOfWeek: Self = this.set("firstDayOfWeek", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setInAppAttributionTrackingEnabled(value: Boolean): Self = this.set("inAppAttributionTrackingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInAppAttributionTrackingEnabled: Self = this.set("inAppAttributionTrackingEnabled", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLookbackConfiguration(value: LookbackConfiguration): Self = this.set("lookbackConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLookbackConfiguration: Self = this.set("lookbackConfiguration", js.undefined)
    @scala.inline
    def setNaturalSearchConversionAttributionOption(value: String): Self = this.set("naturalSearchConversionAttributionOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaturalSearchConversionAttributionOption: Self = this.set("naturalSearchConversionAttributionOption", js.undefined)
    @scala.inline
    def setOmnitureSettings(value: OmnitureSettings): Self = this.set("omnitureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOmnitureSettings: Self = this.set("omnitureSettings", js.undefined)
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    @scala.inline
    def setTagSettings(value: TagSettings): Self = this.set("tagSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSettings: Self = this.set("tagSettings", js.undefined)
    @scala.inline
    def setThirdPartyAuthenticationTokensVarargs(value: ThirdPartyAuthenticationToken*): Self = this.set("thirdPartyAuthenticationTokens", js.Array(value :_*))
    @scala.inline
    def setThirdPartyAuthenticationTokens(value: js.Array[ThirdPartyAuthenticationToken]): Self = this.set("thirdPartyAuthenticationTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThirdPartyAuthenticationTokens: Self = this.set("thirdPartyAuthenticationTokens", js.undefined)
    @scala.inline
    def setUserDefinedVariableConfigurationsVarargs(value: UserDefinedVariableConfiguration*): Self = this.set("userDefinedVariableConfigurations", js.Array(value :_*))
    @scala.inline
    def setUserDefinedVariableConfigurations(value: js.Array[UserDefinedVariableConfiguration]): Self = this.set("userDefinedVariableConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserDefinedVariableConfigurations: Self = this.set("userDefinedVariableConfigurations", js.undefined)
  }
  
}

