package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.TriggerId
import typings.gitlab.distServicesTriggersMod.Triggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Triggers", JSImport.Namespace)
@js.native
object distServicesTriggersMod extends js.Object {
  @js.native
  trait Triggers extends BaseService {
    def add(projectId: ProjectId): js.Promise[js.Object] = js.native
    def add(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(projectId: ProjectId, triggerId: TriggerId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, triggerId: TriggerId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def pipeline(projectId: ProjectId, ref: String, token: String): js.Promise[js.Object] = js.native
    def pipeline(projectId: ProjectId, ref: String, token: String, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, triggerId: TriggerId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, triggerId: TriggerId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, triggerId: TriggerId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, triggerId: TriggerId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Triggers
  
}

