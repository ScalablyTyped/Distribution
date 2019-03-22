package typings
package gitlabLib.distLatestServicesGroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Groups
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  def all(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def create(options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def createLDAPLink(groupId: GroupId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def edit(groupId: GroupId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
  def remove(groupId: GroupId): js.Promise[_] = js.native
  def search(nameOrPath: java.lang.String): js.Promise[_] = js.native
  def show(groupId: GroupId): js.Promise[_] = js.native
  def subgroups(groupId: GroupId, options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions): js.Promise[_] = js.native
}

