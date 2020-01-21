package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingSetupTask extends js.Object {
  /** The user has requested drain. */
  var drain: js.UndefOr[Boolean] = js.undefined
  /**
    * The TCP port on which the worker should listen for messages from
    * other streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.undefined
  /** The global topology of the streaming Dataflow job. */
  var streamingComputationTopology: js.UndefOr[TopologyConfig] = js.undefined
  /**
    * The TCP port used by the worker to communicate with the Dataflow
    * worker harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.undefined
}

object StreamingSetupTask {
  @scala.inline
  def apply(
    drain: js.UndefOr[Boolean] = js.undefined,
    receiveWorkPort: Int | Double = null,
    streamingComputationTopology: TopologyConfig = null,
    workerHarnessPort: Int | Double = null
  ): StreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(drain)) __obj.updateDynamic("drain")(drain.asInstanceOf[js.Any])
    if (receiveWorkPort != null) __obj.updateDynamic("receiveWorkPort")(receiveWorkPort.asInstanceOf[js.Any])
    if (streamingComputationTopology != null) __obj.updateDynamic("streamingComputationTopology")(streamingComputationTopology.asInstanceOf[js.Any])
    if (workerHarnessPort != null) __obj.updateDynamic("workerHarnessPort")(workerHarnessPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamingSetupTask]
  }
}

