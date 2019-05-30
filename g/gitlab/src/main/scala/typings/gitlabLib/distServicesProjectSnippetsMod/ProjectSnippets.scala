package typings
package gitlabLib.distServicesProjectSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSnippets
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def content(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId): js.Promise[gitlabLib.GetResponse] = js.native
  def content(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    title: java.lang.String,
    fileName: java.lang.String,
    code: java.lang.String,
    visibility: gitlabLib.SnippetVisibility
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    title: java.lang.String,
    fileName: java.lang.String,
    code: java.lang.String,
    visibility: gitlabLib.SnippetVisibility,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    snippetId: gitlabLib.SnippetId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def userAgentDetails(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId): js.Promise[gitlabLib.GetResponse] = js.native
  def userAgentDetails(projectId: gitlabLib.ProjectId, snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

