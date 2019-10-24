package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesEpicsMod.Epics
import typings.gitlab.distSrcCoreServicesMod.EpicId
import typings.gitlab.distSrcCoreServicesMod.GroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Epics", JSImport.Namespace)
@js.native
object distSrcCoreServicesEpicsMod extends js.Object {
  @js.native
  trait Epics extends BaseService {
    def all(groupId: GroupId): js.Promise[GetResponse] = js.native
    def all(groupId: GroupId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(groupId: GroupId, title: String): js.Promise[js.Object] = js.native
    def create(groupId: GroupId, title: String, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def edit(groupId: GroupId, epicId: EpicId): js.Promise[js.Object] = js.native
    def edit(groupId: GroupId, epicId: EpicId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(groupId: GroupId, epicId: EpicId): js.Promise[js.Object] = js.native
    def remove(groupId: GroupId, epicId: EpicId, options: Sudo): js.Promise[js.Object] = js.native
    def show(groupId: GroupId, epicId: EpicId): js.Promise[GetResponse] = js.native
    def show(groupId: GroupId, epicId: EpicId, options: Sudo): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends Epics
  
}

