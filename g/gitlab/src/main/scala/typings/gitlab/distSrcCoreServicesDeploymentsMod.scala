package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesDeploymentsMod.Deployments
import typings.gitlab.distSrcCoreServicesMod.DeploymentId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Deployments", JSImport.Namespace)
@js.native
object distSrcCoreServicesDeploymentsMod extends js.Object {
  @js.native
  trait Deployments extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, deploymentId: DeploymentId): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, deploymentId: DeploymentId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Deployments
  
}

