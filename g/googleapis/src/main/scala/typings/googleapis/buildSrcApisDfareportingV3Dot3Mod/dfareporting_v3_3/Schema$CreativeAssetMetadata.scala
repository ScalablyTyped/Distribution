package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CreativeAssets contains properties of a creative asset file which will be
  * uploaded or has already been uploaded. Refer to the creative sample code
  * for how to upload assets and insert a creative.
  */
@js.native
trait Schema$CreativeAssetMetadata extends js.Object {
  /**
    * ID of the creative asset. This is a required field.
    */
  var assetIdentifier: js.UndefOr[Schema$CreativeAssetId] = js.native
  /**
    * List of detected click tags for assets. This is a read-only
    * auto-generated field.
    */
  var clickTags: js.UndefOr[js.Array[Schema$ClickTag]] = js.native
  /**
    * List of feature dependencies for the creative asset that are detected by
    * Campaign Manager. Feature dependencies are features that a browser must
    * be able to support in order to render your HTML5 creative correctly. This
    * is a read-only, auto-generated field.
    */
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.native
  /**
    * Numeric ID of the asset. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the numeric ID of the asset. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeAssetMetadata&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Rules validated during code generation that generated a warning. This is
    * a read-only, auto-generated field.  Possible values are: -
    * &quot;ADMOB_REFERENCED&quot; - &quot;ASSET_FORMAT_UNSUPPORTED_DCM&quot; -
    * &quot;ASSET_INVALID&quot; - &quot;CLICK_TAG_HARD_CODED&quot; -
    * &quot;CLICK_TAG_INVALID&quot; - &quot;CLICK_TAG_IN_GWD&quot; -
    * &quot;CLICK_TAG_MISSING&quot; - &quot;CLICK_TAG_MORE_THAN_ONE&quot; -
    * &quot;CLICK_TAG_NON_TOP_LEVEL&quot; -
    * &quot;COMPONENT_UNSUPPORTED_DCM&quot; -
    * &quot;ENABLER_UNSUPPORTED_METHOD_DCM&quot; -
    * &quot;EXTERNAL_FILE_REFERENCED&quot; - &quot;FILE_DETAIL_EMPTY&quot; -
    * &quot;FILE_TYPE_INVALID&quot; - &quot;GWD_PROPERTIES_INVALID&quot; -
    * &quot;HTML5_FEATURE_UNSUPPORTED&quot; - &quot;LINKED_FILE_NOT_FOUND&quot;
    * - &quot;MAX_FLASH_VERSION_11&quot; - &quot;MRAID_REFERENCED&quot; -
    * &quot;NOT_SSL_COMPLIANT&quot; - &quot;ORPHANED_ASSET&quot; -
    * &quot;PRIMARY_HTML_MISSING&quot; - &quot;SVG_INVALID&quot; -
    * &quot;ZIP_INVALID&quot;
    */
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.native
}

object Schema$CreativeAssetMetadata {
  @scala.inline
  def apply(
    assetIdentifier: Schema$CreativeAssetId = null,
    clickTags: js.Array[Schema$ClickTag] = null,
    detectedFeatures: js.Array[String] = null,
    id: String = null,
    idDimensionValue: Schema$DimensionValue = null,
    kind: String = null,
    warnedValidationRules: js.Array[String] = null
  ): Schema$CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    if (assetIdentifier != null) __obj.updateDynamic("assetIdentifier")(assetIdentifier.asInstanceOf[js.Any])
    if (clickTags != null) __obj.updateDynamic("clickTags")(clickTags.asInstanceOf[js.Any])
    if (detectedFeatures != null) __obj.updateDynamic("detectedFeatures")(detectedFeatures.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (warnedValidationRules != null) __obj.updateDynamic("warnedValidationRules")(warnedValidationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreativeAssetMetadata]
  }
}

