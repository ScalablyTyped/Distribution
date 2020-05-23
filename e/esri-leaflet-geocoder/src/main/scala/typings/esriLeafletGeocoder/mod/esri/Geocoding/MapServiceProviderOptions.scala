package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapServiceProviderOptions extends BaseProviderOptions {
  var bufferRadius: Double | js.Array[Double]
  var layers: Double | js.Array[Double]
  var searchFields: String | js.Array[String]
  var url: String
  def formatSuggestion(featureInformation: js.Any): String
}

object MapServiceProviderOptions {
  @scala.inline
  def apply(
    bufferRadius: Double | js.Array[Double],
    formatSuggestion: js.Any => String,
    layers: Double | js.Array[Double],
    searchFields: String | js.Array[String],
    url: String,
    attribution: String = null,
    label: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    token: js.UndefOr[Null | String] = js.undefined
  ): MapServiceProviderOptions = {
    val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapServiceProviderOptions]
  }
}

