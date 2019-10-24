package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.EventOptions
import typings.gitlab.distSrcCoreServicesMod.GroupId
import typings.gitlab.distSrcCoreServicesMod.NamespaceId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesProjectsMod.Projects
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Projects", JSImport.Namespace)
@js.native
object distSrcCoreServicesProjectsMod extends js.Object {
  @js.native
  trait Projects extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def archive(projectId: ProjectId): js.Promise[js.Object] = js.native
    def archive(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def create(hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def events(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def events(projectId: ProjectId, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
    def fork(projectId: ProjectId): js.Promise[js.Object] = js.native
    def fork(projectId: ProjectId, hasForkedFromIdOptions: Anon_ForkedFromId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def forks(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def forks(projectId: ProjectId, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def languages(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def languages(projectId: ProjectId, options: Sudo): js.Promise[GetResponse] = js.native
    def mirrorPull(projectId: ProjectId): js.Promise[js.Object] = js.native
    def mirrorPull(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def removeFork(projectId: ProjectId): js.Promise[js.Object] = js.native
    def removeFork(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def search(projectName: String): js.Promise[GetResponse] = js.native
    def share(projectId: ProjectId, groupId: GroupId, groupAccess: Double): js.Promise[js.Object] = js.native
    def share(projectId: ProjectId, groupId: GroupId, groupAccess: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def star(projectId: ProjectId): js.Promise[js.Object] = js.native
    def star(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def statuses(projectId: ProjectId, sha: String, state: String): js.Promise[js.Object] = js.native
    def statuses(projectId: ProjectId, sha: String, state: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def transfer(projectId: ProjectId, namespaceId: NamespaceId): js.Promise[js.Object] = js.native
    def unarchive(projectId: ProjectId): js.Promise[js.Object] = js.native
    def unarchive(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def unshare(projectId: ProjectId, groupId: GroupId): js.Promise[js.Object] = js.native
    def unshare(projectId: ProjectId, groupId: GroupId, options: Sudo): js.Promise[js.Object] = js.native
    def unstar(projectId: ProjectId): js.Promise[js.Object] = js.native
    def unstar(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
    def updatePushRule(projectId: ProjectId): js.Promise[js.Object] = js.native
    def updatePushRule(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def upload(projectId: js.Any, content: js.Any): js.Promise[js.Object] = js.native
    def upload(projectId: js.Any, content: js.Any, hasMetadataSudo: Anon_Metadata with Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Projects
  
}

