package typings.gitlab.distTypesCoreServicesSnippetsMod

import typings.gitlab.Anon_Public
import typings.gitlab.distTypesCoreInfrastructureMod.BaseService
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.BaseRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.GetResponse
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.PaginatedRequestOptions
import typings.gitlab.distTypesCoreInfrastructureRequestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Snippets", "Snippets")
@js.native
class Snippets () extends BaseService {
  def all(hasPublicOptions: Anon_Public with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def content(snippetId: Double): js.Promise[GetResponse] = js.native
  def content(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def create(title: String, fileName: String, content: String, visibility: SnippetVisibility): js.Promise[js.Object] = js.native
  def create(
    title: String,
    fileName: String,
    content: String,
    visibility: SnippetVisibility,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(snippetId: Double): js.Promise[js.Object] = js.native
  def edit(snippetId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(snippetId: Double): js.Promise[js.Object] = js.native
  def remove(snippetId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def show(snippetId: Double): js.Promise[GetResponse] = js.native
  def show(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def userAgentDetails(snippetId: Double): js.Promise[GetResponse] = js.native
  def userAgentDetails(snippetId: Double, options: Sudo): js.Promise[GetResponse] = js.native
}

