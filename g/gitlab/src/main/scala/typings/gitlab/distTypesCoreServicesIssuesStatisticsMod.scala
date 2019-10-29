package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssuesStatistics", JSImport.Namespace)
@js.native
object distTypesCoreServicesIssuesStatisticsMod extends js.Object {
  @js.native
  class IssuesStatistics () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: (Anon_ProjectId | Anon_GroupId | js.Object) with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

