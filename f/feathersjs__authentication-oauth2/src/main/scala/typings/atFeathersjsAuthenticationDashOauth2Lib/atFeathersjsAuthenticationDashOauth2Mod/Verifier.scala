package typings
package atFeathersjsAuthenticationDashOauth2Lib.atFeathersjsAuthenticationDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-oauth2", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(app: atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[_], options: js.Any) = this()
   // updates an existing entity
  def _createEntity(data: atFeathersjsAuthenticationDashOauth2Lib.Anon_AccessToken): js.Promise[_] = js.native
  def _normalizeResult[T](results: atFeathersjsFeathersLib.atFeathersjsFeathersMod.Paginated[T]): js.Promise[T] = js.native
   // creates an entity if they didn't exist already
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _updateEntity(entity: js.Any, data: atFeathersjsAuthenticationDashOauth2Lib.Anon_AccessToken): js.Promise[_] = js.native
    // normalizes result from service to account for pagination
  def verify(
    req: expressLib.expressMod.eNs.Request,
    accessToken: java.lang.String,
    refreshToken: java.lang.String,
    profile: js.Any,
    done: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* user */ js.Object, 
      /* info */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

