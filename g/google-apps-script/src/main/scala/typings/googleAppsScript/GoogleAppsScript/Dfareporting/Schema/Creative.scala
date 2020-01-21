package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Creative extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var adParameters: js.UndefOr[String] = js.undefined
  var adTagKeys: js.UndefOr[js.Array[String]] = js.undefined
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var advertiserId: js.UndefOr[String] = js.undefined
  var allowScriptAccess: js.UndefOr[Boolean] = js.undefined
  var archived: js.UndefOr[Boolean] = js.undefined
  var artworkType: js.UndefOr[String] = js.undefined
  var authoringSource: js.UndefOr[String] = js.undefined
  var authoringTool: js.UndefOr[String] = js.undefined
  var autoAdvanceImages: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var backupImageClickThroughUrl: js.UndefOr[CreativeClickThroughUrl] = js.undefined
  var backupImageFeatures: js.UndefOr[js.Array[String]] = js.undefined
  var backupImageReportingLabel: js.UndefOr[String] = js.undefined
  var backupImageTargetWindow: js.UndefOr[TargetWindow] = js.undefined
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.undefined
  var commercialId: js.UndefOr[String] = js.undefined
  var companionCreatives: js.UndefOr[js.Array[String]] = js.undefined
  var compatibility: js.UndefOr[js.Array[String]] = js.undefined
  var convertFlashToHtml5: js.UndefOr[Boolean] = js.undefined
  var counterCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.undefined
  var creativeAssetSelection: js.UndefOr[CreativeAssetSelection] = js.undefined
  var creativeAssets: js.UndefOr[js.Array[CreativeAsset]] = js.undefined
  var creativeFieldAssignments: js.UndefOr[js.Array[CreativeFieldAssignment]] = js.undefined
  var customKeyValues: js.UndefOr[js.Array[String]] = js.undefined
  var dynamicAssetSelection: js.UndefOr[Boolean] = js.undefined
  var exitCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.undefined
  var fsCommand: js.UndefOr[FsCommand] = js.undefined
  var htmlCode: js.UndefOr[String] = js.undefined
  var htmlCodeLocked: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  var latestTraffickedCreativeId: js.UndefOr[String] = js.undefined
  var mediaDescription: js.UndefOr[String] = js.undefined
  var mediaDuration: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var overrideCss: js.UndefOr[String] = js.undefined
  var progressOffset: js.UndefOr[VideoOffset] = js.undefined
  var redirectUrl: js.UndefOr[String] = js.undefined
  var renderingId: js.UndefOr[String] = js.undefined
  var renderingIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var requiredFlashPluginVersion: js.UndefOr[String] = js.undefined
  var requiredFlashVersion: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var skipOffset: js.UndefOr[VideoOffset] = js.undefined
  var skippable: js.UndefOr[Boolean] = js.undefined
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  var sslOverride: js.UndefOr[Boolean] = js.undefined
  var studioAdvertiserId: js.UndefOr[String] = js.undefined
  var studioCreativeId: js.UndefOr[String] = js.undefined
  var studioTraffickedCreativeId: js.UndefOr[String] = js.undefined
  var subaccountId: js.UndefOr[String] = js.undefined
  var thirdPartyBackupImageImpressionsUrl: js.UndefOr[String] = js.undefined
  var thirdPartyRichMediaImpressionsUrl: js.UndefOr[String] = js.undefined
  var thirdPartyUrls: js.UndefOr[js.Array[ThirdPartyTrackingUrl]] = js.undefined
  var timerCustomEvents: js.UndefOr[js.Array[CreativeCustomEvent]] = js.undefined
  var totalFileSize: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var universalAdId: js.UndefOr[UniversalAdId] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Creative {
  @scala.inline
  def apply(
    accountId: String = null,
    active: js.UndefOr[Boolean] = js.undefined,
    adParameters: String = null,
    adTagKeys: js.Array[String] = null,
    additionalSizes: js.Array[Size] = null,
    advertiserId: String = null,
    allowScriptAccess: js.UndefOr[Boolean] = js.undefined,
    archived: js.UndefOr[Boolean] = js.undefined,
    artworkType: String = null,
    authoringSource: String = null,
    authoringTool: String = null,
    autoAdvanceImages: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    backupImageClickThroughUrl: CreativeClickThroughUrl = null,
    backupImageFeatures: js.Array[String] = null,
    backupImageReportingLabel: String = null,
    backupImageTargetWindow: TargetWindow = null,
    clickTags: js.Array[ClickTag] = null,
    commercialId: String = null,
    companionCreatives: js.Array[String] = null,
    compatibility: js.Array[String] = null,
    convertFlashToHtml5: js.UndefOr[Boolean] = js.undefined,
    counterCustomEvents: js.Array[CreativeCustomEvent] = null,
    creativeAssetSelection: CreativeAssetSelection = null,
    creativeAssets: js.Array[CreativeAsset] = null,
    creativeFieldAssignments: js.Array[CreativeFieldAssignment] = null,
    customKeyValues: js.Array[String] = null,
    dynamicAssetSelection: js.UndefOr[Boolean] = js.undefined,
    exitCustomEvents: js.Array[CreativeCustomEvent] = null,
    fsCommand: FsCommand = null,
    htmlCode: String = null,
    htmlCodeLocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    kind: String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    latestTraffickedCreativeId: String = null,
    mediaDescription: String = null,
    mediaDuration: Int | Double = null,
    name: String = null,
    overrideCss: String = null,
    progressOffset: VideoOffset = null,
    redirectUrl: String = null,
    renderingId: String = null,
    renderingIdDimensionValue: DimensionValue = null,
    requiredFlashPluginVersion: String = null,
    requiredFlashVersion: Int | Double = null,
    size: Size = null,
    skipOffset: VideoOffset = null,
    skippable: js.UndefOr[Boolean] = js.undefined,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    sslOverride: js.UndefOr[Boolean] = js.undefined,
    studioAdvertiserId: String = null,
    studioCreativeId: String = null,
    studioTraffickedCreativeId: String = null,
    subaccountId: String = null,
    thirdPartyBackupImageImpressionsUrl: String = null,
    thirdPartyRichMediaImpressionsUrl: String = null,
    thirdPartyUrls: js.Array[ThirdPartyTrackingUrl] = null,
    timerCustomEvents: js.Array[CreativeCustomEvent] = null,
    totalFileSize: String = null,
    `type`: String = null,
    universalAdId: UniversalAdId = null,
    version: Int | Double = null
  ): Creative = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (adParameters != null) __obj.updateDynamic("adParameters")(adParameters.asInstanceOf[js.Any])
    if (adTagKeys != null) __obj.updateDynamic("adTagKeys")(adTagKeys.asInstanceOf[js.Any])
    if (additionalSizes != null) __obj.updateDynamic("additionalSizes")(additionalSizes.asInstanceOf[js.Any])
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId.asInstanceOf[js.Any])
    if (!js.isUndefined(allowScriptAccess)) __obj.updateDynamic("allowScriptAccess")(allowScriptAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(archived)) __obj.updateDynamic("archived")(archived.asInstanceOf[js.Any])
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType.asInstanceOf[js.Any])
    if (authoringSource != null) __obj.updateDynamic("authoringSource")(authoringSource.asInstanceOf[js.Any])
    if (authoringTool != null) __obj.updateDynamic("authoringTool")(authoringTool.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdvanceImages)) __obj.updateDynamic("autoAdvanceImages")(autoAdvanceImages.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backupImageClickThroughUrl != null) __obj.updateDynamic("backupImageClickThroughUrl")(backupImageClickThroughUrl.asInstanceOf[js.Any])
    if (backupImageFeatures != null) __obj.updateDynamic("backupImageFeatures")(backupImageFeatures.asInstanceOf[js.Any])
    if (backupImageReportingLabel != null) __obj.updateDynamic("backupImageReportingLabel")(backupImageReportingLabel.asInstanceOf[js.Any])
    if (backupImageTargetWindow != null) __obj.updateDynamic("backupImageTargetWindow")(backupImageTargetWindow.asInstanceOf[js.Any])
    if (clickTags != null) __obj.updateDynamic("clickTags")(clickTags.asInstanceOf[js.Any])
    if (commercialId != null) __obj.updateDynamic("commercialId")(commercialId.asInstanceOf[js.Any])
    if (companionCreatives != null) __obj.updateDynamic("companionCreatives")(companionCreatives.asInstanceOf[js.Any])
    if (compatibility != null) __obj.updateDynamic("compatibility")(compatibility.asInstanceOf[js.Any])
    if (!js.isUndefined(convertFlashToHtml5)) __obj.updateDynamic("convertFlashToHtml5")(convertFlashToHtml5.asInstanceOf[js.Any])
    if (counterCustomEvents != null) __obj.updateDynamic("counterCustomEvents")(counterCustomEvents.asInstanceOf[js.Any])
    if (creativeAssetSelection != null) __obj.updateDynamic("creativeAssetSelection")(creativeAssetSelection.asInstanceOf[js.Any])
    if (creativeAssets != null) __obj.updateDynamic("creativeAssets")(creativeAssets.asInstanceOf[js.Any])
    if (creativeFieldAssignments != null) __obj.updateDynamic("creativeFieldAssignments")(creativeFieldAssignments.asInstanceOf[js.Any])
    if (customKeyValues != null) __obj.updateDynamic("customKeyValues")(customKeyValues.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicAssetSelection)) __obj.updateDynamic("dynamicAssetSelection")(dynamicAssetSelection.asInstanceOf[js.Any])
    if (exitCustomEvents != null) __obj.updateDynamic("exitCustomEvents")(exitCustomEvents.asInstanceOf[js.Any])
    if (fsCommand != null) __obj.updateDynamic("fsCommand")(fsCommand.asInstanceOf[js.Any])
    if (htmlCode != null) __obj.updateDynamic("htmlCode")(htmlCode.asInstanceOf[js.Any])
    if (!js.isUndefined(htmlCodeLocked)) __obj.updateDynamic("htmlCodeLocked")(htmlCodeLocked.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo.asInstanceOf[js.Any])
    if (latestTraffickedCreativeId != null) __obj.updateDynamic("latestTraffickedCreativeId")(latestTraffickedCreativeId.asInstanceOf[js.Any])
    if (mediaDescription != null) __obj.updateDynamic("mediaDescription")(mediaDescription.asInstanceOf[js.Any])
    if (mediaDuration != null) __obj.updateDynamic("mediaDuration")(mediaDuration.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrideCss != null) __obj.updateDynamic("overrideCss")(overrideCss.asInstanceOf[js.Any])
    if (progressOffset != null) __obj.updateDynamic("progressOffset")(progressOffset.asInstanceOf[js.Any])
    if (redirectUrl != null) __obj.updateDynamic("redirectUrl")(redirectUrl.asInstanceOf[js.Any])
    if (renderingId != null) __obj.updateDynamic("renderingId")(renderingId.asInstanceOf[js.Any])
    if (renderingIdDimensionValue != null) __obj.updateDynamic("renderingIdDimensionValue")(renderingIdDimensionValue.asInstanceOf[js.Any])
    if (requiredFlashPluginVersion != null) __obj.updateDynamic("requiredFlashPluginVersion")(requiredFlashPluginVersion.asInstanceOf[js.Any])
    if (requiredFlashVersion != null) __obj.updateDynamic("requiredFlashVersion")(requiredFlashVersion.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (skipOffset != null) __obj.updateDynamic("skipOffset")(skipOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(skippable)) __obj.updateDynamic("skippable")(skippable.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.asInstanceOf[js.Any])
    if (!js.isUndefined(sslOverride)) __obj.updateDynamic("sslOverride")(sslOverride.asInstanceOf[js.Any])
    if (studioAdvertiserId != null) __obj.updateDynamic("studioAdvertiserId")(studioAdvertiserId.asInstanceOf[js.Any])
    if (studioCreativeId != null) __obj.updateDynamic("studioCreativeId")(studioCreativeId.asInstanceOf[js.Any])
    if (studioTraffickedCreativeId != null) __obj.updateDynamic("studioTraffickedCreativeId")(studioTraffickedCreativeId.asInstanceOf[js.Any])
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId.asInstanceOf[js.Any])
    if (thirdPartyBackupImageImpressionsUrl != null) __obj.updateDynamic("thirdPartyBackupImageImpressionsUrl")(thirdPartyBackupImageImpressionsUrl.asInstanceOf[js.Any])
    if (thirdPartyRichMediaImpressionsUrl != null) __obj.updateDynamic("thirdPartyRichMediaImpressionsUrl")(thirdPartyRichMediaImpressionsUrl.asInstanceOf[js.Any])
    if (thirdPartyUrls != null) __obj.updateDynamic("thirdPartyUrls")(thirdPartyUrls.asInstanceOf[js.Any])
    if (timerCustomEvents != null) __obj.updateDynamic("timerCustomEvents")(timerCustomEvents.asInstanceOf[js.Any])
    if (totalFileSize != null) __obj.updateDynamic("totalFileSize")(totalFileSize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (universalAdId != null) __obj.updateDynamic("universalAdId")(universalAdId.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Creative]
  }
}

