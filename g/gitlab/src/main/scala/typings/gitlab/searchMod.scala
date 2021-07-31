package typings.gitlab

import typings.gitlab.anon.projectIdstringnumberundeDictkey
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod {
  
  @JSImport("gitlab/dist/types/core/services/Search", "Search")
  @js.native
  class Search () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(scope: String, search: String, hasProjectIdGroupIdOptions: projectIdstringnumberundeDictkey): js.Promise[GetResponse] = js.native
  }
}
