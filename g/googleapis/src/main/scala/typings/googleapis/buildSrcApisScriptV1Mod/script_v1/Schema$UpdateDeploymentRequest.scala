package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request with deployment information to update an existing deployment.
  */
@js.native
trait Schema$UpdateDeploymentRequest extends js.Object {
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[Schema$DeploymentConfig] = js.native
}

object Schema$UpdateDeploymentRequest {
  @scala.inline
  def apply(deploymentConfig: Schema$DeploymentConfig = null): Schema$UpdateDeploymentRequest = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDeploymentRequest]
  }
}

