package typings.googleapis.buildSrcApisDeploymentmanagerAlphaMod.deploymentmanager_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DeploymentOutputsEntry extends js.Object {
  var key: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object Schema$DeploymentOutputsEntry {
  @scala.inline
  def apply(key: String = null, value: String = null): Schema$DeploymentOutputsEntry = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeploymentOutputsEntry]
  }
}

