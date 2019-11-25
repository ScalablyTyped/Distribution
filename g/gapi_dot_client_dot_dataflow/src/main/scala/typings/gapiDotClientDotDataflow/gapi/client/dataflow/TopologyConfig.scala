package typings.gapiDotClientDotDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopologyConfig extends js.Object {
  /** The computations associated with a streaming Dataflow job. */
  var computations: js.UndefOr[js.Array[ComputationTopology]] = js.undefined
  /** The disks assigned to a streaming Dataflow job. */
  var dataDiskAssignments: js.UndefOr[js.Array[DataDiskAssignment]] = js.undefined
  /** The size (in bits) of keys that will be assigned to source messages. */
  var forwardingKeyBits: js.UndefOr[Double] = js.undefined
  /** Version number for persistent state. */
  var persistentStateVersion: js.UndefOr[Double] = js.undefined
  /** Maps user stage names to stable computation names. */
  var userStageToComputationNameMap: js.UndefOr[Record[String, String]] = js.undefined
}

object TopologyConfig {
  @scala.inline
  def apply(
    computations: js.Array[ComputationTopology] = null,
    dataDiskAssignments: js.Array[DataDiskAssignment] = null,
    forwardingKeyBits: Int | Double = null,
    persistentStateVersion: Int | Double = null,
    userStageToComputationNameMap: Record[String, String] = null
  ): TopologyConfig = {
    val __obj = js.Dynamic.literal()
    if (computations != null) __obj.updateDynamic("computations")(computations.asInstanceOf[js.Any])
    if (dataDiskAssignments != null) __obj.updateDynamic("dataDiskAssignments")(dataDiskAssignments.asInstanceOf[js.Any])
    if (forwardingKeyBits != null) __obj.updateDynamic("forwardingKeyBits")(forwardingKeyBits.asInstanceOf[js.Any])
    if (persistentStateVersion != null) __obj.updateDynamic("persistentStateVersion")(persistentStateVersion.asInstanceOf[js.Any])
    if (userStageToComputationNameMap != null) __obj.updateDynamic("userStageToComputationNameMap")(userStageToComputationNameMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopologyConfig]
  }
}

