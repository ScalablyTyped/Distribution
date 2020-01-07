package typings.googleapis.buildSrcApisScriptV1Mod.script_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a single script deployment.
  */
@js.native
trait Schema$Deployment extends js.Object {
  /**
    * The deployment configuration.
    */
  var deploymentConfig: js.UndefOr[Schema$DeploymentConfig] = js.native
  /**
    * The deployment ID for this deployment.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The deployment&#39;s entry points.
    */
  var entryPoints: js.UndefOr[js.Array[Schema$EntryPoint]] = js.native
  /**
    * Last modified date time stamp.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object Schema$Deployment {
  @scala.inline
  def apply(
    deploymentConfig: Schema$DeploymentConfig = null,
    deploymentId: String = null,
    entryPoints: js.Array[Schema$EntryPoint] = null,
    updateTime: String = null
  ): Schema$Deployment = {
    val __obj = js.Dynamic.literal()
    if (deploymentConfig != null) __obj.updateDynamic("deploymentConfig")(deploymentConfig.asInstanceOf[js.Any])
    if (deploymentId != null) __obj.updateDynamic("deploymentId")(deploymentId.asInstanceOf[js.Any])
    if (entryPoints != null) __obj.updateDynamic("entryPoints")(entryPoints.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Deployment]
  }
}

