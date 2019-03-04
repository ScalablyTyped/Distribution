package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeServiceProviderOptions extends BaseProviderOptions {
  var url: java.lang.String
}

object GeocodeServiceProviderOptions {
  @scala.inline
  def apply(
    url: java.lang.String,
    attribution: java.lang.String = null,
    label: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    token: java.lang.String = null
  ): GeocodeServiceProviderOptions = {
    val __obj = js.Dynamic.literal(url = url)
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[GeocodeServiceProviderOptions]
  }
}

