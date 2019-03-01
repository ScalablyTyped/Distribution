package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeocodeServiceOptions
  extends esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.ServiceOptions {
  var supportsSuggest: js.UndefOr[scala.Boolean] = js.undefined
}

object GeocodeServiceOptions {
  @scala.inline
  def apply(
    proxy: java.lang.String = null,
    supportsSuggest: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    useCors: js.UndefOr[scala.Boolean] = js.undefined
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

