package typings
package fpDashTsLib.es6ConstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6/Const", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Const = js.native
  val const_ : fpDashTsLib.es6FunctorMod.Functor2[URI] with fpDashTsLib.es6ContravariantMod.Contravariant2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(map) */ def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Const[_, A], Const[_, B]] = js.native
  def getApplicative[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getApply[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getEq[L, A](S: fpDashTsLib.es6EqMod.Eq[L]): fpDashTsLib.es6EqMod.Eq[Const[L, A]] = js.native
  def getSetoid[L, A](S: fpDashTsLib.es6EqMod.Eq[L]): fpDashTsLib.es6EqMod.Eq[Const[L, A]] = js.native
  def getShow[L, A](S: fpDashTsLib.es6ShowMod.Show[L]): fpDashTsLib.es6ShowMod.Show[Const[L, A]] = js.native
  def make[L, A](l: L): Const[L, A] = js.native
}

