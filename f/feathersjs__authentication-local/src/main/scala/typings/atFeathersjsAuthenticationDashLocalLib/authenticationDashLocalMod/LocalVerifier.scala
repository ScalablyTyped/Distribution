package typings
package atFeathersjsAuthenticationDashLocalLib.authenticationDashLocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-local", "LocalVerifier")
@js.native
class LocalVerifier protected () extends js.Object {
  def this(app: atFeathersjsFeathersLib.feathersMod.Application[_], options: js.Any) = this()
  def _comparePassword[T](entity: T, password: java.lang.String): stdLib.Promise[T] = js.native
   // compares password using bcrypt
  def _normalizeResult[T](results: atFeathersjsFeathersLib.feathersMod.Paginated[T]): stdLib.Promise[T] = js.native
   // compares password using bcrypt
  def _normalizeResult[T](results: js.Array[T]): stdLib.Promise[T] = js.native
   // normalizes result from service to account for pagination
  def verify(
    req: expressLib.expressMod.eNs.Request,
    username: java.lang.String,
    password: java.lang.String,
    done: js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[atFeathersjsAuthenticationDashLocalLib.Anon_Message], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

