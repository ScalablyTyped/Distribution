package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesProtectedBranchesMod.ProtectedBranches
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ProtectedBranches", JSImport.Namespace)
@js.native
object distSrcCoreServicesProtectedBranchesMod extends js.Object {
  @js.native
  trait ProtectedBranches extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def protect(projectId: ProjectId, branchName: String): js.Promise[js.Object] = js.native
    def protect(projectId: ProjectId, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, branchName: String): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, branchName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def unprotect(projectId: ProjectId, branchName: String): js.Promise[js.Object] = js.native
    def unprotect(projectId: ProjectId, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends ProtectedBranches
  
}

