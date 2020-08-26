package typings.gitlab

import typings.gitlab.anon.userIdnumberundefinedBase
import typings.gitlab.anon.userIdnumberundefinedPagi
import typings.gitlab.infrastructureMod.BaseService
import typings.gitlab.requestHelperMod.BaseRequestOptions
import typings.gitlab.requestHelperMod.GetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/services/UserEmails", JSImport.Namespace)
@js.native
object userEmailsMod extends js.Object {
  @js.native
  class UserEmails () extends BaseService {
    def add(email: js.Any): js.Promise[js.Object] = js.native
    def add(email: js.Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    def all(): js.Promise[GetResponse] = js.native
    def all(hasUserIdOptions: userIdnumberundefinedPagi): js.Promise[GetResponse] = js.native
    def remove(emailId: js.Any): js.Promise[js.Object] = js.native
    def remove(emailId: js.Any, hasUserIdOptions: userIdnumberundefinedBase): js.Promise[js.Object] = js.native
    def show(emailId: js.Any): js.Promise[GetResponse] = js.native
    def show(emailId: js.Any, options: BaseRequestOptions): js.Promise[GetResponse] = js.native
  }
  
}

