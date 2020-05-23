package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAsset extends js.Object {
  var actionScript3: js.UndefOr[Boolean] = js.undefined
  var active: js.UndefOr[Boolean] = js.undefined
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var alignment: js.UndefOr[String] = js.undefined
  var artworkType: js.UndefOr[String] = js.undefined
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  var audioBitRate: js.UndefOr[Double] = js.undefined
  var audioSampleRate: js.UndefOr[Double] = js.undefined
  var backupImageExit: js.UndefOr[CreativeCustomEvent] = js.undefined
  var bitRate: js.UndefOr[Double] = js.undefined
  var childAssetType: js.UndefOr[String] = js.undefined
  var collapsedSize: js.UndefOr[Size] = js.undefined
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.undefined
  var customStartTimeValue: js.UndefOr[Double] = js.undefined
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.undefined
  var displayType: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var durationType: js.UndefOr[String] = js.undefined
  var expandedDimension: js.UndefOr[Size] = js.undefined
  var fileSize: js.UndefOr[String] = js.undefined
  var flashVersion: js.UndefOr[Double] = js.undefined
  var frameRate: js.UndefOr[Double] = js.undefined
  var hideFlashObjects: js.UndefOr[Boolean] = js.undefined
  var hideSelectionBoxes: js.UndefOr[Boolean] = js.undefined
  var horizontallyLocked: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var mediaDuration: js.UndefOr[Double] = js.undefined
  var mimeType: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  var orientation: js.UndefOr[String] = js.undefined
  var originalBackup: js.UndefOr[Boolean] = js.undefined
  var politeLoad: js.UndefOr[Boolean] = js.undefined
  var position: js.UndefOr[OffsetPosition] = js.undefined
  var positionLeftUnit: js.UndefOr[String] = js.undefined
  var positionTopUnit: js.UndefOr[String] = js.undefined
  var progressiveServingUrl: js.UndefOr[String] = js.undefined
  var pushdown: js.UndefOr[Boolean] = js.undefined
  var pushdownDuration: js.UndefOr[Double] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  var startTimeType: js.UndefOr[String] = js.undefined
  var streamingServingUrl: js.UndefOr[String] = js.undefined
  var transparency: js.UndefOr[Boolean] = js.undefined
  var verticallyLocked: js.UndefOr[Boolean] = js.undefined
  var windowMode: js.UndefOr[String] = js.undefined
  var zIndex: js.UndefOr[Double] = js.undefined
  var zipFilename: js.UndefOr[String] = js.undefined
  var zipFilesize: js.UndefOr[String] = js.undefined
}

