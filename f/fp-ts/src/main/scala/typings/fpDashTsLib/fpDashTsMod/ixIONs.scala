package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ixIO")
@js.native
object ixIONs extends js.Object {
  @js.native
  class IxIO[I, O, A] protected ()
    extends fpDashTsLib.libIxIOMod.IxIO[I, O, A] {
    def this(value: fpDashTsLib.libIOMod.IO[A]) = this()
  }
  
  val URI: /* IxIO */ java.lang.String = js.native
  val getMonad: js.Function0[
    fpDashTsLib.libMonadMod.Monad3C[fpDashTsLib.fpDashTsLibStrings.IxIO, js.Any, js.Any]
  ] = js.native
  val iof: js.Function1[/* a */ js.Any, fpDashTsLib.libIxIOMod.IxIO[js.Any, js.Any, js.Any]] = js.native
  val ixIO: fpDashTsLib.libIxMonadMod.IxMonad3[fpDashTsLib.libIxIOMod.URI] = js.native
}

