package typings.gitlab.environmentsMod

import typings.gitlab.deploymentsMod.DeploymentSchema
import typings.gitlab.projectsMod.ProjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentDetailSchema extends EnvironmentSchema {
  var deployable: js.UndefOr[DeploymentSchema] = js.undefined
  var last_deployment: js.UndefOr[DeploymentSchema] = js.undefined
}

object EnvironmentDetailSchema {
  @scala.inline
  def apply(
    id: Double,
    name: String,
    deployable: DeploymentSchema = null,
    external_url: String = null,
    last_deployment: DeploymentSchema = null,
    project: ProjectSchema = null,
    slug: String = null,
    state: String = null
  ): EnvironmentDetailSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (deployable != null) __obj.updateDynamic("deployable")(deployable.asInstanceOf[js.Any])
    if (external_url != null) __obj.updateDynamic("external_url")(external_url.asInstanceOf[js.Any])
    if (last_deployment != null) __obj.updateDynamic("last_deployment")(last_deployment.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (slug != null) __obj.updateDynamic("slug")(slug.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDetailSchema]
  }
}

