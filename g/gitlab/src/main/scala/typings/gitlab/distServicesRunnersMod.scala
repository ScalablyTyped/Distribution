package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.RunnerId
import typings.gitlab.distServicesRunnersMod.Runners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Runners", JSImport.Namespace)
@js.native
object distServicesRunnersMod extends js.Object {
  @js.native
  trait Runners extends BaseService {
    def all(hasProjectIdOptions: Anon_ProjectId_1099524987 with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def allOwned(): js.Promise[GetResponse] = js.native
    def allOwned(options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def disable(projectId: ProjectId, runnerId: RunnerId): js.Promise[js.Object] = js.native
    def disable(projectId: ProjectId, runnerId: RunnerId, options: Sudo): js.Promise[js.Object] = js.native
    def edit(runnerId: RunnerId): js.Promise[js.Object] = js.native
    def edit(runnerId: RunnerId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def enable(projectId: ProjectId, runnerId: RunnerId): js.Promise[js.Object] = js.native
    def enable(projectId: ProjectId, runnerId: RunnerId, options: Sudo): js.Promise[js.Object] = js.native
    def jobs(runnerId: RunnerId): js.Promise[GetResponse] = js.native
    def jobs(runnerId: RunnerId, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(runnerId: RunnerId): js.Promise[js.Object] = js.native
    def remove(runnerId: RunnerId, options: Sudo): js.Promise[js.Object] = js.native
    def show(runnerId: RunnerId): js.Promise[GetResponse] = js.native
    def show(runnerId: RunnerId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Runners
  
}

