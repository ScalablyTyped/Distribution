package typings.gitlab.distServicesIssuesMod

import typings.gitlab.Anon_GroupId
import typings.gitlab.Anon_ProjectId
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.IssueId
import typings.gitlab.distServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues extends BaseService {
  def addSpentTime(projectId: ProjectId, issueId: IssueId, duration: String): js.Promise[js.Object] = js.native
  def addSpentTime(projectId: ProjectId, issueId: IssueId, duration: String, options: Sudo): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: ProjectId, issueId: IssueId, duration: String): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: ProjectId, issueId: IssueId, duration: String, options: Sudo): js.Promise[js.Object] = js.native
  def all(): js.Promise[GetResponse] = js.native
  def all(
    hasProjectIdGroupIdOptions: (Anon_ProjectId | Anon_GroupId | js.Object) with PaginatedRequestOptions
  ): js.Promise[GetResponse] = js.native
  def create(projectId: ProjectId): js.Promise[js.Object] = js.native
  def create(projectId: ProjectId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, issueId: IssueId): js.Promise[js.Object] = js.native
  def edit(projectId: ProjectId, issueId: IssueId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def link(projectId: ProjectId, issueIId: IssueId, targetProjectId: ProjectId, targetIssueId: IssueId): js.Promise[js.Object] = js.native
  def link(
    projectId: ProjectId,
    issueIId: IssueId,
    targetProjectId: ProjectId,
    targetIssueId: IssueId,
    options: BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def participants(projectId: ProjectId, issueId: IssueId): js.Promise[GetResponse] = js.native
  def participants(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[GetResponse] = js.native
  def remove(projectId: ProjectId, issueId: IssueId): js.Promise[js.Object] = js.native
  def remove(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: ProjectId, issueId: IssueId): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: ProjectId, issueId: IssueId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: ProjectId, issueId: IssueId): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: ProjectId, issueId: IssueId): js.Promise[GetResponse] = js.native
  def show(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[GetResponse] = js.native
  def subscribe(projectId: ProjectId, issueId: IssueId): js.Promise[js.Object] = js.native
  def subscribe(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
  def timeStats(projectId: ProjectId, issueId: IssueId): js.Promise[GetResponse] = js.native
  def timeStats(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[GetResponse] = js.native
  def unsubscribe(projectId: ProjectId, issueId: IssueId): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: ProjectId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
}

