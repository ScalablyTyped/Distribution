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

object distTypesCoreServicesSystemHooksMod {
  
  @JSImport("gitlab/dist/types/core/services/SystemHooks", "SystemHooks")
  @js.native
  open class SystemHooks () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
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
