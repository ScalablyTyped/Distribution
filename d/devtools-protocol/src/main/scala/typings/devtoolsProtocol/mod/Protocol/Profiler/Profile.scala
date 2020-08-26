package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  /**
    * Profiling end timestamp in microseconds.
    */
  var endTime: Double = js.native
  /**
    * The list of profile nodes. First item is the root node.
    */
  var nodes: js.Array[ProfileNode] = js.native
  /**
    * Ids of samples top nodes.
    */
  var samples: js.UndefOr[js.Array[integer]] = js.native
  /**
    * Profiling start timestamp in microseconds.
    */
  var startTime: Double = js.native
  /**
    * Time intervals between adjacent samples in microseconds. The first delta is relative to the
    * profile startTime.
    */
  var timeDeltas: js.UndefOr[js.Array[integer]] = js.native
}

object Profile {
  @scala.inline
  def apply(endTime: Double, nodes: js.Array[ProfileNode], startTime: Double): Profile = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: ProfileNode*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[ProfileNode]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSamplesVarargs(value: integer*): Self = this.set("samples", js.Array(value :_*))
    @scala.inline
    def setSamples(value: js.Array[integer]): Self = this.set("samples", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamples: Self = this.set("samples", js.undefined)
    @scala.inline
    def setTimeDeltasVarargs(value: integer*): Self = this.set("timeDeltas", js.Array(value :_*))
    @scala.inline
    def setTimeDeltas(value: js.Array[integer]): Self = this.set("timeDeltas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeDeltas: Self = this.set("timeDeltas", js.undefined)
  }
  
}

