package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the identifying information, config, and status of a cluster of
  * Compute Engine instances.
  */
@js.native
trait Schema$Cluster extends js.Object {
  /**
    * Required. The cluster name. Cluster names within a project must be
    * unique. Names of deleted clusters can be reused.
    */
  var clusterName: js.UndefOr[String] = js.native
  /**
    * Output only. A cluster UUID (Unique Universal Identifier). Cloud Dataproc
    * generates this value when it creates the cluster.
    */
  var clusterUuid: js.UndefOr[String] = js.native
  /**
    * Required. The cluster config. Note that Cloud Dataproc may set default
    * values, and values may change when clusters are updated.
    */
  var config: js.UndefOr[Schema$ClusterConfig] = js.native
  /**
    * Optional. The labels to associate with this cluster. Label keys must
    * contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but,
    * if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
    * associated with a cluster.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Output only. Contains cluster daemon metrics such as HDFS and YARN
    * stats.Beta Feature: This report is available for testing purposes only.
    * It may be changed before final release.
    */
  var metrics: js.UndefOr[Schema$ClusterMetrics] = js.native
  /**
    * Required. The Google Cloud Platform project ID that the cluster belongs
    * to.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Output only. Cluster status.
    */
  var status: js.UndefOr[Schema$ClusterStatus] = js.native
  /**
    * Output only. The previous cluster status.
    */
  var statusHistory: js.UndefOr[js.Array[Schema$ClusterStatus]] = js.native
}

object Schema$Cluster {
  @scala.inline
  def apply(
    clusterName: String = null,
    clusterUuid: String = null,
    config: Schema$ClusterConfig = null,
    labels: StringDictionary[String] = null,
    metrics: Schema$ClusterMetrics = null,
    projectId: String = null,
    status: Schema$ClusterStatus = null,
    statusHistory: js.Array[Schema$ClusterStatus] = null
  ): Schema$Cluster = {
    val __obj = js.Dynamic.literal()
    if (clusterName != null) __obj.updateDynamic("clusterName")(clusterName.asInstanceOf[js.Any])
    if (clusterUuid != null) __obj.updateDynamic("clusterUuid")(clusterUuid.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (metrics != null) __obj.updateDynamic("metrics")(metrics.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusHistory != null) __obj.updateDynamic("statusHistory")(statusHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Cluster]
  }
}

