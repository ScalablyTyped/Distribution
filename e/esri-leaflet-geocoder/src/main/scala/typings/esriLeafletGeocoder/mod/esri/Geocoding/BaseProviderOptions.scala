package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderOptions extends js.Object {
  var attribution: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var token: js.UndefOr[String | Null] = js.undefined
}

object BaseProviderOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    label: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    token: js.UndefOr[Null | String] = js.undefined
  ): BaseProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProviderOptions]
  }
}

