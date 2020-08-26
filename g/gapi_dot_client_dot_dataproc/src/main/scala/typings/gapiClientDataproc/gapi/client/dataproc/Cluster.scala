package typings.gapiClientDataproc.gapi.client.dataproc

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /** Required. The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused. */
  var clusterName: js.UndefOr[String] = js.native
  /** Output-only. A cluster UUID (Unique Universal Identifier). Cloud Dataproc generates this value when it creates the cluster. */
  var clusterUuid: js.UndefOr[String] = js.native
  /** Required. The cluster config. Note that Cloud Dataproc may set default values, and values may change when clusters are updated. */
  var config: js.UndefOr[ClusterConfig] = js.native
  /**
    * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
    * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
    */
  var labels: js.UndefOr[Record[String, String]] = js.native
  /**
    * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before
    * final release.
    */
  var metrics: js.UndefOr[ClusterMetrics] = js.native
  /** Required. The Google Cloud Platform project ID that the cluster belongs to. */
  var projectId: js.UndefOr[String] = js.native
  /** Output-only. Cluster status. */
  var status: js.UndefOr[ClusterStatus] = js.native
  /** Output-only. The previous cluster status. */
  var statusHistory: js.UndefOr[js.Array[ClusterStatus]] = js.native
}

object Cluster {
  @scala.inline
  def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  @scala.inline
  implicit class ClusterOps[Self <: Cluster] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    @scala.inline
    def setClusterUuid(value: String): Self = this.set("clusterUuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterUuid: Self = this.set("clusterUuid", js.undefined)
    @scala.inline
    def setConfig(value: ClusterConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    @scala.inline
    def setLabels(value: Record[String, String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setMetrics(value: ClusterMetrics): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setStatus(value: ClusterStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusHistoryVarargs(value: ClusterStatus*): Self = this.set("statusHistory", js.Array(value :_*))
    @scala.inline
    def setStatusHistory(value: js.Array[ClusterStatus]): Self = this.set("statusHistory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusHistory: Self = this.set("statusHistory", js.undefined)
  }
  
}

