package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureLayerProviderOptions extends BaseProviderOptions {
  var bufferRadius: js.UndefOr[scala.Double] = js.undefined
  var formatSuggestion: js.UndefOr[js.Function1[/* featureInformation */ js.Any, java.lang.String]] = js.undefined
  var searchFields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var url: java.lang.String
}

object FeatureLayerProviderOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    attribution: java.lang.String = null,
    bufferRadius: scala.Int | scala.Double = null,
    formatSuggestion: js.Function1[/* featureInformation */ js.Any, java.lang.String] = null,
    label: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    searchFields: java.lang.String | js.Array[java.lang.String] = null,
    token: java.lang.String = null
  ): FeatureLayerProviderOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bufferRadius != null) __obj.updateDynamic("bufferRadius")(bufferRadius.asInstanceOf[js.Any])
    if (formatSuggestion != null) __obj.updateDynamic("formatSuggestion")(formatSuggestion)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[FeatureLayerProviderOptions]
  }
}

