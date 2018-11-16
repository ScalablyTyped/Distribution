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
  
  val URI: /* Const */ java.lang.String = js.native
  val `const_`: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libConstMod.URI] with fpDashTsLib.libContravariantMod.Contravariant2[fpDashTsLib.libConstMod.URI] = js.native
  val getApplicative: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libApplicativeMod.Applicative2C[fpDashTsLib.fpDashTsLibStrings.Const, js.Any]
  ] = js.native
  val getApply: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libApplyMod.Apply2C[fpDashTsLib.fpDashTsLibStrings.Const, js.Any]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libConstMod.Const[js.Any, js.Any]]
  ] = js.native
}

