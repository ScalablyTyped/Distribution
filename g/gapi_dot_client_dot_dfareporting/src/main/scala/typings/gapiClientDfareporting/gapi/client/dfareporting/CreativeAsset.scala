package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAsset extends js.Object {
  /**
    * Whether ActionScript3 is enabled for the flash asset. This is a read-only field. Applicable to the following creative type: FLASH_INPAGE. Applicable to
    * DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var actionScript3: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the video asset is active. This is a read-only field for VPAID_NON_LINEAR_VIDEO assets. Applicable to the following creative types:
    * INSTREAM_VIDEO and all VPAID.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * Possible alignments for an asset. This is a read-only field. Applicable to the following creative types:
    * RICH_MEDIA_DISPLAY_MULTI_FLOATING_INTERSTITIAL.
    */
  var alignment: js.UndefOr[String] = js.undefined
  /** Artwork type of rich media creative. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var artworkType: js.UndefOr[String] = js.undefined
  /**
    * Identifier of this asset. This is the same identifier returned during creative asset insert operation. This is a required field. Applicable to all but
    * the following creative types: all REDIRECT and TRACKING_TEXT.
    */
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  /** Exit event configured for the backup image. Applicable to the following creative types: all RICH_MEDIA. */
  var backupImageExit: js.UndefOr[CreativeCustomEvent] = js.undefined
  /** Detected bit-rate for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var bitRate: js.UndefOr[Double] = js.undefined
  /** Rich media child asset type. This is a read-only field. Applicable to the following creative types: all VPAID. */
  var childAssetType: js.UndefOr[String] = js.undefined
  /**
    * Size of an asset when collapsed. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID. Additionally,
    * applicable to assets whose displayType is ASSET_DISPLAY_TYPE_EXPANDING or ASSET_DISPLAY_TYPE_PEEL_DOWN.
    */
  var collapsedSize: js.UndefOr[Size] = js.undefined
  /**
    * List of companion creatives assigned to an in-stream video creative asset. Acceptable values include IDs of existing flash and image creatives.
    * Applicable to INSTREAM_VIDEO creative type with dynamicAssetSelection set to true.
    */
  var companionCreativeIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Custom start time in seconds for making the asset visible. Applicable to the following creative types: all RICH_MEDIA. Value must be greater than or
    * equal to 0.
    */
  var customStartTimeValue: js.UndefOr[Double] = js.undefined
  /**
    * List of feature dependencies for the creative asset that are detected by DCM. Feature dependencies are features that a browser must be able to support
    * in order to render your HTML5 creative correctly. This is a read-only, auto-generated field. Applicable to the following creative types: HTML5_BANNER.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.undefined
  /** Type of rich media asset. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var displayType: js.UndefOr[String] = js.undefined
  /**
    * Duration in seconds for which an asset will be displayed. Applicable to the following creative types: INSTREAM_VIDEO and VPAID_LINEAR_VIDEO. Value must
    * be greater than or equal to 1.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /** Duration type for which an asset will be displayed. Applicable to the following creative types: all RICH_MEDIA. */
  var durationType: js.UndefOr[String] = js.undefined
  /** Detected expanded dimension for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var expandedDimension: js.UndefOr[Size] = js.undefined
  /**
    * File size associated with this creative asset. This is a read-only field. Applicable to all but the following creative types: all REDIRECT and
    * TRACKING_TEXT.
    */
  var fileSize: js.UndefOr[String] = js.undefined
  /**
    * Flash version of the asset. This is a read-only field. Applicable to the following creative types: FLASH_INPAGE, all RICH_MEDIA, and all VPAID.
    * Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var flashVersion: js.UndefOr[Double] = js.undefined
  /** Whether to hide Flash objects flag for an asset. Applicable to the following creative types: all RICH_MEDIA. */
  var hideFlashObjects: js.UndefOr[Boolean] = js.undefined
  /** Whether to hide selection boxes flag for an asset. Applicable to the following creative types: all RICH_MEDIA. */
  var hideSelectionBoxes: js.UndefOr[Boolean] = js.undefined
  /** Whether the asset is horizontally locked. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var horizontallyLocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Numeric ID of this creative asset. This is a required field and should not be modified. Applicable to all but the following creative types: all
    * REDIRECT and TRACKING_TEXT.
    */
  var id: js.UndefOr[String] = js.undefined
  /** Dimension value for the ID of the asset. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Detected MIME type for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var mimeType: js.UndefOr[String] = js.undefined
  /**
    * Offset position for an asset in collapsed mode. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID.
    * Additionally, only applicable to assets whose displayType is ASSET_DISPLAY_TYPE_EXPANDING or ASSET_DISPLAY_TYPE_PEEL_DOWN.
    */
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  /** Whether the backup asset is original or changed by the user in DCM. Applicable to the following creative types: all RICH_MEDIA. */
  var originalBackup: js.UndefOr[Boolean] = js.undefined
  /** Offset position for an asset. Applicable to the following creative types: all RICH_MEDIA. */
  var position: js.UndefOr[OffsetPosition] = js.undefined
  /** Offset left unit for an asset. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var positionLeftUnit: js.UndefOr[String] = js.undefined
  /**
    * Offset top unit for an asset. This is a read-only field if the asset displayType is ASSET_DISPLAY_TYPE_OVERLAY. Applicable to the following creative
    * types: all RICH_MEDIA.
    */
  var positionTopUnit: js.UndefOr[String] = js.undefined
  /** Progressive URL for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var progressiveServingUrl: js.UndefOr[String] = js.undefined
  /**
    * Whether the asset pushes down other content. Applicable to the following creative types: all RICH_MEDIA. Additionally, only applicable when the asset
    * offsets are 0, the collapsedSize.width matches size.width, and the collapsedSize.height is less than size.height.
    */
  var pushdown: js.UndefOr[Boolean] = js.undefined
  /**
    * Pushdown duration in seconds for an asset. Applicable to the following creative types: all RICH_MEDIA.Additionally, only applicable when the asset
    * pushdown field is true, the offsets are 0, the collapsedSize.width matches size.width, and the collapsedSize.height is less than size.height.
    * Acceptable values are 0 to 9.99, inclusive.
    */
  var pushdownDuration: js.UndefOr[Double] = js.undefined
  /**
    * Role of the asset in relation to creative. Applicable to all but the following creative types: all REDIRECT and TRACKING_TEXT. This is a required
    * field.
    * PRIMARY applies to DISPLAY, FLASH_INPAGE, HTML5_BANNER, IMAGE, DISPLAY_IMAGE_GALLERY, all RICH_MEDIA (which may contain multiple primary assets), and
    * all VPAID creatives.
    * BACKUP_IMAGE applies to FLASH_INPAGE, HTML5_BANNER, all RICH_MEDIA, and all VPAID creatives. Applicable to DISPLAY when the primary asset type is not
    * HTML_IMAGE.
    * ADDITIONAL_IMAGE and ADDITIONAL_FLASH apply to FLASH_INPAGE creatives.
    * OTHER refers to assets from sources other than DCM, such as Studio uploaded assets, applicable to all RICH_MEDIA and all VPAID creatives.
    * PARENT_VIDEO refers to videos uploaded by the user in DCM and is applicable to INSTREAM_VIDEO and VPAID_LINEAR_VIDEO creatives.
    * TRANSCODED_VIDEO refers to videos transcoded by DCM from PARENT_VIDEO assets and is applicable to INSTREAM_VIDEO and VPAID_LINEAR_VIDEO creatives.
    * ALTERNATE_VIDEO refers to the DCM representation of child asset videos from Studio, and is applicable to VPAID_LINEAR_VIDEO creatives. These cannot be
    * added or removed within DCM.
    * For VPAID_LINEAR_VIDEO creatives, PARENT_VIDEO, TRANSCODED_VIDEO and ALTERNATE_VIDEO assets that are marked active serve as backup in case the VPAID
    * creative cannot be served. Only PARENT_VIDEO assets can be added or removed for an INSTREAM_VIDEO or VPAID_LINEAR_VIDEO creative.
    */
  var role: js.UndefOr[String] = js.undefined
  /**
    * Size associated with this creative asset. This is a required field when applicable; however for IMAGE and FLASH_INPAGE, creatives if left blank, this
    * field will be automatically set using the actual size of the associated image asset. Applicable to the following creative types: DISPLAY_IMAGE_GALLERY,
    * FLASH_INPAGE, HTML5_BANNER, IMAGE, and all RICH_MEDIA. Applicable to DISPLAY when the primary asset type is not HTML_IMAGE.
    */
  var size: js.UndefOr[Size] = js.undefined
  /** Whether the asset is SSL-compliant. This is a read-only field. Applicable to all but the following creative types: all REDIRECT and TRACKING_TEXT. */
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  /** Initial wait time type before making the asset visible. Applicable to the following creative types: all RICH_MEDIA. */
  var startTimeType: js.UndefOr[String] = js.undefined
  /** Streaming URL for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var streamingServingUrl: js.UndefOr[String] = js.undefined
  /** Whether the asset is transparent. Applicable to the following creative types: all RICH_MEDIA. Additionally, only applicable to HTML5 assets. */
  var transparency: js.UndefOr[Boolean] = js.undefined
  /** Whether the asset is vertically locked. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA. */
  var verticallyLocked: js.UndefOr[Boolean] = js.undefined
  /** Detected video duration for video asset. This is a read-only field. Applicable to the following creative types: INSTREAM_VIDEO and all VPAID. */
  var videoDuration: js.UndefOr[Double] = js.undefined
  /**
    * Window mode options for flash assets. Applicable to the following creative types: FLASH_INPAGE, RICH_MEDIA_DISPLAY_EXPANDING, RICH_MEDIA_IM_EXPAND,
    * RICH_MEDIA_DISPLAY_BANNER, and RICH_MEDIA_INPAGE_FLOATING.
    */
  var windowMode: js.UndefOr[String] = js.undefined
  /**
    * zIndex value of an asset. Applicable to the following creative types: all RICH_MEDIA.Additionally, only applicable to assets whose displayType is NOT
    * one of the following types: ASSET_DISPLAY_TYPE_INPAGE or ASSET_DISPLAY_TYPE_OVERLAY. Acceptable values are -999999999 to 999999999, inclusive.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
  /** File name of zip file. This is a read-only field. Applicable to the following creative types: HTML5_BANNER. */
  var zipFilename: js.UndefOr[String] = js.undefined
  /** Size of zip file. This is a read-only field. Applicable to the following creative types: HTML5_BANNER. */
  var zipFilesize: js.UndefOr[String] = js.undefined
}

