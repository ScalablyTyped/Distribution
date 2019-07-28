package typings.gitlab.distServicesEnvironmentsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.EnvironmentId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Environments extends BaseService {
  def all(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, environmentId: EnvironmentId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, environmentId: EnvironmentId, options: Sudo): js.Promise[js.Object] = js.native
  def stop(projectId: ProjectId, environmentId: EnvironmentId): js.Promise[js.Object] = js.native
  def stop(projectId: ProjectId, environmentId: EnvironmentId, options: Sudo): js.Promise[js.Object] = js.native
}

