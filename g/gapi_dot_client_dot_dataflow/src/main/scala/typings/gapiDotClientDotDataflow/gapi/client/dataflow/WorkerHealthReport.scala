package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
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
  var pods: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
  /**
    * The interval at which the worker is sending health reports.
    * The default value of 0 should be interpreted as the field is not being
    * explicitly set by the worker.
    */
  var reportInterval: js.UndefOr[String] = js.undefined
  /** Whether the VM is healthy. */
  var vmIsHealthy: js.UndefOr[Boolean] = js.undefined
  /** The time the VM was booted. */
  var vmStartupTime: js.UndefOr[String] = js.undefined
}

object WorkerHealthReport {
  @scala.inline
  def apply(
    pods: js.Array[Record[String, _]] = null,
    reportInterval: String = null,
    vmIsHealthy: js.UndefOr[Boolean] = js.undefined,
    vmStartupTime: String = null
  ): WorkerHealthReport = {
    val __obj = js.Dynamic.literal()
    if (pods != null) __obj.updateDynamic("pods")(pods.asInstanceOf[js.Any])
    if (reportInterval != null) __obj.updateDynamic("reportInterval")(reportInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(vmIsHealthy)) __obj.updateDynamic("vmIsHealthy")(vmIsHealthy.asInstanceOf[js.Any])
    if (vmStartupTime != null) __obj.updateDynamic("vmStartupTime")(vmStartupTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerHealthReport]
  }
}

