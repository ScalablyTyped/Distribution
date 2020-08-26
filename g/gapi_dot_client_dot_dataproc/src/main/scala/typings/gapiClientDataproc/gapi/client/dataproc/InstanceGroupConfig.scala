package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupConfig extends js.Object {
  /**
    * Optional. The Google Compute Engine accelerator configuration for these instances.Beta Feature: This feature is still under development. It may be
    * changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.native
  /** Optional. Disk option config settings. */
  var diskConfig: js.UndefOr[DiskConfig] = js.native
  /** Output-only. The Google Compute Engine image resource used for cluster instances. Inferred from SoftwareConfig.image_version. */
  var imageUri: js.UndefOr[String] = js.native
  /**
    * Optional. The list of instance names. Cloud Dataproc derives the names from cluster_name, num_instances, and the instance group if not set by user
    * (recommended practice is to let Cloud Dataproc derive the name).
    */
  var instanceNames: js.UndefOr[js.Array[String]] = js.native
  /** Optional. Specifies that this instance group contains preemptible instances. */
  var isPreemptible: js.UndefOr[Boolean] = js.native
  /**
    * Optional. The Google Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2
    */
  var machineTypeUri: js.UndefOr[String] = js.native
  /** Output-only. The config for Google Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups. */
  var managedGroupConfig: js.UndefOr[ManagedGroupConfig] = js.native
  /** Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1. */
  var numInstances: js.UndefOr[Double] = js.native
}

object InstanceGroupConfig {
  @scala.inline
  def apply(): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupConfig]
  }
  @scala.inline
  implicit class InstanceGroupConfigOps[Self <: InstanceGroupConfig] (val x: Self) extends AnyVal {
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
    def setAcceleratorsVarargs(value: AcceleratorConfig*): Self = this.set("accelerators", js.Array(value :_*))
    @scala.inline
    def setAccelerators(value: js.Array[AcceleratorConfig]): Self = this.set("accelerators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccelerators: Self = this.set("accelerators", js.undefined)
    @scala.inline
    def setDiskConfig(value: DiskConfig): Self = this.set("diskConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskConfig: Self = this.set("diskConfig", js.undefined)
    @scala.inline
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
    @scala.inline
    def setInstanceNamesVarargs(value: String*): Self = this.set("instanceNames", js.Array(value :_*))
    @scala.inline
    def setInstanceNames(value: js.Array[String]): Self = this.set("instanceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceNames: Self = this.set("instanceNames", js.undefined)
    @scala.inline
    def setIsPreemptible(value: Boolean): Self = this.set("isPreemptible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPreemptible: Self = this.set("isPreemptible", js.undefined)
    @scala.inline
    def setMachineTypeUri(value: String): Self = this.set("machineTypeUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineTypeUri: Self = this.set("machineTypeUri", js.undefined)
    @scala.inline
    def setManagedGroupConfig(value: ManagedGroupConfig): Self = this.set("managedGroupConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedGroupConfig: Self = this.set("managedGroupConfig", js.undefined)
    @scala.inline
    def setNumInstances(value: Double): Self = this.set("numInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumInstances: Self = this.set("numInstances", js.undefined)
  }
  
}

