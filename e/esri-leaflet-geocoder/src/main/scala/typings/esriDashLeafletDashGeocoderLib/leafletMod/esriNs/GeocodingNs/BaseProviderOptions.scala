package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProviderOptions extends js.Object {
  var attribution: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  var token: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object BaseProviderOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    label: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    token: java.lang.String = null
  ): BaseProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[BaseProviderOptions]
  }
}

