package typings.gitlab

import typings.gitlab.distSrcCoreInfrastructureMod.BaseRequestOptions
import typings.gitlab.distSrcCoreInfrastructureMod.BaseService
import typings.gitlab.distSrcCoreInfrastructureMod.GetResponse
import typings.gitlab.distSrcCoreInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distSrcCoreServicesUserKeysMod.UserKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/src/core/services/UserKeys", JSImport.Namespace)
@js.native
object distSrcCoreServicesUserKeysMod extends js.Object {
  @js.native
  trait UserKeys extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: Anon_UserId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
    def create(title: js.Any, key: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(keyId: js.Any): js.Promise[js.Object] = js.native
    def remove(keyId: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(keyId: js.Any): js.Promise[GetResponse] = js.native
    def show(keyId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends UserKeys
  
}

