package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "state")
@js.native
object stateNs extends js.Object {
  @js.native
  class State[S, A] protected ()
    extends fpDashTsLib.libStateMod.State[S, A] {
    def this(run: js.Function1[/* s */ S, js.Tuple2[A, S]]) = this()
  }
  
  val URI: /* State */ java.lang.String = js.native
  val get: js.Function0[fpDashTsLib.libStateMod.State[js.Any, js.Any]] = js.native
  val gets: js.Function1[
    /* f */ js.Function1[/* s */ js.Any, js.Any], 
    fpDashTsLib.libStateMod.State[js.Any, js.Any]
  ] = js.native
  val modify: js.Function1[
    /* f */ js.Function1[/* s */ js.Any, js.Any], 
    fpDashTsLib.libStateMod.State[js.Any, js.UndefOr[scala.Nothing]]
  ] = js.native
  val put: js.Function1[/* s */ js.Any, fpDashTsLib.libStateMod.State[js.Any, scala.Unit]] = js.native
  val state: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libStateMod.URI] = js.native
}

