package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "setoid")
@js.native
object setoidNs extends js.Object {
  val contramap: js.Function2[
    /* f */ js.Function1[/* b */ js.Any, js.Any], 
    /* fa */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[js.Any]
  ] = js.native
  val getArraySetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val getProductSetoid: js.Function2[
    /* SA */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SB */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getRecordSetoid: js.Function1[
    /* setoids */ fpDashTsLib.fpDashTsLibStrings.getRecordSetoid with js.Any, 
    fpDashTsLib.libSetoidMod.Setoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val setoidBoolean: fpDashTsLib.libSetoidMod.Setoid[scala.Boolean] = js.native
  val setoidDate: fpDashTsLib.libSetoidMod.Setoid[stdLib.Date] = js.native
  val setoidNumber: fpDashTsLib.libSetoidMod.Setoid[scala.Double] = js.native
  val setoidString: fpDashTsLib.libSetoidMod.Setoid[java.lang.String] = js.native
  val strictEqual: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean] = js.native
}

