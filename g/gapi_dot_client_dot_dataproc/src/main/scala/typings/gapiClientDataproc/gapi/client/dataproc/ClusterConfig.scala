package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterConfig extends js.Object {
  /**
    * Optional. A Google Cloud Storage staging bucket used for sharing generated SSH keys and config. If you do not specify a staging bucket, Cloud Dataproc
    * will determine an appropriate Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Google Compute Engine zone
    * where your cluster is deployed, and then it will create and manage this project-level, per-location bucket for you.
    */
  var configBucket: js.UndefOr[String] = js.native
  /** Required. The shared Google Compute Engine config settings for all instances in a cluster. */
  var gceClusterConfig: js.UndefOr[GceClusterConfig] = js.native
  /**
    * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a
    * node's role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget):
    * ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1/instance/attributes/dataproc-role)
    * if [[ "${ROLE}" == 'Master' ]]; then
    * ... master specific actions ...
    * else
    * ... worker specific actions ...
    * fi
    */
  var initializationActions: js.UndefOr[js.Array[NodeInitializationAction]] = js.native
  /** Optional. The Google Compute Engine config settings for the master instance in a cluster. */
  var masterConfig: js.UndefOr[InstanceGroupConfig] = js.native
  /** Optional. The Google Compute Engine config settings for additional worker instances in a cluster. */
  var secondaryWorkerConfig: js.UndefOr[InstanceGroupConfig] = js.native
  /** Optional. The config settings for software inside the cluster. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.native
  /** Optional. The Google Compute Engine config settings for worker instances in a cluster. */
  var workerConfig: js.UndefOr[InstanceGroupConfig] = js.native
}

object ClusterConfig {
  @scala.inline
  def apply(): ClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterConfig]
  }
  @scala.inline
  implicit class ClusterConfigOps[Self <: ClusterConfig] (val x: Self) extends AnyVal {
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
    def setConfigBucket(value: String): Self = this.set("configBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigBucket: Self = this.set("configBucket", js.undefined)
    @scala.inline
    def setGceClusterConfig(value: GceClusterConfig): Self = this.set("gceClusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGceClusterConfig: Self = this.set("gceClusterConfig", js.undefined)
    @scala.inline
    def setInitializationActionsVarargs(value: NodeInitializationAction*): Self = this.set("initializationActions", js.Array(value :_*))
    @scala.inline
    def setInitializationActions(value: js.Array[NodeInitializationAction]): Self = this.set("initializationActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitializationActions: Self = this.set("initializationActions", js.undefined)
    @scala.inline
    def setMasterConfig(value: InstanceGroupConfig): Self = this.set("masterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterConfig: Self = this.set("masterConfig", js.undefined)
    @scala.inline
    def setSecondaryWorkerConfig(value: InstanceGroupConfig): Self = this.set("secondaryWorkerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryWorkerConfig: Self = this.set("secondaryWorkerConfig", js.undefined)
    @scala.inline
    def setSoftwareConfig(value: SoftwareConfig): Self = this.set("softwareConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareConfig: Self = this.set("softwareConfig", js.undefined)
    @scala.inline
    def setWorkerConfig(value: InstanceGroupConfig): Self = this.set("workerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerConfig: Self = this.set("workerConfig", js.undefined)
  }
  
}

