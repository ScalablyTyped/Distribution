package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
  /** The Access Control Policy set on this resource. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.undefined
  /** Output only. The evaluated properties of the resource with references expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. Timestamp when the resource was created or acquired, in RFC3339 text format . */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. URL of the manifest representing the current configuration of this resource. */
  var manifest: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The name of the resource as it appears in the YAML config. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The current properties of the resource before any references have been filled in. Returned as serialized YAML. */
  var properties: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The type of the resource, for example compute.v1.instance, or cloudfunctions.v1beta1.function. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. If Deployment Manager is currently updating or previewing an update to this resource, the updated configuration appears here. */
  var update: js.UndefOr[ResourceUpdate] = js.undefined
  /** Output only. Timestamp when the resource was updated, in RFC3339 text format . */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The URL of the actual resource. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[gapiDotClientDotDeploymentmanagerLib.Anon_CodeData]] = js.undefined
}

object Resource {
  @scala.inline
  def apply(
    accessControl: ResourceAccessControl = null,
    finalProperties: java.lang.String = null,
    id: java.lang.String = null,
    insertTime: java.lang.String = null,
    manifest: java.lang.String = null,
    name: java.lang.String = null,
    properties: java.lang.String = null,
    `type`: java.lang.String = null,
    update: ResourceUpdate = null,
    updateTime: java.lang.String = null,
    url: java.lang.String = null,
    warnings: js.Array[gapiDotClientDotDeploymentmanagerLib.Anon_CodeData] = null
  ): Resource = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl)
    if (finalProperties != null) __obj.updateDynamic("finalProperties")(finalProperties)
    if (id != null) __obj.updateDynamic("id")(id)
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (name != null) __obj.updateDynamic("name")(name)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (update != null) __obj.updateDynamic("update")(update)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    if (url != null) __obj.updateDynamic("url")(url)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Resource]
  }
}

