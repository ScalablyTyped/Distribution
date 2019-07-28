package typings.gitlab.distServicesEpicIssuesMod

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.EpicId
import typings.gitlab.distServicesMod.GroupId
import typings.gitlab.distServicesMod.IssueId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EpicIssues extends BaseService {
  def all(groupId: GroupId, epicId: EpicId): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def all(groupId: GroupId, epicId: EpicId, options: PaginatedRequestOptions): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_gitlab/dist/infrastructure.GetResponse */ _
  ] = js.native
  def assign(groupId: GroupId, epicId: EpicId, issueId: IssueId): js.Promise[js.Object] = js.native
  def assign(groupId: GroupId, epicId: EpicId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
  def edit(groupId: GroupId, epicId: EpicId, issueId: IssueId): js.Promise[js.Object] = js.native
  def edit(groupId: GroupId, epicId: EpicId, issueId: IssueId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(groupId: GroupId, epicId: EpicId, issueId: IssueId): js.Promise[js.Object] = js.native
  def remove(groupId: GroupId, epicId: EpicId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
}

