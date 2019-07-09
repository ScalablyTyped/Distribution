package typings
package gitlabLib.distServicesProjectSnippetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSnippets
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def content(projectId: gitlabLib.distServicesMod.ProjectId, snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def content(
    projectId: gitlabLib.distServicesMod.ProjectId,
    snippetId: gitlabLib.distServicesMod.SnippetId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    title: java.lang.String,
    fileName: java.lang.String,
    code: java.lang.String,
    visibility: gitlabLib.distServicesMod.SnippetVisibility
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    title: java.lang.String,
    fileName: java.lang.String,
    code: java.lang.String,
    visibility: gitlabLib.distServicesMod.SnippetVisibility,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.distServicesMod.ProjectId, snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    snippetId: gitlabLib.distServicesMod.SnippetId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.distServicesMod.ProjectId, snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    snippetId: gitlabLib.distServicesMod.SnippetId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    snippetId: gitlabLib.distServicesMod.SnippetId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def userAgentDetails(projectId: gitlabLib.distServicesMod.ProjectId, snippetId: gitlabLib.distServicesMod.SnippetId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def userAgentDetails(
    projectId: gitlabLib.distServicesMod.ProjectId,
    snippetId: gitlabLib.distServicesMod.SnippetId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

