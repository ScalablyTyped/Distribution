package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeServiceProviderOptions extends BaseProviderOptions {
  var url: String
}

object GeocodeServiceProviderOptions {
  @scala.inline
  def apply(
    url: String,
    attribution: String = null,
    label: String = null,
    maxResults: Int | Double = null,
    token: String = null
  ): GeocodeServiceProviderOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeServiceProviderOptions]
  }
}

