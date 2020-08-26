package typings.gapiClientDataflow.gapi.client.dataflow

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopologyConfig extends js.Object {
  /** The computations associated with a streaming Dataflow job. */
  var computations: js.UndefOr[js.Array[ComputationTopology]] = js.native
  /** The disks assigned to a streaming Dataflow job. */
  var dataDiskAssignments: js.UndefOr[js.Array[DataDiskAssignment]] = js.native
  /** The size (in bits) of keys that will be assigned to source messages. */
  var forwardingKeyBits: js.UndefOr[Double] = js.native
  /** Version number for persistent state. */
  var persistentStateVersion: js.UndefOr[Double] = js.native
  /** Maps user stage names to stable computation names. */
  var userStageToComputationNameMap: js.UndefOr[Record[String, String]] = js.native
}

object TopologyConfig {
  @scala.inline
  def apply(): TopologyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopologyConfig]
  }
  @scala.inline
  implicit class TopologyConfigOps[Self <: TopologyConfig] (val x: Self) extends AnyVal {
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
    def setComputationsVarargs(value: ComputationTopology*): Self = this.set("computations", js.Array(value :_*))
    @scala.inline
    def setComputations(value: js.Array[ComputationTopology]): Self = this.set("computations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputations: Self = this.set("computations", js.undefined)
    @scala.inline
    def setDataDiskAssignmentsVarargs(value: DataDiskAssignment*): Self = this.set("dataDiskAssignments", js.Array(value :_*))
    @scala.inline
    def setDataDiskAssignments(value: js.Array[DataDiskAssignment]): Self = this.set("dataDiskAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDiskAssignments: Self = this.set("dataDiskAssignments", js.undefined)
    @scala.inline
    def setForwardingKeyBits(value: Double): Self = this.set("forwardingKeyBits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForwardingKeyBits: Self = this.set("forwardingKeyBits", js.undefined)
    @scala.inline
    def setPersistentStateVersion(value: Double): Self = this.set("persistentStateVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistentStateVersion: Self = this.set("persistentStateVersion", js.undefined)
    @scala.inline
    def setUserStageToComputationNameMap(value: Record[String, String]): Self = this.set("userStageToComputationNameMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserStageToComputationNameMap: Self = this.set("userStageToComputationNameMap", js.undefined)
  }
  
}

