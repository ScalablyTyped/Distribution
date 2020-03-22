package typings.gitlab.mergeRequestsMod

import typings.gitlab.Anon0
import typings.gitlab.Anon1
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.mergerequestIIdnumberBase
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import typings.gitlab.shastringBaseRequestOptio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/MergeRequests", "MergeRequests")
@js.native
class MergeRequests () extends BaseService {
  def accept(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def accept(
    projectId: String,
    mergerequestIId: Double,
    options: AcceptMergeRequestOptions with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def accept(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def accept(
    projectId: Double,
    mergerequestIId: Double,
    options: AcceptMergeRequestOptions with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def addSpentTime(projectId: String, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
  def addSpentTime(projectId: String, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
  def addSpentTime(projectId: Double, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
  def addSpentTime(projectId: Double, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: String, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: String, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: Double, mergerequestIId: Double, duration: String): js.Promise[js.Object] = js.native
  def addTimeEstimate(projectId: Double, mergerequestIId: Double, duration: String, options: Sudo): js.Promise[js.Object] = js.native
  def all(hasProjectIdGroupIdOptions: (Anon0 | Anon1 | js.Object) with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def approvalState(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def approvalState(projectId: String, mergerequestIId: Double, options: shastringBaseRequestOptio): js.Promise[GetResponse] = js.native
  def approvalState(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def approvalState(projectId: Double, mergerequestIId: Double, options: shastringBaseRequestOptio): js.Promise[GetResponse] = js.native
  def approvals(projectId: String): js.Promise[GetResponse] = js.native
  def approvals(projectId: String, hasMergerequestIIdOptions: mergerequestIIdnumberBase): js.Promise[GetResponse] = js.native
  def approvals(projectId: Double): js.Promise[GetResponse] = js.native
  def approvals(projectId: Double, hasMergerequestIIdOptions: mergerequestIIdnumberBase): js.Promise[GetResponse] = js.native
  def approve(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def approve(projectId: String, mergerequestIId: Double, options: shastringBaseRequestOptio): js.Promise[js.Object] = js.native
  def approve(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def approve(projectId: Double, mergerequestIId: Double, options: shastringBaseRequestOptio): js.Promise[js.Object] = js.native
  def approvers(projectId: String, approverIds: js.Array[Double], approverGroupIds: js.Array[String | Double]): js.Promise[js.Object] = js.native
  def approvers(
    projectId: String,
    approverIds: js.Array[Double],
    approverGroupIds: js.Array[String | Double],
    hasMergerequestIIdOptions: mergerequestIIdnumberBase
  ): js.Promise[js.Object] = js.native
  def approvers(projectId: Double, approverIds: js.Array[Double], approverGroupIds: js.Array[String | Double]): js.Promise[js.Object] = js.native
  def approvers(
    projectId: Double,
    approverIds: js.Array[Double],
    approverGroupIds: js.Array[String | Double],
    hasMergerequestIIdOptions: mergerequestIIdnumberBase
  ): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def cancelOnPipelineSucess(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def changes(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def changes(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def changes(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def changes(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def closesIssues(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def closesIssues(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def closesIssues(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def closesIssues(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def commits(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def commits(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def commits(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def commits(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def create(projectId: String, sourceBranch: String, targetBranch: String, title: String): js.Promise[js.Object] = js.native
  def create(
    projectId: String,
    sourceBranch: String,
    targetBranch: String,
    title: String,
    options: CreateMergeRequestOptions with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def create(projectId: Double, sourceBranch: String, targetBranch: String, title: String): js.Promise[js.Object] = js.native
  def create(
    projectId: Double,
    sourceBranch: String,
    targetBranch: String,
    title: String,
    options: CreateMergeRequestOptions with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def edit(
    projectId: String,
    mergerequestIId: Double,
    options: UpdateMergeRequestOptions with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def edit(
    projectId: Double,
    mergerequestIId: Double,
    options: UpdateMergeRequestOptions with BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def editApprovals(projectId: String): js.Promise[js.Object] = js.native
  def editApprovals(projectId: String, hasMergerequestIIdOptions: mergerequestIIdnumberBase): js.Promise[js.Object] = js.native
  def editApprovals(projectId: Double): js.Promise[js.Object] = js.native
  def editApprovals(projectId: Double, hasMergerequestIIdOptions: mergerequestIIdnumberBase): js.Promise[js.Object] = js.native
  def participants(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def participants(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def participants(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def participants(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def pipelines(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def pipelines(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def pipelines(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def pipelines(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def remove(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def remove(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def remove(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def remove(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def show(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def show(
    projectId: String,
    mergerequestIId: Double,
    options: ShowMergeRequestOptions with BaseRequestOptions
  ): js.Promise[GetResponse] = js.native
  def show(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def show(
    projectId: Double,
    mergerequestIId: Double,
    options: ShowMergeRequestOptions with BaseRequestOptions
  ): js.Promise[GetResponse] = js.native
  def timeStats(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def timeStats(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def timeStats(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def timeStats(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def unapprove(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def unapprove(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def unapprove(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def unapprove(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: String, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: Double, mergerequestIId: Double): js.Promise[js.Object] = js.native
  def unsubscribe(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def version(projectId: String, mergerequestIId: Double, versionId: Double): js.Promise[GetResponse] = js.native
  def version(projectId: String, mergerequestIId: Double, versionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def version(projectId: Double, mergerequestIId: Double, versionId: Double): js.Promise[GetResponse] = js.native
  def version(projectId: Double, mergerequestIId: Double, versionId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def versions(projectId: String, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def versions(projectId: String, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def versions(projectId: Double, mergerequestIId: Double): js.Promise[GetResponse] = js.native
  def versions(projectId: Double, mergerequestIId: Double, options: Sudo): js.Promise[GetResponse] = js.native
}

