package typings.gitlab.distServicesProjectSnippetsMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.SnippetId
import typings.gitlab.distServicesMod.SnippetVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

