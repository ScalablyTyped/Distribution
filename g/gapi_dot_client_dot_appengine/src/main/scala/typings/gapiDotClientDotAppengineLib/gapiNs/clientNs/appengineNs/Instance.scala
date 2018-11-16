package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Instance extends js.Object {
  /** App Engine release this instance is running on.@OutputOnly */
  var appEngineRelease: js.UndefOr[java.lang.String] = js.undefined
  /** Availability of the instance.@OutputOnly */
  var availability: js.UndefOr[java.lang.String] = js.undefined
  /** Average latency (ms) over the last minute.@OutputOnly */
  var averageLatency: js.UndefOr[scala.Double] = js.undefined
  /** Number of errors since this instance was started.@OutputOnly */
  var errors: js.UndefOr[scala.Double] = js.undefined
  /** Relative name of the instance within the version. Example: instance-1.@OutputOnly */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Total memory in use (bytes).@OutputOnly */
  var memoryUsage: js.UndefOr[java.lang.String] = js.undefined
  /** Full path to the Instance resource in the API. Example: apps/myapp/services/default/versions/v1/instances/instance-1.@OutputOnly */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Average queries per second (QPS) over the last minute.@OutputOnly */
  var qps: js.UndefOr[scala.Double] = js.undefined
  /** Number of requests since this instance was started.@OutputOnly */
  var requests: js.UndefOr[scala.Double] = js.undefined
  /** Time that this instance was started.@OutputOnly */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this instance is in debug mode. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmDebugEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Virtual machine ID of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmId: js.UndefOr[java.lang.String] = js.undefined
  /** The IP address of this instance. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmIp: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmName: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the virtual machine where this instance lives. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmStatus: js.UndefOr[java.lang.String] = js.undefined
  /** Zone where the virtual machine is located. Only applicable for instances in App Engine flexible environment.@OutputOnly */
  var vmZoneName: js.UndefOr[java.lang.String] = js.undefined
}

