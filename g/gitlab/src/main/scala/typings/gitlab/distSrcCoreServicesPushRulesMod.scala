package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesPushRulesMod.PushRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/PushRules", JSImport.Namespace)
@js.native
object distSrcCoreServicesPushRulesMod extends js.Object {
  @js.native
  trait PushRules extends BaseService {
    def create(projectId: ProjectId): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, hasUpsertOptions: Anon_Upsert with BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends PushRules
  
}

