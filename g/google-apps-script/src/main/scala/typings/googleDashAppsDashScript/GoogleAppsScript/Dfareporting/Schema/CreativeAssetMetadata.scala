package typings.googleDashAppsDashScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetMetadata extends js.Object {
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.undefined
  var detectedFeatures: js.UndefOr[js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var warnedValidationRules: js.UndefOr[js.Array[String]] = js.undefined
}

object CreativeAssetMetadata {
  @scala.inline
  def apply(
    assetIdentifier: CreativeAssetId = null,
    clickTags: js.Array[ClickTag] = null,
    detectedFeatures: js.Array[String] = null,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    kind: String = null,
    warnedValidationRules: js.Array[String] = null
  ): CreativeAssetMetadata = {
    val __obj = js.Dynamic.literal()
    if (assetIdentifier != null) __obj.updateDynamic("assetIdentifier")(assetIdentifier.asInstanceOf[js.Any])
    if (clickTags != null) __obj.updateDynamic("clickTags")(clickTags.asInstanceOf[js.Any])
    if (detectedFeatures != null) __obj.updateDynamic("detectedFeatures")(detectedFeatures.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (warnedValidationRules != null) __obj.updateDynamic("warnedValidationRules")(warnedValidationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAssetMetadata]
  }
}

