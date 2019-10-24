package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesEnvironmentsMod.Environments
import typings.gitlab.distSrcCoreServicesMod.EnvironmentId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Environments", JSImport.Namespace)
@js.native
object distSrcCoreServicesEnvironmentsMod extends js.Object {
  @js.native
  trait Environments extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, environmentId: EnvironmentId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, environmentId: EnvironmentId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, environmentId: EnvironmentId, options: Sudo): js.Promise[GetResponse] = js.native
    def stop(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[js.Object] = js.native
    def stop(projectId: ProjectId, environmentId: EnvironmentId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Environments
  
}

