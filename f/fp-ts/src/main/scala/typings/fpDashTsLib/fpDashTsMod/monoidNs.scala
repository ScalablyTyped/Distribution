package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "monoid")
@js.native
object monoidNs extends js.Object {
  val fold: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], js.Any]
  ] = js.native
  val getArrayMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]]] = js.native
  val getDictionaryMonoid: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val getDualMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[js.Any]
  ] = js.native
  val getEndomorphismMonoid: js.Function0[fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libFunctionMod.Endomorphism[js.Any]]] = js.native
  val getFunctionMonoid: js.Function1[
    /* M */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    js.Function0[fpDashTsLib.libMonoidMod.Monoid[js.Function1[/* a */ js.Any, js.Any]]]
  ] = js.native
  val getJoinMonoid: js.Function1[
    /* B */ fpDashTsLib.libBoundedMod.Bounded[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[js.Any]
  ] = js.native
  val getMeetMonoid: js.Function1[
    /* B */ fpDashTsLib.libBoundedMod.Bounded[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[js.Any]
  ] = js.native
  val getProductMonoid: js.Function2[
    /* MA */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    /* MB */ fpDashTsLib.libMonoidMod.Monoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getRecordMonoid: js.Function1[
    /* monoids */ fpDashTsLib.fpDashTsLibStrings.getRecordMonoid with js.Any, 
    fpDashTsLib.libMonoidMod.Monoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val monoidAll: fpDashTsLib.libMonoidMod.Monoid[scala.Boolean] = js.native
  val monoidAny: fpDashTsLib.libMonoidMod.Monoid[scala.Boolean] = js.native
  val monoidProduct: fpDashTsLib.libMonoidMod.Monoid[scala.Double] = js.native
  val monoidString: fpDashTsLib.libMonoidMod.Monoid[java.lang.String] = js.native
  val monoidSum: fpDashTsLib.libMonoidMod.Monoid[scala.Double] = js.native
  val monoidVoid: fpDashTsLib.libMonoidMod.Monoid[scala.Unit] = js.native
  val unsafeMonoidArray: fpDashTsLib.libMonoidMod.Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]] = js.native
}

