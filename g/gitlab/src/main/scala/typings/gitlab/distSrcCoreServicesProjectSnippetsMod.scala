package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import typings.gitlab.distSrcCoreServicesMod.SnippetId
import typings.gitlab.distSrcCoreServicesMod.SnippetVisibility
import typings.gitlab.distSrcCoreServicesProjectSnippetsMod.ProjectSnippets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/ProjectSnippets", JSImport.Namespace)
@js.native
object distSrcCoreServicesProjectSnippetsMod extends js.Object {
  @js.native
  trait ProjectSnippets extends BaseService {
    def all(projectId: ProjectId): js.Promise[GetResponse] = js.native
    def all(projectId: ProjectId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def content(projectId: ProjectId, snippetId: SnippetId): js.Promise[GetResponse] = js.native
    def content(projectId: ProjectId, snippetId: SnippetId, options: Sudo): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, title: String, fileName: String, code: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
    def create(
      projectId: ProjectId,
      title: String,
      fileName: String,
      code: String,
      visibility: SnippetVisibility,
      options: BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, snippetId: SnippetId): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, snippetId: SnippetId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, snippetId: SnippetId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, snippetId: SnippetId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, snippetId: SnippetId): js.Promise[GetResponse] = js.native
    def show(projectId: ProjectId, snippetId: SnippetId, options: Sudo): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: ProjectId, snippetId: SnippetId): js.Promise[GetResponse] = js.native
    def userAgentDetails(projectId: ProjectId, snippetId: SnippetId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends ProjectSnippets
  
}

