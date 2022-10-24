package typings.gitlab

import typings.gitlab.anon.SudokeepNstringolderThans
import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesContainerRegistryMod {
  
  @JSImport("gitlab/dist/types/core/services/ContainerRegistry", "ContainerRegistry")
  @js.native
  open class ContainerRegistry () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
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
