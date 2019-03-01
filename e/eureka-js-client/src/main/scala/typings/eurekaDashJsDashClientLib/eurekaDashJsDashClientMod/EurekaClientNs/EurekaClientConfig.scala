package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaClientConfig extends js.Object {
  var clusterRefreshInterval: js.UndefOr[scala.Boolean] = js.undefined
  var fetchMetadata: js.UndefOr[scala.Boolean] = js.undefined
  var fetchRegistry: js.UndefOr[scala.Boolean] = js.undefined
  var filterUpInstances: js.UndefOr[scala.Boolean] = js.undefined
  var heartbeatInterval: js.UndefOr[scala.Double] = js.undefined
  var host: java.lang.String
  var logger: js.UndefOr[eurekaDashJsDashClientLib.Anon_Args] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
  var port: scala.Double
  var preferIpAddress: js.UndefOr[scala.Boolean] = js.undefined
  var preferSameZone: js.UndefOr[scala.Boolean] = js.undefined
  var registerWithEureka: js.UndefOr[scala.Boolean] = js.undefined
  var registryFetchInterval: js.UndefOr[scala.Double] = js.undefined
  var requestRetryDelay: js.UndefOr[scala.Double] = js.undefined
  var servicePath: js.UndefOr[java.lang.String] = js.undefined
  var shouldUseDelta: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
  var useDns: js.UndefOr[scala.Boolean] = js.undefined
  var useLocalMetadata: js.UndefOr[scala.Boolean] = js.undefined
}

object EurekaClientConfig {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    clusterRefreshInterval: js.UndefOr[scala.Boolean] = js.undefined,
    fetchMetadata: js.UndefOr[scala.Boolean] = js.undefined,
    fetchRegistry: js.UndefOr[scala.Boolean] = js.undefined,
    filterUpInstances: js.UndefOr[scala.Boolean] = js.undefined,
    heartbeatInterval: scala.Int | scala.Double = null,
    logger: eurekaDashJsDashClientLib.Anon_Args = null,
    maxRetries: scala.Int | scala.Double = null,
    preferIpAddress: js.UndefOr[scala.Boolean] = js.undefined,
    preferSameZone: js.UndefOr[scala.Boolean] = js.undefined,
    registerWithEureka: js.UndefOr[scala.Boolean] = js.undefined,
    registryFetchInterval: scala.Int | scala.Double = null,
    requestRetryDelay: scala.Int | scala.Double = null,
    servicePath: java.lang.String = null,
    shouldUseDelta: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    useDns: js.UndefOr[scala.Boolean] = js.undefined,
    useLocalMetadata: js.UndefOr[scala.Boolean] = js.undefined
  ): EurekaClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("port")(port)
    if (!js.isUndefined(clusterRefreshInterval)) __obj.updateDynamic("clusterRefreshInterval")(clusterRefreshInterval)
    if (!js.isUndefined(fetchMetadata)) __obj.updateDynamic("fetchMetadata")(fetchMetadata)
    if (!js.isUndefined(fetchRegistry)) __obj.updateDynamic("fetchRegistry")(fetchRegistry)
    if (!js.isUndefined(filterUpInstances)) __obj.updateDynamic("filterUpInstances")(filterUpInstances)
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(preferIpAddress)) __obj.updateDynamic("preferIpAddress")(preferIpAddress)
    if (!js.isUndefined(preferSameZone)) __obj.updateDynamic("preferSameZone")(preferSameZone)
    if (!js.isUndefined(registerWithEureka)) __obj.updateDynamic("registerWithEureka")(registerWithEureka)
    if (registryFetchInterval != null) __obj.updateDynamic("registryFetchInterval")(registryFetchInterval.asInstanceOf[js.Any])
    if (requestRetryDelay != null) __obj.updateDynamic("requestRetryDelay")(requestRetryDelay.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    if (!js.isUndefined(shouldUseDelta)) __obj.updateDynamic("shouldUseDelta")(shouldUseDelta)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(useDns)) __obj.updateDynamic("useDns")(useDns)
    if (!js.isUndefined(useLocalMetadata)) __obj.updateDynamic("useLocalMetadata")(useLocalMetadata)
    __obj.asInstanceOf[EurekaClientConfig]
  }
}

