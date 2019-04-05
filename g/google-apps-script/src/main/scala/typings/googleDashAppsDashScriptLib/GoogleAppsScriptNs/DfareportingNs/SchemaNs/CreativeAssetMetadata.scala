package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssetMetadata extends js.Object {
  var assetIdentifier: js.UndefOr[CreativeAssetId] = js.undefined
  var clickTags: js.UndefOr[js.Array[ClickTag]] = js.undefined
  var detectedFeatures: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
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

