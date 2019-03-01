package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerHealthReport extends js.Object {
  /**
    * The pods running on the worker. See:
    * http://kubernetes.io/v1.1/docs/api-reference/v1/definitions.html#_v1_pod
    *
    * This field is used by the worker to send the status of the indvidual
    * containers running on each worker.
    */
  var pods: js.UndefOr[js.Array[stdLib.Record[java.lang.String, _]]] = js.undefined
  /**
    * The interval at which the worker is sending health reports.
    * The default value of 0 should be interpreted as the field is not being
    * explicitly set by the worker.
    */
  var reportInterval: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the VM is healthy. */
  var vmIsHealthy: js.UndefOr[scala.Boolean] = js.undefined
  /** The time the VM was booted. */
  var vmStartupTime: js.UndefOr[java.lang.String] = js.undefined
}

object WorkerHealthReport {
  @scala.inline
  def apply(
    pods: js.Array[stdLib.Record[java.lang.String, _]] = null,
    reportInterval: java.lang.String = null,
    vmIsHealthy: js.UndefOr[scala.Boolean] = js.undefined,
    vmStartupTime: java.lang.String = null
  ): WorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    if (pods != null) __obj.updateDynamic("pods")(pods)
    if (reportInterval != null) __obj.updateDynamic("reportInterval")(reportInterval)
    if (!js.isUndefined(vmIsHealthy)) __obj.updateDynamic("vmIsHealthy")(vmIsHealthy)
    if (vmStartupTime != null) __obj.updateDynamic("vmStartupTime")(vmStartupTime)
    __obj.asInstanceOf[WorkerHealthReport]
  }
}

