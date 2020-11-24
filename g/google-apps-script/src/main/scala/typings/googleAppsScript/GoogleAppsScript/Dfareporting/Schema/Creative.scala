package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Creative extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var active: js.UndefOr[Boolean] = js.native
  
  var adParameters: js.UndefOr[String] = js.native
  
  var adTagKeys: js.UndefOr[js.Array[String]] = js.native
  
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.native
  
  var advertiserId: js.UndefOr[String] = js.native
  
  var allowScriptAccess: js.UndefOr[Boolean] = js.native
  
  var archived: js.UndefOr[Boolean] = js.native
  
  var artworkType: js.UndefOr[String] = js.native
  
  var authoringSource: js.UndefOr[String] = js.native
  
  var authoringTool: js.UndefOr[String] = js.native
  
  var autoAdvanceImages: js.UndefOr[Boolean] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var backupImageClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.native
  
  var backupImageFeatures: js.UndefOr[js.Array[String]] = js.native
  
  var backupImageReportingLabel: js.UndefOr[String] = js.native
  
  var backupImageTargetWindow: js.UndefOr[TargetWindow] = js.native
  
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.native
  
  var commercialId: js.UndefOr[String] = js.native
  
  var companionCreatives: js.UndefOr[js.Array[String]] = js.native
  
  var compatibility: js.UndefOr[js.Array[String]] = js.native
  
  var convertFlashToHtml5: js.UndefOr[Boolean] = js.native
  
  var counterCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  
  var creativeAssetSelection: js.UndefOr[CreativeAssetSelection] = js.native
  
  var creativeAssets: js.UndefOr[js.Array[CreativeAsset]] = js.native
  
  var creativeFieldAssignments: js.UndefOr[js.Array[CreativeFieldAssignment]] = js.native
  
  var customKeyValues: js.UndefOr[js.Array[String]] = js.native
  
  var dynamicAssetSelection: js.UndefOr[Boolean] = js.native
  
  var exitCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  
  var fsCommand: js.UndefOr[FsCommand] = js.native
  
  var htmlCode: js.UndefOr[String] = js.native
  
  var htmlCodeLocked: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.native
  
  var latestTraffickedCreativeId: js.UndefOr[String] = js.native
  
  var mediaDescription: js.UndefOr[String] = js.native
  
  var mediaDuration: js.UndefOr[Double] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var overrideCss: js.UndefOr[String] = js.native
  
  var progressOffset: js.UndefOr[VideoOffset] = js.native
  
  var redirectUrl: js.UndefOr[String] = js.native
  
  var renderingId: js.UndefOr[String] = js.native
  
  var renderingIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  
  var requiredFlashPluginVersion: js.UndefOr[String] = js.native
  
  var requiredFlashVersion: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Size] = js.native
  
  var skipOffset: js.UndefOr[VideoOffset] = js.native
  
  var skippable: js.UndefOr[Boolean] = js.native
  
  var sslCompliant: js.UndefOr[Boolean] = js.native
  
  var sslOverride: js.UndefOr[Boolean] = js.native
  
  var studioAdvertiserId: js.UndefOr[String] = js.native
  
  var studioCreativeId: js.UndefOr[String] = js.native
  
  var studioTraffickedCreativeId: js.UndefOr[String] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
  
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String] = js.native
  
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String] = js.native
  
  var thirdPartyUrls: js.UndefOr[js.Array[ThirdPartyTrackingUrl]] = js.native
  
  var timerCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.native
  
  var totalFileSize: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var universalAdId: js.UndefOr[UniversalAdId] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object Creative {
  
  @scala.inline
  def apply(): Creative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Creative]
  }
  
  @scala.inline
  implicit class CreativeOps[Self <: Creative] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAdParameters(value: String): Self = this.set("adParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdParameters: Self = this.set("adParameters", js.undefined)
    
    @scala.inline
    def setAdTagKeysVarargs(value: String*): Self = this.set("adTagKeys", js.Array(value :_*))
    
    @scala.inline
    def setAdTagKeys(value: js.Array[String]): Self = this.set("adTagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdTagKeys: Self = this.set("adTagKeys", js.undefined)
    
    @scala.inline
    def setAdditionalSizesVarargs(value: Size*): Self = this.set("additionalSizes", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalSizes(value: js.Array[Size]): Self = this.set("additionalSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalSizes: Self = this.set("additionalSizes", js.undefined)
    
    @scala.inline
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setAllowScriptAccess(value: Boolean): Self = this.set("allowScriptAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowScriptAccess: Self = this.set("allowScriptAccess", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setArtworkType(value: String): Self = this.set("artworkType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtworkType: Self = this.set("artworkType", js.undefined)
    
    @scala.inline
    def setAuthoringSource(value: String): Self = this.set("authoringSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoringSource: Self = this.set("authoringSource", js.undefined)
    
    @scala.inline
    def setAuthoringTool(value: String): Self = this.set("authoringTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthoringTool: Self = this.set("authoringTool", js.undefined)
    
    @scala.inline
    def setAutoAdvanceImages(value: Boolean): Self = this.set("autoAdvanceImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAdvanceImages: Self = this.set("autoAdvanceImages", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackupImageClickThroughUrl(value: CreativeClickThroughUrl): Self = this.set("backupImageClickThroughUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupImageClickThroughUrl: Self = this.set("backupImageClickThroughUrl", js.undefined)
    
    @scala.inline
    def setBackupImageFeaturesVarargs(value: String*): Self = this.set("backupImageFeatures", js.Array(value :_*))
    
    @scala.inline
    def setBackupImageFeatures(value: js.Array[String]): Self = this.set("backupImageFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupImageFeatures: Self = this.set("backupImageFeatures", js.undefined)
    
    @scala.inline
    def setBackupImageReportingLabel(value: String): Self = this.set("backupImageReportingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupImageReportingLabel: Self = this.set("backupImageReportingLabel", js.undefined)
    
    @scala.inline
    def setBackupImageTargetWindow(value: TargetWindow): Self = this.set("backupImageTargetWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupImageTargetWindow: Self = this.set("backupImageTargetWindow", js.undefined)
    
    @scala.inline
    def setClickTagsVarargs(value: ClickTag*): Self = this.set("clickTags", js.Array(value :_*))
    
    @scala.inline
    def setClickTags(value: js.Array[ClickTag]): Self = this.set("clickTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTags: Self = this.set("clickTags", js.undefined)
    
    @scala.inline
    def setCommercialId(value: String): Self = this.set("commercialId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommercialId: Self = this.set("commercialId", js.undefined)
    
    @scala.inline
    def setCompanionCreativesVarargs(value: String*): Self = this.set("companionCreatives", js.Array(value :_*))
    
    @scala.inline
    def setCompanionCreatives(value: js.Array[String]): Self = this.set("companionCreatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionCreatives: Self = this.set("companionCreatives", js.undefined)
    
    @scala.inline
    def setCompatibilityVarargs(value: String*): Self = this.set("compatibility", js.Array(value :_*))
    
    @scala.inline
    def setCompatibility(value: js.Array[String]): Self = this.set("compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("compatibility", js.undefined)
    
    @scala.inline
    def setConvertFlashToHtml5(value: Boolean): Self = this.set("convertFlashToHtml5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertFlashToHtml5: Self = this.set("convertFlashToHtml5", js.undefined)
    
    @scala.inline
    def setCounterCustomEventsVarargs(value: CreativeCustomEvent*): Self = this.set("counterCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setCounterCustomEvents(value: js.Array[CreativeCustomEvent]): Self = this.set("counterCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounterCustomEvents: Self = this.set("counterCustomEvents", js.undefined)
    
    @scala.inline
    def setCreativeAssetSelection(value: CreativeAssetSelection): Self = this.set("creativeAssetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeAssetSelection: Self = this.set("creativeAssetSelection", js.undefined)
    
    @scala.inline
    def setCreativeAssetsVarargs(value: CreativeAsset*): Self = this.set("creativeAssets", js.Array(value :_*))
    
    @scala.inline
    def setCreativeAssets(value: js.Array[CreativeAsset]): Self = this.set("creativeAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeAssets: Self = this.set("creativeAssets", js.undefined)
    
    @scala.inline
    def setCreativeFieldAssignmentsVarargs(value: CreativeFieldAssignment*): Self = this.set("creativeFieldAssignments", js.Array(value :_*))
    
    @scala.inline
    def setCreativeFieldAssignments(value: js.Array[CreativeFieldAssignment]): Self = this.set("creativeFieldAssignments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeFieldAssignments: Self = this.set("creativeFieldAssignments", js.undefined)
    
    @scala.inline
    def setCustomKeyValuesVarargs(value: String*): Self = this.set("customKeyValues", js.Array(value :_*))
    
    @scala.inline
    def setCustomKeyValues(value: js.Array[String]): Self = this.set("customKeyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomKeyValues: Self = this.set("customKeyValues", js.undefined)
    
    @scala.inline
    def setDynamicAssetSelection(value: Boolean): Self = this.set("dynamicAssetSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicAssetSelection: Self = this.set("dynamicAssetSelection", js.undefined)
    
    @scala.inline
    def setExitCustomEventsVarargs(value: CreativeCustomEvent*): Self = this.set("exitCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setExitCustomEvents(value: js.Array[CreativeCustomEvent]): Self = this.set("exitCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExitCustomEvents: Self = this.set("exitCustomEvents", js.undefined)
    
    @scala.inline
    def setFsCommand(value: FsCommand): Self = this.set("fsCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFsCommand: Self = this.set("fsCommand", js.undefined)
    
    @scala.inline
    def setHtmlCode(value: String): Self = this.set("htmlCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlCode: Self = this.set("htmlCode", js.undefined)
    
    @scala.inline
    def setHtmlCodeLocked(value: Boolean): Self = this.set("htmlCodeLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlCodeLocked: Self = this.set("htmlCodeLocked", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastModifiedInfo(value: LastModifiedInfo): Self = this.set("lastModifiedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedInfo: Self = this.set("lastModifiedInfo", js.undefined)
    
    @scala.inline
    def setLatestTraffickedCreativeId(value: String): Self = this.set("latestTraffickedCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestTraffickedCreativeId: Self = this.set("latestTraffickedCreativeId", js.undefined)
    
    @scala.inline
    def setMediaDescription(value: String): Self = this.set("mediaDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaDescription: Self = this.set("mediaDescription", js.undefined)
    
    @scala.inline
    def setMediaDuration(value: Double): Self = this.set("mediaDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaDuration: Self = this.set("mediaDuration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverrideCss(value: String): Self = this.set("overrideCss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideCss: Self = this.set("overrideCss", js.undefined)
    
    @scala.inline
    def setProgressOffset(value: VideoOffset): Self = this.set("progressOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressOffset: Self = this.set("progressOffset", js.undefined)
    
    @scala.inline
    def setRedirectUrl(value: String): Self = this.set("redirectUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectUrl: Self = this.set("redirectUrl", js.undefined)
    
    @scala.inline
    def setRenderingId(value: String): Self = this.set("renderingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingId: Self = this.set("renderingId", js.undefined)
    
    @scala.inline
    def setRenderingIdDimensionValue(value: DimensionValue): Self = this.set("renderingIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderingIdDimensionValue: Self = this.set("renderingIdDimensionValue", js.undefined)
    
    @scala.inline
    def setRequiredFlashPluginVersion(value: String): Self = this.set("requiredFlashPluginVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFlashPluginVersion: Self = this.set("requiredFlashPluginVersion", js.undefined)
    
    @scala.inline
    def setRequiredFlashVersion(value: Double): Self = this.set("requiredFlashVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredFlashVersion: Self = this.set("requiredFlashVersion", js.undefined)
    
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: VideoOffset): Self = this.set("skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOffset: Self = this.set("skipOffset", js.undefined)
    
    @scala.inline
    def setSkippable(value: Boolean): Self = this.set("skippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippable: Self = this.set("skippable", js.undefined)
    
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    
    @scala.inline
    def setSslOverride(value: Boolean): Self = this.set("sslOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslOverride: Self = this.set("sslOverride", js.undefined)
    
    @scala.inline
    def setStudioAdvertiserId(value: String): Self = this.set("studioAdvertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudioAdvertiserId: Self = this.set("studioAdvertiserId", js.undefined)
    
    @scala.inline
    def setStudioCreativeId(value: String): Self = this.set("studioCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudioCreativeId: Self = this.set("studioCreativeId", js.undefined)
    
    @scala.inline
    def setStudioTraffickedCreativeId(value: String): Self = this.set("studioTraffickedCreativeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudioTraffickedCreativeId: Self = this.set("studioTraffickedCreativeId", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setThirdPartyBackupImageImpressionsUrl(value: String): Self = this.set("thirdPartyBackupImageImpressionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyBackupImageImpressionsUrl: Self = this.set("thirdPartyBackupImageImpressionsUrl", js.undefined)
    
    @scala.inline
    def setThirdPartyRichMediaImpressionsUrl(value: String): Self = this.set("thirdPartyRichMediaImpressionsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyRichMediaImpressionsUrl: Self = this.set("thirdPartyRichMediaImpressionsUrl", js.undefined)
    
    @scala.inline
    def setThirdPartyUrlsVarargs(value: ThirdPartyTrackingUrl*): Self = this.set("thirdPartyUrls", js.Array(value :_*))
    
    @scala.inline
    def setThirdPartyUrls(value: js.Array[ThirdPartyTrackingUrl]): Self = this.set("thirdPartyUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThirdPartyUrls: Self = this.set("thirdPartyUrls", js.undefined)
    
    @scala.inline
    def setTimerCustomEventsVarargs(value: CreativeCustomEvent*): Self = this.set("timerCustomEvents", js.Array(value :_*))
    
    @scala.inline
    def setTimerCustomEvents(value: js.Array[CreativeCustomEvent]): Self = this.set("timerCustomEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimerCustomEvents: Self = this.set("timerCustomEvents", js.undefined)
    
    @scala.inline
    def setTotalFileSize(value: String): Self = this.set("totalFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalFileSize: Self = this.set("totalFileSize", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUniversalAdId(value: UniversalAdId): Self = this.set("universalAdId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniversalAdId: Self = this.set("universalAdId", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
