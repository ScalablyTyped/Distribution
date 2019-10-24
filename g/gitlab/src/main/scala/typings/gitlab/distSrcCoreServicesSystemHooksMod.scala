package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.HookId
import typings.gitlab.distSrcCoreServicesSystemHooksMod.SystemHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/SystemHooks", JSImport.Namespace)
@js.native
object distSrcCoreServicesSystemHooksMod extends js.Object {
  @js.native
  trait SystemHooks extends BaseService {
    def add(url: String): js.Promise[js.Object] = js.native
    def add(url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(hookId: HookId, url: String): js.Promise[js.Object] = js.native
    def edit(hookId: HookId, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(hookId: HookId): js.Promise[js.Object] = js.native
    def remove(hookId: HookId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends SystemHooks
  
}

