package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "io")
@js.native
object ioNs extends js.Object {
  @js.native
  class IO[A] protected ()
    extends fpDashTsLib.libIOMod.IO[A] {
    def this(run: fpDashTsLib.libFunctionMod.Lazy[A]) = this()
  }
  
  val URI: /* IO */ java.lang.String = js.native
  val getMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libIOMod.IO[js.Any]]
  ] = js.native
  val getSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libIOMod.IO[js.Any]]
  ] = js.native
  val io: fpDashTsLib.libMonadMod.Monad1[fpDashTsLib.libIOMod.URI] = js.native
}

