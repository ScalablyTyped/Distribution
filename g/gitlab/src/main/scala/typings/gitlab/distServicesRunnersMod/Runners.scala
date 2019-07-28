package typings.gitlab.distServicesRunnersMod

import typings.gitlab.Anon_ProjectId_1556160014
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.RunnerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Runners extends BaseService {
  def all(hasProjectIdOptions: Anon_ProjectId_1556160014 with PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def allOwned(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def allOwned(options: BaseRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def disable(projectId: ProjectId, runnerId: RunnerId): js.Promise[js.Object] = js.native
  def disable(projectId: ProjectId, runnerId: RunnerId, options: Sudo): js.Promise[js.Object] = js.native
  def edit(runnerId: RunnerId): js.Promise[js.Object] = js.native
  def edit(runnerId: RunnerId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def enable(projectId: ProjectId, runnerId: RunnerId): js.Promise[js.Object] = js.native
  def enable(projectId: ProjectId, runnerId: RunnerId, options: Sudo): js.Promise[js.Object] = js.native
  def jobs(runnerId: RunnerId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def jobs(runnerId: RunnerId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(runnerId: RunnerId): js.Promise[js.Object] = js.native
  def remove(runnerId: RunnerId, options: Sudo): js.Promise[js.Object] = js.native
  def show(runnerId: RunnerId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(runnerId: RunnerId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

