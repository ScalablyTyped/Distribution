package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMergeRequestsMod.MergeRequests
import typings.gitlab.distServicesMod.AcceptMergeRequestOptions
import typings.gitlab.distServicesMod.CreateMergeRequestOptions
import typings.gitlab.distServicesMod.GroupId
import typings.gitlab.distServicesMod.MergeRequestId
import typings.gitlab.distServicesMod.ProjectId
import typings.gitlab.distServicesMod.ShowMergeRequestOptions
import typings.gitlab.distServicesMod.UpdateMergeRequestOptions
import typings.gitlab.distServicesMod.UserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/MergeRequests", JSImport.Namespace)
@js.native
object distServicesMergeRequestsMod extends js.Object {
  @js.native
  trait MergeRequests extends BaseService {
    def accept(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def accept(
      projectId: ProjectId,
      mergerequestIId: MergeRequestId,
      options: AcceptMergeRequestOptions with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: ProjectId, mergerequestIId: MergeRequestId, duration: String): js.Promise[js.Object] = js.native
    def addSpentTime(projectId: ProjectId, mergerequestIId: MergeRequestId, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: ProjectId, mergerequestIId: MergeRequestId, duration: String): js.Promise[js.Object] = js.native
    def addTimeEstimate(projectId: ProjectId, mergerequestIId: MergeRequestId, duration: String, options: Sudo): js.Promise[js.Object] = js.native
    def all(
      hasProjectIdGroupIdOptions: (Anon_ProjectId_1099524987 | Anon_GroupId_1043297548 | js.Object) with PaginatedRequestOptions
    ): js.Promise[GetResponse] = js.native
    def approvals(projectId: ProjectId, hasMergerequestIIdOptions: Anon_MergerequestIId with BaseRequestOptions): js.Promise[GetResponse] = js.native
    def approve(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Anon_Sha with BaseRequestOptions): js.Promise[js.Object] = js.native
    def approvers(
      projectId: ProjectId,
      approverIds: js.Array[UserId],
      approverGroupIds: js.Array[GroupId],
      hasMergerequestIIdOptions: Anon_MergerequestIId with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def cancelOnPipelineSucess(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def cancelOnPipelineSucess(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def changes(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def changes(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
    def closesIssues(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def closesIssues(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
    def commits(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def commits(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
    def create(projectId: ProjectId, sourceBranch: String, targetBranch: String, title: String): js.Promise[js.Object] = js.native
    def create(
      projectId: ProjectId,
      sourceBranch: String,
      targetBranch: String,
      title: String,
      options: CreateMergeRequestOptions with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def edit(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def edit(
      projectId: ProjectId,
      mergerequestIId: MergeRequestId,
      options: UpdateMergeRequestOptions with BaseRequestOptions
    ): js.Promise[js.Object] = js.native
    def editApprovals(projectId: ProjectId, hasMergerequestIIdOptions: Anon_MergerequestIId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def participants(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def participants(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
    def pipelines(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def pipelines(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def remove(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def resetSpentTime(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def resetTimeEstimate(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def show(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def show(
      projectId: ProjectId,
      mergerequestIId: MergeRequestId,
      options: ShowMergeRequestOptions with BaseRequestOptions
    ): js.Promise[GetResponse] = js.native
    def timeStats(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def timeStats(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
    def unapprove(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def unapprove(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[js.Object] = js.native
    def unsubscribe(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[js.Object] = js.native
    def version(projectId: ProjectId, mergerequestIId: MergeRequestId, versionId: Double): js.Promise[GetResponse] = js.native
    def version(projectId: ProjectId, mergerequestIId: MergeRequestId, versionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
    def versions(projectId: ProjectId, mergerequestIId: MergeRequestId): js.Promise[GetResponse] = js.native
    def versions(projectId: ProjectId, mergerequestIId: MergeRequestId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends MergeRequests
  
}

