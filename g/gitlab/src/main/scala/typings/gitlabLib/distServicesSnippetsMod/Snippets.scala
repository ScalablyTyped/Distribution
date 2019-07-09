package typings
package gitlabLib.distServicesSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snippets
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(
    hasPublicOptions: gitlabLib.Anon_Public with gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def content(snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def content(snippetId: gitlabLib.distServicesMod.SnippetId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    title: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    visibility: gitlabLib.distServicesMod.SnippetVisibility
  ): js.Promise[js.Object] = js.native
  def create(
    title: java.lang.String,
    fileName: java.lang.String,
    content: java.lang.String,
    visibility: gitlabLib.distServicesMod.SnippetVisibility,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[js.Object] = js.native
  def edit(
    snippetId: gitlabLib.distServicesMod.SnippetId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[js.Object] = js.native
  def remove(snippetId: gitlabLib.distServicesMod.SnippetId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def show(snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(snippetId: gitlabLib.distServicesMod.SnippetId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def userAgentDetails(snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def userAgentDetails(snippetId: gitlabLib.distServicesMod.SnippetId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

