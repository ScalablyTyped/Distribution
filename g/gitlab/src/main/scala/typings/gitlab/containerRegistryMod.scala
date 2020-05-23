package typings.gitlab

import typings.gitlab.anon.SudokeepNstringolderThans
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/ContainerRegistry", JSImport.Namespace)
@js.native
object containerRegistryMod extends js.Object {
  @js.native
  class ContainerRegistry () extends BaseService {
    def removeRepository(projectId: String, repositoryId: Double): js.Promise[js.Object] = js.native
    def removeRepository(projectId: String, repositoryId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeRepository(projectId: Double, repositoryId: Double): js.Promise[js.Object] = js.native
    def removeRepository(projectId: Double, repositoryId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def removeTag(projectId: String, repositoryId: Double, tagName: String): js.Promise[js.Object] = js.native
    def removeTag(projectId: String, repositoryId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def removeTag(projectId: Double, repositoryId: Double, tagName: String): js.Promise[js.Object] = js.native
    def removeTag(projectId: Double, repositoryId: Double, tagName: String, options: Sudo): js.Promise[js.Object] = js.native
    def removeTags(projectId: String, repositoryId: Double, tagNameRegex: String): js.Promise[js.Object] = js.native
    def removeTags(projectId: String, repositoryId: Double, tagNameRegex: String, options: SudokeepNstringolderThans): js.Promise[js.Object] = js.native
    def removeTags(projectId: Double, repositoryId: Double, tagNameRegex: String): js.Promise[js.Object] = js.native
    def removeTags(projectId: Double, repositoryId: Double, tagNameRegex: String, options: SudokeepNstringolderThans): js.Promise[js.Object] = js.native
    def repositories(projectId: String): js.Promise[GetResponse] = js.native
    def repositories(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def repositories(projectId: Double): js.Promise[GetResponse] = js.native
    def repositories(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def showTag(projectId: String, repositoryId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def showTag(projectId: String, repositoryId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def showTag(projectId: Double, repositoryId: Double, tagName: String): js.Promise[GetResponse] = js.native
    def showTag(projectId: Double, repositoryId: Double, tagName: String, options: Sudo): js.Promise[GetResponse] = js.native
    def tags(projectId: String, repositoryId: Double): js.Promise[GetResponse] = js.native
    def tags(projectId: String, repositoryId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def tags(projectId: Double, repositoryId: Double): js.Promise[GetResponse] = js.native
    def tags(projectId: Double, repositoryId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

