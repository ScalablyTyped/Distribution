package typings.gitlab.environmentsMod

import typings.gitlab.deploymentsMod.DeploymentSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentDetailSchema extends EnvironmentSchema {
  var deployable: js.UndefOr[DeploymentSchema] = js.native
  var last_deployment: js.UndefOr[DeploymentSchema] = js.native
}

object EnvironmentDetailSchema {
  @scala.inline
  def apply(id: Double, name: String): EnvironmentDetailSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentDetailSchema]
  }
  @scala.inline
  implicit class EnvironmentDetailSchemaOps[Self <: EnvironmentDetailSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeployable(value: DeploymentSchema): Self = this.set("deployable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployable: Self = this.set("deployable", js.undefined)
    @scala.inline
    def setLast_deployment(value: DeploymentSchema): Self = this.set("last_deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_deployment: Self = this.set("last_deployment", js.undefined)
  }
  
}

