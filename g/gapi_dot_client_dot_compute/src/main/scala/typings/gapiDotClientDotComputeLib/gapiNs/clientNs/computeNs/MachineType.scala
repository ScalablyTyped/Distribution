package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineType extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The deprecation status associated with this machine type. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** [Output Only] An optional textual description of the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The number of virtual CPUs that are available to the instance. */
  var guestCpus: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Deprecated] This property is deprecated and will never be populated with any relevant values. */
  var imageSpaceGb: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Whether this machine type has a shared CPU. See Shared-core machine types for more information. */
  var isSharedCpu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Output Only] The type of the resource. Always compute#machineType for machine types. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Maximum persistent disks allowed. */
  var maximumPersistentDisks: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Maximum total persistent disks size (GB) allowed. */
  var maximumPersistentDisksSizeGb: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The amount of physical memory available to the instance, defined in MB. */
  var memoryMb: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] List of extended scratch disks assigned to the instance. */
  var scratchDisks: js.UndefOr[js.Array[gapiDotClientDotComputeLib.Anon_DiskGb]] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The name of the zone where the machine type resides, such as us-central1-a. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object MachineType {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    deprecated: DeprecationStatus = null,
    description: java.lang.String = null,
    guestCpus: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    imageSpaceGb: scala.Int | scala.Double = null,
    isSharedCpu: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    maximumPersistentDisks: scala.Int | scala.Double = null,
    maximumPersistentDisksSizeGb: java.lang.String = null,
    memoryMb: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    scratchDisks: js.Array[gapiDotClientDotComputeLib.Anon_DiskGb] = null,
    selfLink: java.lang.String = null,
    zone: java.lang.String = null
  ): MachineType = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (guestCpus != null) __obj.updateDynamic("guestCpus")(guestCpus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageSpaceGb != null) __obj.updateDynamic("imageSpaceGb")(imageSpaceGb.asInstanceOf[js.Any])
    if (!js.isUndefined(isSharedCpu)) __obj.updateDynamic("isSharedCpu")(isSharedCpu)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (maximumPersistentDisks != null) __obj.updateDynamic("maximumPersistentDisks")(maximumPersistentDisks.asInstanceOf[js.Any])
    if (maximumPersistentDisksSizeGb != null) __obj.updateDynamic("maximumPersistentDisksSizeGb")(maximumPersistentDisksSizeGb)
    if (memoryMb != null) __obj.updateDynamic("memoryMb")(memoryMb.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (scratchDisks != null) __obj.updateDynamic("scratchDisks")(scratchDisks)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[MachineType]
  }
}

