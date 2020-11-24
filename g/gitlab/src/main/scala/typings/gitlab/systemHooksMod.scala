package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/SystemHooks", JSImport.Namespace)
@js.native
object systemHooksMod extends js.Object {
  
  @js.native
  class SystemHooks () extends BaseService {
    
    def add(url: String): js.Promise[js.Object] = js.native
    def add(url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(hookId: Double, url: String): js.Promise[js.Object] = js.native
    def edit(hookId: Double, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(hookId: Double): js.Promise[js.Object] = js.native
    def remove(hookId: Double, options: Sudo): js.Promise[js.Object] = js.native
  }
}
