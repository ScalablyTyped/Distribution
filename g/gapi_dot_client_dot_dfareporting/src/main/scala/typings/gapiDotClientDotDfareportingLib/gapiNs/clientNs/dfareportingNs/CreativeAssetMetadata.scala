package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetMetadata extends js.Object {
  /** ID of the creative asset. This is a required field. */
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  /** List of detected click tags for assets. This is a read-only auto-generated field. */
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.undefined
  /**
    * List of feature dependencies for the creative asset that are detected by DCM. Feature dependencies are features that a browser must be able to support
    * in order to render your HTML5 creative correctly. This is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Numeric ID of the asset. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the numeric ID of the asset. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#creativeAssetMetadata". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Rules validated during code generation that generated a warning. This is a read-only, auto-generated field.
    *
    * Possible values are:
    * - "ADMOB_REFERENCED"
    * - "ASSET_FORMAT_UNSUPPORTED_DCM"
    * - "ASSET_INVALID"
    * - "CLICK_TAG_HARD_CODED"
    * - "CLICK_TAG_INVALID"
    * - "CLICK_TAG_IN_GWD"
    * - "CLICK_TAG_MISSING"
    * - "CLICK_TAG_MORE_THAN_ONE"
    * - "CLICK_TAG_NON_TOP_LEVEL"
    * - "COMPONENT_UNSUPPORTED_DCM"
    * - "ENABLER_UNSUPPORTED_METHOD_DCM"
    * - "EXTERNAL_FILE_REFERENCED"
    * - "FILE_DETAIL_EMPTY"
    * - "FILE_TYPE_INVALID"
    * - "GWD_PROPERTIES_INVALID"
    * - "HTML5_FEATURE_UNSUPPORTED"
    * - "LINKED_FILE_NOT_FOUND"
    * - "MAX_FLASH_VERSION_11"
    * - "MRAID_REFERENCED"
    * - "NOT_SSL_COMPLIANT"
    * - "ORPHANED_ASSET"
    * - "PRIMARY_HTML_MISSING"
    * - "SVG_INVALID"
    * - "ZIP_INVALID"
    */
  var warnedValidationRules: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object CreativeAssetMetadata {
  @scala.inline
  def apply(
    assetIdentifier: CreativeAssetId = null,
    clickTags: js.Array[ClickTag] = null,
    detectedFeatures: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    kind: java.lang.String = null,
    warnedValidationRules: js.Array[java.lang.String] = null
  ): CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    if (assetIdentifier != null) __obj.updateDynamic("assetIdentifier")(assetIdentifier)
    if (clickTags != null) __obj.updateDynamic("clickTags")(clickTags)
    if (detectedFeatures != null) __obj.updateDynamic("detectedFeatures")(detectedFeatures)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (warnedValidationRules != null) __obj.updateDynamic("warnedValidationRules")(warnedValidationRules)
    __obj.asInstanceOf[CreativeAssetMetadata]
  }
}

