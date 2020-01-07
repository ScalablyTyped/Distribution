package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies workflow execution target.Either managed_cluster or
  * cluster_selector is required.
  */
@js.native
trait Schema$WorkflowTemplatePlacement extends js.Object {
  /**
    * Optional. A selector that chooses target cluster for jobs based on
    * metadata.The selector is evaluated at the time each job is submitted.
    */
  var clusterSelector: js.UndefOr[Schema$ClusterSelector] = js.native
  /**
    * Optional. A cluster that is managed by the workflow.
    */
  var managedCluster: js.UndefOr[Schema$ManagedCluster] = js.native
}

object Schema$WorkflowTemplatePlacement {
  @scala.inline
  def apply(clusterSelector: Schema$ClusterSelector = null, managedCluster: Schema$ManagedCluster = null): Schema$WorkflowTemplatePlacement = {
    val __obj = js.Dynamic.literal()
    if (clusterSelector != null) __obj.updateDynamic("clusterSelector")(clusterSelector.asInstanceOf[js.Any])
    if (managedCluster != null) __obj.updateDynamic("managedCluster")(managedCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkflowTemplatePlacement]
  }
}

