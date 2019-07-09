package typings
package gitlabLib.distServicesCommitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commits
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
  def cherryPick(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String, branch: java.lang.String): js.Promise[js.Object] = js.native
  def cherryPick(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    branch: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def comments(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def comments(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    branch: java.lang.String,
    message: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    branch: java.lang.String,
    message: java.lang.String,
    actions: js.Array[gitlabLib.distServicesMod.CommitAction]
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    branch: java.lang.String,
    message: java.lang.String,
    actions: js.Array[gitlabLib.distServicesMod.CommitAction],
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def createComment(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String, note: java.lang.String): js.Promise[js.Object] = js.native
  def createComment(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    note: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def diff(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def diff(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def editStatus(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[js.Object] = js.native
  def editStatus(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def mergeRequests(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mergeRequests(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def references(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def references(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def status(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def status(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

