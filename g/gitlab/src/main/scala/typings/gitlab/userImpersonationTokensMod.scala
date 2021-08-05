package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userImpersonationTokensMod {
  
  @JSImport("gitlab/dist/types/core/services/UserImpersonationTokens", "UserImpersonationTokens")
  @js.native
  class UserImpersonationTokens () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
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
