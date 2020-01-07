package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The workflow graph.
  */
@js.native
trait Schema$WorkflowGraph extends js.Object {
  /**
    * Output only. The workflow nodes.
    */
  var nodes: js.UndefOr[js.Array[Schema$WorkflowNode]] = js.native
}

object Schema$WorkflowGraph {
  @scala.inline
  def apply(nodes: js.Array[Schema$WorkflowNode] = null): Schema$WorkflowGraph = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkflowGraph]
  }
}

