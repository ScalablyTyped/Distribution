package typings.gitlab

import typings.gitlab.anon.searchstringundefinedSudo
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object namespacesMod {
  
  @JSImport("gitlab/dist/types/core/services/Namespaces", "Namespaces")
  @js.native
  class Namespaces () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def show(namespaceId: String): js.Promise[GetResponse] = js.native
    def show(namespaceId: String, options: searchstringundefinedSudo): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double): js.Promise[GetResponse] = js.native
    def show(namespaceId: Double, options: searchstringundefinedSudo): js.Promise[GetResponse] = js.native
  }
}
