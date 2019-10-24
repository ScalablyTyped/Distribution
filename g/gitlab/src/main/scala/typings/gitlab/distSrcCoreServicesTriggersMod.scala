package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesMod.TriggerId
import typings.gitlab.distSrcCoreServicesTriggersMod.Triggers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Triggers", JSImport.Namespace)
@js.native
object distSrcCoreServicesTriggersMod extends js.Object {
  @js.native
  trait Triggers extends BaseService {
    def add(projectId: ProjectId): js.Promise[js.Object] = js.native
    def add(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def edit(projectId: ProjectId, triggerId: TriggerId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, triggerId: TriggerId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def pipeline(projectId: ProjectId, ref: String, token: String): js.Promise[js.Object] = js.native
    def pipeline(projectId: ProjectId, ref: String, token: String, hasSudoOptions: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, triggerId: TriggerId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, triggerId: TriggerId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, triggerId: TriggerId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, triggerId: TriggerId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Triggers
  
}

