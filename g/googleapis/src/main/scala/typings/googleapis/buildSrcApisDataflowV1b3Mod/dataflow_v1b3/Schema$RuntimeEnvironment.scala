package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environment values to set at runtime.
  */
@js.native
trait Schema$RuntimeEnvironment extends js.Object {
  /**
    * Additional experiment flags for the job.
    */
  var additionalExperiments: js.UndefOr[js.Array[String]] = js.native
  /**
    * Additional user labels attached to the job.
    */
  var additionalUserLabels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Whether to bypass the safety checks for the job&#39;s temporary
    * directory. Use with caution.
    */
  var bypassTempDirValidation: js.UndefOr[Boolean] = js.native
  /**
    * The machine type to use for the job. Defaults to the value from the
    * template if not specified.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The maximum number of Google Compute Engine instances to be made
    * available to your pipeline during execution, from 1 to 1000.
    */
  var maxWorkers: js.UndefOr[Double] = js.native
  /**
    * Network to which VMs will be assigned.  If empty or unspecified, the
    * service will use the network &quot;default&quot;.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The initial number of Google Compute Engine instnaces for the job.
    */
  var numWorkers: js.UndefOr[Double] = js.native
  /**
    * The email address of the service account to run the job as.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.native
  /**
    * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
    * the form &quot;regions/REGION/subnetworks/SUBNETWORK&quot;.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * The Cloud Storage path to use for temporary files. Must be a valid Cloud
    * Storage URL, beginning with `gs://`.
    */
  var tempLocation: js.UndefOr[String] = js.native
  /**
    * The Compute Engine [availability
    * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
    * for launching worker instances to run your pipeline.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$RuntimeEnvironment {
  @scala.inline
  def apply(
    additionalExperiments: js.Array[String] = null,
    additionalUserLabels: StringDictionary[String] = null,
    bypassTempDirValidation: js.UndefOr[Boolean] = js.undefined,
    machineType: String = null,
    maxWorkers: Int | Double = null,
    network: String = null,
    numWorkers: Int | Double = null,
    serviceAccountEmail: String = null,
    subnetwork: String = null,
    tempLocation: String = null,
    zone: String = null
  ): Schema$RuntimeEnvironment = {
    val __obj = js.Dynamic.literal()
    if (additionalExperiments != null) __obj.updateDynamic("additionalExperiments")(additionalExperiments.asInstanceOf[js.Any])
    if (additionalUserLabels != null) __obj.updateDynamic("additionalUserLabels")(additionalUserLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(bypassTempDirValidation)) __obj.updateDynamic("bypassTempDirValidation")(bypassTempDirValidation.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (maxWorkers != null) __obj.updateDynamic("maxWorkers")(maxWorkers.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (numWorkers != null) __obj.updateDynamic("numWorkers")(numWorkers.asInstanceOf[js.Any])
    if (serviceAccountEmail != null) __obj.updateDynamic("serviceAccountEmail")(serviceAccountEmail.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (tempLocation != null) __obj.updateDynamic("tempLocation")(tempLocation.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RuntimeEnvironment]
  }
}

