package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.ServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeServiceOptions extends ServiceOptions {
  var supportsSuggest: js.UndefOr[Boolean] = js.undefined
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(
    proxy: String = null,
    supportsSuggest: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    url: String = null,
    useCors: js.UndefOr[Boolean] = js.undefined
  ): GeocodeServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (!js.isUndefined(supportsSuggest)) __obj.updateDynamic("supportsSuggest")(supportsSuggest)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(useCors)) __obj.updateDynamic("useCors")(useCors)
    __obj.asInstanceOf[GeocodeServiceOptions]
  }
}

