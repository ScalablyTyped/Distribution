package typings.eurekaJsClient.mod.EurekaClient

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
    heartbeatInterval: js.UndefOr[Double] = js.undefined,
    host: String = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    preferIpAddress: js.UndefOr[Boolean] = js.undefined,
    preferSameZone: js.UndefOr[Boolean] = js.undefined,
    registerWithEureka: js.UndefOr[Boolean] = js.undefined,
    registryFetchInterval: js.UndefOr[Double] = js.undefined,
    requestRetryDelay: js.UndefOr[Double] = js.undefined,
    servicePath: String = null,
    serviceUrls: StringDictionary[js.Array[String]] = null,
    ssl: js.UndefOr[Boolean] = js.undefined,
    useDns: js.UndefOr[Boolean] = js.undefined,
    useLocalMetadata: js.UndefOr[Boolean] = js.undefined
  ): EurekaClientConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clusterRefreshInterval)) __obj.updateDynamic("clusterRefreshInterval")(clusterRefreshInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchMetadata)) __obj.updateDynamic("fetchMetadata")(fetchMetadata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fetchRegistry)) __obj.updateDynamic("fetchRegistry")(fetchRegistry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(filterUpInstances)) __obj.updateDynamic("filterUpInstances")(filterUpInstances.get.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatInterval)) __obj.updateDynamic("heartbeatInterval")(heartbeatInterval.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferIpAddress)) __obj.updateDynamic("preferIpAddress")(preferIpAddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preferSameZone)) __obj.updateDynamic("preferSameZone")(preferSameZone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(registerWithEureka)) __obj.updateDynamic("registerWithEureka")(registerWithEureka.get.asInstanceOf[js.Any])
    if (!js.isUndefined(registryFetchInterval)) __obj.updateDynamic("registryFetchInterval")(registryFetchInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestRetryDelay)) __obj.updateDynamic("requestRetryDelay")(requestRetryDelay.get.asInstanceOf[js.Any])
    if (servicePath != null) __obj.updateDynamic("servicePath")(servicePath.asInstanceOf[js.Any])
    if (serviceUrls != null) __obj.updateDynamic("serviceUrls")(serviceUrls.asInstanceOf[js.Any])
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useDns)) __obj.updateDynamic("useDns")(useDns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLocalMetadata)) __obj.updateDynamic("useLocalMetadata")(useLocalMetadata.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaClientConfig]
  }
}

