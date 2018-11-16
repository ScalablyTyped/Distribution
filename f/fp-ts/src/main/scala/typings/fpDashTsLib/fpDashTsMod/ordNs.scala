package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "ord")
@js.native
object ordNs extends js.Object {
  val between: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* low */ js.Any, /* hi */ js.Any, js.Function1[/* x */ js.Any, scala.Boolean]]
  ] = js.native
  val clamp: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* low */ js.Any, /* hi */ js.Any, js.Function1[/* x */ js.Any, js.Any]]
  ] = js.native
  val contramap: js.Function2[
    /* f */ js.Function1[/* b */ js.Any, js.Any], 
    /* fa */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[js.Any]
  ] = js.native
  val fromCompare: js.Function1[
    /* compare */ js.Function2[/* x */ js.Any, /* y */ js.Any, fpDashTsLib.libOrderingMod.Ordering], 
    fpDashTsLib.libOrdMod.Ord[js.Any]
  ] = js.native
  val getDualOrd: js.Function1[/* O */ fpDashTsLib.libOrdMod.Ord[js.Any], fpDashTsLib.libOrdMod.Ord[js.Any]] = js.native
  val getProductOrd: js.Function2[
    /* OA */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    /* OB */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    fpDashTsLib.libOrdMod.Ord[js.Tuple2[js.Any, js.Any]]
  ] = js.native
  val getSemigroup: js.Function0[fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libOrdMod.Ord[js.Any]]] = js.native
  val greaterThan: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Boolean]
  ] = js.native
  val greaterThanOrEq: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Boolean]
  ] = js.native
  val lessThan: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Boolean]
  ] = js.native
  val lessThanOrEq: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, scala.Boolean]
  ] = js.native
  val max: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]
  ] = js.native
  val min: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function2[/* x */ js.Any, /* y */ js.Any, js.Any]
  ] = js.native
  val ordBoolean: fpDashTsLib.libOrdMod.Ord[scala.Boolean] = js.native
  val ordDate: fpDashTsLib.libOrdMod.Ord[stdLib.Date] = js.native
  val ordNumber: fpDashTsLib.libOrdMod.Ord[scala.Double] = js.native
  val ordString: fpDashTsLib.libOrdMod.Ord[java.lang.String] = js.native
  val unsafeCompare: js.Function2[/* x */ js.Any, /* y */ js.Any, fpDashTsLib.libOrderingMod.Ordering] = js.native
}

