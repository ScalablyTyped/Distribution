package typings.gitlab.distServicesGroupsMod

import typings.gitlab.Anon_Provider
import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distInfrastructureMod.Sudo
import typings.gitlab.distServicesMod.GroupId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

