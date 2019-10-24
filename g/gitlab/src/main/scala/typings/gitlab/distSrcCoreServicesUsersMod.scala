package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.Sudo
import typings.gitlab.distSrcCoreServicesMod.EventOptions
import typings.gitlab.distSrcCoreServicesMod.UserId
import typings.gitlab.distSrcCoreServicesUsersMod.Users
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/Users", JSImport.Namespace)
@js.native
object distSrcCoreServicesUsersMod extends js.Object {
  @js.native
  trait Users extends BaseService {
    def activities(): js.Promise[GetResponse] = js.native
    def activities(options: Sudo): js.Promise[GetResponse] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(options: PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def block(userId: UserId): js.Promise[js.Object] = js.native
    def block(userId: UserId, options: Sudo): js.Promise[js.Object] = js.native
    def create(): js.Promise[js.Object] = js.native
    def create(options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def current(): js.Promise[GetResponse] = js.native
    def current(options: Sudo): js.Promise[GetResponse] = js.native
    def edit(userId: UserId): js.Promise[js.Object] = js.native
    def edit(userId: UserId, options: BaseRequestOptions): js.Promise[js.Object] = js.native
    def events(userId: UserId): js.Promise[GetResponse] = js.native
    def events(userId: UserId, options: BaseRequestOptions with EventOptions): js.Promise[GetResponse] = js.native
    def projects(userId: UserId): js.Promise[GetResponse] = js.native
    def projects(userId: UserId, options: Sudo): js.Promise[GetResponse] = js.native
    def remove(userId: UserId): js.Promise[js.Object] = js.native
    def remove(userId: UserId, options: Sudo): js.Promise[js.Object] = js.native
    def search(emailOrUsername: String): js.Promise[GetResponse] = js.native
    def search(emailOrUsername: String, options: Sudo): js.Promise[GetResponse] = js.native
    def show(userId: UserId): js.Promise[GetResponse] = js.native
    def show(userId: UserId, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
    def unblock(userId: UserId): js.Promise[js.Object] = js.native
    def unblock(userId: UserId, options: Sudo): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class default () extends Users
  
}

