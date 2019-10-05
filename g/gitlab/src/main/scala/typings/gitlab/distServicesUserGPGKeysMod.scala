package typings.gitlab

import typings.gitlab.distInfrastructureMod.BaseRequestOptions
import typings.gitlab.distInfrastructureMod.BaseService
import typings.gitlab.distInfrastructureMod.GetResponse
import typings.gitlab.distInfrastructureMod.PaginatedRequestOptions
import typings.gitlab.distServicesUserGPGKeysMod.UserGPGKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/services/UserGPGKeys", JSImport.Namespace)
@js.native
object distServicesUserGPGKeysMod extends js.Object {
  @js.native
  trait UserGPGKeys extends BaseService {
    def add(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
    def add(title: js.Any, key: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: Anon_UserId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def remove(keyId: js.Any): js.Promise[js.Object] = js.native
    def remove(keyId: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(keyId: js.Any): js.Promise[GetResponse] = js.native
    def show(keyId: js.Any, hasUserIdOptions: Anon_UserId with BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
  @js.native
  class default () extends UserGPGKeys
  
}

