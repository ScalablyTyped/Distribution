package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Node Type resource.
  */
@js.native
trait SchemaNodeType extends js.Object {
  /**
    * [Output Only] The CPU platform used by this node type.
    */
  var cpuPlatform: js.UndefOr[String] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The deprecation status associated with this node type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The number of virtual CPUs that are available to the node
    * type.
    */
  var guestCpus: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The type of the resource. Always compute#nodeType for node
    * types.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Local SSD available to the node type, defined in GB.
    */
  var localSsdGb: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The amount of physical memory available to the node type,
    * defined in MB.
    */
  var memoryMb: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the zone where the node type resides, such as
    * us-central1-a.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaNodeType {
  @scala.inline
  def apply(
    cpuPlatform: String = null,
    creationTimestamp: String = null,
    deprecated: SchemaDeprecationStatus = null,
    description: String = null,
    guestCpus: Int | Double = null,
    id: String = null,
    kind: String = null,
    localSsdGb: Int | Double = null,
    memoryMb: Int | Double = null,
    name: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    zone: String = null
  ): SchemaNodeType = {
    val __obj = js.Dynamic.literal()
    if (cpuPlatform != null) __obj.updateDynamic("cpuPlatform")(cpuPlatform.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (deprecated != null) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (guestCpus != null) __obj.updateDynamic("guestCpus")(guestCpus.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (localSsdGb != null) __obj.updateDynamic("localSsdGb")(localSsdGb.asInstanceOf[js.Any])
    if (memoryMb != null) __obj.updateDynamic("memoryMb")(memoryMb.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeType]
  }
}

