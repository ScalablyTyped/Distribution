package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreServicesIssuesStatisticsMod.IssuesStatistics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/IssuesStatistics", JSImport.Namespace)
@js.native
object distSrcCoreServicesIssuesStatisticsMod extends js.Object {
  @js.native
  trait IssuesStatistics extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: (Anon_ProjectId | Anon_GroupId | js.Object) with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends IssuesStatistics
  
}

