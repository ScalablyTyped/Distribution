package typings
package fpDashTsLib.libRingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Ring", JSImport.Namespace)
@js.native
object libRingModMembers extends js.Object {
  val getFunctionRing: js.Function1[/* ring */ Ring[js.Any], Ring[js.Function1[/* a */ js.Any, js.Any]]] = js.native
  val getProductRing: js.Function2[/* RA */ Ring[js.Any], /* RB */ Ring[js.Any], Ring[js.Tuple2[js.Any, js.Any]]] = js.native
  val negate: js.Function1[/* ring */ Ring[js.Any], js.Function1[/* a */ js.Any, js.Any]] = js.native
}

