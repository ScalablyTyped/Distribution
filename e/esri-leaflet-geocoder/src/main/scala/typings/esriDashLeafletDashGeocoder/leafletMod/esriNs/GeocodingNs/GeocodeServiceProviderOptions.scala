package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

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
    val __obj = js.Dynamic.literal(url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[GeocodeServiceProviderOptions]
  }
}

