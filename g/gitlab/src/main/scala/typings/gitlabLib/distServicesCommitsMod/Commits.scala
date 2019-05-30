package typings
package gitlabLib.distServicesCommitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commits
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(projectId: gitlabLib.ProjectId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(projectId: gitlabLib.ProjectId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def cherryPick(projectId: gitlabLib.ProjectId, sha: java.lang.String, branch: java.lang.String): js.Promise[js.Object] = js.native
  def cherryPick(
    projectId: gitlabLib.ProjectId,
    sha: java.lang.String,
    branch: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def comments(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def comments(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId, branch: java.lang.String, message: java.lang.String): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    branch: java.lang.String,
    message: java.lang.String,
    actions: js.Array[gitlabLib.CommitAction]
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    branch: java.lang.String,
    message: java.lang.String,
    actions: js.Array[gitlabLib.CommitAction],
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def createComment(projectId: gitlabLib.ProjectId, sha: java.lang.String, note: java.lang.String): js.Promise[js.Object] = js.native
  def createComment(
    projectId: gitlabLib.ProjectId,
    sha: java.lang.String,
    note: java.lang.String,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def diff(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def diff(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def editStatus(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[js.Object] = js.native
  def editStatus(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def mergeRequests(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def mergeRequests(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def references(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def references(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def status(projectId: gitlabLib.ProjectId, sha: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def status(projectId: gitlabLib.ProjectId, sha: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
}

