package typings.gitlab

import typings.gitlab.anon.BaseRequestOptions
import typings.gitlab.anon.groupIdstringnumberundefiDictkey
import typings.gitlab.anon.projectIdstringnumberundeDictkey
import typings.gitlab.baseServiceMod.BaseServiceOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issuesStatisticsMod {
  
  @JSImport("gitlab/dist/types/core/services/IssuesStatistics", "IssuesStatistics")
  @js.native
  open class IssuesStatistics () extends BaseService {
    def this(hasTokenJobTokenOauthTokenSudoProfileTokenProfileModeHostUrlVersionCamelizeRejectUnauthorizedRequesterRequestTimeout: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(
      hasProjectIdGroupIdOptions: projectIdstringnumberundeDictkey | groupIdstringnumberundefiDictkey | BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
  }
}
