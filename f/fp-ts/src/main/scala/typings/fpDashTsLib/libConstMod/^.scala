package typings
package fpDashTsLib.libConstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Const", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val URI: /* Const */ java.lang.String = js.native
  val `const_`: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libConstMod.URI] with fpDashTsLib.libContravariantMod.Contravariant2[fpDashTsLib.libConstMod.URI] = js.native
  def getApplicative[L](M: fpDashTsLib.libMonoidMod.Monoid[L]): fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getApply[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, L] = js.native
  def getSetoid[L, A](S: fpDashTsLib.libSetoidMod.Setoid[L]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libConstMod.Const[L, A]] = js.native
}

