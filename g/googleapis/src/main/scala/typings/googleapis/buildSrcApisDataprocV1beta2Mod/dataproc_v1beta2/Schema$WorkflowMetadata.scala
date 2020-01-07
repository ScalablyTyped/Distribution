package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Dataproc workflow template resource.
  */
@js.native
trait Schema$WorkflowMetadata extends js.Object {
  /**
    * Output only. The name of the target cluster.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Output only. The UUID of target cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Output only. The create cluster operation metadata.
    */
  var createCluster: js.UndefOr[Schema$ClusterOperation] = js.native
  /**
    * Output only. The delete cluster operation metadata.
    */
  var deleteCluster: js.UndefOr[Schema$ClusterOperation] = js.native
  /**
    * Output only. Workflow end time.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Output only. The workflow graph.
    */
  var graph: js.UndefOr[Schema$WorkflowGraph] = js.native
  /**
    * Map from parameter names to values that were used for those parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Workflow start time.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Output only. The workflow state.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * Output only. The &quot;resource name&quot; of the template.
    */
  var template: js.UndefOr[String] = js.native
  /**
    * Output only. The version of template at the time of workflow
    * instantiation.
    */
  var version: js.UndefOr[Double] = js.native
}

object Schema$WorkflowMetadata {
  @scala.inline
  def apply(
    clusterName: String = null,
    clusterUuid: String = null,
    createCluster: Schema$ClusterOperation = null,
    deleteCluster: Schema$ClusterOperation = null,
    endTime: String = null,
    graph: Schema$WorkflowGraph = null,
    parameters: StringDictionary[String] = null,
    startTime: String = null,
    state: String = null,
    template: String = null,
    version: Int | Double = null
  ): Schema$WorkflowMetadata = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (clusterUuid != null) __obj.updateDynamic("clusterUuid")(clusterUuid.asInstanceOf[js.Any])
    if (createCluster != null) __obj.updateDynamic("createCluster")(createCluster.asInstanceOf[js.Any])
    if (deleteCluster != null) __obj.updateDynamic("deleteCluster")(deleteCluster.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (graph != null) __obj.updateDynamic("graph")(graph.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkflowMetadata]
  }
}

