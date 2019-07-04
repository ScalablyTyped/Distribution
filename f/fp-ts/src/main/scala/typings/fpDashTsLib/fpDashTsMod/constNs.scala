package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "const")
@js.native
object constNs extends js.Object {
  @js.native
  class Const[L, A] protected ()
    extends fpDashTsLib.libConstMod.Const[L, A] {
    /**
      * Use `make`
      *
      * @deprecated
      */
    def this(value: L) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Const = js.native
  val const_ : fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libConstMod.URI] with fpDashTsLib.libContravariantMod.Contravariant2[fpDashTsLib.libConstMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(map) */ def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ fpDashTsLib.libConstMod.Const[_, A], fpDashTsLib.libConstMod.Const[_, B]] = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getEq[L, A](S: fpDashTsLib.libEqMod.Eq[L]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libConstMod.Const[L, A]] = js.native
  def getSetoid[L, A](S: fpDashTsLib.libEqMod.Eq[L]): fpDashTsLib.libEqMod.Eq[fpDashTsLib.libConstMod.Const[L, A]] = js.native
  def getShow[L, A](S: fpDashTsLib.libShowMod.Show[L]): fpDashTsLib.libShowMod.Show[fpDashTsLib.libConstMod.Const[L, A]] = js.native
  def make[L, A](l: L): fpDashTsLib.libConstMod.Const[L, A] = js.native
}

