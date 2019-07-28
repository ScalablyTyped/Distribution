package typings.gitlab.distServicesWikisMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wikis extends BaseService {
  def all(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, slug: String): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, slug: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, slug: String): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, slug: String, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, slug: String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, slug: String, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

