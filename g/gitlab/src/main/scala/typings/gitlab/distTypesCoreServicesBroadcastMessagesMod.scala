package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesBroadcastMessagesMod {
  
  @JSImport("gitlab/dist/types/core/services/BroadcastMessages", "BroadcastMessages")
  @js.native
  open class BroadcastMessages () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
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
