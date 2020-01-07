package typings.googleapis.buildSrcApisMonitoringV3Mod.monitoring_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message configures which resources and services to monitor for
  * availability.
  */
@js.native
trait Schema$UptimeCheckConfig extends js.Object {
  /**
    * The expected content on the page the check is run against. Currently,
    * only the first entry in the list is supported, and other entries will be
    * ignored. The server will look for an exact match of the string in the
    * page response&#39;s content. This field is optional and should only be
    * specified if a content match is required.
    */
  var contentMatchers: js.UndefOr[js.Array[Schema$ContentMatcher]] = js.native
  /**
    * A human-friendly name for the uptime check configuration. The display
    * name should be unique within a Stackdriver Workspace in order to make it
    * easier to identify; however, uniqueness is not enforced. Required.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Contains information needed to make an HTTP or HTTPS check.
    */
  var httpCheck: js.UndefOr[Schema$HttpCheck] = js.native
  /**
    * The internal checkers that this check will egress from. If is_internal is
    * true and this list is empty, the check will egress from all the
    * InternalCheckers configured for the project that owns this CheckConfig.
    */
  var internalCheckers: js.UndefOr[js.Array[Schema$InternalChecker]] = js.native
  /**
    * The monitored resource
    * (https://cloud.google.com/monitoring/api/resources) associated with the
    * configuration. The following monitored resource types are supported for
    * uptime checks:  uptime_url  gce_instance  gae_app  aws_ec2_instance
    * aws_elb_load_balancer
    */
  var monitoredResource: js.UndefOr[Schema$MonitoredResource] = js.native
  /**
    * A unique resource name for this UptimeCheckConfig. The format
    * is:projects/[PROJECT_ID]/uptimeCheckConfigs/[UPTIME_CHECK_ID].This field
    * should be omitted when creating the uptime check configuration; on
    * create, the resource name is assigned by the server and included in the
    * response.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * How often, in seconds, the uptime check is performed. Currently, the only
    * supported values are 60s (1 minute), 300s (5 minutes), 600s (10 minutes),
    * and 900s (15 minutes). Optional, defaults to 60s.
    */
  var period: js.UndefOr[String] = js.native
  /**
    * The group resource associated with the configuration.
    */
  var resourceGroup: js.UndefOr[Schema$ResourceGroup] = js.native
  /**
    * The list of regions from which the check will be run. Some regions
    * contain one location, and others contain more than one. If this field is
    * specified, enough regions to include a minimum of 3 locations must be
    * provided, or an error message is returned. Not specifying this field will
    * result in uptime checks running from all regions.
    */
  var selectedRegions: js.UndefOr[js.Array[String]] = js.native
  /**
    * Contains information needed to make a TCP check.
    */
  var tcpCheck: js.UndefOr[Schema$TcpCheck] = js.native
  /**
    * The maximum amount of time to wait for the request to complete (must be
    * between 1 and 60 seconds). Required.
    */
  var timeout: js.UndefOr[String] = js.native
}

object Schema$UptimeCheckConfig {
  @scala.inline
  def apply(
    contentMatchers: js.Array[Schema$ContentMatcher] = null,
    displayName: String = null,
    httpCheck: Schema$HttpCheck = null,
    internalCheckers: js.Array[Schema$InternalChecker] = null,
    monitoredResource: Schema$MonitoredResource = null,
    name: String = null,
    period: String = null,
    resourceGroup: Schema$ResourceGroup = null,
    selectedRegions: js.Array[String] = null,
    tcpCheck: Schema$TcpCheck = null,
    timeout: String = null
  ): Schema$UptimeCheckConfig = {
    val __obj = js.Dynamic.literal()
    if (contentMatchers != null) __obj.updateDynamic("contentMatchers")(contentMatchers.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (httpCheck != null) __obj.updateDynamic("httpCheck")(httpCheck.asInstanceOf[js.Any])
    if (internalCheckers != null) __obj.updateDynamic("internalCheckers")(internalCheckers.asInstanceOf[js.Any])
    if (monitoredResource != null) __obj.updateDynamic("monitoredResource")(monitoredResource.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (resourceGroup != null) __obj.updateDynamic("resourceGroup")(resourceGroup.asInstanceOf[js.Any])
    if (selectedRegions != null) __obj.updateDynamic("selectedRegions")(selectedRegions.asInstanceOf[js.Any])
    if (tcpCheck != null) __obj.updateDynamic("tcpCheck")(tcpCheck.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UptimeCheckConfig]
  }
}

