package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for `L.esri.Service`
  */
trait ServiceOptions extends js.Object {
  /**
    * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying POST requests.
    */
  var proxy: js.UndefOr[String] = js.undefined
  /**
    * Operation timeout
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * URL of the ArcGIS service you would like to consume.
    */
  var url: js.UndefOr[String] = js.undefined
  /**
    * If this service should use CORS when making GET requests.
    */
  var useCors: js.UndefOr[Boolean] = js.undefined
}

object ServiceOptions {
  @scala.inline
  def apply(
    proxy: String = null,
    timeout: js.UndefOr[Double] = js.undefined,
    url: String = null,
    useCors: js.UndefOr[Boolean] = js.undefined
  ): ServiceOptions = {
    val __obj = js.Dynamic.literal()
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useCors)) __obj.updateDynamic("useCors")(useCors.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceOptions]
  }
}

