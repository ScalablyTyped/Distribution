package typings
package fpDashTsLib.libSetoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Setoid", JSImport.Namespace)
@js.native
object libSetoidModMembers extends js.Object {
  val contramap: js.Function2[
    /* f */ js.Function1[/* b */ js.Any, js.Any], 
    /* fa */ Setoid[js.Any], 
    Setoid[js.Any]
  ] = js.native
  val getArraySetoid: js.Function1[/* S */ Setoid[js.Any], Setoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]]] = js.native
  val getProductSetoid: js.Function2[/* SA */ Setoid[js.Any], /* SB */ Setoid[js.Any], Setoid[js.Tuple2[js.Any, js.Any]]] = js.native
  val getRecordSetoid: js.Function1[
    /* setoids */ fpDashTsLib.fpDashTsLibStrings.getRecordSetoid with js.Any, 
    Setoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val setoidBoolean: Setoid[scala.Boolean] = js.native
  val setoidDate: Setoid[stdLib.Date] = js.native
  val setoidNumber: Setoid[scala.Double] = js.native
  val setoidString: Setoid[java.lang.String] = js.native
  val strictEqual: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean] = js.native
}

