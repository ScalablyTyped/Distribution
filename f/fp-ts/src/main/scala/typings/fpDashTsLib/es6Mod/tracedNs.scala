package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "traced")
@js.native
object tracedNs extends js.Object {
  @js.native
  class Traced[P, A] protected ()
    extends fpDashTsLib.es6TracedMod.Traced[P, A] {
    def this(run: js.Function1[/* p */ P, A]) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Traced = js.native
  val traced: fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.es6TracedMod.URI] = js.native
  def censor[P, A](wa: fpDashTsLib.es6TracedMod.Traced[P, A], f: js.Function1[/* p */ P, P]): fpDashTsLib.es6TracedMod.Traced[P, A] = js.native
  def getComonad[P](monoid: fpDashTsLib.es6MonoidMod.Monoid[P]): fpDashTsLib.es6ComonadMod.Comonad2C[fpDashTsLib.es6TracedMod.URI, P] = js.native
  def listen[P, A](wa: fpDashTsLib.es6TracedMod.Traced[P, A]): fpDashTsLib.es6TracedMod.Traced[P, js.Tuple2[A, P]] = js.native
  def listens[P, A, B](wa: fpDashTsLib.es6TracedMod.Traced[P, A], f: js.Function1[/* p */ P, B]): fpDashTsLib.es6TracedMod.Traced[P, js.Tuple2[A, B]] = js.native
  def tracks[P, A](M: fpDashTsLib.es6MonoidMod.Monoid[P], f: js.Function1[/* a */ A, P]): js.Function1[/* wa */ fpDashTsLib.es6TracedMod.Traced[P, A], A] = js.native
}

