package typings.esriLeafletGeocoder.mod.esri.Geocoding

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
    maxResults: js.UndefOr[Double] = js.undefined,
    token: js.UndefOr[Null | String] = js.undefined
  ): ArcgisOnlineProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (attribution != null) __obj.updateDynamic("attribution")(attribution.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (!js.isUndefined(forStorage)) __obj.updateDynamic("forStorage")(forStorage.get.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcgisOnlineProviderOptions]
  }
}

