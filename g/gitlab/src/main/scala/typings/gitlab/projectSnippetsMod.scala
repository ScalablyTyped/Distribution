package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import typings.gitlab.snippetsMod.SnippetVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitlab/dist/types/core/services/ProjectSnippets", JSImport.Namespace)
@js.native
object projectSnippetsMod extends js.Object {
  
  @js.native
  class ProjectSnippets () extends BaseService {
    
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
