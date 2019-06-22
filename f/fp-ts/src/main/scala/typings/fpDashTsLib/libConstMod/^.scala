package typings
package fpDashTsLib.libConstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Const", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: fpDashTsLib.fpDashTsLibStrings.Const = js.native
  val const_ : fpDashTsLib.libFunctorMod.Functor2[URI] with fpDashTsLib.libContravariantMod.Contravariant2[URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(map) */ def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ Const[_, A], Const[_, B]] = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getEq[L, A](S: fpDashTsLib.libEqMod.Eq[L]): fpDashTsLib.libEqMod.Eq[Const[L, A]] = js.native
  def getSetoid[L, A](S: fpDashTsLib.libEqMod.Eq[L]): fpDashTsLib.libEqMod.Eq[Const[L, A]] = js.native
  def getShow[L, A](S: fpDashTsLib.libShowMod.Show[L]): fpDashTsLib.libShowMod.Show[Const[L, A]] = js.native
  def make[L](l: L): Const[L, scala.Nothing] = js.native
}

