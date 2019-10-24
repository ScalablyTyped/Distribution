package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesEpicIssuesMod.EpicIssues
import typings.gitlab.distSrcCoreServicesMod.EpicId
import typings.gitlab.distSrcCoreServicesMod.GroupId
import typings.gitlab.distSrcCoreServicesMod.IssueId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/EpicIssues", JSImport.Namespace)
@js.native
object distSrcCoreServicesEpicIssuesMod extends js.Object {
  @js.native
  trait EpicIssues extends BaseService {
    def all(groupId: GroupId, epicId: EpicId): js.Promise[GetResponse] = js.native
    def all(groupId: GroupId, epicId: EpicId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def assign(groupId: GroupId, epicId: EpicId, issueId: IssueId): js.Promise[js.Object] = js.native
    def assign(groupId: GroupId, epicId: EpicId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
    def edit(groupId: GroupId, epicId: EpicId, issueId: IssueId): js.Promise[js.Object] = js.native
    def edit(groupId: GroupId, epicId: EpicId, issueId: IssueId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(groupId: GroupId, epicId: EpicId, issueId: IssueId): js.Promise[js.Object] = js.native
    def remove(groupId: GroupId, epicId: EpicId, issueId: IssueId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends EpicIssues
  
}

