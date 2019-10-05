package typings.gapiDotClientDotDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiDotClientDotDeploymentmanager.Anon_CodeData
import typings.gapiDotClientDotDeploymentmanager.Anon_Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUpdate extends js.Object {
  /** The Access Control Policy to set on this resource after updating the resource itself. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.undefined
  /** Output only. If errors are generated during update of the resource, this field will be populated. */
  var error: js.UndefOr[Anon_Errors] = js.undefined
  /** Output only. The expanded properties of the resource with reference values expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[String] = js.undefined
  /** Output only. The intent of the resource: PREVIEW, UPDATE, or CANCEL. */
  var intent: js.UndefOr[String] = js.undefined
  /** Output only. URL of the manifest representing the update configuration of this resource. */
  var manifest: js.UndefOr[String] = js.undefined
  /** Output only. The set of updated properties for this resource, before references are expanded. Returned as serialized YAML. */
  var properties: js.UndefOr[String] = js.undefined
  /** Output only. The state of the resource. */
  var state: js.UndefOr[String] = js.undefined
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[Anon_CodeData]] = js.undefined
}

object ResourceUpdate {
  @scala.inline
  def apply(
    accessControl: ResourceAccessControl = null,
    error: Anon_Errors = null,
    finalProperties: String = null,
    intent: String = null,
    manifest: String = null,
    properties: String = null,
    state: String = null,
    warnings: js.Array[Anon_CodeData] = null
  ): ResourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl)
    if (error != null) __obj.updateDynamic("error")(error)
    if (finalProperties != null) __obj.updateDynamic("finalProperties")(finalProperties)
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (state != null) __obj.updateDynamic("state")(state)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[ResourceUpdate]
  }
}

