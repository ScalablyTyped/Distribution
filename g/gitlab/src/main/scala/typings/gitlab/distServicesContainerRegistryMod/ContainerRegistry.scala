package typings.gitlab.distServicesContainerRegistryMod

import typings.gitlab.Anon_KeepN
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerRegistry extends BaseService {
  def removeRepository(projectId: ProjectId, repositoryId: Double): js.Promise[js.Object] = js.native
  def removeRepository(projectId: ProjectId, repositoryId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def removeTag(projectId: ProjectId, repositoryId: Double, tagName: String): js.Promise[js.Object] = js.native
  def removeTag(projectId: ProjectId, repositoryId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
  def removeTags(projectId: ProjectId, repositoryId: Double, tagNameRegex: String): js.Promise[js.Object] = js.native
  def removeTags(projectId: ProjectId, repositoryId: Double, tagNameRegex: String, options: Sudo with Anon_KeepN): js.Promise[js.Object] = js.native
  def repositories(projectId: ProjectId): js.Promise[GetResponse] = js.native
  def repositories(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def showTag(projectId: ProjectId, repositoryId: Double, tagName: String): js.Promise[GetResponse] = js.native
  def showTag(projectId: ProjectId, repositoryId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
  def tags(projectId: ProjectId, repositoryId: Double): js.Promise[GetResponse] = js.native
  def tags(projectId: ProjectId, repositoryId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
}

