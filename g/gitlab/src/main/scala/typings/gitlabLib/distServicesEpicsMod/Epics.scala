package typings
package gitlabLib.distServicesEpicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Epics
  extends gitlabLib.distInfrastructureMod.BaseService {
  def all(groupId: gitlabLib.GroupId): js.Promise[gitlabLib.GetResponse] = js.native
  def all(groupId: gitlabLib.GroupId, options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def create(groupId: gitlabLib.GroupId, title: java.lang.String): js.Promise[js.Object] = js.native
  def create(groupId: gitlabLib.GroupId, title: java.lang.String, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId): js.Promise[js.Object] = js.native
  def edit(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId): js.Promise[js.Object] = js.native
  def remove(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(groupId: gitlabLib.GroupId, epicId: gitlabLib.EpicId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
}

