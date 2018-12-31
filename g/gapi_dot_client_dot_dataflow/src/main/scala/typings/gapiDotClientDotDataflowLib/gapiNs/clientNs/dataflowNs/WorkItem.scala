package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItem extends js.Object {
  /** Work item-specific configuration as an opaque blob. */
  var configuration: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies this WorkItem. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The initial index to use when reporting the status of the WorkItem. */
  var initialReportIndex: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies the workflow job this WorkItem belongs to. */
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  /** Time when the lease on this Work will expire. */
  var leaseExpireTime: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information for MapTask WorkItems. */
  var mapTask: js.UndefOr[MapTask] = js.undefined
  /**
    * Any required packages that need to be fetched in order to execute
    * this WorkItem.
    */
  var packages: js.UndefOr[js.Array[Package]] = js.undefined
  /** Identifies the cloud project this WorkItem belongs to. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information for SeqMapTask WorkItems. */
  var seqMapTask: js.UndefOr[SeqMapTask] = js.undefined
  /** Additional information for ShellTask WorkItems. */
  var shellTask: js.UndefOr[ShellTask] = js.undefined
  /** Additional information for source operation WorkItems. */
  var sourceOperationTask: js.UndefOr[SourceOperationRequest] = js.undefined
  /** Additional information for StreamingComputationTask WorkItems. */
  var streamingComputationTask: js.UndefOr[StreamingComputationTask] = js.undefined
  /** Additional information for StreamingConfigTask WorkItems. */
  var streamingConfigTask: js.UndefOr[StreamingConfigTask] = js.undefined
  /** Additional information for StreamingSetupTask WorkItems. */
  var streamingSetupTask: js.UndefOr[StreamingSetupTask] = js.undefined
}

