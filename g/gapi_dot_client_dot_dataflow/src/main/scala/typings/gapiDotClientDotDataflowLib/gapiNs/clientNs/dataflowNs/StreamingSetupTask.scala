package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingSetupTask extends js.Object {
  /** The user has requested drain. */
  var drain: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The TCP port on which the worker should listen for messages from
    * other streaming computation workers.
    */
  var receiveWorkPort: js.UndefOr[scala.Double] = js.undefined
  /** The global topology of the streaming Dataflow job. */
  var streamingComputationTopology: js.UndefOr[TopologyConfig] = js.undefined
  /**
    * The TCP port used by the worker to communicate with the Dataflow
    * worker harness.
    */
  var workerHarnessPort: js.UndefOr[scala.Double] = js.undefined
}

