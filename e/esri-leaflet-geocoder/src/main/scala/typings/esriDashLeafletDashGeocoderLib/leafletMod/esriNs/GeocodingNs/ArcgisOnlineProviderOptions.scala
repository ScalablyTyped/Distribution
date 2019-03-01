package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcgisOnlineProviderOptions extends BaseProviderOptions {
  var categories: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var countries: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var forStorage: js.UndefOr[scala.Boolean] = js.undefined
}

object ArcgisOnlineProviderOptions {
  @scala.inline
  def apply(
    attribution: java.lang.String = null,
    categories: java.lang.String | js.Array[java.lang.String] = null,
    countries: java.lang.String | js.Array[java.lang.String] = null,
    forStorage: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    token: java.lang.String = null
  ): ArcgisOnlineProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution)
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (!js.isUndefined(forStorage)) __obj.updateDynamic("forStorage")(forStorage)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[ArcgisOnlineProviderOptions]
  }
}

