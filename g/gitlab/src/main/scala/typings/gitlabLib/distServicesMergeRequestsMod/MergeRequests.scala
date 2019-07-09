package typings
package gitlabLib.distServicesMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeRequests
  extends gitlabLib.distInfrastructureMod.BaseService {
  def accept(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def accept(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distServicesMod.AcceptMergeRequestOptions with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def addSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    duration: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    duration: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    duration: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    duration: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def all(
    hasProjectIdGroupIdOptions: (gitlabLib.Anon_ProjectId_1556160014 | gitlabLib.Anon_GroupId_373224993 | js.Object) with gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def approvals(
    projectId: gitlabLib.distServicesMod.ProjectId,
    hasMergerequestIIdOptions: gitlabLib.Anon_MergerequestIId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def approve(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.Anon_Sha with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def approvers(
    projectId: gitlabLib.distServicesMod.ProjectId,
    approverIds: js.Array[gitlabLib.distServicesMod.UserId],
    approverGroupIds: js.Array[gitlabLib.distServicesMod.GroupId],
    hasMergerequestIIdOptions: gitlabLib.Anon_MergerequestIId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def changes(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def changes(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def closesIssues(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def closesIssues(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def commits(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def commits(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    title: java.lang.String
  ): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    title: java.lang.String,
    options: gitlabLib.distServicesMod.CreateMergeRequestOptions with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distServicesMod.UpdateMergeRequestOptions with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def editApprovals(
    projectId: gitlabLib.distServicesMod.ProjectId,
    hasMergerequestIIdOptions: gitlabLib.Anon_MergerequestIId with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def participants(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def participants(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def pipelines(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def pipelines(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def resetSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def resetSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def resetTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def resetTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distServicesMod.ShowMergeRequestOptions with gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def timeStats(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def timeStats(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def unapprove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def unapprove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def unsubscribe(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[js.Object] = js.native
  def unsubscribe(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def version(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    versionId: scala.Double
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def version(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    versionId: scala.Double,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def versions(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def versions(
    projectId: gitlabLib.distServicesMod.ProjectId,
    mergerequestIId: gitlabLib.distServicesMod.MergeRequestId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
}

