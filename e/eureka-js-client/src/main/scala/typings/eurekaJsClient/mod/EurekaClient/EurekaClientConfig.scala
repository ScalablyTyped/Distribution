package typings.eurekaJsClient.mod.EurekaClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EurekaClientConfig extends js.Object {
  
  var clusterRefreshInterval: js.UndefOr[Boolean] = js.native
  
  var fetchMetadata: js.UndefOr[Boolean] = js.native
  
  var fetchRegistry: js.UndefOr[Boolean] = js.native
  
  var filterUpInstances: js.UndefOr[Boolean] = js.native
  
  var heartbeatInterval: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var preferIpAddress: js.UndefOr[Boolean] = js.native
  
  var preferSameZone: js.UndefOr[Boolean] = js.native
  
  var registerWithEureka: js.UndefOr[Boolean] = js.native
  
  var registryFetchInterval: js.UndefOr[Double] = js.native
  
  var requestRetryDelay: js.UndefOr[Double] = js.native
  
  var servicePath: js.UndefOr[String] = js.native
  
  var serviceUrls: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
  
  var useDns: js.UndefOr[Boolean] = js.native
  
  var useLocalMetadata: js.UndefOr[Boolean] = js.native
}
object EurekaClientConfig {
  
  @scala.inline
  def apply(): EurekaClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EurekaClientConfig]
  }
  
  @scala.inline
  implicit class EurekaClientConfigOps[Self <: EurekaClientConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterRefreshInterval(value: Boolean): Self = this.set("clusterRefreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterRefreshInterval: Self = this.set("clusterRefreshInterval", js.undefined)
    
    @scala.inline
    def setFetchMetadata(value: Boolean): Self = this.set("fetchMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchMetadata: Self = this.set("fetchMetadata", js.undefined)
    
    @scala.inline
    def setFetchRegistry(value: Boolean): Self = this.set("fetchRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchRegistry: Self = this.set("fetchRegistry", js.undefined)
    
    @scala.inline
    def setFilterUpInstances(value: Boolean): Self = this.set("filterUpInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterUpInstances: Self = this.set("filterUpInstances", js.undefined)
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = this.set("heartbeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatInterval: Self = this.set("heartbeatInterval", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPreferIpAddress(value: Boolean): Self = this.set("preferIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferIpAddress: Self = this.set("preferIpAddress", js.undefined)
    
    @scala.inline
    def setPreferSameZone(value: Boolean): Self = this.set("preferSameZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferSameZone: Self = this.set("preferSameZone", js.undefined)
    
    @scala.inline
    def setRegisterWithEureka(value: Boolean): Self = this.set("registerWithEureka", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisterWithEureka: Self = this.set("registerWithEureka", js.undefined)
    
    @scala.inline
    def setRegistryFetchInterval(value: Double): Self = this.set("registryFetchInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistryFetchInterval: Self = this.set("registryFetchInterval", js.undefined)
    
    @scala.inline
    def setRequestRetryDelay(value: Double): Self = this.set("requestRetryDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestRetryDelay: Self = this.set("requestRetryDelay", js.undefined)
    
    @scala.inline
    def setServicePath(value: String): Self = this.set("servicePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServicePath: Self = this.set("servicePath", js.undefined)
    
    @scala.inline
    def setServiceUrls(value: StringDictionary[js.Array[String]]): Self = this.set("serviceUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceUrls: Self = this.set("serviceUrls", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setUseDns(value: Boolean): Self = this.set("useDns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDns: Self = this.set("useDns", js.undefined)
    
    @scala.inline
    def setUseLocalMetadata(value: Boolean): Self = this.set("useLocalMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseLocalMetadata: Self = this.set("useLocalMetadata", js.undefined)
  }
}
