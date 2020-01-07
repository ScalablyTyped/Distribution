package typings.googleapis.buildSrcApisGenomicsV1alpha2Mod.genomics_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The system resources for the pipeline run.
  */
@js.native
trait Schema$PipelineResources extends js.Object {
  /**
    * Optional. The number of accelerators of the specified type to attach. By
    * specifying this parameter, you will download and install the following
    * third-party software onto your managed Compute Engine instances: NVIDIA®
    * Tesla® drivers and NVIDIA® CUDA toolkit.
    */
  var acceleratorCount: js.UndefOr[String] = js.native
  /**
    * Optional. The Compute Engine defined accelerator type. By specifying this
    * parameter, you will download and install the following third-party
    * software onto your managed Compute Engine instances: NVIDIA® Tesla®
    * drivers and NVIDIA® CUDA toolkit. Please see
    * https://cloud.google.com/compute/docs/gpus/ for a list of available
    * accelerator types.
    */
  var acceleratorType: js.UndefOr[String] = js.native
  /**
    * The size of the boot disk. Defaults to 10 (GB).
    */
  var bootDiskSizeGb: js.UndefOr[Double] = js.native
  /**
    * Disks to attach.
    */
  var disks: js.UndefOr[js.Array[Schema$Disk]] = js.native
  /**
    * The minimum number of cores to use. Defaults to 1.
    */
  var minimumCpuCores: js.UndefOr[Double] = js.native
  /**
    * The minimum amount of RAM to use. Defaults to 3.75 (GB)
    */
  var minimumRamGb: js.UndefOr[Double] = js.native
  /**
    * Whether to assign an external IP to the instance. This is an experimental
    * feature that may go away. Defaults to false. Corresponds to
    * `--no_address` flag for [gcloud compute instances create]
    * (https://cloud.google.com/sdk/gcloud/reference/compute/instances/create).
    * In order to use this, must be true for both create time and run time.
    * Cannot be true at run time if false at create time. If you need to ssh
    * into a private IP VM for debugging, you can ssh to a public VM and then
    * ssh into the private VM&#39;s Internal IP.  If noAddress is set, this
    * pipeline run may only load docker images from Google Container Registry
    * and not Docker Hub. Before using this, you must [configure access to
    * Google services from internal
    * IPs](https://cloud.google.com/compute/docs/configure-private-google-access#configuring_access_to_google_services_from_internal_ips).
    */
  var noAddress: js.UndefOr[Boolean] = js.native
  /**
    * Whether to use preemptible VMs. Defaults to `false`. In order to use
    * this, must be true for both create time and run time. Cannot be true at
    * run time if false at create time.
    */
  var preemptible: js.UndefOr[Boolean] = js.native
  /**
    * List of Google Compute Engine availability zones to which resource
    * creation will restricted. If empty, any zone may be chosen.
    */
  var zones: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PipelineResources {
  @scala.inline
  def apply(
    acceleratorCount: String = null,
    acceleratorType: String = null,
    bootDiskSizeGb: Int | Double = null,
    disks: js.Array[Schema$Disk] = null,
    minimumCpuCores: Int | Double = null,
    minimumRamGb: Int | Double = null,
    noAddress: js.UndefOr[Boolean] = js.undefined,
    preemptible: js.UndefOr[Boolean] = js.undefined,
    zones: js.Array[String] = null
  ): Schema$PipelineResources = {
    val __obj = js.Dynamic.literal()
    if (acceleratorCount != null) __obj.updateDynamic("acceleratorCount")(acceleratorCount.asInstanceOf[js.Any])
    if (acceleratorType != null) __obj.updateDynamic("acceleratorType")(acceleratorType.asInstanceOf[js.Any])
    if (bootDiskSizeGb != null) __obj.updateDynamic("bootDiskSizeGb")(bootDiskSizeGb.asInstanceOf[js.Any])
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    if (minimumCpuCores != null) __obj.updateDynamic("minimumCpuCores")(minimumCpuCores.asInstanceOf[js.Any])
    if (minimumRamGb != null) __obj.updateDynamic("minimumRamGb")(minimumRamGb.asInstanceOf[js.Any])
    if (!js.isUndefined(noAddress)) __obj.updateDynamic("noAddress")(noAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(preemptible)) __obj.updateDynamic("preemptible")(preemptible.asInstanceOf[js.Any])
    if (zones != null) __obj.updateDynamic("zones")(zones.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PipelineResources]
  }
}

