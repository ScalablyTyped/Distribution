package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.SnippetId
import typings.gitlab.distSrcCoreServicesMod.SnippetVisibility
import typings.gitlab.distSrcCoreServicesSnippetsMod.Snippets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Snippets", JSImport.Namespace)
@js.native
object distSrcCoreServicesSnippetsMod extends js.Object {
  @js.native
  trait Snippets extends BaseService {
    def all(hasPublicOptions: Anon_Public with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def content(snippetId: SnippetId): js.Promise[GetResponse] = js.native
    def content(snippetId: SnippetId, options: Sudo): js.Promise[GetResponse] = js.native
    def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      title: String,
      fileName: String,
      content: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def edit(snippetId: SnippetId): js.Promise[js.Object] = js.native
    def edit(snippetId: SnippetId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(snippetId: SnippetId): js.Promise[js.Object] = js.native
    def remove(snippetId: SnippetId, options: Sudo): js.Promise[js.Object] = js.native
    def show(snippetId: SnippetId): js.Promise[GetResponse] = js.native
    def show(snippetId: SnippetId, options: Sudo): js.Promise[GetResponse] = js.native
    def userAgentDetails(snippetId: SnippetId): js.Promise[GetResponse] = js.native
    def userAgentDetails(snippetId: SnippetId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Snippets
  
}

