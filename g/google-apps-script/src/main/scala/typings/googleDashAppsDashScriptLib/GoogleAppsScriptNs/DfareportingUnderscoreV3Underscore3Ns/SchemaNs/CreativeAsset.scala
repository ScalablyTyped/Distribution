package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAsset extends js.Object {
  var actionScript3: js.UndefOr[scala.Boolean] = js.undefined
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var artworkType: js.UndefOr[java.lang.String] = js.undefined
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  var audioBitRate: js.UndefOr[scala.Double] = js.undefined
  var audioSampleRate: js.UndefOr[scala.Double] = js.undefined
  var backupImageExit: js.UndefOr[CreativeCustomEvent] = js.undefined
  var bitRate: js.UndefOr[scala.Double] = js.undefined
  var childAssetType: js.UndefOr[java.lang.String] = js.undefined
  var collapsedSize: js.UndefOr[Size] = js.undefined
  var companionCreativeIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var customStartTimeValue: js.UndefOr[scala.Double] = js.undefined
  var detectedFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var displayType: js.UndefOr[java.lang.String] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var durationType: js.UndefOr[java.lang.String] = js.undefined
  var expandedDimension: js.UndefOr[Size] = js.undefined
  var fileSize: js.UndefOr[java.lang.String] = js.undefined
  var flashVersion: js.UndefOr[scala.Double] = js.undefined
  var frameRate: js.UndefOr[stdLib.Number] = js.undefined
  var hideFlashObjects: js.UndefOr[scala.Boolean] = js.undefined
  var hideSelectionBoxes: js.UndefOr[scala.Boolean] = js.undefined
  var horizontallyLocked: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var mediaDuration: js.UndefOr[stdLib.Number] = js.undefined
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  var originalBackup: js.UndefOr[scala.Boolean] = js.undefined
  var politeLoad: js.UndefOr[scala.Boolean] = js.undefined
  var position: js.UndefOr[OffsetPosition] = js.undefined
  var positionLeftUnit: js.UndefOr[java.lang.String] = js.undefined
  var positionTopUnit: js.UndefOr[java.lang.String] = js.undefined
  var progressiveServingUrl: js.UndefOr[java.lang.String] = js.undefined
  var pushdown: js.UndefOr[scala.Boolean] = js.undefined
  var pushdownDuration: js.UndefOr[stdLib.Number] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var sslCompliant: js.UndefOr[scala.Boolean] = js.undefined
  var startTimeType: js.UndefOr[java.lang.String] = js.undefined
  var streamingServingUrl: js.UndefOr[java.lang.String] = js.undefined
  var transparency: js.UndefOr[scala.Boolean] = js.undefined
  var verticallyLocked: js.UndefOr[scala.Boolean] = js.undefined
  var windowMode: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
  var zipFilename: js.UndefOr[java.lang.String] = js.undefined
  var zipFilesize: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeAsset {
  @scala.inline
  def apply(
    actionScript3: js.UndefOr[scala.Boolean] = js.undefined,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    additionalSizes: js.Array[Size] = null,
    alignment: java.lang.String = null,
    artworkType: java.lang.String = null,
    assetIdentifier: CreativeAssetId = null,
    audioBitRate: scala.Int | scala.Double = null,
    audioSampleRate: scala.Int | scala.Double = null,
    backupImageExit: CreativeCustomEvent = null,
    bitRate: scala.Int | scala.Double = null,
    childAssetType: java.lang.String = null,
    collapsedSize: Size = null,
    companionCreativeIds: js.Array[java.lang.String] = null,
    customStartTimeValue: scala.Int | scala.Double = null,
    detectedFeatures: js.Array[java.lang.String] = null,
    displayType: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    durationType: java.lang.String = null,
    expandedDimension: Size = null,
    fileSize: java.lang.String = null,
    flashVersion: scala.Int | scala.Double = null,
    frameRate: stdLib.Number = null,
    hideFlashObjects: js.UndefOr[scala.Boolean] = js.undefined,
    hideSelectionBoxes: js.UndefOr[scala.Boolean] = js.undefined,
    horizontallyLocked: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    mediaDuration: stdLib.Number = null,
    mimeType: java.lang.String = null,
    offset: OffsetPosition = null,
    orientation: java.lang.String = null,
    originalBackup: js.UndefOr[scala.Boolean] = js.undefined,
    politeLoad: js.UndefOr[scala.Boolean] = js.undefined,
    position: OffsetPosition = null,
    positionLeftUnit: java.lang.String = null,
    positionTopUnit: java.lang.String = null,
    progressiveServingUrl: java.lang.String = null,
    pushdown: js.UndefOr[scala.Boolean] = js.undefined,
    pushdownDuration: stdLib.Number = null,
    role: java.lang.String = null,
    size: Size = null,
    sslCompliant: js.UndefOr[scala.Boolean] = js.undefined,
    startTimeType: java.lang.String = null,
    streamingServingUrl: java.lang.String = null,
    transparency: js.UndefOr[scala.Boolean] = js.undefined,
    verticallyLocked: js.UndefOr[scala.Boolean] = js.undefined,
    windowMode: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null,
    zipFilename: java.lang.String = null,
    zipFilesize: java.lang.String = null
  ): CreativeAsset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionScript3)) __obj.updateDynamic("actionScript3")(actionScript3)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (additionalSizes != null) __obj.updateDynamic("additionalSizes")(additionalSizes)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType)
    if (assetIdentifier != null) __obj.updateDynamic("assetIdentifier")(assetIdentifier)
    if (audioBitRate != null) __obj.updateDynamic("audioBitRate")(audioBitRate.asInstanceOf[js.Any])
    if (audioSampleRate != null) __obj.updateDynamic("audioSampleRate")(audioSampleRate.asInstanceOf[js.Any])
    if (backupImageExit != null) __obj.updateDynamic("backupImageExit")(backupImageExit)
    if (bitRate != null) __obj.updateDynamic("bitRate")(bitRate.asInstanceOf[js.Any])
    if (childAssetType != null) __obj.updateDynamic("childAssetType")(childAssetType)
    if (collapsedSize != null) __obj.updateDynamic("collapsedSize")(collapsedSize)
    if (companionCreativeIds != null) __obj.updateDynamic("companionCreativeIds")(companionCreativeIds)
    if (customStartTimeValue != null) __obj.updateDynamic("customStartTimeValue")(customStartTimeValue.asInstanceOf[js.Any])
    if (detectedFeatures != null) __obj.updateDynamic("detectedFeatures")(detectedFeatures)
    if (displayType != null) __obj.updateDynamic("displayType")(displayType)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (durationType != null) __obj.updateDynamic("durationType")(durationType)
    if (expandedDimension != null) __obj.updateDynamic("expandedDimension")(expandedDimension)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize)
    if (flashVersion != null) __obj.updateDynamic("flashVersion")(flashVersion.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate)
    if (!js.isUndefined(hideFlashObjects)) __obj.updateDynamic("hideFlashObjects")(hideFlashObjects)
    if (!js.isUndefined(hideSelectionBoxes)) __obj.updateDynamic("hideSelectionBoxes")(hideSelectionBoxes)
    if (!js.isUndefined(horizontallyLocked)) __obj.updateDynamic("horizontallyLocked")(horizontallyLocked)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (mediaDuration != null) __obj.updateDynamic("mediaDuration")(mediaDuration)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(originalBackup)) __obj.updateDynamic("originalBackup")(originalBackup)
    if (!js.isUndefined(politeLoad)) __obj.updateDynamic("politeLoad")(politeLoad)
    if (position != null) __obj.updateDynamic("position")(position)
    if (positionLeftUnit != null) __obj.updateDynamic("positionLeftUnit")(positionLeftUnit)
    if (positionTopUnit != null) __obj.updateDynamic("positionTopUnit")(positionTopUnit)
    if (progressiveServingUrl != null) __obj.updateDynamic("progressiveServingUrl")(progressiveServingUrl)
    if (!js.isUndefined(pushdown)) __obj.updateDynamic("pushdown")(pushdown)
    if (pushdownDuration != null) __obj.updateDynamic("pushdownDuration")(pushdownDuration)
    if (role != null) __obj.updateDynamic("role")(role)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant)
    if (startTimeType != null) __obj.updateDynamic("startTimeType")(startTimeType)
    if (streamingServingUrl != null) __obj.updateDynamic("streamingServingUrl")(streamingServingUrl)
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency)
    if (!js.isUndefined(verticallyLocked)) __obj.updateDynamic("verticallyLocked")(verticallyLocked)
    if (windowMode != null) __obj.updateDynamic("windowMode")(windowMode)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    if (zipFilename != null) __obj.updateDynamic("zipFilename")(zipFilename)
    if (zipFilesize != null) __obj.updateDynamic("zipFilesize")(zipFilesize)
    __obj.asInstanceOf[CreativeAsset]
  }
}

