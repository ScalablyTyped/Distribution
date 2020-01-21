package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Machine image resource.
  */
@js.native
trait SchemaMachineImage extends js.Object {
  /**
    * [Output Only] The creation timestamp for this machine image in RFC3339
    * text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] A unique identifier for this machine image. The server
    * defines this identifier.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] The resource type, which is always compute#machineImage for
    * machine image.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Encryption key to protect the machine image.
    */
  var machineImageEncryptionKey: js.UndefOr[SchemaCustomerEncryptionKey] = js.native
  /**
    * Name of the resource; provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] The URL for this machine image. The server defines this
    * URL.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource with the resource id.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
  /**
    * The source instance used to create the machine image. You can provide
    * this as a partial or full URL to the resource. For example, the following
    * are valid values:   -
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/instance
    * - projects/project/zones/zone/instances/instance
    */
  var sourceInstance: js.UndefOr[String] = js.native
  /**
    * Properties of source instance.
    */
  var sourceInstanceProperties: js.UndefOr[SchemaSourceInstanceProperties] = js.native
  /**
    * [Output Only] The status of disk creation.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * GCS bucket storage location of the snapshot (regional or multi-regional).
    */
  var storageLocations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaMachineImage {
  @scala.inline
  def apply(
    creationTimestamp: String = null,
    description: String = null,
    id: String = null,
    kind: String = null,
    machineImageEncryptionKey: SchemaCustomerEncryptionKey = null,
    name: String = null,
    selfLink: String = null,
    selfLinkWithId: String = null,
    sourceInstance: String = null,
    sourceInstanceProperties: SchemaSourceInstanceProperties = null,
    status: String = null,
    storageLocations: js.Array[String] = null
  ): SchemaMachineImage = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (machineImageEncryptionKey != null) __obj.updateDynamic("machineImageEncryptionKey")(machineImageEncryptionKey.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (selfLinkWithId != null) __obj.updateDynamic("selfLinkWithId")(selfLinkWithId.asInstanceOf[js.Any])
    if (sourceInstance != null) __obj.updateDynamic("sourceInstance")(sourceInstance.asInstanceOf[js.Any])
    if (sourceInstanceProperties != null) __obj.updateDynamic("sourceInstanceProperties")(sourceInstanceProperties.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (storageLocations != null) __obj.updateDynamic("storageLocations")(storageLocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMachineImage]
  }
}

