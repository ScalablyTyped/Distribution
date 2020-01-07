package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes one particular pool of Cloud Dataflow workers to be instantiated
  * by the Cloud Dataflow service in order to perform the computations required
  * by a job.  Note that a workflow job may use multiple pools, in order to
  * match the various computational requirements of the various stages of the
  * job.
  */
@js.native
trait Schema$WorkerPool extends js.Object {
  /**
    * Settings for autoscaling of this WorkerPool.
    */
  var autoscalingSettings: js.UndefOr[Schema$AutoscalingSettings] = js.native
  /**
    * Data disks that are used by a VM in this workflow.
    */
  var dataDisks: js.UndefOr[js.Array[Schema$Disk]] = js.native
  /**
    * The default package set to install.  This allows the service to select a
    * default set of packages which are useful to worker harnesses written in a
    * particular language.
    */
  var defaultPackageSet: js.UndefOr[String] = js.native
  /**
    * Size of root disk for VMs, in GB.  If zero or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var diskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Fully qualified source image for disks.
    */
  var diskSourceImage: js.UndefOr[String] = js.native
  /**
    * Type of root disk for VMs.  If empty or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * Configuration for VM IPs.
    */
  var ipConfiguration: js.UndefOr[String] = js.native
  /**
    * The kind of the worker pool; currently only `harness` and `shuffle` are
    * supported.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Machine type (e.g. &quot;n1-standard-1&quot;).  If empty or unspecified,
    * the service will attempt to choose a reasonable default.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Metadata to set on the Google Compute Engine VMs.
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Network to which VMs will be assigned.  If empty or unspecified, the
    * service will use the network &quot;default&quot;.
    */
  var network: js.UndefOr[String] = js.native
  /**
    * The number of threads per worker harness. If empty or unspecified, the
    * service will choose a number of threads (according to the number of cores
    * on the selected machine type for batch, or 1 by convention for
    * streaming).
    */
  var numThreadsPerWorker: js.UndefOr[Double] = js.native
  /**
    * Number of Google Compute Engine workers in this pool needed to execute
    * the job.  If zero or unspecified, the service will attempt to choose a
    * reasonable default.
    */
  var numWorkers: js.UndefOr[Double] = js.native
  /**
    * The action to take on host maintenance, as defined by the Google Compute
    * Engine API.
    */
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * Packages to be installed on workers.
    */
  var packages: js.UndefOr[js.Array[Schema$Package]] = js.native
  /**
    * Extra arguments for this worker pool.
    */
  var poolArgs: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
    * the form &quot;regions/REGION/subnetworks/SUBNETWORK&quot;.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * Settings passed through to Google Compute Engine workers when using the
    * standard Dataflow task runner.  Users should ignore this field.
    */
  var taskrunnerSettings: js.UndefOr[Schema$TaskRunnerSettings] = js.native
  /**
    * Sets the policy for determining when to turndown worker pool. Allowed
    * values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and
    * `TEARDOWN_NEVER`. `TEARDOWN_ALWAYS` means workers are always torn down
    * regardless of whether the job succeeds. `TEARDOWN_ON_SUCCESS` means
    * workers are torn down if the job succeeds. `TEARDOWN_NEVER` means the
    * workers are never torn down.  If the workers are not torn down by the
    * service, they will continue to run and use Google Compute Engine VM
    * resources in the user&#39;s project until they are explicitly terminated
    * by the user. Because of this, Google recommends using the
    * `TEARDOWN_ALWAYS` policy except for small, manually supervised test jobs.
    * If unknown or unspecified, the service will attempt to choose a
    * reasonable default.
    */
  var teardownPolicy: js.UndefOr[String] = js.native
  /**
    * Required. Docker container image that executes the Cloud Dataflow worker
    * harness, residing in Google Container Registry.
    */
  var workerHarnessContainerImage: js.UndefOr[String] = js.native
  /**
    * Zone to run the worker pools in.  If empty or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$WorkerPool {
  @scala.inline
  def apply(
    autoscalingSettings: Schema$AutoscalingSettings = null,
    dataDisks: js.Array[Schema$Disk] = null,
    defaultPackageSet: String = null,
    diskSizeGb: Int | Double = null,
    diskSourceImage: String = null,
    diskType: String = null,
    ipConfiguration: String = null,
    kind: String = null,
    machineType: String = null,
    metadata: StringDictionary[String] = null,
    network: String = null,
    numThreadsPerWorker: Int | Double = null,
    numWorkers: Int | Double = null,
    onHostMaintenance: String = null,
    packages: js.Array[Schema$Package] = null,
    poolArgs: StringDictionary[js.Any] = null,
    subnetwork: String = null,
    taskrunnerSettings: Schema$TaskRunnerSettings = null,
    teardownPolicy: String = null,
    workerHarnessContainerImage: String = null,
    zone: String = null
  ): Schema$WorkerPool = {
    val __obj = js.Dynamic.literal()
    if (autoscalingSettings != null) __obj.updateDynamic("autoscalingSettings")(autoscalingSettings.asInstanceOf[js.Any])
    if (dataDisks != null) __obj.updateDynamic("dataDisks")(dataDisks.asInstanceOf[js.Any])
    if (defaultPackageSet != null) __obj.updateDynamic("defaultPackageSet")(defaultPackageSet.asInstanceOf[js.Any])
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (diskSourceImage != null) __obj.updateDynamic("diskSourceImage")(diskSourceImage.asInstanceOf[js.Any])
    if (diskType != null) __obj.updateDynamic("diskType")(diskType.asInstanceOf[js.Any])
    if (ipConfiguration != null) __obj.updateDynamic("ipConfiguration")(ipConfiguration.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (numThreadsPerWorker != null) __obj.updateDynamic("numThreadsPerWorker")(numThreadsPerWorker.asInstanceOf[js.Any])
    if (numWorkers != null) __obj.updateDynamic("numWorkers")(numWorkers.asInstanceOf[js.Any])
    if (onHostMaintenance != null) __obj.updateDynamic("onHostMaintenance")(onHostMaintenance.asInstanceOf[js.Any])
    if (packages != null) __obj.updateDynamic("packages")(packages.asInstanceOf[js.Any])
    if (poolArgs != null) __obj.updateDynamic("poolArgs")(poolArgs.asInstanceOf[js.Any])
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork.asInstanceOf[js.Any])
    if (taskrunnerSettings != null) __obj.updateDynamic("taskrunnerSettings")(taskrunnerSettings.asInstanceOf[js.Any])
    if (teardownPolicy != null) __obj.updateDynamic("teardownPolicy")(teardownPolicy.asInstanceOf[js.Any])
    if (workerHarnessContainerImage != null) __obj.updateDynamic("workerHarnessContainerImage")(workerHarnessContainerImage.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerPool]
  }
}

