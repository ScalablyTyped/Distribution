package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2C[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition2C1[M, fpDashTsLib.libOptionMod.URI, L] {
  def chain[A, B](
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[B]]],
    fa: fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[A]]
  ): fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT2C {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */, L](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type2[
        M, 
        L, 
        fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ],
    chain: js.Function2[
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[js.Any]], 
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libOptionMod.Option[js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type2[M, L, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ]
  ): OptionT2C[M, L] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[OptionT2C[M, L]]
  }
}