object CreativeAsset {
  @scala.inline
  def apply(
    actionScript3: js.UndefOr[Boolean] = js.undefined,
    active: js.UndefOr[Boolean] = js.undefined,
    alignment: String = null,
    artworkType: String = null,
    assetIdentifier: CreativeAssetId = null,
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
    hideFlashObjects: js.UndefOr[Boolean] = js.undefined,
    hideSelectionBoxes: js.UndefOr[Boolean] = js.undefined,
    horizontallyLocked: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    mimeType: String = null,
    offset: OffsetPosition = null,
    originalBackup: js.UndefOr[Boolean] = js.undefined,
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
    videoDuration: js.UndefOr[Double] = js.undefined,
    windowMode: String = null,
    zIndex: js.UndefOr[Double] = js.undefined,
    zipFilename: String = null,
    zipFilesize: String = null
  ): CreativeAsset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(actionScript3)) __obj.updateDynamic("actionScript3")(actionScript3.get.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType.asInstanceOf[js.Any])
    if (assetIdentifier != null) __obj.updateDynamic("assetIdentifier")(assetIdentifier.asInstanceOf[js.Any])
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
    if (!js.isUndefined(hideFlashObjects)) __obj.updateDynamic("hideFlashObjects")(hideFlashObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideSelectionBoxes)) __obj.updateDynamic("hideSelectionBoxes")(hideSelectionBoxes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontallyLocked)) __obj.updateDynamic("horizontallyLocked")(horizontallyLocked.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(originalBackup)) __obj.updateDynamic("originalBackup")(originalBackup.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(videoDuration)) __obj.updateDynamic("videoDuration")(videoDuration.get.asInstanceOf[js.Any])
    if (windowMode != null) __obj.updateDynamic("windowMode")(windowMode.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    if (zipFilename != null) __obj.updateDynamic("zipFilename")(zipFilename.asInstanceOf[js.Any])
    if (zipFilesize != null) __obj.updateDynamic("zipFilesize")(zipFilesize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAsset]
  }
}

