package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesProjectHooksMod {
  
  @JSImport("gitlab/dist/types/core/services/ProjectHooks", "ProjectHooks")
  @js.native
  open class ProjectHooks () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def add(projectId: String, url: String): js.Promise[js.Object] = js.native
    def add(projectId: String, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(projectId: Double, url: String): js.Promise[js.Object] = js.native
    def add(projectId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(projectId: String, hookId: Double, url: String): js.Promise[js.Object] = js.native
    def edit(projectId: String, hookId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, hookId: Double, url: String): js.Promise[js.Object] = js.native
    def edit(projectId: Double, hookId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, hookId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, hookId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, hookId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, hookId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, hookId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, hookId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, hookId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, hookId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
