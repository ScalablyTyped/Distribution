package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ring")
@js.native
object ringNs extends js.Object {
  val getFunctionRing: js.Function1[
    /* ring */ fpDashTsLib.libRingMod.Ring[js.Any], 
    fpDashTsLib.libRingMod.Ring[js.Function1[/* a */ js.Any, js.Any]]
  ] = js.native
  val getProductRing: js.Function2[
    /* RA */ fpDashTsLib.libRingMod.Ring[js.Any], 
    /* RB */ fpDashTsLib.libRingMod.Ring[js.Any], 
    fpDashTsLib.libRingMod.Ring[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val negate: js.Function1[
    /* ring */ fpDashTsLib.libRingMod.Ring[js.Any], 
    js.Function1[/* a */ js.Any, js.Any]
  ] = js.native
}

