package typings
package atFeathersjsAuthenticationDashJwtLib.atFeathersjsAuthenticationDashJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-jwt", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(app: atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[_], options: js.Any) = this()
   // the class constructor
  def verify(
    req: expressLib.expressMod.Request,
    payload: js.Any,
    done: js.Function3[
      /* error */ js.Any, 
      /* user */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

