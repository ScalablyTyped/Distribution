package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Carries information about a Compute Engine VM resource.
  */
@js.native
trait Schema$VirtualMachine extends js.Object {
  /**
    * The list of accelerators to attach to the VM.
    */
  var accelerators: js.UndefOr[js.Array[Schema$Accelerator]] = js.native
  /**
    * The size of the boot disk, in GB. The boot disk must be large enough to
    * accommodate all of the Docker images from each action in the pipeline at
    * the same time. If not specified, a small but reasonable default value is
    * used.
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * The host operating system image to use.  Currently, only
    * Container-Optimized OS images can be used.  The default value is
    * `projects/cos-cloud/global/images/family/cos-stable`, which selects the
    * latest stable release of Container-Optimized OS.  This option is provided
    * to allow testing against the beta release of the operating system to
    * ensure that the new version does not interact negatively with production
    * pipelines.  To test a pipeline against the beta release of
    * Container-Optimized OS, use the value
    * `projects/cos-cloud/global/images/family/cos-beta`.
    */
  var bootImage: js.UndefOr[String] = js.native
  /**
    * The CPU platform to request. An instance based on a newer platform can be
    * allocated, but never one with fewer capabilities. The value of this
    * parameter must be a valid Compute Engine CPU platform name (such as
    * &quot;Intel Skylake&quot;). This parameter is only useful for carefully
    * optimized work loads where the CPU platform has a significant impact. For
    * more information about the effect of this parameter, see
    * https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform.
    */
  var cpuPlatform: js.UndefOr[String] = js.native
  /**
    * The list of disks to create and attach to the VM.
    */
  var disks: js.UndefOr[js.Array[Schema$Disk]] = js.native
  /**
    * Optional set of labels to apply to the VM and any attached disk
    * resources. These labels must adhere to the name and value restrictions on
    * VM labels imposed by Compute Engine.  Labels applied at creation time to
    * the VM. Applied on a best-effort basis to attached disk resources shortly
    * after VM creation.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The machine type of the virtual machine to create. Must be the short name
    * of a standard machine type (such as &quot;n1-standard-1&quot;) or a
    * custom machine type (such as &quot;custom-1-4096&quot;, where
    * &quot;1&quot; indicates the number of vCPUs and &quot;4096&quot;
    * indicates the memory in MB). See [Creating an instance with a custom
    * machine
    * type](https://cloud.google.com/compute/docs/instances/creating-instance-with-custom-machine-type#create)
    * for more specifications on creating a custom machine type.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The VM network configuration.
    */
  var network: js.UndefOr[Schema$Network] = js.native
  /**
    * The NVIDIA driver version to use when attaching an NVIDIA GPU
    * accelerator. The version specified here must be compatible with the GPU
    * libraries contained in the container being executed, and must be one of
    * the drivers hosted in the `nvidia-drivers-us-public` bucket on Google
    * Cloud Storage.
    */
  var nvidiaDriverVersion: js.UndefOr[String] = js.native
  /**
    * If true, allocate a preemptible VM.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
  /**
    * The service account to install on the VM. This account does not need any
    * permissions other than those required by the pipeline.
    */
  var serviceAccount: js.UndefOr[Schema$ServiceAccount] = js.native
}

object Schema$VirtualMachine {
  @scala.inline
  def apply(
    accelerators: js.Array[Schema$Accelerator] = null,
    bootDiskSizeGb: Int | Double = null,
    bootImage: String = null,
    cpuPlatform: String = null,
    disks: js.Array[Schema$Disk] = null,
    labels: StringDictionary[String] = null,
    machineType: String = null,
    network: Schema$Network = null,
    nvidiaDriverVersion: String = null,
    preemptible: js.UndefOr[Boolean] = js.undefined,
    serviceAccount: Schema$ServiceAccount = null
  ): Schema$VirtualMachine = {
    val __obj = js.Dynamic.literal()
    if (accelerators != null) __obj.updateDynamic("accelerators")(accelerators.asInstanceOf[js.Any])
    if (bootDiskSizeGb != null) __obj.updateDynamic("bootDiskSizeGb")(bootDiskSizeGb.asInstanceOf[js.Any])
    if (bootImage != null) __obj.updateDynamic("bootImage")(bootImage.asInstanceOf[js.Any])
    if (cpuPlatform != null) __obj.updateDynamic("cpuPlatform")(cpuPlatform.asInstanceOf[js.Any])
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (nvidiaDriverVersion != null) __obj.updateDynamic("nvidiaDriverVersion")(nvidiaDriverVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    if (serviceAccount != null) __obj.updateDynamic("serviceAccount")(serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VirtualMachine]
  }
}

