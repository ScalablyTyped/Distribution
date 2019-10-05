package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.MergeRequestId
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesTodosMod.Todos
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Todos", JSImport.Namespace)
@js.native
object distServicesTodosMod extends js.Object {
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

