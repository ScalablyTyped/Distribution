package typings
package fpDashTsLib.libOptionTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionT2v1[M /* <: fpDashTsLib.libHKTMod.URIS */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition11[M, fpDashTsLib.libOptionMod.URI] {
  def chain[A, B](
    fa: fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[A]],
    f: js.Function1[/* a */ A, fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[B]]]
  ): fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[B]]
}

object OptionT2v1 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS */](
    ap: js.Function2[
      fpDashTsLib.libHKTMod.Type[
        M, 
        fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Function1[js.Any, js.Any]]
      ], 
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], 
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[js.Any]]], 
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libOptionMod.Option[js.Any]]
    ],
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ],
    of: js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type[M, fpDashTsLib.libHKTMod.Type[fpDashTsLib.libOptionMod.URI, js.Any]]
    ]
  ): OptionT2v1[M] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[OptionT2v1[M]]
  }
}

