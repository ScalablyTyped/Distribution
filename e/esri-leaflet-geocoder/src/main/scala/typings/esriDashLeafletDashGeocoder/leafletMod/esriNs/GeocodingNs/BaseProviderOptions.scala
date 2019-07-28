package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

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
    maxResults: Int | Double = null,
    token: String = null
  ): BaseProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[BaseProviderOptions]
  }
}

