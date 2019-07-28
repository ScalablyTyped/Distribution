package typings.gitlab.distServicesSnippetsMod

import typings.gitlab.Anon_Public
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.SnippetId
import typings.gitlab.distServicesMod.SnippetVisibility
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snippets extends BaseService {
  def all(hasPublicOptions: Anon_Public with PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def content(snippetId: SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def content(snippetId: SnippetId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
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
  def show(snippetId: SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(snippetId: SnippetId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def userAgentDetails(snippetId: SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def userAgentDetails(snippetId: SnippetId, options: Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

