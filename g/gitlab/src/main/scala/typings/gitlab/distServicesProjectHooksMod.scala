package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.HookId
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesProjectHooksMod.ProjectHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/ProjectHooks", JSImport.Namespace)
@js.native
object distServicesProjectHooksMod extends js.Object {
  @js.native
  trait ProjectHooks extends BaseService {
    def add(projectId: ProjectId, url: String): js.Promise[js.Object] = js.native
    def add(projectId: ProjectId, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(projectId: ProjectId, hookId: HookId, url: String): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, hookId: HookId, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, hookId: HookId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, hookId: HookId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, hookId: HookId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, hookId: HookId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends ProjectHooks
  
}

