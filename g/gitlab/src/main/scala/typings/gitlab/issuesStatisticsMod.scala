package typings.gitlab

import typings.gitlab.anon.GroupId
import typings.gitlab.anon.ProjectId
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/IssuesStatistics", JSImport.Namespace)
@js.native
object issuesStatisticsMod extends js.Object {
  @js.native
  class IssuesStatistics () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasProjectIdGroupIdOptions: (ProjectId | GroupId | js.Object) with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

