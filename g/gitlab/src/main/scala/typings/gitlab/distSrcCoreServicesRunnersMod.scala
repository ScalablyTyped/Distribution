package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesMod.RunnerId
import typings.gitlab.distSrcCoreServicesRunnersMod.Runners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Runners", JSImport.Namespace)
@js.native
object distSrcCoreServicesRunnersMod extends js.Object {
  @js.native
  trait Runners extends BaseService {
    def all(hasProjectIdOptions: Anon_ProjectId_900947029 with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
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

