package typings
package gitlabLib.distServicesIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues
  extends gitlabLib.distInfrastructureMod.BaseService {
  def addSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    duration: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    duration: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    duration: java.lang.String
  ): js.Promise[js.Object] = js.native
  def addTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    duration: java.lang.String,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def all(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    hasProjectIdGroupIdOptions: (gitlabLib.Anon_ProjectId | gitlabLib.Anon_GroupId | js.Object) with gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def create(projectId: gitlabLib.distServicesMod.ProjectId): js.Promise[js.Object] = js.native
  def create(
    projectId: gitlabLib.distServicesMod.ProjectId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def edit(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[js.Object] = js.native
  def edit(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def link(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueIId: gitlabLib.distServicesMod.IssueId,
    targetProjectId: gitlabLib.distServicesMod.ProjectId,
    targetIssueId: gitlabLib.distServicesMod.IssueId
  ): js.Promise[js.Object] = js.native
  def link(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueIId: gitlabLib.distServicesMod.IssueId,
    targetProjectId: gitlabLib.distServicesMod.ProjectId,
    targetIssueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def participants(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def participants(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def remove(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[js.Object] = js.native
  def remove(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def resetSpentTime(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[js.Object] = js.native
  def resetSpentTime(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def resetTimeEstimate(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[js.Object] = js.native
  def resetTimeEstimate(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def show(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def show(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def subscribe(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[js.Object] = js.native
  def subscribe(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def timeStats(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def timeStats(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def unsubscribe(projectId: gitlabLib.distServicesMod.ProjectId, issueId: gitlabLib.distServicesMod.IssueId): js.Promise[js.Object] = js.native
  def unsubscribe(
    projectId: gitlabLib.distServicesMod.ProjectId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
}

