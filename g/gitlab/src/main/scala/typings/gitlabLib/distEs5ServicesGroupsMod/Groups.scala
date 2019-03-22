package typings
package gitlabLib.distEs5ServicesGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups
  extends gitlabLib.distEs5InfrastructureMod.BaseService {
  def all(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def createLDAPLink(groupId: GroupId, options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(groupId: GroupId, options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def remove(groupId: GroupId): js.Promise[_] = js.native
  def search(nameOrPath: java.lang.String): js.Promise[_] = js.native
  def show(groupId: GroupId): js.Promise[_] = js.native
  def subgroups(groupId: GroupId, options: gitlabLib.distEs5InfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
}

