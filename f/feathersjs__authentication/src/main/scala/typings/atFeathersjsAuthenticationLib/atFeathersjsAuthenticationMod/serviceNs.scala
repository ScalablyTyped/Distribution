package typings
package atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", "service")
@js.native
object serviceNs extends js.Object {
  @js.native
  class Service[T] protected () extends js.Object {
    def this(app: expressLib.expressMod.eNs.Application) = this()
    def create(data: stdLib.Partial[T], params: atFeathersjsFeathersLib.atFeathersjsFeathersMod.feathersNs.Params): js.Promise[atFeathersjsAuthenticationLib.Anon_AccessToken] = js.native
    def remove(id: java.lang.String, params: atFeathersjsFeathersLib.atFeathersjsFeathersMod.feathersNs.Params): js.Promise[atFeathersjsAuthenticationLib.Anon_AccessToken] = js.native
    def remove(id: scala.Null, params: atFeathersjsFeathersLib.atFeathersjsFeathersMod.feathersNs.Params): js.Promise[atFeathersjsAuthenticationLib.Anon_AccessToken] = js.native
  }
  
}

