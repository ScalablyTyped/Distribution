package typings.gitlab

import typings.gitlab.distTypesCoreInfrastructureBaseServiceMod.BaseServiceOptions
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import typings.gitlab.distTypesCoreServicesSnippetsMod.SnippetVisibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCoreServicesProjectSnippetsMod {
  
  @JSImport("gitlab/dist/types/core/services/ProjectSnippets", "ProjectSnippets")
  @js.native
  open class ProjectSnippets () extends BaseService {
    def this(param0: BaseServiceOptions) = this()
    
    def all(projectId: String): js.Promise[GetResponse] = js.native
    def all(projectId: String, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def all(projectId: Double): js.Promise[GetResponse] = js.native
    def all(projectId: Double, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    
    def content(projectId: String, snippetId: Double): js.Promise[GetResponse] = js.native
    def content(projectId: String, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def content(projectId: Double, snippetId: Double): js.Promise[GetResponse] = js.native
    def content(projectId: Double, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def create(projectId: String, title: String, fileName: String, code: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      projectId: String,
      title: String,
      fileName: String,
      code: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def create(projectId: Double, title: String, fileName: String, code: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      projectId: Double,
      title: String,
      fileName: String,
      code: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    
    def edit(projectId: String, snippetId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: String, snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(projectId: Double, snippetId: Double): js.Promise[js.Object] = js.native
    def edit(projectId: Double, snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    
    def remove(projectId: String, snippetId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: String, snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    def remove(projectId: Double, snippetId: Double): js.Promise[js.Object] = js.native
    def remove(projectId: Double, snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
    
    def show(projectId: String, snippetId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: String, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def show(projectId: Double, snippetId: Double): js.Promise[GetResponse] = js.native
    def show(projectId: Double, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    
    def userAgentDetails(projectId: String, snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: String, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: Double, snippetId: Double): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: Double, snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  }
}
