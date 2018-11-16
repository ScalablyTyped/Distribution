package typings
package fpDashTsLib.libMonoidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Monoid", JSImport.Namespace)
@js.native
object libMonoidModMembers extends js.Object {
  val fold: js.Function1[
    /* M */ Monoid[js.Any], 
    js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], js.Any]
  ] = js.native
  val getArrayMonoid: js.Function0[Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]]] = js.native
  val getDictionaryMonoid: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    Monoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val getDualMonoid: js.Function1[/* M */ Monoid[js.Any], Monoid[js.Any]] = js.native
  val getEndomorphismMonoid: js.Function0[Monoid[fpDashTsLib.libFunctionMod.Endomorphism[js.Any]]] = js.native
  val getFunctionMonoid: js.Function1[/* M */ Monoid[js.Any], js.Function0[Monoid[js.Function1[/* a */ js.Any, js.Any]]]] = js.native
  val getJoinMonoid: js.Function1[/* B */ fpDashTsLib.libBoundedMod.Bounded[js.Any], Monoid[js.Any]] = js.native
  val getMeetMonoid: js.Function1[/* B */ fpDashTsLib.libBoundedMod.Bounded[js.Any], Monoid[js.Any]] = js.native
  val getProductMonoid: js.Function2[/* MA */ Monoid[js.Any], /* MB */ Monoid[js.Any], Monoid[js.Tuple2[js.Any, js.Any]]] = js.native
  val getRecordMonoid: js.Function1[
    /* monoids */ fpDashTsLib.fpDashTsLibStrings.getRecordMonoid with js.Any, 
    Monoid[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val monoidAll: Monoid[scala.Boolean] = js.native
  val monoidAny: Monoid[scala.Boolean] = js.native
  val monoidProduct: Monoid[scala.Double] = js.native
  val monoidString: Monoid[java.lang.String] = js.native
  val monoidSum: Monoid[scala.Double] = js.native
  val monoidVoid: Monoid[scala.Unit] = js.native
  val unsafeMonoidArray: Monoid[fpDashTsLib.libArrayMod.Global.Array[js.Any]] = js.native
}

