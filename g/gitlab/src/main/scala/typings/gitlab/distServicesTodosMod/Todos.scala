package typings.gitlab.distServicesTodosMod

import typings.gitlab.Anon_TodoId
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.MergeRequestId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Todos extends BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId, mergerequestId: MergeRequestId): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, mergerequestId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
  def done(hasTodoIdOptions: Anon_TodoId with Sudo): js.Promise[js.Object] = js.native
}

