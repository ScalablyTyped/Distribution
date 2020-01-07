package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata describing the operation.
  */
@js.native
trait Schema$ClusterOperationMetadata extends js.Object {
  /**
    * Output only. Name of the cluster for the operation.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Output only. Cluster UUID for the operation.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Output only. Short description of operation.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. Labels associated with the operation
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. The operation type.
    */
  var operationType: js.UndefOr[String] = js.native
  /**
    * Output only. Current operation status.
    */
  var status: js.UndefOr[Schema$ClusterOperationStatus] = js.native
  /**
    * Output only. The previous operation status.
    */
  var statusHistory: js.UndefOr[js.Array[Schema$ClusterOperationStatus]] = js.native
  /**
    * Output only. Errors encountered during operation execution.
    */
  var warnings: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ClusterOperationMetadata {
  @scala.inline
  def apply(
    clusterName: String = null,
    clusterUuid: String = null,
    description: String = null,
    labels: StringDictionary[String] = null,
    operationType: String = null,
    status: Schema$ClusterOperationStatus = null,
    statusHistory: js.Array[Schema$ClusterOperationStatus] = null,
    warnings: js.Array[String] = null
  ): Schema$ClusterOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (clusterUuid != null) __obj.updateDynamic("clusterUuid")(clusterUuid.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClusterOperationMetadata]
  }
}

