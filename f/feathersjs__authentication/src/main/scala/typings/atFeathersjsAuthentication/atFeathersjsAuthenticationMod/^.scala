package typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod

import typings.atFeathersjsAuthentication.Typeofself
import typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.AuthHooksNs.Hooks
import typings.express.expressMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[Unit]]) with Typeofself = js.native
  val hooks: Hooks = js.native
  def service(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application], Unit] = js.native
}

