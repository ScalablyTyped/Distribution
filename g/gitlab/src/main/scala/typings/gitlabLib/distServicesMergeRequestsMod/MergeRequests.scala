package typings
package gitlabLib.distServicesMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeRequests
  extends gitlabLib.distInfrastructureMod.BaseService {
  def accept(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def accept(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    options: gitlabLib.AcceptMergeRequestOptions with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def addSpentTime(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    duration: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addSpentTime(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    duration: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    duration: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    duration: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def all(
    hasProjectIdGroupIdOptions: (gitlabLib.Anon_ProjectId_1917859966 | gitlabLib.Anon_GroupId | js.Object) with gitlabLib.PaginatedRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def approvals(
    projectId: gitlabLib.ProjectId,
    hasMergerequestIIdOptions: gitlabLib.Anon_MergerequestIId with gitlabLib.BaseRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def approve(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    options: gitlabLib.Anon_Sha with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def approvers(
    projectId: gitlabLib.ProjectId,
    approverIds: js.Array[gitlabLib.UserId],
    approverGroupIds: js.Array[gitlabLib.GroupId],
    hasMergerequestIIdOptions: gitlabLib.Anon_MergerequestIId with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def changes(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def changes(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def closesIssues(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def closesIssues(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def commits(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def commits(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    title: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.ProjectId,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    title: java.lang.String,
    options: gitlabLib.CreateMergeRequestOptions with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    options: gitlabLib.UpdateMergeRequestOptions with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def editApprovals(
    projectId: gitlabLib.ProjectId,
    hasMergerequestIIdOptions: gitlabLib.Anon_MergerequestIId with gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def participants(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def participants(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def pipelines(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def pipelines(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def remove(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    options: gitlabLib.ShowMergeRequestOptions with gitlabLib.BaseRequestOptions
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def timeStats(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def timeStats(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def unapprove(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def unapprove(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def version(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, versionId: scala.Double): js.Promise[gitlabLib.GetResponse] = js.native
  def version(
    projectId: gitlabLib.ProjectId,
    mergerequestIId: gitlabLib.MergeRequestId,
    versionId: scala.Double,
    options: gitlabLib.Sudo
  ): js.Promise[gitlabLib.GetResponse] = js.native
  def versions(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId): js.Promise[gitlabLib.GetResponse] = js.native
  def versions(projectId: gitlabLib.ProjectId, mergerequestIId: gitlabLib.MergeRequestId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

