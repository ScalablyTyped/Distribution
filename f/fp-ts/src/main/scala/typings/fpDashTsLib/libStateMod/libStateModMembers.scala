package typings
package fpDashTsLib.libStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/State", JSImport.Namespace)
@js.native
object libStateModMembers extends js.Object {
  val URI: /* State */ java.lang.String = js.native
  val get: js.Function0[State[js.Any, js.Any]] = js.native
  val gets: js.Function1[/* f */ js.Function1[/* s */ js.Any, js.Any], State[js.Any, js.Any]] = js.native
  val modify: js.Function1[
    /* f */ js.Function1[/* s */ js.Any, js.Any], 
    State[js.Any, js.UndefOr[scala.Nothing]]
  ] = js.native
  val put: js.Function1[/* s */ js.Any, State[js.Any, scala.Unit]] = js.native
  val state: fpDashTsLib.libMonadMod.Monad2[URI] = js.native
}

