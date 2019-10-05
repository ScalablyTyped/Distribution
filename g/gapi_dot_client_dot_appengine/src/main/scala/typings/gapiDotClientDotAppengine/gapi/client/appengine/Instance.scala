package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /** App Engine release this instance is running on.@OutputOnly */
  var appEngineRelease: js.UndefOr[String] = js.undefined
  /** Availability of the instance.@OutputOnly */
  var availability: js.UndefOr[String] = js.undefined
  /** Average latency (ms) over the last minute.@OutputOnly */
  var averageLatency: js.UndefOr[Double] = js.undefined
  /** Number of errors since this instance was started.@OutputOnly */
  var errors: js.UndefOr[Double] = js.undefined
  /** Relative name of the instance within the version. Example: instance-1.@OutputOnly */
  var id: js.UndefOr[String] = js.undefined
  /** Total memory in use (bytes).@OutputOnly */
  var memoryUsage: js.UndefOr[String] = js.undefined
  /** Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  /** Average queries per second (QPS) over the last minute.@OutputOnly */
  var qps: js.UndefOr[Double] = js.undefined
  /** Number of requests since this instance was started.@OutputOnly */
  var requests: js.UndefOr[Double] = js.undefined
  /** Time that this instance was started.@OutputOnly */
  var startTime: js.UndefOr[String] = js.undefined
  /** Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmDebugEnabled: js.UndefOr[Boolean] = js.undefined
  /** Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmId: js.UndefOr[String] = js.undefined
  /** The IP address of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmIp: js.UndefOr[String] = js.undefined
  /** Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmName: js.UndefOr[String] = js.undefined
  /** Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmStatus: js.UndefOr[String] = js.undefined
  /** Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmZoneName: js.UndefOr[String] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    appEngineRelease: String = null,
    availability: String = null,
    averageLatency: Int | Double = null,
    errors: Int | Double = null,
    id: String = null,
    memoryUsage: String = null,
    name: String = null,
    qps: Int | Double = null,
    requests: Int | Double = null,
    startTime: String = null,
    vmDebugEnabled: js.UndefOr[Boolean] = js.undefined,
    vmId: String = null,
    vmIp: String = null,
    vmName: String = null,
    vmStatus: String = null,
    vmZoneName: String = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (appEngineRelease != null) __obj.updateDynamic("appEngineRelease")(appEngineRelease)
    if (availability != null) __obj.updateDynamic("availability")(availability)
    if (averageLatency != null) __obj.updateDynamic("averageLatency")(averageLatency.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (memoryUsage != null) __obj.updateDynamic("memoryUsage")(memoryUsage)
    if (name != null) __obj.updateDynamic("name")(name)
    if (qps != null) __obj.updateDynamic("qps")(qps.asInstanceOf[js.Any])
    if (requests != null) __obj.updateDynamic("requests")(requests.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (!js.isUndefined(vmDebugEnabled)) __obj.updateDynamic("vmDebugEnabled")(vmDebugEnabled)
    if (vmId != null) __obj.updateDynamic("vmId")(vmId)
    if (vmIp != null) __obj.updateDynamic("vmIp")(vmIp)
    if (vmName != null) __obj.updateDynamic("vmName")(vmName)
    if (vmStatus != null) __obj.updateDynamic("vmStatus")(vmStatus)
    if (vmZoneName != null) __obj.updateDynamic("vmZoneName")(vmZoneName)
    __obj.asInstanceOf[Instance]
  }
}

