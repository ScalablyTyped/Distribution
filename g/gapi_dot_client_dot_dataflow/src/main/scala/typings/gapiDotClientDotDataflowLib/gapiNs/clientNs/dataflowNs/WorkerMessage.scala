package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerMessage extends js.Object {
  /**
    * Labels are used to group WorkerMessages.
    * For example, a worker_message about a particular container
    * might have the labels:
    * { "JOB_ID": "2015-04-22",
    * "WORKER_ID": "wordcount-vm-2015…"
    * "CONTAINER_TYPE": "worker",
    * "CONTAINER_ID": "ac1234def"}
    * Label tags typically correspond to Label enum values. However, for ease
    * of development other strings can be used as tags. LABEL_UNSPECIFIED should
    * not be used here.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The timestamp of the worker_message. */
  var time: js.UndefOr[java.lang.String] = js.undefined
  /** The health of a worker. */
  var workerHealthReport: js.UndefOr[WorkerHealthReport] = js.undefined
  /** A worker message code. */
  var workerMessageCode: js.UndefOr[WorkerMessageCode] = js.undefined
  /** Resource metrics reported by workers. */
  var workerMetrics: js.UndefOr[ResourceUtilizationReport] = js.undefined
  /** Shutdown notice by workers. */
  var workerShutdownNotice: js.UndefOr[WorkerShutdownNotice] = js.undefined
}

