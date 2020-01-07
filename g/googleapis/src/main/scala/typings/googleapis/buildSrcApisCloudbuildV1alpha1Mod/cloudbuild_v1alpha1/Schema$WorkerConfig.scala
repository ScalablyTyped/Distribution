package typings.googleapis.buildSrcApisCloudbuildV1alpha1Mod.cloudbuild_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WorkerConfig defines the configuration to be used for a creating workers in
  * the pool.
  */
@js.native
trait Schema$WorkerConfig extends js.Object {
  /**
    * Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud
    * Build will use a standard disk size. `disk_size` is overridden if you
    * specify a different disk size in `build_options`. In this case, a VM with
    * a disk size specified in the `build_options` will be created on demand at
    * build time. For more information see
    * https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Machine Type of the worker, such as n1-standard-1. See
    * https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud
    * Build will use a standard unspecified machine to create the worker pool.
    * `machine_type` is overridden if you specify a different machine type in
    * `build_options`. In this case, the VM specified in the `build_options`
    * will be created on demand at build time. For more information see
    * https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The network definition used to create the worker. If this section is left
    * empty, the workers will be created in WorkerPool.project_id on the
    * default network.
    */
  var network: js.UndefOr[Schema$Network] = js.native
  /**
    * The tag applied to the worker, and the same tag used by the firewall
    * rule. It is used to identify the Cloud Build workers among other VMs. The
    * default value for tag is `worker`.
    */
  var tag: js.UndefOr[String] = js.native
}

object Schema$WorkerConfig {
  @scala.inline
  def apply(
    diskSizeGb: String = null,
    machineType: String = null,
    network: Schema$Network = null,
    tag: String = null
  ): Schema$WorkerConfig = {
    val __obj = js.Dynamic.literal()
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WorkerConfig]
  }
}

