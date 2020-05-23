package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupConfig extends js.Object {
  /**
    * Optional. The Google Compute Engine accelerator configuration for these instances.Beta Feature: This feature is still under development. It may be
    * changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  /** Optional. Disk option config settings. */
  var diskConfig: js.UndefOr[DiskConfig] = js.undefined
  /** Output-only. The Google Compute Engine image resource used for cluster instances. Inferred from SoftwareConfig.image_version. */
  var imageUri: js.UndefOr[String] = js.undefined
  /**
    * Optional. The list of instance names. Cloud Dataproc derives the names from cluster_name, num_instances, and the instance group if not set by user
    * (recommended practice is to let Cloud Dataproc derive the name).
    */
  var instanceNames: js.UndefOr[js.Array[String]] = js.undefined
  /** Optional. Specifies that this instance group contains preemptible instances. */
  var isPreemptible: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional. The Google Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2
    */
  var machineTypeUri: js.UndefOr[String] = js.undefined
  /** Output-only. The config for Google Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups. */
  var managedGroupConfig: js.UndefOr[ManagedGroupConfig] = js.undefined
  /** Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1. */
  var numInstances: js.UndefOr[Double] = js.undefined
}

object InstanceGroupConfig {
  @scala.inline
  def apply(
    accelerators: js.Array[AcceleratorConfig] = null,
    diskConfig: DiskConfig = null,
    imageUri: String = null,
    instanceNames: js.Array[String] = null,
    isPreemptible: js.UndefOr[Boolean] = js.undefined,
    machineTypeUri: String = null,
    managedGroupConfig: ManagedGroupConfig = null,
    numInstances: js.UndefOr[Double] = js.undefined
  ): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (accelerators != null) __obj.updateDynamic("accelerators")(accelerators.asInstanceOf[js.Any])
    if (diskConfig != null) __obj.updateDynamic("diskConfig")(diskConfig.asInstanceOf[js.Any])
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri.asInstanceOf[js.Any])
    if (instanceNames != null) __obj.updateDynamic("instanceNames")(instanceNames.asInstanceOf[js.Any])
    if (!js.isUndefined(isPreemptible)) __obj.updateDynamic("isPreemptible")(isPreemptible.get.asInstanceOf[js.Any])
    if (machineTypeUri != null) __obj.updateDynamic("machineTypeUri")(machineTypeUri.asInstanceOf[js.Any])
    if (managedGroupConfig != null) __obj.updateDynamic("managedGroupConfig")(managedGroupConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(numInstances)) __obj.updateDynamic("numInstances")(numInstances.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupConfig]
  }
}

