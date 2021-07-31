package typings.gitlab

import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broadcastMessagesMod {
  
  @JSImport("gitlab/dist/types/core/services/BroadcastMessages", "BroadcastMessages")
  @js.native
  class BroadcastMessages () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def edit(broadcastMessageId: Double): js.Promise[js.Object] = js.native
    def edit(broadcastMessageId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(broadcastMessageId: Double): js.Promise[js.Object] = js.native
    
    def show(broadcastMessageId: Double): js.Promise[GetResponse] = js.native
    def show(broadcastMessageId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
