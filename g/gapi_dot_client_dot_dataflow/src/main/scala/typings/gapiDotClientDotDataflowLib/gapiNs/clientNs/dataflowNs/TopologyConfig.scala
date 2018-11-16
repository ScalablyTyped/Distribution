package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TopologyConfig extends js.Object {
  /** The computations associated with a streaming Dataflow job. */
  var computations: js.UndefOr[js.Array[ComputationTopology]] = js.undefined
  /** The disks assigned to a streaming Dataflow job. */
  var dataDiskAssignments: js.UndefOr[js.Array[DataDiskAssignment]] = js.undefined
  /** The size (in bits) of keys that will be assigned to source messages. */
  var forwardingKeyBits: js.UndefOr[scala.Double] = js.undefined
  /** Version number for persistent state. */
  var persistentStateVersion: js.UndefOr[scala.Double] = js.undefined
  /** Maps user stage names to stable computation names. */
  var userStageToComputationNameMap: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
}

