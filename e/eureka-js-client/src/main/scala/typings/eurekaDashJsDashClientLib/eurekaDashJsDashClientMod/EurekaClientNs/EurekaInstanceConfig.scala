package typings
package eurekaDashJsDashClientLib.eurekaDashJsDashClientMod.EurekaClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EurekaInstanceConfig extends js.Object {
  var actionType: js.UndefOr[ActionType] = js.undefined
  var app: java.lang.String
  var appGroupName: js.UndefOr[java.lang.String] = js.undefined
  var countryId: js.UndefOr[scala.Double] = js.undefined
  var dataCenterInfo: DataCenterInfo
  var healthCheckUrl: js.UndefOr[java.lang.String] = js.undefined
  var homePageUrl: js.UndefOr[java.lang.String] = js.undefined
  var hostName: java.lang.String
  var instanceId: js.UndefOr[java.lang.String] = js.undefined
  var ipAddr: java.lang.String
  var isCoordinatingDiscoveryServer: js.UndefOr[scala.Boolean] = js.undefined
  var lastDirtyTimestamp: js.UndefOr[scala.Double] = js.undefined
  var lastUpdatedTimestamp: js.UndefOr[scala.Double] = js.undefined
  var leaseInfo: js.UndefOr[LeaseInfo] = js.undefined
  var metadata: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var overriddenstatus: js.UndefOr[InstanceStatus] = js.undefined
  var port: js.UndefOr[scala.Double | PortWrapper | LegacyPortWrapper] = js.undefined
  var secureHealthCheckUrl: js.UndefOr[java.lang.String] = js.undefined
  var securePort: js.UndefOr[scala.Double | PortWrapper | LegacyPortWrapper] = js.undefined
  var secureVipAddress: js.UndefOr[java.lang.String] = js.undefined
  var sid: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[InstanceStatus] = js.undefined
  var statusPageUrl: js.UndefOr[java.lang.String] = js.undefined
  var vipAddress: java.lang.String
}

object EurekaInstanceConfig {
  @scala.inline
  def apply(
    app: java.lang.String,
    dataCenterInfo: DataCenterInfo,
    hostName: java.lang.String,
    ipAddr: java.lang.String,
    vipAddress: java.lang.String,
    actionType: ActionType = null,
    appGroupName: java.lang.String = null,
    countryId: scala.Int | scala.Double = null,
    healthCheckUrl: java.lang.String = null,
    homePageUrl: java.lang.String = null,
    instanceId: java.lang.String = null,
    isCoordinatingDiscoveryServer: js.UndefOr[scala.Boolean] = js.undefined,
    lastDirtyTimestamp: scala.Int | scala.Double = null,
    lastUpdatedTimestamp: scala.Int | scala.Double = null,
    leaseInfo: LeaseInfo = null,
    metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    overriddenstatus: InstanceStatus = null,
    port: scala.Double | PortWrapper | LegacyPortWrapper = null,
    secureHealthCheckUrl: java.lang.String = null,
    securePort: scala.Double | PortWrapper | LegacyPortWrapper = null,
    secureVipAddress: java.lang.String = null,
    sid: java.lang.String = null,
    status: InstanceStatus = null,
    statusPageUrl: java.lang.String = null
  ): EurekaInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("dataCenterInfo")(dataCenterInfo)
    __obj.updateDynamic("hostName")(hostName)
    __obj.updateDynamic("ipAddr")(ipAddr)
    __obj.updateDynamic("vipAddress")(vipAddress)
    if (actionType != null) __obj.updateDynamic("actionType")(actionType)
    if (appGroupName != null) __obj.updateDynamic("appGroupName")(appGroupName)
    if (countryId != null) __obj.updateDynamic("countryId")(countryId.asInstanceOf[js.Any])
    if (healthCheckUrl != null) __obj.updateDynamic("healthCheckUrl")(healthCheckUrl)
    if (homePageUrl != null) __obj.updateDynamic("homePageUrl")(homePageUrl)
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId)
    if (!js.isUndefined(isCoordinatingDiscoveryServer)) __obj.updateDynamic("isCoordinatingDiscoveryServer")(isCoordinatingDiscoveryServer)
    if (lastDirtyTimestamp != null) __obj.updateDynamic("lastDirtyTimestamp")(lastDirtyTimestamp.asInstanceOf[js.Any])
    if (lastUpdatedTimestamp != null) __obj.updateDynamic("lastUpdatedTimestamp")(lastUpdatedTimestamp.asInstanceOf[js.Any])
    if (leaseInfo != null) __obj.updateDynamic("leaseInfo")(leaseInfo)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (overriddenstatus != null) __obj.updateDynamic("overriddenstatus")(overriddenstatus)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (secureHealthCheckUrl != null) __obj.updateDynamic("secureHealthCheckUrl")(secureHealthCheckUrl)
    if (securePort != null) __obj.updateDynamic("securePort")(securePort.asInstanceOf[js.Any])
    if (secureVipAddress != null) __obj.updateDynamic("secureVipAddress")(secureVipAddress)
    if (sid != null) __obj.updateDynamic("sid")(sid)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusPageUrl != null) __obj.updateDynamic("statusPageUrl")(statusPageUrl)
    __obj.asInstanceOf[EurekaInstanceConfig]
  }
}

