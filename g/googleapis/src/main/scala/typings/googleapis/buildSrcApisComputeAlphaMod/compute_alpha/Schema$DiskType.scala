package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A DiskType resource. (== resource_for beta.diskTypes ==) (== resource_for
  * v1.diskTypes ==)
  */
@js.native
trait Schema$DiskType extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined default disk size in GB.
    */
  var defaultDiskSizeGb: js.UndefOr[String] = js.native
  /**
    * [Output Only] The deprecation status associated with this disk type.
    */
  var deprecated: js.UndefOr[Schema$DeprecationStatus] = js.native
  /**
    * [Output Only] An optional description of this resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#diskType for disk
    * types.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the disk type resides. Only
    * applicable for regional resources. You must specify this field as part of
    * the HTTP request URL. It is not settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] An optional textual description of the valid disk size,
    * such as &quot;10GB-10TB&quot;.
    */
  var validDiskSize: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the zone where the disk type resides. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var zone: js.UndefOr[String] = js.native
}

object Schema$DiskType {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    defaultDiskSizeGb: String = null,
    deprecated: Schema$DeprecationStatus = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    name: String = null,
    region: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    validDiskSize: String = null,
    zone: String = null
  ): Schema$DiskType = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (defaultDiskSizeGb != null) __obj.updateDynamic("defaultDiskSizeGb")(defaultDiskSizeGb.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (validDiskSize != null) __obj.updateDynamic("validDiskSize")(validDiskSize.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DiskType]
  }
}

