package typings
package gitlabLib.distServicesEpicIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicIssues
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(groupId: gitlabLib.distServicesMod.GroupId, epicId: gitlabLib.distServicesMod.EpicId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    options: gitlabLib.distInfrastructureMod.PaginatedRequestOptions
  ): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def assign(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    issueId: gitlabLib.distServicesMod.IssueId
  ): js.Promise[js.Object] = js.native
  def assign(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    issueId: gitlabLib.distServicesMod.IssueId
  ): js.Promise[js.Object] = js.native
  def edit(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    issueId: gitlabLib.distServicesMod.IssueId
  ): js.Promise[js.Object] = js.native
  def remove(
    groupId: gitlabLib.distServicesMod.GroupId,
    epicId: gitlabLib.distServicesMod.EpicId,
    issueId: gitlabLib.distServicesMod.IssueId,
    options: gitlabLib.distInfrastructureMod.Sudo
  ): js.Promise[js.Object] = js.native
}

