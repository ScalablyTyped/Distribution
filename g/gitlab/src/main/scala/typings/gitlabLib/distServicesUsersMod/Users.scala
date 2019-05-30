package typings
package gitlabLib.distServicesUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Users
  extends gitlabLib.distInfrastructureMod.BaseService {
  def activities(): js.Promise[gitlabLib.GetResponse] = js.native
  def activities(options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def all(): js.Promise[gitlabLib.GetResponse] = js.native
  def all(options: gitlabLib.PaginatedRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def block(userId: gitlabLib.UserId): js.Promise[js.Object] = js.native
  def block(userId: gitlabLib.UserId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def current(): js.Promise[gitlabLib.GetResponse] = js.native
  def current(options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def edit(userId: gitlabLib.UserId): js.Promise[js.Object] = js.native
  def edit(userId: gitlabLib.UserId, options: gitlabLib.BaseRequestOptions): js.Promise[js.Object] = js.native
  def events(userId: gitlabLib.UserId): js.Promise[gitlabLib.GetResponse] = js.native
  def events(userId: gitlabLib.UserId, options: gitlabLib.BaseRequestOptions with gitlabLib.EventOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def projects(userId: gitlabLib.UserId): js.Promise[gitlabLib.GetResponse] = js.native
  def projects(userId: gitlabLib.UserId, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def remove(userId: gitlabLib.UserId): js.Promise[js.Object] = js.native
  def remove(userId: gitlabLib.UserId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def search(emailOrUsername: java.lang.String): js.Promise[gitlabLib.GetResponse] = js.native
  def search(emailOrUsername: java.lang.String, options: gitlabLib.Sudo): js.Promise[gitlabLib.GetResponse] = js.native
  def session(email: java.lang.String, password: java.lang.String): js.Promise[js.Object] = js.native
  def session(email: java.lang.String, password: java.lang.String, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
  def show(userId: gitlabLib.UserId): js.Promise[gitlabLib.GetResponse] = js.native
  def show(userId: gitlabLib.UserId, options: gitlabLib.BaseRequestOptions): js.Promise[gitlabLib.GetResponse] = js.native
  def unblock(userId: gitlabLib.UserId): js.Promise[js.Object] = js.native
  def unblock(userId: gitlabLib.UserId, options: gitlabLib.Sudo): js.Promise[js.Object] = js.native
}

