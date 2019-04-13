package typings
package atFeathersjsAuthenticationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AppAuthHooks extends js.Object {
  val AuthHooksNs: js.Any = js.native
  val expressNs: Anon_Authenticate = js.native
  val hooks: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.AuthHooksNs.Hooks = js.native
  val serviceNs: Anon_App = js.native
  def default(): js.Function0[scala.Unit] = js.native
  def default(config: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions): js.Function0[scala.Unit] = js.native
  def service(options: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[expressLib.expressMod.Application], scala.Unit] = js.native
}

