package typings.gitlab

import typings.gitlab.anon.BaseRequestOptions
import typings.gitlab.anon.groupIdstringnumberundefiDictkey
import typings.gitlab.anon.projectIdstringnumberundeDictkey
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesIssuesStatisticsMod {
  
  @JSImport("gitlab/dist/types/core/services/IssuesStatistics", "IssuesStatistics")
  @js.native
  open class IssuesStatistics () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(): js.Promise[GetResponse] = js.native
    def all(param0: projectIdstringnumberundeDictkey | groupIdstringnumberundefiDictkey | BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
}
