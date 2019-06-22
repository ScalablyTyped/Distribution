package typings
package fpDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/es6", "const")
@js.native
object constNs extends js.Object {
  @js.native
  class Const[L, A] protected ()
    extends fpDashTsLib.es6ConstMod.Const[L, A] {
    /**
      * Use `make`
      *
      * @deprecated
      */
    def this(value: L) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Const = js.native
  val const_ : fpDashTsLib.es6FunctorMod.Functor2[fpDashTsLib.es6ConstMod.URI] with fpDashTsLib.es6ContravariantMod.Contravariant2[fpDashTsLib.es6ConstMod.URI] = js.native
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(map) */ def contramap[A, B](f: js.Function1[/* b */ B, A]): js.Function1[/* fa */ fpDashTsLib.es6ConstMod.Const[_, A], fpDashTsLib.es6ConstMod.Const[_, B]] = js.native
  def getApplicative[L](M: fpDashTsLib.es6MonoidMod.Monoid[L]): fpDashTsLib.es6ApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getApply[L](S: fpDashTsLib.es6SemigroupMod.Semigroup[L]): fpDashTsLib.es6ApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getEq[L, A](S: fpDashTsLib.es6EqMod.Eq[L]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6ConstMod.Const[L, A]] = js.native
  def getSetoid[L, A](S: fpDashTsLib.es6EqMod.Eq[L]): fpDashTsLib.es6EqMod.Eq[fpDashTsLib.es6ConstMod.Const[L, A]] = js.native
  def getShow[L, A](S: fpDashTsLib.es6ShowMod.Show[L]): fpDashTsLib.es6ShowMod.Show[fpDashTsLib.es6ConstMod.Const[L, A]] = js.native
  def make[L](l: L): fpDashTsLib.es6ConstMod.Const[L, scala.Nothing] = js.native
}

