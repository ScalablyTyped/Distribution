package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesGroupsMod.Groups
import typings.gitlab.distSrcCoreServicesMod.GroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Groups", JSImport.Namespace)
@js.native
object distSrcCoreServicesGroupsMod extends js.Object {
  @js.native
  trait Groups extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def createLDAPLink(groupId: GroupId, cn: js.Any, groupAccess: js.Any, provider: String): js.Promise[js.Object] = js.native
    def createLDAPLink(groupId: GroupId, cn: js.Any, groupAccess: js.Any, provider: String, options: Sudo): js.Promise[js.Object] = js.native
    def edit(groupId: GroupId): js.Promise[js.Object] = js.native
    def edit(groupId: GroupId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(groupId: GroupId): js.Promise[js.Object] = js.native
    def remove(groupId: GroupId, options: Sudo): js.Promise[js.Object] = js.native
    def removeLDAPLink(groupId: GroupId, cn: js.Any): js.Promise[js.Object] = js.native
    def removeLDAPLink(groupId: GroupId, cn: js.Any, hasProviderOptions: Sudo with Anon_Provider): js.Promise[js.Object] = js.native
    def search(nameOrPath: String): js.Promise[GetResponse] = js.native
    def search(nameOrPath: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(groupId: GroupId): js.Promise[GetResponse] = js.native
    def show(groupId: GroupId, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def subgroups(groupId: GroupId): js.Promise[GetResponse] = js.native
    def subgroups(groupId: GroupId, options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def syncLDAP(groupId: GroupId): js.Promise[js.Object] = js.native
    def syncLDAP(groupId: GroupId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Groups
  
}

