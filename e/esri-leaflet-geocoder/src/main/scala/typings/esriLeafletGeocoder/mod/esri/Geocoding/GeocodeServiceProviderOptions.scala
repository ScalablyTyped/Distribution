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
    maxResults: js.UndefOr[Double] = js.undefined,
    token: js.UndefOr[Null | String] = js.undefined
  ): GeocodeServiceProviderOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeServiceProviderOptions]
  }
}

