package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClusterConfig extends js.Object {
  /**
               * Optional. A Google Cloud Storage staging bucket used for sharing generated SSH keys and config. If you do not specify a staging bucket, Cloud Dataproc
               * will determine an appropriate Cloud Storage location (US, ASIA, or EU) for your cluster's staging bucket according to the Google Compute Engine zone
               * where your cluster is deployed, and then it will create and manage this project-level, per-location bucket for you.
               */
  var configBucket: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The shared Google Compute Engine config settings for all instances in a cluster. */
  var gceClusterConfig: js.UndefOr[GceClusterConfig] = js.undefined
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
  var initializationActions: js.UndefOr[js.Array[NodeInitializationAction]] = js.undefined
  /** Optional. The Google Compute Engine config settings for the master instance in a cluster. */
  var masterConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
  /** Optional. The Google Compute Engine config settings for additional worker instances in a cluster. */
  var secondaryWorkerConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
  /** Optional. The config settings for software inside the cluster. */
  var softwareConfig: js.UndefOr[SoftwareConfig] = js.undefined
  /** Optional. The Google Compute Engine config settings for worker instances in a cluster. */
  var workerConfig: js.UndefOr[InstanceGroupConfig] = js.undefined
}

