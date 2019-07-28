package typings.atFeathersjsAuthentication

import typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.AuthHooksNs.Hooks
import typings.atFeathersjsAuthentication.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions
import typings.express.expressMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofself extends js.Object {
  val AuthHooksNs: js.Any = js.native
  val expressNs: Typeofexpress = js.native
  val hooks: Hooks = js.native
  val serviceNs: Typeofservice = js.native
  def default(): js.Function0[Unit] = js.native
  def default(config: FeathersAuthenticationOptions): js.Function0[Unit] = js.native
  def service(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[Application], Unit] = js.native
}

