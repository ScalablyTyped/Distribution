package typings
package gitlabLib.distServicesProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Projects
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def archive(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def archive(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def create(hasUserIdOptions: gitlabLib.Anon_UserId with gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def events(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def events(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions with gitlabLib.EventOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def fork(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def fork(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def forks(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def forks(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def languages(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def languages(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def mirrorPull(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def mirrorPull(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def removeFork(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def removeFork(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def search(projectName: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def share(projectId: gitlabLib.ProjectId, groupId: gitlabLib.GroupId, groupAccess: scala.Double): js.Promise[js.Object] = js.native
  def share(
    projectId: gitlabLib.ProjectId,
    groupId: gitlabLib.GroupId,
    groupAccess: scala.Double,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def star(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def star(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def statuses(projectId: gitlabLib.ProjectId, sha: java.lang.String, state: java.lang.String): js.Promise[js.Object] = js.native
  def statuses(
    projectId: gitlabLib.ProjectId,
    sha: java.lang.String,
    state: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def transfer(projectId: gitlabLib.ProjectId, namespaceId: gitlabLib.NamespaceId): js.Promise[js.Object] = js.native
  def unarchive(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def unarchive(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def unshare(projectId: gitlabLib.ProjectId, groupId: gitlabLib.GroupId): js.Promise[js.Object] = js.native
  def unshare(projectId: gitlabLib.ProjectId, groupId: gitlabLib.GroupId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def unstar(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def unstar(projectId: gitlabLib.ProjectId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def updatePushRule(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def updatePushRule(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any): js.Promise[js.Object] = js.native
  def upload(projectId: js.Any, content: js.Any, metadata: gitlabLib.ProjectUploadMetadata): js.Promise[js.Object] = js.native
  def upload(
    projectId: js.Any,
    content: js.Any,
    metadata: gitlabLib.ProjectUploadMetadata,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
}

