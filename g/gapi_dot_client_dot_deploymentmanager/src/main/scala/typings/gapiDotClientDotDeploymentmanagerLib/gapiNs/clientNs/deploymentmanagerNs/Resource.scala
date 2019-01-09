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

