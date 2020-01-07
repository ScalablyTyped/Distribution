package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Resource extends js.Object {
  /**
    * The Access Control Policy set on this resource.
    */
  var accessControl: js.UndefOr[Schema$ResourceAccessControl] = js.native
  /**
    * Output only. The evaluated properties of the resource with references
    * expanded. Returned as serialized YAML.
    */
  var finalProperties: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. Creation timestamp in RFC3339 text format.
    */
  var insertTime: js.UndefOr[String] = js.native
  /**
    * Output only. The last used credential that successfully created/updated
    * the resource.
    */
  var lastUsedCredential: js.UndefOr[Schema$Credential] = js.native
  /**
    * Output only. URL of the manifest representing the current configuration
    * of this resource.
    */
  var manifest: js.UndefOr[String] = js.native
  /**
    * Output only. The name of the resource as it appears in the YAML config.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The current properties of the resource before any references
    * have been filled in. Returned as serialized YAML.
    */
  var properties: js.UndefOr[String] = js.native
  /**
    * Output only. In case this is an action, it will show the runtimePolicies
    * on which this action will run in the deployment
    */
  var runtimePolicies: js.UndefOr[js.Array[String]] = js.native
  /**
    * Output only. The type of the resource, for example compute.v1.instance,
    * or cloudfunctions.v1beta1.function.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Output only. If Deployment Manager is currently updating or previewing an
    * update to this resource, the updated configuration appears here.
    */
  var update: js.UndefOr[Schema$ResourceUpdate] = js.native
  /**
    * Output only. Update timestamp in RFC3339 text format.
    */
  var updateTime: js.UndefOr[String] = js.native
  /**
    * Output only. The URL of the actual resource.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * Output only. If warning messages are generated during processing of this
    * resource, this field will be populated.
    */
  var warnings: js.UndefOr[js.Array[Anon_Code]] = js.native
}

object Schema$Resource {
  @scala.inline
  def apply(
    accessControl: Schema$ResourceAccessControl = null,
    finalProperties: String = null,
    id: String = null,
    insertTime: String = null,
    lastUsedCredential: Schema$Credential = null,
    manifest: String = null,
    name: String = null,
    properties: String = null,
    runtimePolicies: js.Array[String] = null,
    `type`: String = null,
    update: Schema$ResourceUpdate = null,
    updateTime: String = null,
    url: String = null,
    warnings: js.Array[Anon_Code] = null
  ): Schema$Resource = {
    val __obj = js.Dynamic.literal()
    if (accessControl != null) __obj.updateDynamic("accessControl")(accessControl.asInstanceOf[js.Any])
    if (finalProperties != null) __obj.updateDynamic("finalProperties")(finalProperties.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime.asInstanceOf[js.Any])
    if (lastUsedCredential != null) __obj.updateDynamic("lastUsedCredential")(lastUsedCredential.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (runtimePolicies != null) __obj.updateDynamic("runtimePolicies")(runtimePolicies.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Resource]
  }
}

