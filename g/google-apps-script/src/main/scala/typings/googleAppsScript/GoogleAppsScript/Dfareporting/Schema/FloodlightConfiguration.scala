package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightConfiguration extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var analyticsDataSharingEnabled: js.UndefOr[Boolean] = js.native
  
  var customViewabilityMetric: js.UndefOr[CustomViewabilityMetric] = js.native
  
  var exposureToConversionEnabled: js.UndefOr[Boolean] = js.native
  
  var firstDayOfWeek: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var inAppAttributionTrackingEnabled: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lookbackConfiguration: js.UndefOr[LookbackConfiguration] = js.native
  
  var naturalSearchConversionAttributionOption: js.UndefOr[String] = js.native
  
  var omnitureSettings: js.UndefOr[OmnitureSettings] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var tagSettings: js.UndefOr[TagSettings] = js.native
  
  var thirdPartyAuthenticationTokens: js.UndefOr[js.Array[ThirdPartyAuthenticationToken]] = js.native
  
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
    def setCustomViewabilityMetric(value: CustomViewabilityMetric): Self = this.set("customViewabilityMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomViewabilityMetric: Self = this.set("customViewabilityMetric", js.undefined)
    
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
