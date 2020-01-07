package typings.googleapis.buildSrcApisDataprocV1Mod.dataproc_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The cluster config.
  */
@js.native
trait Schema$ClusterConfig extends js.Object {
  /**
    * Optional. A Google Cloud Storage bucket used to stage job dependencies,
    * config files, and job driver console output. If you do not specify a
    * staging bucket, Cloud Dataproc will determine a Cloud Storage location
    * (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the
    * Google Compute Engine zone where your cluster is deployed, and then
    * create and manage this project-level, per-location bucket (see Cloud
    * Dataproc staging bucket).
    */
  var configBucket: js.UndefOr[String] = js.native
  /**
    * Optional. Encryption settings for the cluster.
    */
  var encryptionConfig: js.UndefOr[Schema$EncryptionConfig] = js.native
  /**
    * Optional. The shared Compute Engine config settings for all instances in
    * a cluster.
    */
  var gceClusterConfig: js.UndefOr[Schema$GceClusterConfig] = js.native
  /**
    * Optional. Commands to execute on each node after config is completed. By
    * default, executables are run on master and all worker nodes. You can test
    * a node&#39;s role metadata to run an executable on a master or worker
    * node, as shown below using curl (you can also use wget): ROLE=$(curl -H
    * Metadata-Flavor:Google
    * http://metadata/computeMetadata/v1/instance/attributes/dataproc-role) if
    * [[ &quot;${ROLE}&quot; == &#39;Master&#39; ]]; then   ... master specific
    * actions ... else   ... worker specific actions ... fi
    */
  var initializationActions: js.UndefOr[js.Array[Schema$NodeInitializationAction]] = js.native
  /**
    * Optional. The Compute Engine config settings for the master instance in a
    * cluster.
    */
  var masterConfig: js.UndefOr[Schema$InstanceGroupConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for additional worker
    * instances in a cluster.
    */
  var secondaryWorkerConfig: js.UndefOr[Schema$InstanceGroupConfig] = js.native
  /**
    * Optional. The config settings for software inside the cluster.
    */
  var softwareConfig: js.UndefOr[Schema$SoftwareConfig] = js.native
  /**
    * Optional. The Compute Engine config settings for worker instances in a
    * cluster.
    */
  var workerConfig: js.UndefOr[Schema$InstanceGroupConfig] = js.native
}

object Schema$ClusterConfig {
  @scala.inline
  def apply(
    configBucket: String = null,
    encryptionConfig: Schema$EncryptionConfig = null,
    gceClusterConfig: Schema$GceClusterConfig = null,
    initializationActions: js.Array[Schema$NodeInitializationAction] = null,
    masterConfig: Schema$InstanceGroupConfig = null,
    secondaryWorkerConfig: Schema$InstanceGroupConfig = null,
    softwareConfig: Schema$SoftwareConfig = null,
    workerConfig: Schema$InstanceGroupConfig = null
  ): Schema$ClusterConfig = {
    val __obj = js.Dynamic.literal()
    if (configBucket != null) __obj.updateDynamic("configBucket")(configBucket.asInstanceOf[js.Any])
    if (encryptionConfig != null) __obj.updateDynamic("encryptionConfig")(encryptionConfig.asInstanceOf[js.Any])
    if (gceClusterConfig != null) __obj.updateDynamic("gceClusterConfig")(gceClusterConfig.asInstanceOf[js.Any])
    if (initializationActions != null) __obj.updateDynamic("initializationActions")(initializationActions.asInstanceOf[js.Any])
    if (masterConfig != null) __obj.updateDynamic("masterConfig")(masterConfig.asInstanceOf[js.Any])
    if (secondaryWorkerConfig != null) __obj.updateDynamic("secondaryWorkerConfig")(secondaryWorkerConfig.asInstanceOf[js.Any])
    if (softwareConfig != null) __obj.updateDynamic("softwareConfig")(softwareConfig.asInstanceOf[js.Any])
    if (workerConfig != null) __obj.updateDynamic("workerConfig")(workerConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ClusterConfig]
  }
}

