package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ioRef")
@js.native
object ioRefNs extends js.Object {
  @js.native
  class IORef[A] protected ()
    extends fpDashTsLib.libIORefMod.IORef[A] {
    def this(value: A) = this()
  }
  
  val newIORef: js.Function1[/* a */ js.Any, fpDashTsLib.libIOMod.IO[fpDashTsLib.libIORefMod.IORef[js.Any]]] = js.native
}

