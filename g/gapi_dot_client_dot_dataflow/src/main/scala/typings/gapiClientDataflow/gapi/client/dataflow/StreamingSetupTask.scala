package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingSetupTask extends js.Object {
  /** The user has requested drain. */
  var drain: js.UndefOr[Boolean] = js.native
  /**
    * The TCP port on which the worker should listen for messages from
    * other streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[Double] = js.native
  /** The global topology of the streaming Dataflow job. */
  var streamingComputationTopology: js.UndefOr[TopologyConfig] = js.native
  /**
    * The TCP port used by the worker to communicate with the Dataflow
    * worker harness.
    */
  var workerHarnessPort: js.UndefOr[Double] = js.native
}

object StreamingSetupTask {
  @scala.inline
  def apply(): StreamingSetupTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingSetupTask]
  }
  @scala.inline
  implicit class StreamingSetupTaskOps[Self <: StreamingSetupTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDrain(value: Boolean): Self = this.set("drain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrain: Self = this.set("drain", js.undefined)
    @scala.inline
    def setReceiveWorkPort(value: Double): Self = this.set("receiveWorkPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiveWorkPort: Self = this.set("receiveWorkPort", js.undefined)
    @scala.inline
    def setStreamingComputationTopology(value: TopologyConfig): Self = this.set("streamingComputationTopology", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamingComputationTopology: Self = this.set("streamingComputationTopology", js.undefined)
    @scala.inline
    def setWorkerHarnessPort(value: Double): Self = this.set("workerHarnessPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerHarnessPort: Self = this.set("workerHarnessPort", js.undefined)
  }
  
}

