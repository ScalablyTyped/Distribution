package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesRepositoryFilesMod.RepositoryFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/RepositoryFiles", JSImport.Namespace)
@js.native
object distSrcCoreServicesRepositoryFilesMod extends js.Object {
  @js.native
  trait RepositoryFiles extends BaseService {
    def create(projectId: ProjectId, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
    def create(
      projectId: ProjectId,
      filePath: String,
      branch: String,
      content: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, filePath: String, branch: String, content: String, commitMessage: String): js.Promise[js.Object] = js.native
    def edit(
      projectId: ProjectId,
      filePath: String,
      branch: String,
      content: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, filePath: String, branch: String, commitMessage: String): js.Promise[js.Object] = js.native
    def remove(
      projectId: ProjectId,
      filePath: String,
      branch: String,
      commitMessage: String,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, filePath: String, ref: String): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showBlame(projectId: ProjectId, filePath: String): js.Promise[GetResponse] = js.native
    def showBlame(projectId: ProjectId, filePath: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showRaw(projectId: ProjectId, filePath: String, ref: String): js.Promise[GetResponse] = js.native
    def showRaw(projectId: ProjectId, filePath: String, ref: String, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends RepositoryFiles
  
}

