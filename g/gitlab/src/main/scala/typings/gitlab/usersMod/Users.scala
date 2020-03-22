package typings.gitlab.usersMod

import typings.gitlab.eventsMod.EventOptions
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import typings.gitlab.requestHelperMod.Sudo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/Users", "Users")
@js.native
class Users () extends BaseService {
  def activities(): js.Promise[GetResponse] = js.native
  def activities(options: Sudo): js.Promise[GetResponse] = js.native
  def all(): js.Promise[GetResponse] = js.native
  def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
  def block(userId: Double): js.Promise[js.Object] = js.native
  def block(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def create(): js.Promise[js.Object] = js.native
  def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def current(): js.Promise[GetResponse] = js.native
  def current(options: Sudo): js.Promise[GetResponse] = js.native
  def edit(userId: Double): js.Promise[js.Object] = js.native
  def edit(userId: Double, options: BaseRequestOptions): js.Promise[js.Object] = js.native
  def events(userId: Double): js.Promise[GetResponse] = js.native
  def events(userId: Double, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
  def projects(userId: Double): js.Promise[GetResponse] = js.native
  def projects(userId: Double, options: Sudo): js.Promise[GetResponse] = js.native
  def remove(userId: Double): js.Promise[js.Object] = js.native
  def remove(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
  def search(emailOrUsername: String): js.Promise[GetResponse] = js.native
  def search(emailOrUsername: String, options: Sudo): js.Promise[GetResponse] = js.native
  def show(userId: Double): js.Promise[GetResponse] = js.native
  def show(userId: Double, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  def unblock(userId: Double): js.Promise[js.Object] = js.native
  def unblock(userId: Double, options: Sudo): js.Promise[js.Object] = js.native
}

