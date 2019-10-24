package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.MergeRequestId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesTodosMod.Todos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Todos", JSImport.Namespace)
@js.native
object distSrcCoreServicesTodosMod extends js.Object {
  @js.native
  trait Todos extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, mergerequestId: MergeRequestId): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, mergerequestId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def done(hasTodoIdOptions: Anon_TodoId with Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Todos
  
}

