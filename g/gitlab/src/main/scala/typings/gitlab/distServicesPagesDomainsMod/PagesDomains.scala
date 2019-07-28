package typings.gitlab.distServicesPagesDomainsMod

import typings.gitlab.Anon_ProjectId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PagesDomains extends BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(hasProjectIdOptions: Anon_ProjectId with PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId, domain: String): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, domain: String): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, domain: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, domain: String): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, domain: String, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, domain: String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, domain: String, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

