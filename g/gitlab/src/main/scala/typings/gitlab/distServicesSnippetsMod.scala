package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.SnippetId
import typings.gitlab.distServicesMod.SnippetVisibility
import typings.gitlab.distServicesSnippetsMod.Snippets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/Snippets", JSImport.Namespace)
@js.native
object distServicesSnippetsMod extends js.Object {
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

