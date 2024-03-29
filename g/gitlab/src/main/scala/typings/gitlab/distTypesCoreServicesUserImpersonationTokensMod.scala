package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesUserImpersonationTokensMod {
  
  @JSImport("gitlab/dist/types/core/services/UserImpersonationTokens", "UserImpersonationTokens")
  @js.native
  open class UserImpersonationTokens () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String): js.Promise[js.Object] = js.native
    def add(userId: Double, name: String, scopes: ImpersonationTokenScope, expiresAt: String, options: Sudo): js.Promise[js.Object] = js.native
    
    def all(userId: Double): js.Promise[GetResponse] = js.native
    def all(userId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def revoke(userId: Double, tokenId: Double): js.Promise[js.Object] = js.native
    def revoke(userId: Double, tokenId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(userId: Double, tokenId: Double): js.Promise[GetResponse] = js.native
    def show(userId: Double, tokenId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.gitlab.gitlabStrings.api
    - typings.gitlab.gitlabStrings.read_user
  */
  trait ImpersonationTokenScope extends StObject
  object ImpersonationTokenScope {
    
    inline def api: typings.gitlab.gitlabStrings.api = "api".asInstanceOf[typings.gitlab.gitlabStrings.api]
    
    inline def read_user: typings.gitlab.gitlabStrings.read_user = "read_user".asInstanceOf[typings.gitlab.gitlabStrings.read_user]
  }
}
