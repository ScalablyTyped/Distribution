package typings.gitlab

import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import typings.gitlab.requestHelperMod.PaginatedRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/UserKeys", JSImport.Namespace)
@js.native
object userKeysMod extends js.Object {
  @js.native
  class UserKeys () extends BaseService {
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: AnonUserId with PaginatedRequestOptions): js.Promise[GetResponse] = js.native
    def create(title: js.Any, key: js.Any): js.Promise[js.Object] = js.native
    def create(title: js.Any, key: js.Any, hasUserIdOptions: AnonUserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def remove(keyId: js.Any): js.Promise[js.Object] = js.native
    def remove(keyId: js.Any, hasUserIdOptions: AnonUserId with BaseRequestOptions): js.Promise[js.Object] = js.native
    def show(keyId: js.Any): js.Promise[GetResponse] = js.native
    def show(keyId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

