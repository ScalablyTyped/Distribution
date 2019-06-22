package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition2C1[M, fpDashTsLib.libOptionMod.URI, L] {
  def chain[A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libOptionMod.Option[B]]],
    fa: fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    ap: (fpDashTsLib.libHKTMod.Kind2[
      M, 
      L, 
      fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]]) => fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]],
    chain: (js.Function1[js.Any, fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libOptionMod.Option[js.Any]]], fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libOptionMod.Option[js.Any]],
    map: (fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Kind2[M, L, fpDashTsLib.libHKTMod.Kind[fpDashTsLib.libOptionMod.URI, js.Any]]
  ): OptionT2C[M, L] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[OptionT2C[M, L]]
  }
}

