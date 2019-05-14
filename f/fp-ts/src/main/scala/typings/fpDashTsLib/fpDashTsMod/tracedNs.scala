package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "traced")
@js.native
object tracedNs extends js.Object {
  @js.native
  class Traced[P, A] protected ()
    extends fpDashTsLib.libTracedMod.Traced[P, A] {
    def this(run: js.Function1[/* p */ P, A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Traced = js.native
  val traced: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libTracedMod.URI] = js.native
  def censor[P, A](wa: fpDashTsLib.libTracedMod.Traced[P, A], f: js.Function1[/* p */ P, P]): fpDashTsLib.libTracedMod.Traced[P, A] = js.native
  def getComonad[P](monoid: fpDashTsLib.libMonoidMod.Monoid[P]): fpDashTsLib.libComonadMod.Comonad2C[fpDashTsLib.libTracedMod.URI, P] = js.native
  def listen[P, A](wa: fpDashTsLib.libTracedMod.Traced[P, A]): fpDashTsLib.libTracedMod.Traced[P, js.Tuple2[A, P]] = js.native
  def listens[P, A, B](wa: fpDashTsLib.libTracedMod.Traced[P, A], f: js.Function1[/* p */ P, B]): fpDashTsLib.libTracedMod.Traced[P, js.Tuple2[A, B]] = js.native
  def tracks[P, A](M: fpDashTsLib.libMonoidMod.Monoid[P], f: js.Function1[/* a */ A, P]): js.Function1[/* wa */ fpDashTsLib.libTracedMod.Traced[P, A], A] = js.native
}

