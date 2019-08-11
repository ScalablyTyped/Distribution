package typings.gitlab.distServicesDeployKeysMod

import typings.gitlab.Anon_ProjectId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.KeyId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeployKeys extends BaseService {
  def add(projectId: ProjectId): js.Promise[js.Object] = js.native
  def add(projectId: ProjectId, options: Sudo): js.Promise[js.Object] = js.native
  def all(hasProjectIdOptions: Anon_ProjectId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def edit(projectId: ProjectId, keyId: KeyId): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, keyId: KeyId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def enable(projectId: ProjectId, keyId: KeyId): js.Promise[js.Object] = js.native
  def enable(projectId: ProjectId, keyId: KeyId, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, keyId: KeyId): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, keyId: KeyId, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, keyId: KeyId): js.Promise[GetResponse] = js.native
  def show(projectId: ProjectId, keyId: KeyId, options: Sudo): js.Promise[GetResponse] = js.native
}

