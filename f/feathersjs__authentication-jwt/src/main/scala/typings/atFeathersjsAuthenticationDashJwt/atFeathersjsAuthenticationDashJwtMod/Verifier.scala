package typings.atFeathersjsAuthenticationDashJwt.atFeathersjsAuthenticationDashJwtMod

import typings.atFeathersjsFeathers.atFeathersjsFeathersMod.Application
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-jwt", "Verifier")
@js.native
class Verifier protected () extends js.Object {
  def this(app: Application[js.Object], options: js.Any) = this()
   // the class constructor
  def verify(
    req: Request[ParamsDictionary],
    payload: js.Any,
    done: js.Function3[/* error */ js.Any, /* user */ js.UndefOr[js.Any], /* info */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
}

