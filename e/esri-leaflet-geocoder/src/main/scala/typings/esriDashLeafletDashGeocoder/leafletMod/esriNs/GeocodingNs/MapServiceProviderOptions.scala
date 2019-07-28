package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

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
    maxResults: Int | Double = null,
    token: String = null
  ): MapServiceProviderOptions = {
    val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = js.Any.fromFunction1(formatSuggestion), layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[MapServiceProviderOptions]
  }
}

