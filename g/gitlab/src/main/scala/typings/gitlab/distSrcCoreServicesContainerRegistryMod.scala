package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesContainerRegistryMod.ContainerRegistry
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ContainerRegistry", JSImport.Namespace)
@js.native
object distSrcCoreServicesContainerRegistryMod extends js.Object {
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
  
  @js.native
  class default () extends ContainerRegistry
  
}

