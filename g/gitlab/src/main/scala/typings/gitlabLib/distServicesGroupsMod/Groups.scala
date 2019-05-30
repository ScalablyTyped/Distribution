package typings
package gitlabLib.distServicesGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def createLDAPLink(groupId: gitlabLib.GroupId, cn: js.Any, groupAccess: js.Any, provider: java.lang.String): js.Promise[js.Object] = js.native
  def createLDAPLink(
    groupId: gitlabLib.GroupId,
    cn: js.Any,
    groupAccess: js.Any,
    provider: java.lang.String,
    options: gitlabLib.Sudo
  ): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.GroupId): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.GroupId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.GroupId): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.GroupId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def removeLDAPLink(groupId: gitlabLib.GroupId, cn: js.Any): js.Promise[js.Object] = js.native
  def removeLDAPLink(
    groupId: gitlabLib.GroupId,
    cn: js.Any,
    hasProviderOptions: gitlabLib.Sudo with gitlabLib.Anon_Provider
  ): js.Promise[js.Object] = js.native
  def search(nameOrPath: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def search(nameOrPath: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def show(groupId: gitlabLib.GroupId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(groupId: gitlabLib.GroupId, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def subgroups(groupId: gitlabLib.GroupId): js.Promise[gitlabLib.GetResponse] = js.native
  def subgroups(groupId: gitlabLib.GroupId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def syncLDAP(groupId: gitlabLib.GroupId): js.Promise[js.Object] = js.native
  def syncLDAP(groupId: gitlabLib.GroupId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

