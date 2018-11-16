package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "semigroup")
@js.native
object semigroupNs extends js.Object {
  val fold: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    js.Function1[
      /* a */ js.Any, 
      js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], js.Any]
    ]
  ] = js.native
  val getArraySemigroup: js.Function0[
    fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val getDictionarySemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val getDualSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[js.Any]
  ] = js.native
  val getFirstSemigroup: js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[js.Any]] = js.native
  val getFunctionSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[js.Function1[/* a */ js.Any, js.Any]]]
  ] = js.native
  val getJoinSemigroup: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[js.Any]
  ] = js.native
  val getLastSemigroup: js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[js.Any]] = js.native
  val getMeetSemigroup: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[js.Any]
  ] = js.native
  val getObjectSemigroup: js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[js.Object]] = js.native
  val getProductSemigroup: js.Function2[
    /* SA */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    /* SB */ fpDashTsLib.libSemigroupMod.Semigroup[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getRecordSemigroup: js.Function1[
    /* semigroups */ fpDashTsLib.fpDashTsLibStrings.getRecordSemigroup with js.Any, 
    fpDashTsLib.libSemigroupMod.Semigroup[ScalablyTyped.runtime.StringDictionary[js.Any]]
  ] = js.native
  val semigroupAll: fpDashTsLib.libSemigroupMod.Semigroup[scala.Boolean] = js.native
  val semigroupAny: fpDashTsLib.libSemigroupMod.Semigroup[scala.Boolean] = js.native
  val semigroupProduct: fpDashTsLib.libSemigroupMod.Semigroup[scala.Double] = js.native
  val semigroupString: fpDashTsLib.libSemigroupMod.Semigroup[java.lang.String] = js.native
  val semigroupSum: fpDashTsLib.libSemigroupMod.Semigroup[scala.Double] = js.native
  val semigroupVoid: fpDashTsLib.libSemigroupMod.Semigroup[scala.Unit] = js.native
}

