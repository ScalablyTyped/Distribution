package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

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
    bufferRadius: Int | Double = null,
    formatSuggestion: /* featureInformation */ js.Any => String = null,
    label: String = null,
    maxResults: Int | Double = null,
    searchFields: String | js.Array[String] = null,
    token: String = null
  ): FeatureLayerProviderOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (bufferRadius != null) __obj.updateDynamic("bufferRadius")(bufferRadius.asInstanceOf[js.Any])
    if (formatSuggestion != null) __obj.updateDynamic("formatSuggestion")(js.Any.fromFunction1(formatSuggestion))
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (searchFields != null) __obj.updateDynamic("searchFields")(searchFields.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[FeatureLayerProviderOptions]
  }
}

