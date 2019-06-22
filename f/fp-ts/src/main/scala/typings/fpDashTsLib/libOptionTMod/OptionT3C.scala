package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT3C[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition3C1[M, fpDashTsLib.libOptionMod.URI, U, L] {
  def chain[A, B](
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libOptionMod.Option[B]]
    ],
    fa: fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    ap: (fpDashTsLib.libHKTMod.Kind3[
      M, 
      U, 
      L, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]]) => fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]],
    chain: (js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libOptionMod.Option[js.Any]]
    ], fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libOptionMod.Option[js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Kind3[M, U, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]]
  ): OptionT3C[M, U, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT3C[M, U, L]]
  }
}

