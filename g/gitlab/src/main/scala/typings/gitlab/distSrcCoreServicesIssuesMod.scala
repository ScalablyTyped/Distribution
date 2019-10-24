package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesIssuesMod.Issues
import typings.gitlab.distSrcCoreServicesMod.IssueId
import typings.gitlab.distSrcCoreServicesMod.ProjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Issues", JSImport.Namespace)
@js.native
object distSrcCoreServicesIssuesMod extends js.Object {
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
  
  @js.native
  class default () extends Issues
  
}

