package typings
package gitlabLib.distServicesSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snippets
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(hasPublicOptions: gitlabLib.Anon_Public with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def content(snippetId: gitlabLib.SnippetId): js.Promise[gitlabLib.GetResponse] = js.native
  def content(snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def create(
    title: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    visibility: gitlabLib.SnippetVisibility
  ): js.Promise[js.Object] = js.native
  def create(
    title: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    visibility: gitlabLib.SnippetVisibility,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(snippetId: gitlabLib.SnippetId): js.Promise[js.Object] = js.native
  def edit(snippetId: gitlabLib.SnippetId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(snippetId: gitlabLib.SnippetId): js.Promise[js.Object] = js.native
  def remove(snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(snippetId: gitlabLib.SnippetId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def userAgentDetails(snippetId: gitlabLib.SnippetId): js.Promise[gitlabLib.GetResponse] = js.native
  def userAgentDetails(snippetId: gitlabLib.SnippetId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

