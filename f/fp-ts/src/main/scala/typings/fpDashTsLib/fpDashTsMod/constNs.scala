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
    def this(value: L) = this()
  }
  
  val URI: fpDashTsLib.fpDashTsLibStrings.Const = js.native
  val const_ : fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libConstMod.URI] with fpDashTsLib.libContravariantMod.Contravariant2[fpDashTsLib.libConstMod.URI] = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getSetoid[L, A](S: fpDashTsLib.libSetoidMod.Setoid[L]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libConstMod.Const[L, A]] = js.native
}

