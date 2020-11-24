package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/FeatureFlags", JSImport.Namespace)
@js.native
object featureFlagsMod extends js.Object {
  
  @js.native
  class FeatureFlags () extends BaseService {
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def set(name: String): js.Promise[js.Object] = js.native
    def set(name: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  }
}
