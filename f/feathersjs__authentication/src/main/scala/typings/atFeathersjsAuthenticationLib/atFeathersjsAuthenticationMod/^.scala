package typings
package atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val default: (js.Function1[/* config */ js.UndefOr[FeathersAuthenticationOptions], js.Function0[scala.Unit]]) with atFeathersjsAuthenticationLib.Typeofself = js.native
  val hooks: atFeathersjsAuthenticationLib.atFeathersjsAuthenticationMod.AuthHooksNs.Hooks = js.native
  def service(options: FeathersAuthenticationOptions): js.Function1[/* app */ js.UndefOr[expressLib.expressMod.Application], scala.Unit] = js.native
}

