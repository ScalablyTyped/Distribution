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
  val state: fpDashTsLib.libMonadMod.Monad2[fpDashTsLib.libStateMod.URI] = js.native
  def get[S](): fpDashTsLib.libStateMod.State[S, S] = js.native
  def gets[S, A](f: js.Function1[/* s */ S, A]): fpDashTsLib.libStateMod.State[S, A] = js.native
  def modify[S](f: js.Function1[/* s */ S, S]): fpDashTsLib.libStateMod.State[S, js.UndefOr[scala.Nothing]] = js.native
  def put[S](s: S): fpDashTsLib.libStateMod.State[S, scala.Unit] = js.native
}

