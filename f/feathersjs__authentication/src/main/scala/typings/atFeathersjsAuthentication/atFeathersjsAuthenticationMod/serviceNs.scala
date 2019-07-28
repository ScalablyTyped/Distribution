package typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod

import typings.atFeathersjsAuthentication.Anon_AccessToken
import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Params
import typings.express.expressMod.Application
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "service")
@js.native
object serviceNs extends js.Object {
  @js.native
  class Service[T] protected () extends js.Object {
    def this(app: Application) = this()
    def create(data: Partial[T], params: Params): js.Promise[Anon_AccessToken] = js.native
    def remove(id: String, params: Params): js.Promise[Anon_AccessToken] = js.native
    def remove(id: Null, params: Params): js.Promise[Anon_AccessToken] = js.native
  }
  
}

