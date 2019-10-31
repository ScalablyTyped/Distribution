package typings.eurekaDashJsDashClient.eurekaDashJsDashClientMod.EurekaClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaClientConfig extends js.Object {
  var clusterRefreshInterval: js.UndefOr[Boolean] = js.undefined
  var fetchMetadata: js.UndefOr[Boolean] = js.undefined
  var fetchRegistry: js.UndefOr[Boolean] = js.undefined
  var filterUpInstances: js.UndefOr[Boolean] = js.undefined
  var heartbeatInterval: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var preferIpAddress: js.UndefOr[Boolean] = js.undefined
  var preferSameZone: js.UndefOr[Boolean] = js.undefined
  var registerWithEureka: js.UndefOr[Boolean] = js.undefined
  var registryFetchInterval: js.UndefOr[Double] = js.undefined
  var requestRetryDelay: js.UndefOr[Double] = js.undefined
  var servicePath: js.UndefOr[String] = js.undefined
  var serviceUrls: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
  var useDns: js.UndefOr[Boolean] = js.undefined
  var useLocalMetadata: js.UndefOr[Boolean] = js.undefined
}

object EurekaClientConfig {
  @scala.inline
  def apply(
    clusterRefreshInterval: js.UndefOr[Boolean] = js.undefined,
    fetchMetadata: js.UndefOr[Boolean] = js.undefined,
    fetchRegistry: js.UndefOr[Boolean] = js.undefined,
    filterUpInstances: js.UndefOr[Boolean] = js.undefined,
    heartbeatInterval: Int | Double = null,
    host: String = null,
    maxRetries: Int | Double = null,
    port: Int | Double = null,
    preferIpAddress: js.UndefOr[Boolean] = js.undefined,
    preferSameZone: js.UndefOr[Boolean] = js.undefined,
    registerWithEureka: js.UndefOr[Boolean] = js.undefined,
    registryFetchInterval: Int | Double = null,
    requestRetryDelay: Int | Double = null,
    servicePath: String = null,
    serviceUrls: StringDictionary[js.Array[String]] = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    useDns: js.UndefOr[Boolean] = js.undefined,
    useLocalMetadata: js.UndefOr[Boolean] = js.undefined
  ): EurekaClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clusterRefreshInterval)) __obj.updateDynamic("clusterRefreshInterval")(clusterRefreshInterval)
    if (!js.isUndefined(fetchMetadata)) __obj.updateDynamic("fetchMetadata")(fetchMetadata)
    if (!js.isUndefined(fetchRegistry)) __obj.updateDynamic("fetchRegistry")(fetchRegistry)
    if (!js.isUndefined(filterUpInstances)) __obj.updateDynamic("filterUpInstances")(filterUpInstances)
    if (heartbeatInterval != null) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(preferIpAddress)) __obj.updateDynamic("preferIpAddress")(preferIpAddress)
    if (!js.isUndefined(preferSameZone)) __obj.updateDynamic("preferSameZone")(preferSameZone)
    if (!js.isUndefined(registerWithEureka)) __obj.updateDynamic("registerWithEureka")(registerWithEureka)
    if (registryFetchInterval != null) __obj.updateDynamic("registryFetchInterval")(registryFetchInterval.asInstanceOf[js.Any])
    if (requestRetryDelay != null) __obj.updateDynamic("requestRetryDelay")(requestRetryDelay.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath)
    if (serviceUrls != null) __obj.updateDynamic("serviceUrls")(serviceUrls)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (!js.isUndefined(useDns)) __obj.updateDynamic("useDns")(useDns)
    if (!js.isUndefined(useLocalMetadata)) __obj.updateDynamic("useLocalMetadata")(useLocalMetadata)
    __obj.asInstanceOf[EurekaClientConfig]
  }
}

