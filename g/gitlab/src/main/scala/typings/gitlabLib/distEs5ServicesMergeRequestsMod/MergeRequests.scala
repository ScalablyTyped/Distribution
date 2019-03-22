package typings
package gitlabLib.distEs5ServicesMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeRequests
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def accept(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    options: AcceptMergeRequestOptions with gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def addSpentTime(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    duration: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Duration */ js.Any
  ): js.Promise[_] = js.native
  def addTimeEstimate(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    duration: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Duration */ js.Any
  ): js.Promise[_] = js.native
  def all(): js.Promise[_] = js.native
  def all(hasProjectIdOptions: gitlabLib.Anon_ProjectIdAny): js.Promise[_] = js.native
  def approvals(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def approvals(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    hasMergerequestId: gitlabLib.Anon_MergerequestId
  ): js.Promise[_] = js.native
  def approve(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    hasSha: gitlabLib.Anon_Sha
  ): js.Promise[_] = js.native
  def cancelOnPipelineSucess(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def changes(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def closesIssues(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def commits(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    title: java.lang.String,
    options: CreateMergeRequestOptions with gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    options: UpdateMergeRequestOptions with gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def editApprovals(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    hasMergerequestIdOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ): js.Promise[_] = js.native
  def editApprovers(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    hasMergerequestIdOptions: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify temporaryAny */ js.Any
  ): js.Promise[_] = js.native
  def participants(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def pipelines(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any
  ): js.Promise[_] = js.native
  def pipelines(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    hasMergerequestId: gitlabLib.Anon_MergerequestIdString
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def resetSpentTime(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def resetTimeEstimate(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    options: ShowMergeRequestOptions with gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def timeStats(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def unapprove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def unsubscribe(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
  def version(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    versionId: java.lang.String
  ): js.Promise[_] = js.native
  def version(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId,
    versionId: scala.Double
  ): js.Promise[_] = js.native
  def versions(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: MergeRequestId
  ): js.Promise[_] = js.native
}

