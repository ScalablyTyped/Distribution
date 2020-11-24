package typings.eurekaJsClient.mod.EurekaClient

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EurekaInstanceConfig extends js.Object {
  
  var actionType: js.UndefOr[ActionType] = js.native
  
  var app: String = js.native
  
  var appGroupName: js.UndefOr[String] = js.native
  
  var countryId: js.UndefOr[Double] = js.native
  
  var dataCenterInfo: DataCenterInfo = js.native
  
  var healthCheckUrl: js.UndefOr[String] = js.native
  
  var homePageUrl: js.UndefOr[String] = js.native
  
  var hostName: String = js.native
  
  var instanceId: js.UndefOr[String] = js.native
  
  var ipAddr: String = js.native
  
  var isCoordinatingDiscoveryServer: js.UndefOr[Boolean] = js.native
  
  var lastDirtyTimestamp: js.UndefOr[Double] = js.native
  
  var lastUpdatedTimestamp: js.UndefOr[Double] = js.native
  
  var leaseInfo: js.UndefOr[LeaseInfo] = js.native
  
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  var overriddenstatus: js.UndefOr[InstanceStatus] = js.native
  
  var port: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.native
  
  var secureHealthCheckUrl: js.UndefOr[String] = js.native
  
  var securePort: js.UndefOr[Double | PortWrapper | LegacyPortWrapper] = js.native
  
  var secureVipAddress: js.UndefOr[String] = js.native
  
  var sid: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[InstanceStatus] = js.native
  
  var statusPageUrl: js.UndefOr[String] = js.native
  
  var vipAddress: String = js.native
}
object EurekaInstanceConfig {
  
  @scala.inline
  def apply(app: String, dataCenterInfo: DataCenterInfo, hostName: String, ipAddr: String, vipAddress: String): EurekaInstanceConfig = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], dataCenterInfo = dataCenterInfo.asInstanceOf[js.Any], hostName = hostName.asInstanceOf[js.Any], ipAddr = ipAddr.asInstanceOf[js.Any], vipAddress = vipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[EurekaInstanceConfig]
  }
  
  @scala.inline
  implicit class EurekaInstanceConfigOps[Self <: EurekaInstanceConfig] (val x: Self) extends AnyVal {
    
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
    def setApp(value: String): Self = this.set("app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataCenterInfo(value: DataCenterInfo): Self = this.set("dataCenterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddr(value: String): Self = this.set("ipAddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVipAddress(value: String): Self = this.set("vipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionType(value: ActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionType: Self = this.set("actionType", js.undefined)
    
    @scala.inline
    def setAppGroupName(value: String): Self = this.set("appGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppGroupName: Self = this.set("appGroupName", js.undefined)
    
    @scala.inline
    def setCountryId(value: Double): Self = this.set("countryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryId: Self = this.set("countryId", js.undefined)
    
    @scala.inline
    def setHealthCheckUrl(value: String): Self = this.set("healthCheckUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckUrl: Self = this.set("healthCheckUrl", js.undefined)
    
    @scala.inline
    def setHomePageUrl(value: String): Self = this.set("homePageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomePageUrl: Self = this.set("homePageUrl", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    
    @scala.inline
    def setIsCoordinatingDiscoveryServer(value: Boolean): Self = this.set("isCoordinatingDiscoveryServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCoordinatingDiscoveryServer: Self = this.set("isCoordinatingDiscoveryServer", js.undefined)
    
    @scala.inline
    def setLastDirtyTimestamp(value: Double): Self = this.set("lastDirtyTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastDirtyTimestamp: Self = this.set("lastDirtyTimestamp", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: Double): Self = this.set("lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("lastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setLeaseInfo(value: LeaseInfo): Self = this.set("leaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaseInfo: Self = this.set("leaseInfo", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOverriddenstatus(value: InstanceStatus): Self = this.set("overriddenstatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverriddenstatus: Self = this.set("overriddenstatus", js.undefined)
    
    @scala.inline
    def setPort(value: Double | PortWrapper | LegacyPortWrapper): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSecureHealthCheckUrl(value: String): Self = this.set("secureHealthCheckUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureHealthCheckUrl: Self = this.set("secureHealthCheckUrl", js.undefined)
    
    @scala.inline
    def setSecurePort(value: Double | PortWrapper | LegacyPortWrapper): Self = this.set("securePort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurePort: Self = this.set("securePort", js.undefined)
    
    @scala.inline
    def setSecureVipAddress(value: String): Self = this.set("secureVipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecureVipAddress: Self = this.set("secureVipAddress", js.undefined)
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSid: Self = this.set("sid", js.undefined)
    
    @scala.inline
    def setStatus(value: InstanceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusPageUrl(value: String): Self = this.set("statusPageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusPageUrl: Self = this.set("statusPageUrl", js.undefined)
  }
}
