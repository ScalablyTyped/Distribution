package typings.feathersjsAuthentication.mod

import typings.express.mod.Application_
import typings.feathersjsAuthentication.anon.AccessToken
import typings.feathersjsFeathers.mod.Params
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "service")
@js.native
object service extends js.Object {
  @js.native
  class Service[T] protected () extends js.Object {
    def this(app: Application_) = this()
    def create(data: Partial[T], params: Params): js.Promise[AccessToken] = js.native
    def remove(id: String, params: Params): js.Promise[AccessToken] = js.native
    def remove(id: Null, params: Params): js.Promise[AccessToken] = js.native
  }
  
  def apply(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application_], Unit] = js.native
}

