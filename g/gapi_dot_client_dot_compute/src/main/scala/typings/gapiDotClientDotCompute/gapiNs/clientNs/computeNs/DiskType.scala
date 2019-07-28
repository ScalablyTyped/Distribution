package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskType extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined default disk size in GB. */
  var defaultDiskSizeGb: js.UndefOr[String] = js.undefined
  /** [Output Only] The deprecation status associated with this disk type. */
  var deprecated: js.UndefOr[DeprecationStatus] = js.undefined
  /** [Output Only] An optional description of this resource. */
  var description: js.UndefOr[String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#diskType for disk types. */
  var kind: js.UndefOr[String] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** [Output Only] An optional textual description of the valid disk size, such as "10GB-10TB". */
  var validDiskSize: js.UndefOr[String] = js.undefined
  /** [Output Only] URL of the zone where the disk type resides. */
  var zone: js.UndefOr[String] = js.undefined
}

object DiskType {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    defaultDiskSizeGb: String = null,
    deprecated: DeprecationStatus = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    selfLink: String = null,
    validDiskSize: String = null,
    zone: String = null
  ): DiskType = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (defaultDiskSizeGb != null) __obj.updateDynamic("defaultDiskSizeGb")(defaultDiskSizeGb)
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (validDiskSize != null) __obj.updateDynamic("validDiskSize")(validDiskSize)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[DiskType]
  }
}

