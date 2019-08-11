package typings.gitlab.distServicesReleasesMod

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
trait Releases extends BaseService {
  def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
  def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def create(projectId: ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, tagName: String): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, tagName: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, tagName: String): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, tagName: String): js.Promise[GetResponse] = js.native
  def show(projectId: ProjectId, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
}

