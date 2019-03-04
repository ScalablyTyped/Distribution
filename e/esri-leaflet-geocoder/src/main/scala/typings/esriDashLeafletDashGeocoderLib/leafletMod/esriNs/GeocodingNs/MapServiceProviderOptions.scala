package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapServiceProviderOptions extends BaseProviderOptions {
  var bufferRadius: scala.Double | js.Array[scala.Double]
  var layers: scala.Double | js.Array[scala.Double]
  var searchFields: java.lang.String | js.Array[java.lang.String]
  var url: java.lang.String
  def formatSuggestion(featureInformation: js.Any): java.lang.String
}

object MapServiceProviderOptions {
  @scala.inline
  def apply(
    bufferRadius: scala.Double | js.Array[scala.Double],
    formatSuggestion: js.Function1[js.Any, java.lang.String],
    layers: scala.Double | js.Array[scala.Double],
    searchFields: java.lang.String | js.Array[java.lang.String],
    url: java.lang.String,
    attribution: java.lang.String = null,
    label: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    token: java.lang.String = null
  ): MapServiceProviderOptions = {
    val __obj = js.Dynamic.literal(bufferRadius = bufferRadius.asInstanceOf[js.Any], formatSuggestion = formatSuggestion, layers = layers.asInstanceOf[js.Any], searchFields = searchFields.asInstanceOf[js.Any], url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[MapServiceProviderOptions]
  }
}

