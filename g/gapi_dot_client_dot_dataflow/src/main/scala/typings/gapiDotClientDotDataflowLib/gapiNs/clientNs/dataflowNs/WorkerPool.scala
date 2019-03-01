package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerPool extends js.Object {
  /** Settings for autoscaling of this WorkerPool. */
  var autoscalingSettings: js.UndefOr[AutoscalingSettings] = js.undefined
  /** Data disks that are used by a VM in this workflow. */
  var dataDisks: js.UndefOr[js.Array[Disk]] = js.undefined
  /**
    * The default package set to install.  This allows the service to
    * select a default set of packages which are useful to worker
    * harnesses written in a particular language.
    */
  var defaultPackageSet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Size of root disk for VMs, in GB.  If zero or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var diskSizeGb: js.UndefOr[scala.Double] = js.undefined
  /** Fully qualified source image for disks. */
  var diskSourceImage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of root disk for VMs.  If empty or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var diskType: js.UndefOr[java.lang.String] = js.undefined
  /** Configuration for VM IPs. */
  var ipConfiguration: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The kind of the worker pool; currently only `harness` and `shuffle`
    * are supported.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Machine type (e.g. "n1-standard-1").  If empty or unspecified, the
    * service will attempt to choose a reasonable default.
    */
  var machineType: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata to set on the Google Compute Engine VMs. */
  var metadata: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Network to which VMs will be assigned.  If empty or unspecified,
    * the service will use the network "default".
    */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of threads per worker harness. If empty or unspecified, the
    * service will choose a number of threads (according to the number of cores
    * on the selected machine type for batch, or 1 by convention for streaming).
    */
  var numThreadsPerWorker: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of Google Compute Engine workers in this pool needed to
    * execute the job.  If zero or unspecified, the service will
    * attempt to choose a reasonable default.
    */
  var numWorkers: js.UndefOr[scala.Double] = js.undefined
  /**
    * The action to take on host maintenance, as defined by the Google
    * Compute Engine API.
    */
  var onHostMaintenance: js.UndefOr[java.lang.String] = js.undefined
  /** Packages to be installed on workers. */
  var packages: js.UndefOr[js.Array[Package]] = js.undefined
  /** Extra arguments for this worker pool. */
  var poolArgs: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /**
    * Subnetwork to which VMs will be assigned, if desired.  Expected to be of
    * the form "regions/REGION/subnetworks/SUBNETWORK".
    */
  var subnetwork: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Settings passed through to Google Compute Engine workers when
    * using the standard Dataflow task runner.  Users should ignore
    * this field.
    */
  var taskrunnerSettings: js.UndefOr[TaskRunnerSettings] = js.undefined
  /**
    * Sets the policy for determining when to turndown worker pool.
    * Allowed values are: `TEARDOWN_ALWAYS`, `TEARDOWN_ON_SUCCESS`, and
    * `TEARDOWN_NEVER`.
    * `TEARDOWN_ALWAYS` means workers are always torn down regardless of whether
    * the job succeeds. `TEARDOWN_ON_SUCCESS` means workers are torn down
    * if the job succeeds. `TEARDOWN_NEVER` means the workers are never torn
    * down.
    *
    * If the workers are not torn down by the service, they will
    * continue to run and use Google Compute Engine VM resources in the
    * user's project until they are explicitly terminated by the user.
    * Because of this, Google recommends using the `TEARDOWN_ALWAYS`
    * policy except for small, manually supervised test jobs.
    *
    * If unknown or unspecified, the service will attempt to choose a reasonable
    * default.
    */
  var teardownPolicy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Required. Docker container image that executes the Cloud Dataflow worker
    * harness, residing in Google Container Registry.
    */
  var workerHarnessContainerImage: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Zone to run the worker pools in.  If empty or unspecified, the service
    * will attempt to choose a reasonable default.
    */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object WorkerPool {
  @scala.inline
  def apply(
    autoscalingSettings: AutoscalingSettings = null,
    dataDisks: js.Array[Disk] = null,
    defaultPackageSet: java.lang.String = null,
    diskSizeGb: scala.Int | scala.Double = null,
    diskSourceImage: java.lang.String = null,
    diskType: java.lang.String = null,
    ipConfiguration: java.lang.String = null,
    kind: java.lang.String = null,
    machineType: java.lang.String = null,
    metadata: stdLib.Record[java.lang.String, java.lang.String] = null,
    network: java.lang.String = null,
    numThreadsPerWorker: scala.Int | scala.Double = null,
    numWorkers: scala.Int | scala.Double = null,
    onHostMaintenance: java.lang.String = null,
    packages: js.Array[Package] = null,
    poolArgs: stdLib.Record[java.lang.String, _] = null,
    subnetwork: java.lang.String = null,
    taskrunnerSettings: TaskRunnerSettings = null,
    teardownPolicy: java.lang.String = null,
    workerHarnessContainerImage: java.lang.String = null,
    zone: java.lang.String = null
  ): WorkerPool = {
    val __obj = js.Dynamic.literal()
    if (autoscalingSettings != null) __obj.updateDynamic("autoscalingSettings")(autoscalingSettings)
    if (dataDisks != null) __obj.updateDynamic("dataDisks")(dataDisks)
    if (defaultPackageSet != null) __obj.updateDynamic("defaultPackageSet")(defaultPackageSet)
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (diskSourceImage != null) __obj.updateDynamic("diskSourceImage")(diskSourceImage)
    if (diskType != null) __obj.updateDynamic("diskType")(diskType)
    if (ipConfiguration != null) __obj.updateDynamic("ipConfiguration")(ipConfiguration)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (machineType != null) __obj.updateDynamic("machineType")(machineType)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (network != null) __obj.updateDynamic("network")(network)
    if (numThreadsPerWorker != null) __obj.updateDynamic("numThreadsPerWorker")(numThreadsPerWorker.asInstanceOf[js.Any])
    if (numWorkers != null) __obj.updateDynamic("numWorkers")(numWorkers.asInstanceOf[js.Any])
    if (onHostMaintenance != null) __obj.updateDynamic("onHostMaintenance")(onHostMaintenance)
    if (packages != null) __obj.updateDynamic("packages")(packages)
    if (poolArgs != null) __obj.updateDynamic("poolArgs")(poolArgs)
    if (subnetwork != null) __obj.updateDynamic("subnetwork")(subnetwork)
    if (taskrunnerSettings != null) __obj.updateDynamic("taskrunnerSettings")(taskrunnerSettings)
    if (teardownPolicy != null) __obj.updateDynamic("teardownPolicy")(teardownPolicy)
    if (workerHarnessContainerImage != null) __obj.updateDynamic("workerHarnessContainerImage")(workerHarnessContainerImage)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[WorkerPool]
  }
}

