package typings
package fpDashTsLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Field", JSImport.Namespace)
@js.native
object libFieldModMembers extends js.Object {
  val fieldNumber: Field[scala.Double] = js.native
  val gcd: js.Function2[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* field */ Field[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]
  ] = js.native
  val lcm: js.Function2[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* F */ Field[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]
  ] = js.native
}