object CreativeAsset {
  @scala.inline
  def apply(
    actionScript3: js.UndefOr[Boolean] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    additionalSizes: js.Array[Size] = null,
    alignment: String = null,
    artworkType: String = null,
    assetIdentifier: CreativeAssetId = null,
    audioBitRate: js.UndefOr[Double] = js.undefined,
    audioSampleRate: js.UndefOr[Double] = js.undefined,
    backupImageExit: CreativeCustomEvent = null,
    bitRate: js.UndefOr[Double] = js.undefined,
    childAssetType: String = null,
    collapsedSize: Size = null,
    companionCreativeIds: js.Array[String] = null,
    customStartTimeValue: js.UndefOr[Double] = js.undefined,
    detectedFeatures: js.Array[String] = null,
    displayType: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    durationType: String = null,
    expandedDimension: Size = null,
    fileSize: String = null,
    flashVersion: js.UndefOr[Double] = js.undefined,
    frameRate: js.UndefOr[Double] = js.undefined,
    hideFlashObjects: js.UndefOr[Boolean] = js.undefined,
    hideSelectionBoxes: js.UndefOr[Boolean] = js.undefined,
    horizontallyLocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    mediaDuration: js.UndefOr[Double] = js.undefined,
    mimeType: String = null,
    offset: OffsetPosition = null,
    orientation: String = null,
    originalBackup: js.UndefOr[Boolean] = js.undefined,
    politeLoad: js.UndefOr[Boolean] = js.undefined,
    position: OffsetPosition = null,
    positionLeftUnit: String = null,
    positionTopUnit: String = null,
    progressiveServingUrl: String = null,
    pushdown: js.UndefOr[Boolean] = js.undefined,
    pushdownDuration: js.UndefOr[Double] = js.undefined,
    role: String = null,
    size: Size = null,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    startTimeType: String = null,
    streamingServingUrl: String = null,
    transparency: js.UndefOr[Boolean] = js.undefined,
    verticallyLocked: js.UndefOr[Boolean] = js.undefined,
    windowMode: String = null,
    zIndex: js.UndefOr[Double] = js.undefined,
    zipFilename: String = null,
    zipFilesize: String = null
  ): CreativeAsset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionScript3)) __obj.updateDynamic("actionScript3")(actionScript3.get.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (additionalSizes != null) __obj.updateDynamic("additionalSizes")(additionalSizes.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType.asInstanceOf[js.Any])
    if (assetIdentifier != null) __obj.updateDynamic("assetIdentifier")(assetIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(audioBitRate)) __obj.updateDynamic("audioBitRate")(audioBitRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(audioSampleRate)) __obj.updateDynamic("audioSampleRate")(audioSampleRate.get.asInstanceOf[js.Any])
    if (backupImageExit != null) __obj.updateDynamic("backupImageExit")(backupImageExit.asInstanceOf[js.Any])
    if (!js.isUndefined(bitRate)) __obj.updateDynamic("bitRate")(bitRate.get.asInstanceOf[js.Any])
    if (childAssetType != null) __obj.updateDynamic("childAssetType")(childAssetType.asInstanceOf[js.Any])
    if (collapsedSize != null) __obj.updateDynamic("collapsedSize")(collapsedSize.asInstanceOf[js.Any])
    if (companionCreativeIds != null) __obj.updateDynamic("companionCreativeIds")(companionCreativeIds.asInstanceOf[js.Any])
    if (!js.isUndefined(customStartTimeValue)) __obj.updateDynamic("customStartTimeValue")(customStartTimeValue.get.asInstanceOf[js.Any])
    if (detectedFeatures != null) __obj.updateDynamic("detectedFeatures")(detectedFeatures.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (durationType != null) __obj.updateDynamic("durationType")(durationType.asInstanceOf[js.Any])
    if (expandedDimension != null) __obj.updateDynamic("expandedDimension")(expandedDimension.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (!js.isUndefined(flashVersion)) __obj.updateDynamic("flashVersion")(flashVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frameRate)) __obj.updateDynamic("frameRate")(frameRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideFlashObjects)) __obj.updateDynamic("hideFlashObjects")(hideFlashObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSelectionBoxes)) __obj.updateDynamic("hideSelectionBoxes")(hideSelectionBoxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontallyLocked)) __obj.updateDynamic("horizontallyLocked")(horizontallyLocked.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (!js.isUndefined(mediaDuration)) __obj.updateDynamic("mediaDuration")(mediaDuration.get.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(originalBackup)) __obj.updateDynamic("originalBackup")(originalBackup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(politeLoad)) __obj.updateDynamic("politeLoad")(politeLoad.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (positionLeftUnit != null) __obj.updateDynamic("positionLeftUnit")(positionLeftUnit.asInstanceOf[js.Any])
    if (positionTopUnit != null) __obj.updateDynamic("positionTopUnit")(positionTopUnit.asInstanceOf[js.Any])
    if (progressiveServingUrl != null) __obj.updateDynamic("progressiveServingUrl")(progressiveServingUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(pushdown)) __obj.updateDynamic("pushdown")(pushdown.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pushdownDuration)) __obj.updateDynamic("pushdownDuration")(pushdownDuration.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.get.asInstanceOf[js.Any])
    if (startTimeType != null) __obj.updateDynamic("startTimeType")(startTimeType.asInstanceOf[js.Any])
    if (streamingServingUrl != null) __obj.updateDynamic("streamingServingUrl")(streamingServingUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(transparency)) __obj.updateDynamic("transparency")(transparency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticallyLocked)) __obj.updateDynamic("verticallyLocked")(verticallyLocked.get.asInstanceOf[js.Any])
    if (windowMode != null) __obj.updateDynamic("windowMode")(windowMode.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zipFilename != null) __obj.updateDynamic("zipFilename")(zipFilename.asInstanceOf[js.Any])
    if (zipFilesize != null) __obj.updateDynamic("zipFilesize")(zipFilesize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAsset]
  }
}

