package typings.gapiDotClientDotDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterOperationMetadata extends js.Object {
  /** Output-only. Name of the cluster for the operation. */
  var clusterName: js.UndefOr[String] = js.undefined
  /** Output-only. Cluster UUID for the operation. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  /** Output-only. Short description of operation. */
  var description: js.UndefOr[String] = js.undefined
  /** Output-only. Labels associated with the operation */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /** Output-only. The operation type. */
  var operationType: js.UndefOr[String] = js.undefined
  /** Output-only. Current operation status. */
  var status: js.UndefOr[ClusterOperationStatus] = js.undefined
  /** Output-only. The previous operation status. */
  var statusHistory: js.UndefOr[js.Array[ClusterOperationStatus]] = js.undefined
  /** Output-only. Errors encountered during operation execution. */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}

object ClusterOperationMetadata {
  @scala.inline
  def apply(
    clusterName: String = null,
    clusterUuid: String = null,
    description: String = null,
    labels: Record[String, String] = null,
    operationType: String = null,
    status: ClusterOperationStatus = null,
    statusHistory: js.Array[ClusterOperationStatus] = null,
    warnings: js.Array[String] = null
  ): ClusterOperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (clusterUuid != null) __obj.updateDynamic("clusterUuid")(clusterUuid.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (operationType != null) __obj.updateDynamic("operationType")(operationType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOperationMetadata]
  }
}

