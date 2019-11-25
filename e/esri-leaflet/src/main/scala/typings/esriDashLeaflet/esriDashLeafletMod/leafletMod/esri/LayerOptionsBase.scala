package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerOptionsBase extends js.Object {
  /**
    * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying requests.
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * Will use this token to authenticate all calls to the service.
    */
  var token: js.UndefOr[String] = js.undefined
  /**
    * URL of the Map Service
    */
  var url: String
  /**
    * Dictates if the service should use CORS when making GET requests.
    */
  var useCors: js.UndefOr[Boolean] = js.undefined
}

object LayerOptionsBase {
  @scala.inline
  def apply(
    url: String,
    proxy: String = null,
    token: String = null,
    useCors: js.UndefOr[Boolean] = js.undefined
  ): LayerOptionsBase = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(useCors)) __obj.updateDynamic("useCors")(useCors.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerOptionsBase]
  }
}

