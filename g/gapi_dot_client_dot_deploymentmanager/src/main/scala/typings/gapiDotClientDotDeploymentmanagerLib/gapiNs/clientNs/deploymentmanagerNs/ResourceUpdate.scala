package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUpdate extends js.Object {
  /** The Access Control Policy to set on this resource after updating the resource itself. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.undefined
  /** Output only. If errors are generated during update of the resource, this field will be populated. */
  var error: js.UndefOr[gapiDotClientDotDeploymentmanagerLib.Anon_Errors] = js.undefined
  /** Output only. The expanded properties of the resource with reference values expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The intent of the resource: PREVIEW, UPDATE, or CANCEL. */
  var intent: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. URL of the manifest representing the update configuration of this resource. */
  var manifest: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The set of updated properties for this resource, before references are expanded. Returned as serialized YAML. */
  var properties: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The state of the resource. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[gapiDotClientDotDeploymentmanagerLib.Anon_CodeData]] = js.undefined
}

