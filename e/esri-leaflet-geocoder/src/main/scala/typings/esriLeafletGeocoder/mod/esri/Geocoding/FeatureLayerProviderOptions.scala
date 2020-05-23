package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerProviderOptions extends BaseProviderOptions {
  var bufferRadius: js.UndefOr[Double] = js.undefined
  var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, String]] = js.undefined
  var searchFields: js.UndefOr[String | js.Array[String]] = js.undefined
  var url: String
}

object FeatureLayerProviderOptions {
  @scala.inline
  def apply(
    url: String,
    attribution: String = null,
    bufferRadius: js.UndefOr[Double] = js.undefined,
    formatSuggestion: /* featureInformation */ js.Any => String = null,
    label: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    searchFields: String | js.Array[String] = null,
    token: js.UndefOr[Null | String] = js.undefined
  ): FeatureLayerProviderOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (!js.isUndefined(bufferRadius)) __obj.updateDynamic("bufferRadius")(bufferRadius.get.asInstanceOf[js.Any])
    if (formatSuggestion != null) __obj.updateDynamic("formatSuggestion")(js.Any.fromFunction1(formatSuggestion))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerProviderOptions]
  }
}

