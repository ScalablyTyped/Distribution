package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesCommitsMod.Commits
import typings.gitlab.distSrcCoreServicesMod.CommitAction
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Commits", JSImport.Namespace)
@js.native
object distSrcCoreServicesCommitsMod extends js.Object {
  @js.native
  trait Commits extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def cherryPick(projectId: ProjectId, sha: String, branch: String): js.Promise[js.Object] = js.native
    def cherryPick(projectId: ProjectId, sha: String, branch: String, options: Sudo): js.Promise[js.Object] = js.native
    def comments(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def comments(projectId: ProjectId, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, branch: String, message: String): js.Promise[js.Object] = js.native
    def create(projectId: ProjectId, branch: String, message: String, actions: js.Array[CommitAction]): js.Promise[js.Object] = js.native
    def create(
      projectId: ProjectId,
      branch: String,
      message: String,
      actions: js.Array[CommitAction],
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def createComment(projectId: ProjectId, sha: String, note: String): js.Promise[js.Object] = js.native
    def createComment(projectId: ProjectId, sha: String, note: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def diff(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def diff(projectId: ProjectId, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def editStatus(projectId: ProjectId, sha: String): js.Promise[js.Object] = js.native
    def editStatus(projectId: ProjectId, sha: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def mergeRequests(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def mergeRequests(projectId: ProjectId, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def references(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def references(projectId: ProjectId, sha: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def status(projectId: ProjectId, sha: String): js.Promise[GetResponse] = js.native
    def status(projectId: ProjectId, sha: String, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Commits
  
}

