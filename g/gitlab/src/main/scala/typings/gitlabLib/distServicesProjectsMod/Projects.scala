package typings
package gitlabLib.distServicesProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projects
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def archive(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def archive(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def create(hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.distInfrastructureMod.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def events(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def events(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions with gitlabLib.distServicesMod.EventOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def fork(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def fork(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def forks(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def forks(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def languages(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def languages(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def mirrorPull(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def mirrorPull(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def removeFork(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def removeFork(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def search(projectName: java.lang.String): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def share(
    projectId: gitlabLib.distServicesMod.ProjectId,
    groupId: gitlabLib.distServicesMod.GroupId,
    groupAccess: scala.Double
  ): js.Promise[js.Object] = js.native
  def share(
    projectId: gitlabLib.distServicesMod.ProjectId,
    groupId: gitlabLib.distServicesMod.GroupId,
    groupAccess: scala.Double,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def star(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def star(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def statuses(projectId: gitlabLib.distServicesMod.ProjectId, sha: java.lang.String, state: java.lang.String): js.Promise[js.Object] = js.native
  def statuses(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sha: java.lang.String,
    state: java.lang.String,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def transfer(projectId: gitlabLib.distServicesMod.ProjectId, namespaceId: gitlabLib.distServicesMod.NamespaceId): js.Promise[js.Object] = js.native
  def unarchive(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def unarchive(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: gitlabLib.distServicesMod.ProjectId, groupId: gitlabLib.distServicesMod.GroupId): js.Promise[js.Object] = js.native
  def unshare(
    projectId: gitlabLib.distServicesMod.ProjectId,
    groupId: gitlabLib.distServicesMod.GroupId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def unstar(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def unstar(projectId: gitlabLib.distServicesMod.ProjectId, options: gitlabLib.distInfrastructureMod.Sudo): js.Promise[js.Object] = js.native
  def updatePushRule(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def updatePushRule(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any): js.Promise[js.Object] = js.native
  def upload(
    projectId: js.Any,
    content: js.Any,
    hasMetadataSudo: gitlabLib.Anon_Metadata with gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
}

