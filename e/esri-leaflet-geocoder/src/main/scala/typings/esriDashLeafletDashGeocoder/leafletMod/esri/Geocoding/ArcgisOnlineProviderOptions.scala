package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcgisOnlineProviderOptions extends BaseProviderOptions {
  var categories: js.UndefOr[String | js.Array[String]] = js.undefined
  var countries: js.UndefOr[String | js.Array[String]] = js.undefined
  var forStorage: js.UndefOr[Boolean] = js.undefined
}

object ArcgisOnlineProviderOptions {
  @scala.inline
  def apply(
    attribution: String = null,
    categories: String | js.Array[String] = null,
    countries: String | js.Array[String] = null,
    forStorage: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    maxResults: Int | Double = null,
    token: String = null
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

