package typings
package gitlabLib.distServicesEpicIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicIssues
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def assign(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def assign(
    groupId: gitlabLib.GroupId,
    epicId: gitlabLib.EpicId,
    issueId: gitlabLib.IssueId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def edit(
    groupId: gitlabLib.GroupId,
    epicId: gitlabLib.EpicId,
    issueId: gitlabLib.IssueId,
    options: gitlabLib.BaseRequestOptions
  ): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, issueId: gitlabLib.IssueId): js.Promise[js.Object] = js.native
  def remove(
    groupId: gitlabLib.GroupId,
    epicId: gitlabLib.EpicId,
    issueId: gitlabLib.IssueId,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
}

