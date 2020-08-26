package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAsset extends js.Object {
  var actionScript3: js.UndefOr[Boolean] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var additionalSizes: js.UndefOr[js.Array[Size]] = js.native
  var alignment: js.UndefOr[String] = js.native
  var artworkType: js.UndefOr[String] = js.native
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.native
  var audioBitRate: js.UndefOr[Double] = js.native
  var audioSampleRate: js.UndefOr[Double] = js.native
  var backupImageExit: js.UndefOr[CreativeCustomEvent] = js.native
  var bitRate: js.UndefOr[Double] = js.native
  var childAssetType: js.UndefOr[String] = js.native
  var collapsedSize: js.UndefOr[Size] = js.native
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.native
  var customStartTimeValue: js.UndefOr[Double] = js.native
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  var displayType: js.UndefOr[String] = js.native
  var duration: js.UndefOr[Double] = js.native
  var durationType: js.UndefOr[String] = js.native
  var expandedDimension: js.UndefOr[Size] = js.native
  var fileSize: js.UndefOr[String] = js.native
  var flashVersion: js.UndefOr[Double] = js.native
  var frameRate: js.UndefOr[Double] = js.native
  var hideFlashObjects: js.UndefOr[Boolean] = js.native
  var hideSelectionBoxes: js.UndefOr[Boolean] = js.native
  var horizontallyLocked: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  var mediaDuration: js.UndefOr[Double] = js.native
  var mimeType: js.UndefOr[String] = js.native
  var offset: js.UndefOr[OffsetPosition] = js.native
  var orientation: js.UndefOr[String] = js.native
  var originalBackup: js.UndefOr[Boolean] = js.native
  var politeLoad: js.UndefOr[Boolean] = js.native
  var position: js.UndefOr[OffsetPosition] = js.native
  var positionLeftUnit: js.UndefOr[String] = js.native
  var positionTopUnit: js.UndefOr[String] = js.native
  var progressiveServingUrl: js.UndefOr[String] = js.native
  var pushdown: js.UndefOr[Boolean] = js.native
  var pushdownDuration: js.UndefOr[Double] = js.native
  var role: js.UndefOr[String] = js.native
  var size: js.UndefOr[Size] = js.native
  var sslCompliant: js.UndefOr[Boolean] = js.native
  var startTimeType: js.UndefOr[String] = js.native
  var streamingServingUrl: js.UndefOr[String] = js.native
  var transparency: js.UndefOr[Boolean] = js.native
  var verticallyLocked: js.UndefOr[Boolean] = js.native
  var windowMode: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[Double] = js.native
  var zipFilename: js.UndefOr[String] = js.native
  var zipFilesize: js.UndefOr[String] = js.native
}

