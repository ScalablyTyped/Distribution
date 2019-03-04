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
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[B]]
    ],
    fa: fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT3C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type3[
        M, 
        U, 
        L, 
        fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ],
    chain: js.Function2[
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libOptionMod.Option[js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type3[M, U, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ]
  ): OptionT3C[M, U, L] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[OptionT3C[M, U, L]]
  }
}

