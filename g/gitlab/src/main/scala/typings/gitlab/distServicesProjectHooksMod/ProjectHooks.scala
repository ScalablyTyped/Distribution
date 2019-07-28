package typings.gitlab.distServicesProjectHooksMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.HookId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectHooks extends BaseService {
  def add(projectId: ProjectId, url: String): js.Promise[js.Object] = js.native
  def add(projectId: ProjectId, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def all(projectId: ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def edit(projectId: ProjectId, hookId: HookId, url: String): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, hookId: HookId, url: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, hookId: HookId): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, hookId: HookId, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, hookId: HookId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: ProjectId, hookId: HookId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

