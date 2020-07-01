package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Instance resource is the computing unit that App Engine uses to
  * automatically scale an application.
  */
@js.native
trait SchemaInstance extends js.Object {
  /**
    * App Engine release this instance is running on.@OutputOnly
    */
  var appEngineRelease: js.UndefOr[String] = js.native
  /**
    * Availability of the instance.@OutputOnly
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * Average latency (ms) over the last minute.@OutputOnly
    */
  var averageLatency: js.UndefOr[Double] = js.native
  /**
    * Number of errors since this instance was started.@OutputOnly
    */
  var errors: js.UndefOr[Double] = js.native
  /**
    * Relative name of the instance within the version. Example:
    * instance-1.@OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Total memory in use (bytes).@OutputOnly
    */
  var memoryUsage: js.UndefOr[String] = js.native
  /**
    * Full path to the Instance resource in the API. Example:
    * apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Average queries per second (QPS) over the last minute.@OutputOnly
    */
  var qps: js.UndefOr[Double] = js.native
  /**
    * Number of requests since this instance was started.@OutputOnly
    */
  var requests: js.UndefOr[Double] = js.native
  /**
    * Time that this instance was started.@OutputOnly
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Whether this instance is in debug mode. Only applicable for instances in
    * App Engine flexible environment.@OutputOnly
    */
  var vmDebugEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Virtual machine ID of this instance. Only applicable for instances in App
    * Engine flexible environment.@OutputOnly
    */
  var vmId: js.UndefOr[String] = js.native
  /**
    * The IP address of this instance. Only applicable for instances in App
    * Engine flexible environment.@OutputOnly
    */
  var vmIp: js.UndefOr[String] = js.native
  /**
    * Name of the virtual machine where this instance lives. Only applicable
    * for instances in App Engine flexible environment.@OutputOnly
    */
  var vmName: js.UndefOr[String] = js.native
  /**
    * Status of the virtual machine where this instance lives. Only applicable
    * for instances in App Engine flexible environment.@OutputOnly
    */
  var vmStatus: js.UndefOr[String] = js.native
  /**
    * Zone where the virtual machine is located. Only applicable for instances
    * in App Engine flexible environment.@OutputOnly
    */
  var vmZoneName: js.UndefOr[String] = js.native
}

object SchemaInstance {
  @scala.inline
  def apply(
    appEngineRelease: String = null,
    availability: String = null,
    averageLatency: js.UndefOr[Double] = js.undefined,
    errors: js.UndefOr[Double] = js.undefined,
    id: String = null,
    memoryUsage: String = null,
    name: String = null,
    qps: js.UndefOr[Double] = js.undefined,
    requests: js.UndefOr[Double] = js.undefined,
    startTime: String = null,
    vmDebugEnabled: js.UndefOr[Boolean] = js.undefined,
    vmId: String = null,
    vmIp: String = null,
    vmName: String = null,
    vmStatus: String = null,
    vmZoneName: String = null
  ): SchemaInstance = {
    val __obj = js.Dynamic.literal()
    if (appEngineRelease != null) __obj.updateDynamic("appEngineRelease")(appEngineRelease.asInstanceOf[js.Any])
    if (availability != null) __obj.updateDynamic("availability")(availability.asInstanceOf[js.Any])
    if (!js.isUndefined(averageLatency)) __obj.updateDynamic("averageLatency")(averageLatency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (memoryUsage != null) __obj.updateDynamic("memoryUsage")(memoryUsage.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(qps)) __obj.updateDynamic("qps")(qps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requests)) __obj.updateDynamic("requests")(requests.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(vmDebugEnabled)) __obj.updateDynamic("vmDebugEnabled")(vmDebugEnabled.get.asInstanceOf[js.Any])
    if (vmId != null) __obj.updateDynamic("vmId")(vmId.asInstanceOf[js.Any])
    if (vmIp != null) __obj.updateDynamic("vmIp")(vmIp.asInstanceOf[js.Any])
    if (vmName != null) __obj.updateDynamic("vmName")(vmName.asInstanceOf[js.Any])
    if (vmStatus != null) __obj.updateDynamic("vmStatus")(vmStatus.asInstanceOf[js.Any])
    if (vmZoneName != null) __obj.updateDynamic("vmZoneName")(vmZoneName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstance]
  }
}

