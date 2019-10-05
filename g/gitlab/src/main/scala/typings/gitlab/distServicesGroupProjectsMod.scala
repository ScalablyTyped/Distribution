package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesGroupProjectsMod.GroupProjects
import typings.gitlab.distServicesMod.GroupProjectId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/GroupProjects", JSImport.Namespace)
@js.native
object distServicesGroupProjectsMod extends js.Object {
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

