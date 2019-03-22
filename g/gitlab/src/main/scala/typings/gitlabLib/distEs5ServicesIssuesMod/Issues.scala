package typings
package gitlabLib.distEs5ServicesIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def addSpentTime(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    duration: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Duration */ js.Any
  ): js.Promise[_] = js.native
  def addTimeEstimate(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    duration: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Duration */ js.Any
  ): js.Promise[_] = js.native
  def all(
    hasProjectIdOptions: gitlabLib.Anon_ProjectId with gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def create(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def link(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueIId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    targetProjectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    targetIssueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId
  ): js.Promise[_] = js.native
  def link(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueIId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    targetProjectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    targetIssueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    options: js.Object
  ): js.Promise[_] = js.native
  def participants(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId
  ): js.Promise[_] = js.native
  def remove(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId
  ): js.Promise[_] = js.native
  def resetSpentTime(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: gitlabLib.distEs5ServicesMergeRequestsMod.MergeRequestId
  ): js.Promise[_] = js.native
  def resetTimeEstimate(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: gitlabLib.distEs5ServicesMergeRequestsMod.MergeRequestId
  ): js.Promise[_] = js.native
  def show(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId
  ): js.Promise[_] = js.native
  def subscribe(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId,
    options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def timeStats(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    mergerequestId: gitlabLib.distEs5ServicesMergeRequestsMod.MergeRequestId
  ): js.Promise[_] = js.native
  def unsubscribe(
    projectId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ProjectId */ js.Any,
    issueId: gitlabLib.distEs5ServicesEpicIssuesMod.IssueId
  ): js.Promise[_] = js.native
}