object CreativeAsset {
  @scala.inline
  def apply(): CreativeAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativeAsset]
  }
  @scala.inline
  implicit class CreativeAssetOps[Self <: CreativeAsset] (val x: Self) extends AnyVal {
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
    def setActionScript3(value: Boolean): Self = this.set("actionScript3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionScript3: Self = this.set("actionScript3", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAdditionalSizesVarargs(value: Size*): Self = this.set("additionalSizes", js.Array(value :_*))
    @scala.inline
    def setAdditionalSizes(value: js.Array[Size]): Self = this.set("additionalSizes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalSizes: Self = this.set("additionalSizes", js.undefined)
    @scala.inline
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setArtworkType(value: String): Self = this.set("artworkType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtworkType: Self = this.set("artworkType", js.undefined)
    @scala.inline
    def setAssetIdentifier(value: CreativeAssetId): Self = this.set("assetIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssetIdentifier: Self = this.set("assetIdentifier", js.undefined)
    @scala.inline
    def setAudioBitRate(value: Double): Self = this.set("audioBitRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioBitRate: Self = this.set("audioBitRate", js.undefined)
    @scala.inline
    def setAudioSampleRate(value: Double): Self = this.set("audioSampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioSampleRate: Self = this.set("audioSampleRate", js.undefined)
    @scala.inline
    def setBackupImageExit(value: CreativeCustomEvent): Self = this.set("backupImageExit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupImageExit: Self = this.set("backupImageExit", js.undefined)
    @scala.inline
    def setBitRate(value: Double): Self = this.set("bitRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitRate: Self = this.set("bitRate", js.undefined)
    @scala.inline
    def setChildAssetType(value: String): Self = this.set("childAssetType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildAssetType: Self = this.set("childAssetType", js.undefined)
    @scala.inline
    def setCollapsedSize(value: Size): Self = this.set("collapsedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsedSize: Self = this.set("collapsedSize", js.undefined)
    @scala.inline
    def setCompanionCreativeIdsVarargs(value: String*): Self = this.set("companionCreativeIds", js.Array(value :_*))
    @scala.inline
    def setCompanionCreativeIds(value: js.Array[String]): Self = this.set("companionCreativeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompanionCreativeIds: Self = this.set("companionCreativeIds", js.undefined)
    @scala.inline
    def setCustomStartTimeValue(value: Double): Self = this.set("customStartTimeValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomStartTimeValue: Self = this.set("customStartTimeValue", js.undefined)
    @scala.inline
    def setDetectedFeaturesVarargs(value: String*): Self = this.set("detectedFeatures", js.Array(value :_*))
    @scala.inline
    def setDetectedFeatures(value: js.Array[String]): Self = this.set("detectedFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetectedFeatures: Self = this.set("detectedFeatures", js.undefined)
    @scala.inline
    def setDisplayType(value: String): Self = this.set("displayType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayType: Self = this.set("displayType", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setDurationType(value: String): Self = this.set("durationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationType: Self = this.set("durationType", js.undefined)
    @scala.inline
    def setExpandedDimension(value: Size): Self = this.set("expandedDimension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandedDimension: Self = this.set("expandedDimension", js.undefined)
    @scala.inline
    def setFileSize(value: String): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    @scala.inline
    def setFlashVersion(value: Double): Self = this.set("flashVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlashVersion: Self = this.set("flashVersion", js.undefined)
    @scala.inline
    def setFrameRate(value: Double): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    @scala.inline
    def setHideFlashObjects(value: Boolean): Self = this.set("hideFlashObjects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideFlashObjects: Self = this.set("hideFlashObjects", js.undefined)
    @scala.inline
    def setHideSelectionBoxes(value: Boolean): Self = this.set("hideSelectionBoxes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSelectionBoxes: Self = this.set("hideSelectionBoxes", js.undefined)
    @scala.inline
    def setHorizontallyLocked(value: Boolean): Self = this.set("horizontallyLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontallyLocked: Self = this.set("horizontallyLocked", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setMediaDuration(value: Double): Self = this.set("mediaDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaDuration: Self = this.set("mediaDuration", js.undefined)
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMimeType: Self = this.set("mimeType", js.undefined)
    @scala.inline
    def setOffset(value: OffsetPosition): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setOriginalBackup(value: Boolean): Self = this.set("originalBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalBackup: Self = this.set("originalBackup", js.undefined)
    @scala.inline
    def setPoliteLoad(value: Boolean): Self = this.set("politeLoad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoliteLoad: Self = this.set("politeLoad", js.undefined)
    @scala.inline
    def setPosition(value: OffsetPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setPositionLeftUnit(value: String): Self = this.set("positionLeftUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionLeftUnit: Self = this.set("positionLeftUnit", js.undefined)
    @scala.inline
    def setPositionTopUnit(value: String): Self = this.set("positionTopUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionTopUnit: Self = this.set("positionTopUnit", js.undefined)
    @scala.inline
    def setProgressiveServingUrl(value: String): Self = this.set("progressiveServingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgressiveServingUrl: Self = this.set("progressiveServingUrl", js.undefined)
    @scala.inline
    def setPushdown(value: Boolean): Self = this.set("pushdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushdown: Self = this.set("pushdown", js.undefined)
    @scala.inline
    def setPushdownDuration(value: Double): Self = this.set("pushdownDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushdownDuration: Self = this.set("pushdownDuration", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSslCompliant(value: Boolean): Self = this.set("sslCompliant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslCompliant: Self = this.set("sslCompliant", js.undefined)
    @scala.inline
    def setStartTimeType(value: String): Self = this.set("startTimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimeType: Self = this.set("startTimeType", js.undefined)
    @scala.inline
    def setStreamingServingUrl(value: String): Self = this.set("streamingServingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingServingUrl: Self = this.set("streamingServingUrl", js.undefined)
    @scala.inline
    def setTransparency(value: Boolean): Self = this.set("transparency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransparency: Self = this.set("transparency", js.undefined)
    @scala.inline
    def setVerticallyLocked(value: Boolean): Self = this.set("verticallyLocked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticallyLocked: Self = this.set("verticallyLocked", js.undefined)
    @scala.inline
    def setWindowMode(value: String): Self = this.set("windowMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowMode: Self = this.set("windowMode", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
    @scala.inline
    def setZipFilename(value: String): Self = this.set("zipFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipFilename: Self = this.set("zipFilename", js.undefined)
    @scala.inline
    def setZipFilesize(value: String): Self = this.set("zipFilesize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipFilesize: Self = this.set("zipFilesize", js.undefined)
  }
  
}

