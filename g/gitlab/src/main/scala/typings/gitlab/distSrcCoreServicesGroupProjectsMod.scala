package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesGroupProjectsMod.GroupProjects
import typings.gitlab.distSrcCoreServicesMod.GroupProjectId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/GroupProjects", JSImport.Namespace)
@js.native
object distSrcCoreServicesGroupProjectsMod extends js.Object {
  @js.native
  trait GroupProjects extends BaseService {
    def add(groupId: GroupProjectId, projectId: ProjectId): js.Promise[js.Object] = js.native
    def add(groupId: GroupProjectId, projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(groupId: GroupProjectId): js.Promise[GetResponse] = js.native
    def all(groupId: GroupProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends GroupProjects
  
}

