package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClientDeploymentmanager.AnonCodeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /** The Access Control Policy set on this resource. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.undefined
  /** Output only. The evaluated properties of the resource with references expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[String] = js.undefined
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  /** Output only. Timestamp when the resource was created or acquired, in RFC3339 text format . */
  var insertTime: js.UndefOr[String] = js.undefined
  /** Output only. URL of the manifest representing the current configuration of this resource. */
  var manifest: js.UndefOr[String] = js.undefined
  /** Output only. The name of the resource as it appears in the YAML config. */
  var name: js.UndefOr[String] = js.undefined
  /** Output only. The current properties of the resource before any references have been filled in. Returned as serialized YAML. */
  var properties: js.UndefOr[String] = js.undefined
  /** Output only. The type of the resource, for example compute.v1.instance, or cloudfunctions.v1beta1.function. */
  var `type`: js.UndefOr[String] = js.undefined
  /** Output only. If Deployment Manager is currently updating or previewing an update to this resource, the updated configuration appears here. */
  var update: js.UndefOr[ResourceUpdate] = js.undefined
  /** Output only. Timestamp when the resource was updated, in RFC3339 text format . */
  var updateTime: js.UndefOr[String] = js.undefined
  /** Output only. The URL of the actual resource. */
  var url: js.UndefOr[String] = js.undefined
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[AnonCodeData]] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    accessControl: ResourceAccessControl = null,
    finalProperties: String = null,
    id: String = null,
    insertTime: String = null,
    manifest: String = null,
    name: String = null,
    properties: String = null,
    `type`: String = null,
    update: ResourceUpdate = null,
    updateTime: String = null,
    url: String = null,
    warnings: js.Array[AnonCodeData] = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl.asInstanceOf[js.Any])
    if (finalProperties != null) __obj.updateDynamic("finalProperties")(finalProperties.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
}

