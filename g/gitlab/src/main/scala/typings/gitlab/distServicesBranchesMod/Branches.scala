package typings.gitlab.distServicesBranchesMod

import typings.gitlab.Anon_Search
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branches extends BaseService {
  def all(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, options: Anon_Search with PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId, branchName: String, ref: String): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, branchName: String, ref: String, options: Sudo): js.Promise[js.Object] = js.native
  def protect(projectId: ProjectId, branchName: String): js.Promise[js.Object] = js.native
  def protect(projectId: ProjectId, branchName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, branchName: String): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, branchName: String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, branchName: String, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def unprotect(projectId: ProjectId, branchName: String): js.Promise[js.Object] = js.native
  def unprotect(projectId: ProjectId, branchName: String, options: Sudo): js.Promise[js.Object] = js.native
}

