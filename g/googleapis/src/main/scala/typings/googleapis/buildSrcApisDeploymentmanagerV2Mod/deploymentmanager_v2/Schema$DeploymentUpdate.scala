package typings.googleapis.buildSrcApisDeploymentmanagerV2Mod.deploymentmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DeploymentUpdate extends js.Object {
  /**
    * Output only. An optional user-provided description of the deployment
    * after the current update has been applied.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Output only. Map of labels; provided by the client when the resource is
    * created or updated. Specifically: Label keys must be between 1 and 63
    * characters long and must conform to the following regular expression:
    * [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
    * characters long and must conform to the regular expression
    * ([a-z]([-a-z0-9]*[a-z0-9])?)?
    */
  var labels: js.UndefOr[js.Array[Schema$DeploymentUpdateLabelEntry]] = js.native
  /**
    * Output only. URL of the manifest representing the update configuration of
    * this deployment.
    */
  var manifest: js.UndefOr[String] = js.native
}

object Schema$DeploymentUpdate {
  @scala.inline
  def apply(
    description: String = null,
    labels: js.Array[Schema$DeploymentUpdateLabelEntry] = null,
    manifest: String = null
  ): Schema$DeploymentUpdate = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeploymentUpdate]
  }
}

