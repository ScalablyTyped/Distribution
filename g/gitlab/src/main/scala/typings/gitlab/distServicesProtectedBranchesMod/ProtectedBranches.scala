package typings.gitlab.distServicesProtectedBranchesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

