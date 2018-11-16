package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "field")
@js.native
object fieldNs extends js.Object {
  val fieldNumber: fpDashTsLib.libFieldMod.Field[scala.Double] = js.native
  val gcd: js.Function2[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* field */ fpDashTsLib.libFieldMod.Field[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]
  ] = js.native
  val lcm: js.Function2[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* F */ fpDashTsLib.libFieldMod.Field[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]
  ] = js.native
}

