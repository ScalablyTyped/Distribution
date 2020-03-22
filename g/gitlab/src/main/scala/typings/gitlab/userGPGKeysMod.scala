package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/UserGPGKeys", JSImport.Namespace)
@js.native
object userGPGKeysMod extends js.Object {
  @js.native
  class UserGPGKeys () extends BaseService {
    def add(key: String): js.Promise[js.Object] = js.native
    def add(key: String, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberPaginatedRequ): js.Promise[GetResponse] = js.native
    def remove(keyId: Double): js.Promise[js.Object] = js.native
    def remove(keyId: Double, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[js.Object] = js.native
    def show(keyId: Double): js.Promise[GetResponse] = js.native
    def show(keyId: Double, hasUserIdOptions: userIdnumberBaseRequestOp): js.Promise[GetResponse] = js.native
  }
  
}

