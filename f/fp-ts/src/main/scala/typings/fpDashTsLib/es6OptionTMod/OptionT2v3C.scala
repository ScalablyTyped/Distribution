package typings
package fpDashTsLib.es6OptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2v3C[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L]
  extends fpDashTsLib.es6ApplicativeMod.ApplicativeComposition3C1[M, fpDashTsLib.es6OptionMod.URI, U, L] {
  def chain[A, B](
    fa: fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6OptionMod.Option[A]],
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6OptionMod.Option[B]]
    ]
  ): fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6OptionMod.Option[B]]
}

object OptionT2v3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.es6HKTMod.URIS3 */, U, L](
    ap: (fpDashTsLib.es6HKTMod.Type3[
      M, 
      U, 
      L, 
      fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]],
    chain: (fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6OptionMod.Option[js.Any]], js.Function1[
      js.Any, 
      fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6OptionMod.Option[js.Any]]
    ]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6OptionMod.Option[js.Any]],
    map: (fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.es6HKTMod.Type3[M, U, L, fpDashTsLib.es6HKTMod.Type[fpDashTsLib.es6OptionMod.URI, js.Any]]
  ): OptionT2v3C[M, U, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT2v3C[M, U, L]]
  }
}

