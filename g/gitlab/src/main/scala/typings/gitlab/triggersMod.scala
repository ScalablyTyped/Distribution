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

object triggersMod {
  
  @JSImport("gitlab/dist/types/core/services/Triggers", "Triggers")
  @js.native
  class Triggers () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def add(projectId: String): js.Promise[js.Object] = js.native
    def add(projectId: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def add(projectId: Double): js.Promise[js.Object] = js.native
    def add(projectId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def edit(projectId: String, triggerId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, triggerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, triggerId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, triggerId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def pipeline(projectId: String, ref: String, token: String): js.Promise[js.Object] = js.native
    def pipeline(projectId: String, ref: String, token: String, hasSudoOptions: BaseRequestOptions): js.Promise[js.Object] = js.native
    def pipeline(projectId: Double, ref: String, token: String): js.Promise[js.Object] = js.native
    def pipeline(projectId: Double, ref: String, token: String, hasSudoOptions: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, triggerId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, triggerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, triggerId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, triggerId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, triggerId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, triggerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, triggerId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, triggerId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
