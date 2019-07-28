package typings.gapiDotClientDotDataproc.gapiNs.clientNs.dataprocNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /** Required. The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused. */
  var clusterName: js.UndefOr[String] = js.undefined
  /** Output-only. A cluster UUID (Unique Universal Identifier). Cloud Dataproc generates this value when it creates the cluster. */
  var clusterUuid: js.UndefOr[String] = js.undefined
  /** Required. The cluster config. Note that Cloud Dataproc may set default values, and values may change when clusters are updated. */
  var config: js.UndefOr[ClusterConfig] = js.undefined
  /**
    * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
    */
  var labels: js.UndefOr[Record[String, String]] = js.undefined
  /**
    * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before
    * final release.
    */
  var metrics: js.UndefOr[ClusterMetrics] = js.undefined
  /** Required. The Google Cloud Platform project ID that the cluster belongs to. */
  var projectId: js.UndefOr[String] = js.undefined
  /** Output-only. Cluster status. */
  var status: js.UndefOr[ClusterStatus] = js.undefined
  /** Output-only. The previous cluster status. */
  var statusHistory: js.UndefOr[js.Array[ClusterStatus]] = js.undefined
}

object Cluster {
  @scala.inline
  def apply(
    clusterName: String = null,
    clusterUuid: String = null,
    config: ClusterConfig = null,
    labels: Record[String, String] = null,
    metrics: ClusterMetrics = null,
    projectId: String = null,
    status: ClusterStatus = null,
    statusHistory: js.Array[ClusterStatus] = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName)
    if (clusterUuid != null) __obj.updateDynamic("clusterUuid")(clusterUuid)
    if (config != null) __obj.updateDynamic("config")(config)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory)
    __obj.asInstanceOf[Cluster]
  }
}

