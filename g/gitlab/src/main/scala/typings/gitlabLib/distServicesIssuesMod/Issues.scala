package typings
package gitlabLib.distServicesIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues
  extends gitlabLib.distInfrastructureMod.BaseService {
  def addSpentTime(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, duration: java.lang.String): js.Promise[js.Object] = js.native
  def addSpentTime(
    projectId: gitlabLib.ProjectId,
    issueId: gitlabLib.IssueId,
    duration: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, duration: java.lang.String): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.ProjectId,
    issueId: gitlabLib.IssueId,
    duration: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(hasProjectIdOptions: gitlabLib.Anon_ProjectId with gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(projectId: gitlabLib.ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: gitlabLib.ProjectId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def link(
    projectId: gitlabLib.ProjectId,
    issueIId: gitlabLib.IssueId,
    targetProjectId: gitlabLib.ProjectId,
    targetIssueId: gitlabLib.IssueId
  ): js.Promise[js.Object] = js.native
  def link(
    projectId: gitlabLib.ProjectId,
    issueIId: gitlabLib.IssueId,
    targetProjectId: gitlabLib.ProjectId,
    targetIssueId: gitlabLib.IssueId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def participants(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[gitlabLib.GetResponse] = js.native
  def participants(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def subscribe(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def subscribe(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def timeStats(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[gitlabLib.GetResponse] = js.native
  def timeStats(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def unsubscribe(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: gitlabLib.ProjectId, issueId: gitlabLib.IssueId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

