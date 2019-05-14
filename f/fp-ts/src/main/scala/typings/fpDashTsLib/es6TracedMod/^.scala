package typings
package fpDashTsLib.es6TracedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Traced", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Traced = js.native
  val traced: fpDashTsLib.es6FunctorMod.Functor2[URI] = js.native
  def censor[P, A](wa: Traced[P, A], f: js.Function1[/* p */ P, P]): Traced[P, A] = js.native
  def getComonad[P](monoid: fpDashTsLib.es6MonoidMod.Monoid[P]): fpDashTsLib.es6ComonadMod.Comonad2C[URI, P] = js.native
  def listen[P, A](wa: Traced[P, A]): Traced[P, js.Tuple2[A, P]] = js.native
  def listens[P, A, B](wa: Traced[P, A], f: js.Function1[/* p */ P, B]): Traced[P, js.Tuple2[A, B]] = js.native
  def tracks[P, A](M: fpDashTsLib.es6MonoidMod.Monoid[P], f: js.Function1[/* a */ A, P]): js.Function1[/* wa */ Traced[P, A], A] = js.native
}

