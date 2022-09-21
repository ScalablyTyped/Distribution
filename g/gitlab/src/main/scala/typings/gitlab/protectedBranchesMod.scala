package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protectedBranchesMod {
  
  @JSImport("gitlab/dist/types/core/services/ProtectedBranches", "ProtectedBranches")
  @js.native
  open class ProtectedBranches () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def protect(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: String, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def protect(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: Double, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def show(projectId: String, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: String, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: Double, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    
    def unprotect(projectId: String, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: String, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: Double, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
}
