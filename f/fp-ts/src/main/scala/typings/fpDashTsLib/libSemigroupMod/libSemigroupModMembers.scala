package typings
package fpDashTsLib.libSemigroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Semigroup", JSImport.Namespace)
@js.native
object libSemigroupModMembers extends js.Object {
  val fold: js.Function1[
    /* S */ Semigroup[js.Any], 
    js.Function1[
      /* a */ js.Any, 
      js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], js.Any]
    ]
  ] = js.native
  val getArraySemigroup: js.Function0[Semigroup[fpDashTsLib.libArrayMod.Global.Array[js.Any]]] = js.native
  val getDictionarySemigroup: js.Function1[
    /* S */ Semigroup[js.Any], 
    Semigroup[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val getDualSemigroup: js.Function1[/* S */ Semigroup[js.Any], Semigroup[js.Any]] = js.native
  val getFirstSemigroup: js.Function0[Semigroup[js.Any]] = js.native
  val getFunctionSemigroup: js.Function1[
    /* S */ Semigroup[js.Any], 
    js.Function0[Semigroup[js.Function1[/* a */ js.Any, js.Any]]]
  ] = js.native
  val getJoinSemigroup: js.Function1[/* O */ fpDashTsLib.libOrdMod.Ord[js.Any], Semigroup[js.Any]] = js.native
  val getLastSemigroup: js.Function0[Semigroup[js.Any]] = js.native
  val getMeetSemigroup: js.Function1[/* O */ fpDashTsLib.libOrdMod.Ord[js.Any], Semigroup[js.Any]] = js.native
  val getObjectSemigroup: js.Function0[Semigroup[js.Object]] = js.native
  val getProductSemigroup: js.Function2[
    /* SA */ Semigroup[js.Any], 
    /* SB */ Semigroup[js.Any], 
    Semigroup[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getRecordSemigroup: js.Function1[
    /* semigroups */ fpDashTsLib.fpDashTsLibStrings.getRecordSemigroup with js.Any, 
    Semigroup[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val semigroupAll: Semigroup[scala.Boolean] = js.native
  val semigroupAny: Semigroup[scala.Boolean] = js.native
  val semigroupProduct: Semigroup[scala.Double] = js.native
  val semigroupString: Semigroup[java.lang.String] = js.native
  val semigroupSum: Semigroup[scala.Double] = js.native
  val semigroupVoid: Semigroup[scala.Unit] = js.native
}

